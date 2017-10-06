package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import selenium_utils.Action;
import selenium_utils.Browsers;

public class Servlet_helper {
	static String method_code;
	private static WebDriver driver;
	
	public static WebDriver getdriver()
	{
		
		return driver;
	}

	private static String validate_class(HashMap<String, String> out_map) {
		// TODO Auto-generated method stub
		System.out.println(out_map.get("class_name"));
		return out_map.get("class_name");
	}

	public static void execute(HashMap<String, String> out_map, int flag) {
		// TODO Auto-generated method stub

		if (!out_map.get("browser").equals(null) && !out_map.get("browser").equals("")) {
			driver = Browsers.getBrowser(out_map.get("browser"), out_map.get("URL"), flag);
			if (flag == 1 || flag == 2)
				method_code = "Browsers.getBrowser(\"" + out_map.get("browser") + "\",\"" + out_map.get("URL") + "\");";
		}

		if (out_map.get("close_browser").equals("YES"))
			method_code += Browsers.close_browsers(flag);

		if (out_map.get("kill_drivers").equals("YES"))
			method_code += Browsers.kill_browser_drivers(out_map.get("browser"), flag);

		if (flag == 1 || flag == 2)
			Create_runtime.create_Method(validate_class(out_map), out_map.get("method_name"), method_code);

		Actions action = Action.create_action_obj(driver);

	}

	public static HashMap<String, String> get_value(String input) {
		HashMap<String, String> input_map = new HashMap<String, String>();
		// TODO Auto-generated method stub
		input = input.substring(1, input.length() - 1);
		String[] s = input.split("},");
		for (int i = 0; i < s.length; i++) {
			s[i] = s[i] + "}";
			JSONObject jObj = new JSONObject(s[i]);
			input_map.put(jObj.get("name").toString(), jObj.get("value").toString());

		}

		return input_map;
	}

	public static String read_input_servlet(HttpServletRequest req) {
		String body = null;
		StringBuilder stringBuilder = new StringBuilder();
		BufferedReader bufferedReader = null;

		try {
			InputStream inputStream = req.getInputStream();
			if (inputStream != null) {
				bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
				char[] charBuffer = new char[128];
				int bytesRead = -1;
				while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
					stringBuilder.append(charBuffer, 0, bytesRead);
				}
			} else {
				stringBuilder.append("");
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}

		return stringBuilder.toString();

	}
}