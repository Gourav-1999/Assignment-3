package spiceJet_Steps;

import io.cucumber.java.en.*;
import spiceJet_Pages.PassengerDetails;

public class SpiceJet_PassengersDetail extends PassengerDetails {

	// WebDriver driver = this.driver = ChromeBrowser.objDriver;
	PassengerDetails PD = new PassengerDetails();

	@Given("user is on spiceJet passengers page")
	public void user_is_on_spice_jet_passengers_page() {
		System.out.println("This is Passenger Page");
	}

	@When("user fill contact details {string},{string},{string},{string},{string},{string}")
	public void user_fill_contact_details(String title, String name, String lastName, String contact, String email,
			String city) {

		PD.contactDetails(title, name, lastName, contact, email, city);
	}

	@Then("user fill passenger details {string}, {string} ,{string}")
	public void user_fill_passenger_details(String name, String lastName, String number) {
		PD.passengerDetails(name, lastName, number);
	}

	@When("click on continue button")
	public void click_on_continue_button() {

		// Continue
		PD.continueButton2();

	}

	@Then("user navigate to next page")
	public void user_navigate_to_next_page() {

		System.out.println("Test 3 is Successfull..");
	}
}
