package spiceJet_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PassengerDetails {

	WebDriver driver = null;

	public PassengerDetails(WebDriver driver) {
		this.driver = driver;
	}

	public void details() {
		// select title
		driver.findElement(By.xpath("//*[@data-testid=\"title-contact-detail-card\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Mr\"]")).click();

		// contact details
		// name
		driver.findElement(By.xpath("//*[@data-testid=\"first-inputbox-contact-details\"]")).sendKeys("Balle");
		// last name
		driver.findElement(By.xpath("//*[@data-testid=\"last-inputbox-contact-details\"]")).sendKeys("Balle");
		// contact
		driver.findElement(By.xpath("//*[@data-testid=\"contact-number-input-box\"]")).sendKeys("9876543210");
		// email
		driver.findElement(By.xpath("//*[@data-testid=\"emailAddress-inputbox-contact-details\"]"))
				.sendKeys("xyz@gmail.com");
		// town and city
		driver.findElement(By.xpath("//*[@data-testid=\"city-inputbox-contact-details\"]")).sendKeys("FurFuri Nagar");

		// Passenger details
		// name
		driver.findElement(By.xpath("//*[@data-testid=\"traveller-0-first-traveller-info-input-box\"]"))
				.sendKeys("Balle");
		// last
		driver.findElement(By.xpath("//*[@data-testid=\"traveller-0-last-traveller-info-input-box\"]"))
				.sendKeys("Balle");
		// number
		driver.findElement(By.xpath("//*[@data-testid=\"sc-member-mobile-number-input-box\"]")).sendKeys("9876543210");
	}
	
	public void continueButton2() {
		driver.findElement(By.xpath("//*[@data-testid=\"traveller-info-continue-cta\"]")).click();
	}
}
