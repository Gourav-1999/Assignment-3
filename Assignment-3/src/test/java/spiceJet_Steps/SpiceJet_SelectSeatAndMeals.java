package spiceJet_Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import spiceJet_Pages.Select_Seat_Meals;

public class SpiceJet_SelectSeatAndMeals {
	
	WebDriver driver =	this.driver = SpiceJet_WelcomeBoard.driver;
	
	Select_Seat_Meals SM = new Select_Seat_Meals(driver);

	@Given("user already fill passenger details and user is on Add-on page")
	public void user_already_fill_passenger_details_and_user_is_on_add_on_page() {
	   System.out.println("Passenger Page");
	}

	@When("user first select seat")
	public void user_first_select_seat() {
	   SM.selectSeat();
	}

	@And("user book private row or extra seat for extra comfort and safety")
	public void user_book_private_row_or_extra_seat_for_extra_comfort_and_safety() {
		SM.adjacentSeat();
	}

	@And("user accept terms and conditions for extra seat")
	public void user_accept_terms_and_conditions_for_extra_seat() {
		//Accept
		SM.accept();
	}

	@And("click on continue button and user click on meals button")
	public void click_on_continue_button_and_user_click_on_meals_button() {
	
		SM.cont_Meal_Button();
	}

	@And("user select meals and click on done button")
	public void user_select_meals_and_click_on_done_button() throws InterruptedException {
		SM.selectMeal();
	}

	@Then("user nevigate to Add-on page")
	public void user_nevigate_to_add_on_page_and_click_on_continue_button() {
	  System.out.println("All done..");
	}
	
	@And("click on continue button again")
	public void user_nevigate_to_add_on_page() {
		SM.continueButtonAgain();
	}
	
	@Then("user nevigate to payment page")
	public void user_nevigate_to_next_button() {
	   System.out.println("Test 4 is Successfull..");
	}
}
