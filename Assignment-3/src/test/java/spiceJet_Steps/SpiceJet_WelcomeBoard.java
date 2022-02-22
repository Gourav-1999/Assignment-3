package spiceJet_Steps;

import io.cucumber.java.en.*;
import spiceJet_Pages.Welcome_Board;

public class SpiceJet_WelcomeBoard extends Welcome_Board {


	
	 Welcome_Board browser = new Welcome_Board();
  
  
	@Given("user is on spiceJet welcome board page")
	public void user_is_on_spice_jet_welcome_board_page() {
		System.out.println("This is welcome board page");
		
		browser.launch_ChromeBrowser();
		
	}

	@When("user select from and to cities")
	public void user_select_from_location_and_to_location() {
		browser.fromLocation();
		browser.toLocation();

	}

	@And("user select Departure date from calender")
	public void user_select_departure_date() {
		// Select departure date
		browser.departureDate();
	}

	@And("user click on search flight")
	public void user_click_on_search_flight() {
		// click next
		browser.searchButton();
	}

	@Then("user nevigate to flights page")
	public void user_nevigate_to_next_page() {
		System.out.println("Test 1 Succesfull..");
	}
	
}
