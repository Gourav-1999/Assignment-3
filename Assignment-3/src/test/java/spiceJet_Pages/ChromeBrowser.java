package spiceJet_Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowser {
	public static WebDriver objDriver1;


	public void launch_ChromeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/gourav.vig/eclipse-workspace/Cucumber/drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		objDriver1 = new ChromeDriver(options);
		objDriver1.manage().window().maximize();
		objDriver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		objDriver1.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		objDriver1.get("https://www.spicejet.com/");
	}
	
}
