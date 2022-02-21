package spiceJet_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Select_Flight {

	WebDriver driver=null;
	public String fNumber;
	public String fPrice;
	public Select_Flight(WebDriver driver) {
		this.driver=driver;
	}
	
	public void selectFlight() {
		driver.findElement(By.xpath("(//*[@data-testid=\"spicemax-flight-select-radio-button-3\"]//..)[1]")).click();
		fNumber = driver.findElement(By.xpath("//div[text()=\"SG 191\"]")).getText();
		System.out.println(fNumber);
	    fPrice = driver.findElement(By.xpath("(//*[text()=\"5,619\"])[1]")).getText();
		System.out.println("Rupees"+"="+ fPrice);
	}
	
	public void continueButton() {
		try {
			driver.findElement(By.xpath("(//*[@data-testid=\"continue-search-page-cta\"])[3]")).click();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
