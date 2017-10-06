package selenium_utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browsers {

	/*
	 * public static void main(String[] args) { getBrowser("firefox");
	 * 
	 * }
	 */

	public static WebDriver DRIVER = null;
	public static DesiredCapabilities capabilities = null;
	/**
	 * Method is initializing driver with defined browser properties.
	 * 
	 * @author SHasan
	 * @param browser
	 * @return driver Object
	 */

	static Logger log = LogManager.getLogger(Browsers.class);

	public static WebDriver getBrowser(String browser, String URL, int flag) {
		if (flag == 0 || flag == 2) {
			switch (browser) {
			case "Firefox": {

				// Creating Firefox instance

				FirefoxProfile profile = new FirefoxProfile();
				profile.setAcceptUntrustedCertificates(true);
				System.setProperty("webdriver.gecko.driver", "d:\\s.w\\geckodriver.exe");
				DRIVER = new FirefoxDriver(profile);
				DRIVER.manage().timeouts().implicitlyWait(10, TimeUnit.MICROSECONDS);
				log.info(browser + " instance initializing...");
				DRIVER.manage().window().maximize();
				log.info(browser + " browser launched successfully.");
				log.info("Opening... " + URL);
				DRIVER.get(URL);
				log.info("URL opens up. ");

			}
			break;
			case "Chrome": {
				// Creating Chrome instance

				capabilities = DesiredCapabilities.chrome();
				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

				System.setProperty("webdriver.chrome.driver", "d:\\s.w\\chromedriver.exe");
				DRIVER = new ChromeDriver();
				DRIVER.manage().timeouts().implicitlyWait(10, TimeUnit.MICROSECONDS);
				log.info(browser + " instance initializing...");
				// DRIVER.manage().window().maximize();
				log.info(browser + " browser launched successfully.");
				log.info("Opening... " + URL);
				DRIVER.get(URL);
				log.info("URL opens up. ");

			}
			break;

			case "IE": {

				// Creating InternetExplorer instance

				/*
				 * capabilities = DesiredCapabilities.internetExplorer();
				 * capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,
				 * true); capabilities.setCapability(InternetExplorerDriver.
				 * INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				 * capabilities.setCapability(InternetExplorerDriver.
				 * IGNORE_ZOOM_SETTING, true);
				 */
				System.setProperty("webdriver.ie.driver", "D:\\s.w\\IEDriverServer.exe");
				DRIVER = new InternetExplorerDriver();
				log.info(browser + " instance initializing...");
				DRIVER.manage().window().maximize();
				log.info(browser + " browser launched successfully.");
				log.info("Opening... " + URL);
				DRIVER.get(URL);
				log.info("URL opens up. ");

			}
			break;
			default:
				log.info("Enter Valid browser ");

			}
		}
		return DRIVER;

	}

	public static String refresh_browsers(int flag) {
		// TODO Auto-generated method stub
		if (flag == 0 || flag == 2) {
			DRIVER.navigate().refresh();
			log.info("Refreshing Browser");
		}
		return "refresh_browsers()";
	}

	public static String navigate_browser_forward(int flag) {
		// TODO Auto-generated method stub
		if (flag == 0 || flag == 2) {
			DRIVER.navigate().forward();
			log.info("Navigate Browser Forward");
		}
		return "navigate_browser_forward()";
	}

	public static String navigate_browser_backward(int flag) {
		// TODO Auto-generated method stub
		if (flag == 0 || flag == 2) {
			DRIVER.navigate().back();
			log.info("Navigate Browser Backward");
		}
		return "navigate_browser_backward()";
	}

	public static String close_browsers(int flag) {
		// TODO Auto-generated method stub
		if (flag == 0 || flag == 2) {
			DRIVER.close();
			DRIVER.quit();
			log.info("Closing Browser");
		}
		return "close_browsers()";
	}

	public static String kill_browser_drivers(String browser, int flag) {
		// TODO Auto-generated method stub
		if (flag == 0 || flag == 2) {
			switch (browser) {
			case "Firefox": {
				log.info("Killing " + browser + " Drivers");
				try {
					Runtime.getRuntime().exec("taskkill /F /IM IEdriver.exe");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			break;
			case "Chrome": {
				log.info("Killing " + browser + " Drivers");
				try {
					Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			break;
			case "IE": {
				log.info("Killing " + browser + " Drivers");
				try {
					Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			break;
			default:
				log.info("Killing " + browser + " Drivers");
			}
		}
		return "kill_browser_drivers(" + browser + ")";

	}

	public static void main(String[] args) {
		WebDriver driver = getBrowser("Chrome", "http://www.fb.com", 1);
		WebElement e = driver.findElement(By.id("email"));
		System.out.println(Keyboard.write_text(e, "gmail@email.com", 1));
	}
}