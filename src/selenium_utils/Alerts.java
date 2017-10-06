package selenium_utils;

import org.openqa.selenium.security.Credentials;

import utils.Servlet_helper;

public class Alerts {

	
	public static String accept_alert(int flag) {
		if (flag == 0 || flag == 2)
			Servlet_helper.getdriver().switchTo().alert().accept();
			

		return "Servlet_helper.getdriver().switchTo().alert().accept();";
	}
	
	
	public static String credentials_set_alert(int flag , Credentials credentials) {
		if (flag == 0 || flag == 2)
			Servlet_helper.getdriver().switchTo().alert().setCredentials(credentials);
			

		return "Servlet_helper.getdriver().switchTo().alert().setCredentials(" + credentials + ");";
	}
	
	public static String credentials_authenticate_alert(int flag , Credentials credentials ) {
		if (flag == 0 || flag == 2)
			Servlet_helper.getdriver().switchTo().alert().authenticateUsing(credentials);
			

		return "Servlet_helper.getdriver().switchTo().alert().authenticateUsing(" + credentials + ");";
	}
	
	public static String credentials_senddata_alert(int flag , String data ) {
		if (flag == 0 || flag == 2)
			Servlet_helper.getdriver().switchTo().alert().sendKeys(data);
			

		return "Servlet_helper.getdriver().switchTo().alert().sendKeys(" + data + ");";
	}
	
	public static String dismiss_alert(int flag , String data ) {
		if (flag == 0 || flag == 2)
			Servlet_helper.getdriver().switchTo().alert().dismiss();
			

		return "Servlet_helper.getdriver().switchTo().alert().dismiss()";
	}
	
	public static String getText_alert(int flag , String data ) {
		if (flag == 0 || flag == 2)
			Servlet_helper.getdriver().switchTo().alert().getText();
			

		return "Servlet_helper.getdriver().switchTo().alert().getText();";
	}
	
	
}
