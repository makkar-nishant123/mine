
package initiate;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utils.Servlet_helper;

@WebServlet("/Selenium")
public class Selenium_init extends HttpServlet {
	StringBuffer jb = new StringBuffer();
	String line = null;
	private static final long serialVersionUID = 1031422249396784970L;

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		String input = Servlet_helper.read_input_servlet(req);

		HashMap<String, String> out_map = Servlet_helper.get_value(input);

		switch (out_map.get("type_e")) {
		case "Execute":
			Servlet_helper.execute(out_map,0);
			break;
		case "Code":
			Servlet_helper.execute(out_map,1);
			break;
		case "Both":
			Servlet_helper.execute(out_map,2);
			break;
		default:
			System.out.println("Not valid");
		}
	}

	
	/*
	 * public static void main(String[] args) { String input1 =
	 * "[{\"name\":\"browser\",\"value\":\"Chrome\"},{\"name\":\"URL\",\"value\":\"http://www.google.com\"},{\"name\":\"count_actions\",\"value\":\"2\"},{\"name\":\"close_browser\",\"value\":\"YES\"},{\"name\":\"kill_drivers\",\"value\":\"YES\"}]";
	 * String input =
	 * "[{\"name\":\"type_e\",\"value\":\"Both\"},{\"name\":\"class_name\",\"value\":\"C:\\\\Users\\\\nmakkar\\\\workspace\\\\Sel_project_AI\\\\src\\\\temp\\\\temp_cl1.java\"},{\"name\":\"method_name\",\"value\":\"Testing\"},{\"name\":\"browser\",\"value\":\"Chrome\"},{\"name\":\"URL\",\"value\":\"http://www.google.com\"},{\"name\":\"count_actions\",\"value\":\"1\"},{\"name\":\"close_browser\",\"value\":\"NO\"},{\"name\":\"kill_drivers\",\"value\":\"NO\"}][{\"name\":\"10\",\"value\":\"--Select--\"},{\"name\":\"20\",\"value\":\"--Select--\"},{\"name\":\"30\",\"value\":\"\"},{\"name\":\"40\",\"value\":\"\"}]";
	 * 
	 * HashMap<String, String> out_map = get_value(input); switch
	 * (out_map.get("type_e")) { case "Execute": execute(out_map); break; case
	 * "Code": code(out_map); break; case "Both": both(out_map); break; default:
	 * System.out.println("Not valid"); }
	 * 
	 * }
	 */
}