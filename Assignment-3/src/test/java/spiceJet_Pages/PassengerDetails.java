package spiceJet_Pages;

import org.openqa.selenium.By;

public class PassengerDetails extends ChromeBrowser {


	public void details() {
		// select title
		objDriver1.findElement(By.xpath("//*[@data-testid=\"title-contact-detail-card\"]")).click();
		objDriver1.findElement(By.xpath("//*[text()=\"Mr\"]")).click();

		// contact details
		// name
		objDriver1.findElement(By.xpath("//*[@data-testid=\"first-inputbox-contact-details\"]")).sendKeys("Balle");
		// last name
		objDriver1.findElement(By.xpath("//*[@data-testid=\"last-inputbox-contact-details\"]")).sendKeys("Balle");
		// contact
		objDriver1.findElement(By.xpath("//*[@data-testid=\"contact-number-input-box\"]")).sendKeys("9876543210");
		// email
		objDriver1.findElement(By.xpath("//*[@data-testid=\"emailAddress-inputbox-contact-details\"]"))
				.sendKeys("xyz@gmail.com");
		// town and city
		objDriver1.findElement(By.xpath("//*[@data-testid=\"city-inputbox-contact-details\"]")).sendKeys("FurFuri Nagar");

		// Passenger details
		// name
		objDriver1.findElement(By.xpath("//*[@data-testid=\"traveller-0-first-traveller-info-input-box\"]"))
				.sendKeys("Balle");
		// last
		objDriver1.findElement(By.xpath("//*[@data-testid=\"traveller-0-last-traveller-info-input-box\"]"))
				.sendKeys("Balle");
		// number
		objDriver1.findElement(By.xpath("//*[@data-testid=\"sc-member-mobile-number-input-box\"]")).sendKeys("9876543210");
	}
	
	public void continueButton2() {
		objDriver1.findElement(By.xpath("//*[@data-testid=\"traveller-info-continue-cta\"]")).click();
	}
}
