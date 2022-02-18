package spiceJet_Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

public class SpiceJet_SelectFlight {


	WebDriver driver =	this.driver = SpiceJet_WelcomeBoard.driver;
	@Given("user is on spiceJet flight search page")
	public void user_is_on_spice_jet_flight_search_page() {
		System.out.println("Flight Search Page");
		System.out.println(driver);
	}

	@When("user select any flight")
	public void user_select_any_flight() {
		System.out.println("Select Any Flight");
	}

	@And("user select spicemax radio button and fetch flight number and price")
	public void user_select_spicemax_radio_button_and_fetch_flight_number_and_price() {

		// select spice max button and fetch data
		
		String fNumber = driver.findElement(By.xpath("//div[text()=\"SG 191\"]")).getText();
		System.out.println(fNumber);
		String fPrice = driver.findElement(By.xpath("(//*[text()=\"5,619\"])[1]")).getText();
		System.out.println("Rupees" + "=" + fPrice);

		driver.findElement(By.xpath("(//*[@data-testid=\"spicemax-flight-select-radio-button-3\"]//..)[1]")).click();

	}

	@And("user click on continue button")
	public void user_click_on_continue_button() {
		// Continue
		try {
			driver.findElement(By.xpath("(//*[@data-testid=\"continue-search-page-cta\"])[3]")).click();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Then("user navigate to passengers page")
	public void user_navigate_to_next_page() {
		System.out.println("Test 2 is Successfull..");
	}
}
