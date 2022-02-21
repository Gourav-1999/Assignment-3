package spiceJet_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome_Board {

	WebDriver driver = this.driver = ChromeBrowser.driver;
	
	public Welcome_Board(WebDriver driver) {
		this.driver=driver;
	}
	
	public void fromLocation() {
		
		driver.findElement(By.xpath("//*[text()=\"From\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"India\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Delhi\"]")).click();
	}
	
	public void toLocation() {
		
		driver.findElement(By.xpath("//*[text()=\"Bengaluru\"]")).click();
	}
	
	public void departureDate() {
		
		driver.findElement(By.xpath("//*[@data-testid=\"undefined-month-March-2022\"]//div[text()=\"18\"]")).click();
		
	}
	
	public void searchButton() {
		
		driver.findElement(By.xpath("//*[@data-testid=\"home-page-flight-cta\"]")).click();
	}
	
}
