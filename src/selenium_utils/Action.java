package selenium_utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.Helper;

public class Action {

	public static Actions create_action_obj(WebDriver driver )
	{
		Actions action = new Actions(driver);
		return action;
	}
	
	
	// Click without Action class.
	/**
	 * @author NMakkar
	 * @param webElement
	 * @param flag
	 * @return
	 */
	public static String click(WebElement webElement, int flag) {
		if (flag == 0 || flag == 2)
			webElement.click();
		String result_webelement = Helper.fetch_webelement_string(webElement);
		return result_webelement + ".click()";
	}

	// Click and hold with Action class and without webelement
	/**
	 * @author NMakkar
	 * @param action
	 * @param flag
	 * @return
	 */
	public static String mouse_clickandhold(Actions action, int flag) {
		if (flag == 0 || flag == 2)
			action.clickAndHold().build().perform();
		return "action.clickAndHold().build().perform();";
	}

	// Click and hold with Action class and with webelement
	/**
	 * @author NMakkar
	 * @param webElement
	 * @param action
	 * @param flag
	 * @return
	 */
	public static String mouse_clickandhold_webelement(WebElement webElement, Actions action, int flag) {
		if (flag == 0 || flag == 2)
			action.clickAndHold(webElement).build().perform();
		String result_webelement = Helper.fetch_webelement_string(webElement);
		return "action.clickAndHold(" + result_webelement + ").build().perform();";
	}

	// Click with Action class and with webelement

	/**
	 * @author NMakkar
	 * @param webElement
	 * @param action
	 * @param flag
	 * @return
	 */
	public static String mouse_click_webelement(WebElement webElement, Actions action, int flag) {
		if (flag == 0 || flag == 2)
			action.click(webElement).build().perform();
		String result_webelement = Helper.fetch_webelement_string(webElement);
		return "action.click(" + result_webelement + ").build().perform();";
	}

	// Click with Action class and without webelement
	/**
	 * @author NMakkar
	 * @param action
	 * @param flag
	 * @return
	 */
	public static String mouse_click(Actions action, int flag) {
		if (flag == 0 || flag == 2)
			action.click().build().perform();
		return "action.click().build().perform();";
	}

	// ContextClick with Action class and with webelement
	/**
	 * @author NMakkar
	 * @param webElement
	 * @param action
	 * @param flag
	 * @return
	 */
	public static String mouse_contextClick_webelement(WebElement webElement, Actions action, int flag) {
		if (flag == 0 || flag == 2)
			action.contextClick(webElement).build().perform();
		String result_webelement = Helper.fetch_webelement_string(webElement);
		return "action.contextClick(" + result_webelement + ").build().perform();";
	}

	// ContextClick with Action class and without webelement
	/**
	 * @author NMakkar
	 * @param action
	 * @param flag
	 * @return
	 */
	public static String mouse_contextClick(Actions action, int flag) {
		if (flag == 0 || flag == 2)
			action.contextClick().build().perform();
		return "action.contextClick().build().perform();";
	}

	// doubleClick with Action class and with webelement
	/**
	 * @author NMakkar
	 * @param webElement
	 * @param action
	 * @param flag
	 * @return
	 */
	public static String mouse_doubleClick_webelement(WebElement webElement, Actions action, int flag) {
		if (flag == 0 || flag == 2)
			action.doubleClick(webElement).build().perform();
		String result_webelement = Helper.fetch_webelement_string(webElement);
		return "action.doubleClick(" + result_webelement + ").build().perform();";
	}

	// doubleClick with Action class and without webelement
	/**
	 * @author NMakkar
	 * @param action
	 * @param flag
	 * @return
	 */
	public static String mouse_doubleClick(Actions action, int flag) {
		if (flag == 0 || flag == 2)
			action.doubleClick().build().perform();
		return "action.doubleClick().build().perform();";
	}

	// Drag&Drop with Action class and with webelement
	/**
	 * @author NMakkar
	 * @param webElement
	 * @param action
	 * @param flag
	 * @return
	 */
	public static String mouse_dragdrop_webelement(WebElement[] webElement, Actions action, int flag) {
		if (flag == 0 || flag == 2)
			action.dragAndDrop(webElement[0], webElement[1]).build().perform();
		String result_webelement0 = Helper.fetch_webelement_string(webElement[0]) + ",";
		String result_webelement1 = Helper.fetch_webelement_string(webElement[1]);
		return "action.dragAndDrop(" + result_webelement0 + result_webelement1 + ").build().perform();";
	}

	// Drop with Action class and with Webelement and offset
	/**
	 * @author NMakkar
	 * @param webElement
	 * @param offset
	 * @param flag
	 * @param action
	 * @return
	 */
	public static String mouse_dragdrop(WebElement webElement, int[] offset, int flag, Actions action) {
		if (flag == 0 || flag == 2)
			action.dragAndDropBy(webElement, offset[0], offset[1]).build().perform();
		String result_webelement = Helper.fetch_webelement_string(webElement) + "," + offset[0] + "," + offset[1];

		return "action.dragAndDropBy(" + result_webelement + ").build().perform();";
	}

	// KeyDown with Action class and data
	/**
	 * @author NMakkar
	 * @param charseq
	 * @param flag
	 * @param action
	 * @return
	 */
	public static String mouse_keyDown(String charseq, int flag, Actions action) {
		if (flag == 0 || flag == 2)
			action.keyDown(charseq).build().perform();

		return "action.keyDown(" + charseq + ").build().perform();";
	}

	// KeyDown with Action class , WebElement and data
	/**
	 * @author NMakkar
	 * @param charseq
	 * @param flag
	 * @param action
	 * @param webelement
	 * @return
	 */
	public static String mouse_keyDown_webelement(WebElement webElement, String charseq, int flag, Actions action) {
		if (flag == 0 || flag == 2)
			action.keyDown(webElement, charseq).build().perform();
		String result_webelement = Helper.fetch_webelement_string(webElement) + "," + charseq;

		return "action.keyDown(" + result_webelement + ").build().perform();";
	}

	// keyUp with Action class and data
	/**
	 * @author NMakkar
	 * @param charseq
	 * @param flag
	 * @param action
	 * @return
	 */
	public static String mouse_keyUp(String charseq, int flag, Actions action) {
		if (flag == 0 || flag == 2)
			action.keyUp(charseq).build().perform();

		return "action.keyDown(" + charseq + ").build().perform();";
	}

	// keyUp with Action class , WebElement and data
	/**
	 * @author NMakkar
	 * @param charseq
	 * @param flag
	 * @param action
	 * @param webelement
	 * @return
	 */
	public static String mouse_keyUp_webelement(WebElement webElement, String charseq, int flag, Actions action) {
		if (flag == 0 || flag == 2)
			action.keyUp(webElement, charseq).build().perform();
		String result_webelement = Helper.fetch_webelement_string(webElement) + "," + charseq;

		return "action.keyDown(" + result_webelement + ").build().perform();";
	}

	// release with Action class
	/**
	 * @author NMakkar
	 * @param charseq
	 * @param flag
	 * @param action
	 * @return
	 */
	public static String mouse_release(int flag, Actions action) {
		if (flag == 0 || flag == 2)
			action.release().build().perform();

		return "action.release().build().perform();";
	}

	// release with Action class , WebElement
	/**
	 * @author NMakkar
	 * @param charseq
	 * @param flag
	 * @param action
	 * @param webelement
	 * @return
	 */
	public static String mouse_release_webelement(WebElement webElement, int flag, Actions action) {
		if (flag == 0 || flag == 2)
			action.release(webElement).build().perform();
		String result_webelement = Helper.fetch_webelement_string(webElement);

		return "action.release(" + result_webelement + ").build().perform();";
	}

	// pause_long with Action class
	/**
	 * @author NMakkar
	 * @param duration
	 * @param flag
	 * @param action
	 * @return
	 */
	public static String mouse_pause_duration(long duration, int flag, Actions action) {
		if (flag == 0 || flag == 2)
			action.pause(duration).build().perform();

		return "action.pause(" + duration + ").build().perform();";
	}
	// _pause_duration with Action class , WebElement and data

	/*
	 * public static String mouse_pause_duration(long duration, int flag,
	 * Actions action) { if (flag == 0 || flag == 2)
	 * action.pause(duration).build().perform();
	 * 
	 * return "action.pause(" + duration + ").build().perform();"; }
	 */

	// moveToElement with Action class , webElement and offset
	/**
	 * @author NMakkar
	 * @param webElement
	 * @param flag
	 * @param action
	 * @return
	 */
	public static String mouse_moveToElement_Webelement(WebElement webElement, int flag, Actions action) {
		if (flag == 0 || flag == 2)
			action.moveToElement(webElement).build().perform();
		String result_webelement = Helper.fetch_webelement_string(webElement);
		return "action.moveToElement(" + result_webelement + ").build().perform();";
	}

	// moveToElement with Action class , webElement and offset
	/**
	 * @author NMakkar
	 * @param offset
	 * @param flag
	 * @param action
	 * @param webElement
	 * @return
	 */
	public static String mouse_moveToElement_Offset(int[] offset, WebElement webElement, int flag, Actions action) {
		if (flag == 0 || flag == 2)
			action.moveToElement(webElement, offset[0], offset[1]).build().perform();
		String result_webelement = Helper.fetch_webelement_string(webElement) + "," + offset[0] + "," + offset[1];
		return "action.moveToElement(" + result_webelement + ").build().perform();";
	}

	// MoveByOffset with Action class and offset
	/**
	 * @author NMakkar
	 * @param offset
	 * @param flag
	 * @param action
	 * @return
	 */
	public static String mouse_MoveByOffset(int[] offset, int flag, Actions action) {
		if (flag == 0 || flag == 2)
			action.moveByOffset(offset[0], offset[1]).build().perform();

		return "action.moveByOffset(" + offset[0] + "," + offset[1] + ").build().perform();";
	}

	/*
	 * // Tick with Action class
	 *//**
	 * @author NMakkar
	 * @param charseq
	 * @param flag
	 * @param action
	 * @return
	 */

	/*
	 * public static String mouse_tick_action(int[] offset , WebElement
	 * webElement, int flag, Actions action) { if (flag == 0 || flag == 2)
	 * action.moveToElement(webElement,offset[0],offset[1]).build().perform();
	 * String result_webelement =
	 * Helper.fetch_webelement_string(webElement)+","+offset[0]+","+offset[1];
	 * return "action.moveToElement(" + result_webelement +
	 * ").build().perform();"; }
	 * 
	 * // Tick with Action class and interaciton
	 *//**
	 * @author NMakkar
	 * @param charseq
	 * @param flag
	 * @param action
	 * @return
	 *//*
	 * public static String mouse_tick_interaction(int[] offset, int flag,
	 * Actions action) { if (flag == 0 || flag == 2)
	 * action.moveByOffset(offset[0],offset[1]).build().perform();
	 * 
	 * return "action.moveByOffset(" + offset[0] + "," + offset[1] +
	 * ").build().perform();"; }
	 */
	
	
	
	// SendKeys with Action class and data
		/**
		 * @author NMakkar
		 * @param charseq
		 * @param flag
		 * @param action
		 * @return
		 */
		public static String mouse_sendKeys(String charseq, int flag, Actions action) {
			if (flag == 0 || flag == 2)
				action.sendKeys(charseq).build().perform();

			return "action.sendKeys(" + charseq + ").build().perform();";
		}

		// SendKeys with Action class , WebElement and data
		/**
		 * @author NMakkar
		 * @param charseq
		 * @param flag
		 * @param action
		 * @param webelement
		 * @return
		 */
		public static String mouse_sendKeys_webelement(WebElement webElement, String charseq, int flag, Actions action) {
			if (flag == 0 || flag == 2)
				action.sendKeys(webElement, charseq).build().perform();
			String result_webelement = Helper.fetch_webelement_string(webElement) + "," + charseq;

			return "action.sendKeys(" + result_webelement + ").build().perform();";
		}
}
