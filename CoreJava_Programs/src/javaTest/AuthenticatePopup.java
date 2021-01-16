package javaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatePopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium_Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://admin:admin@the-internet-herokuapp.com/basic_auth");
		String text = driver.findElement(By.cssSelector("p")).getText();
		System.out.println("Get the Text:  " + text);
	}
}
