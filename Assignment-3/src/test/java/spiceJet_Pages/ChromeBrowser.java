package spiceJet_Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;

public class ChromeBrowser {
	public WebDriver objDriver1;

	
	public ChromeBrowser(WebDriver objDriver1) {
		this.objDriver1=objDriver1;
	}

	public void launch_ChromeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/gourav.vig/eclipse-workspace/Cucumber/drivers/chromedriver.exe");
		objDriver1 = new ChromeDriver();
		objDriver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		objDriver1.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		objDriver1.get("https://www.spicejet.com/");
	}
	
public void fromLocation() {
		
		objDriver1.findElement(By.xpath("//*[text()=\"From\"]")).click();
		objDriver1.findElement(By.xpath("//*[text()=\"India\"]")).click();
		objDriver1.findElement(By.xpath("//*[text()=\"Delhi\"]")).click();
	}
	
	public void toLocation() {
		
		objDriver1.findElement(By.xpath("//*[text()=\"Bengaluru\"]")).click();
	}
	
	public void departureDate() {
		
		objDriver1.findElement(By.xpath("//*[@data-testid=\"undefined-month-March-2022\"]//div[text()=\"18\"]")).click();
		
	}
	
	public void searchButton() {
		
		objDriver1.findElement(By.xpath("//*[@data-testid=\"home-page-flight-cta\"]")).click();
	}
	
}
