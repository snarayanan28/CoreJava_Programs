package javaTest;

import org.apache.xml.serializer.Version;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCaps {

	public static void main(String[] args) {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.WIN8);
		caps.setVersion(Version.getVersion());
		
		caps.setCapability("network", true);	// To enable network logs
		caps.setCapability("visual", true);		// To enable step by step screenshot
		caps.setCapability("console", true);	// To capture console logs
		caps.setCapability("timezone", "UTC+05:30");
		caps.setCapability("geolocation", "IN");
		
		options.merge(caps);
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium_Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cacert.com");
		
	}

}
