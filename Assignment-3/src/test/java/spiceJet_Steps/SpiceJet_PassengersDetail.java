package spiceJet_Steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import spiceJet_Pages.ChromeBrowser;
import spiceJet_Pages.PassengerDetails;

public class SpiceJet_PassengersDetail extends ChromeBrowser{

	public SpiceJet_PassengersDetail(WebDriver objDriver) {
		super(objDriver);
		// TODO Auto-generated constructor stub
	}

	//WebDriver driver =	this.driver = ChromeBrowser.objDriver;
	PassengerDetails PD = new PassengerDetails(objDriver);
	
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
