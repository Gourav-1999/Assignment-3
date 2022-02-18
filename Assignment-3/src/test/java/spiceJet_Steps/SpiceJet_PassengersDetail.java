package spiceJet_Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

public class SpiceJet_PassengersDetail {

	WebDriver driver =	this.driver = SpiceJet_WelcomeBoard.driver;
	
	@Given("user is on spiceJet passengers page")
	public void user_is_on_spice_jet_passengers_page() {
		System.out.println("This is Passenger Page");
	}

	@When("user fill contact details and passenger information")
	public void user_fill_contact_details_and_passenger_information() {

		//select title
				driver.findElement(By.xpath("//*[@data-testid=\"title-contact-detail-card\"]")).click();
				driver.findElement(By.xpath("//*[text()=\"Mr\"]")).click();
				//title.selectByVisibleText("Mrs");
				
				//contact details
				//name
				driver.findElement(By.xpath("//*[@data-testid=\"first-inputbox-contact-details\"]")).sendKeys("Balle");
				//last name
				driver.findElement(By.xpath("//*[@data-testid=\"last-inputbox-contact-details\"]")).sendKeys("Balle");
				//contact
				driver.findElement(By.xpath("//*[@data-testid=\"contact-number-input-box\"]")).sendKeys("9876543210");
				//email
				driver.findElement(By.xpath("//*[@data-testid=\"emailAddress-inputbox-contact-details\"]")).sendKeys("xyz@gmail.com");
				//town and city
				driver.findElement(By.xpath("//*[@data-testid=\"city-inputbox-contact-details\"]")).sendKeys("FurFuri Nagar");
				
				//Passenger details
				//name
				driver.findElement(By.xpath("//*[@data-testid=\"traveller-0-first-traveller-info-input-box\"]")).sendKeys("Balle");
				//last
				driver.findElement(By.xpath("//*[@data-testid=\"traveller-0-last-traveller-info-input-box\"]")).sendKeys("Balle");
				//number
				driver.findElement(By.xpath("//*[@data-testid=\"sc-member-mobile-number-input-box\"]")).sendKeys("9876543210");
				
	}

	@When("click on continue button")
	public void click_on_continue_button() {

		//Continue
				driver.findElement(By.xpath("//*[@data-testid=\"traveller-info-continue-cta\"]")).click();

	}

	@Then("user navigate to next page")
	public void user_navigate_to_next_page() {

		System.out.println("Test 3 is Successfull..");
	}
}
