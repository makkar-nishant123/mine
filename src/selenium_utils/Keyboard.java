package selenium_utils;

import org.openqa.selenium.WebElement;

import utils.Helper;

public class Keyboard {
	
	public static String write_text(WebElement webElement , String data , int flag )
	{
		if(flag == 0 || flag == 2)
		webElement.sendKeys(data);
		String result_webelement = Helper.fetch_webelement_string(webElement);
		
		return result_webelement+".sendKeys(" + data + ")";
	}

	
	
}
