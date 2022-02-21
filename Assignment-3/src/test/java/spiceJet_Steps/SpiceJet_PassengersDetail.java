package spiceJet_Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import spiceJet_Pages.PassengerDetails;

public class SpiceJet_PassengersDetail {

	WebDriver driver =	this.driver = SpiceJet_WelcomeBoard.driver;
	PassengerDetails PD = new PassengerDetails(driver);
	
	@Given("user is on spiceJet passengers page")
	public void user_is_on_spice_jet_passengers_page() {
		System.out.println("This is Passenger Page");
	}

	@When("user fill contact details and passenger information")
	public void user_fill_contact_details_and_passenger_information() {

		PD.details();
	}

	@When("click on continue button")
	public void click_on_continue_button() {

		//Continue
		PD.continueButton2();

	}

	@Then("user navigate to next page")
	public void user_navigate_to_next_page() {

		System.out.println("Test 3 is Successfull..");
	}
}
