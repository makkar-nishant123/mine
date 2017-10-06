package selenium_utils;

import java.util.LinkedList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Select_Select {

	// Selecting By Index.
	/**
	 * 
	 * @param webElement
	 * @param index
	 * @param flag
	 * @return
	 */
	public static String select_by_id(WebElement webElement, int index, int flag) {
		if (flag == 0 || flag == 2) {
			Select select = new Select(webElement);
			select.selectByIndex(index);
		}
		return "select.selectByIndex(" + index + ")";
	}

	// Selecting by Value.
	/**
	 * 
	 * @param webElement
	 * @param index
	 * @param flag
	 * @return
	 */
	public static String select_by_value(WebElement webElement, String value, int flag) {
		if (flag == 0 || flag == 2) {
			Select select = new Select(webElement);
			select.selectByValue(value);
		}
		return "select.selectByValue(" + value + ")";
	}

	// Selecting by VisibleText.
	/**
	 * 
	 * @param webElement
	 * @param index
	 * @param flag
	 * @return
	 */
	public static String select_by_VisibleText(WebElement webElement, String text, int flag) {
		if (flag == 0 || flag == 2) {
			Select select = new Select(webElement);
			select.selectByVisibleText(text);
		}
		return "select.selectByValue(" + text + ")";
	}

	// DeSelecting All.
	/**
	 * 
	 * @param webElement
	 * @param index
	 * @param flag
	 * @return
	 */
	public static String select_deselectAll(WebElement webElement, int flag) {
		if (flag == 0 || flag == 2) {
			Select select = new Select(webElement);
			select.deselectAll();
		}
		return "select.deselectAll()";
	}

	// DeSelecting By Index.
	/**
	 * 
	 * @param webElement
	 * @param index
	 * @param flag
	 * @return
	 */
	public static String deselect_by_id(WebElement webElement, int index, int flag) {
		if (flag == 0 || flag == 2) {
			Select select = new Select(webElement);
			select.deselectByIndex(index);
		}
		return "select.deselectByIndex(" + index + ")";
	}

	// deSelecting by Value.
	/**
	 * 
	 * @param webElement
	 * @param index
	 * @param flag
	 * @return
	 */
	public static String deselect_by_value(WebElement webElement, String value, int flag) {
		if (flag == 0 || flag == 2) {
			Select select = new Select(webElement);
			select.deselectByValue(value);
		}
		return "select.deselectByValue(" + value + ")";
	}

	// deSelecting by VisibleText.
	/**
	 * 
	 * @param webElement
	 * @param index
	 * @param flag
	 * @return
	 */
	public static String deselect_by_VisibleText(WebElement webElement, String text, int flag) {
		if (flag == 0 || flag == 2) {
			Select select = new Select(webElement);
			select.deselectByVisibleText(text);
		}
		return "select.deselectByValue(" + text + ")";
	}
	// fetch all selected options 
		/**
		 * 
		 * @param webElement
		 * @param index
		 * @param flag
		 * @return
		 */
		public static Select_Select deselect_getAllSelectedOptions(WebElement webElement ,  int flag) {
			List<WebElement> selected_options = new LinkedList<WebElement>();
			if (flag == 0 || flag == 2) {
				Select select = new Select(webElement);
				 selected_options = select.getAllSelectedOptions();
			}
			String method_code =  "select.getAllSelectedOptions()";
			return new Select_Select(method_code, selected_options);
		}

		private String method_code;
		private List<WebElement> selected_options;
		
		public  Select_Select(String method_code, List<WebElement> selected_options) {
			// TODO Auto-generated method stub
			this.method_code = method_code;
			this.selected_options = selected_options;
		}
		
		
		public List<WebElement> get_selected_options()
		{
			return selected_options;
		}
		
		public String get_method_code()
		{
			return method_code;
		}
}