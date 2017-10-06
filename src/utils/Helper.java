package utils;

import org.openqa.selenium.WebElement;

public class Helper {



	public static String string_To_Code(WebElement webElement, String data, String action) {
		// TODO Auto-generated method stub
String[] datas = webElement.toString().split("-> ")[1].split(": ");
		
		String result_webelement = "driver.findElement(By." + datas[0] + "("+ datas[1]+ "))." + action + "(" + data + ")";
		return result_webelement;
	}

	public static String fetch_webelement_string(WebElement webElement) {
		// TODO Auto-generated method stub
String[] datas = webElement.toString().split("-> ")[1].split(": ");
		
		String string_webelement = "driver.findElement(By." + datas[0] + "("+ datas[1]+ "))";
		return string_webelement;
	}
}
