package spiceJet_Pages;

import org.openqa.selenium.By;

public class PassengerDetails extends ChromeBrowser {


	public void contactDetails(String title,String name,String lastName,String contact,String email,String city) {
		// select title	
		
		objDriver1.findElement(By.xpath("//*[@data-testid=\"title-contact-detail-card\"]")).click();
		String xpath = "//*[text()=\"title\"]";
		objDriver1.findElement(By.xpath(xpath.replace("title", title))).click();

		// contact details
		// name
		objDriver1.findElement(By.xpath("//*[@data-testid=\"first-inputbox-contact-details\"]")).sendKeys( name);
		// last name
		objDriver1.findElement(By.xpath("//*[@data-testid=\"last-inputbox-contact-details\"]")).sendKeys( lastName);
		// contact
		objDriver1.findElement(By.xpath("//*[@data-testid=\"contact-number-input-box\"]")).sendKeys( contact);
		// email
		objDriver1.findElement(By.xpath("//*[@data-testid=\"emailAddress-inputbox-contact-details\"]"))
				.sendKeys( email);
		// town and city
		objDriver1.findElement(By.xpath("//*[@data-testid=\"city-inputbox-contact-details\"]")).sendKeys( city);
	}

		public void passengerDetails(String name,String lastName,String number) {
		// name
		objDriver1.findElement(By.xpath("//*[@data-testid=\"traveller-0-first-traveller-info-input-box\"]"))
				.sendKeys( name);
		// last
		objDriver1.findElement(By.xpath("//*[@data-testid=\"traveller-0-last-traveller-info-input-box\"]"))
				.sendKeys( lastName);
		// number
		objDriver1.findElement(By.xpath("//*[@data-testid=\"sc-member-mobile-number-input-box\"]")).sendKeys( number);
			}

	
	public void continueButton2() {
		objDriver1.findElement(By.xpath("//*[@data-testid=\"traveller-info-continue-cta\"]")).click();
	}
}
