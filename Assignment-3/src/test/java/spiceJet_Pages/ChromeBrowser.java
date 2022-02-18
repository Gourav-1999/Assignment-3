package spiceJet_Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	WebDriver driver;
	public ChromeBrowser(WebDriver driver) {
		this.driver=driver;
	}

	public void launch_ChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:/Users/gourav.vig/eclipse-workspace/Cucumber/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.spicejet.com/");
	}
}
