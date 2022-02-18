package spiceJet_Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import spiceJet_Pages.Select_Seat_Meals;

public class SpiceJet_SelectSeatAndMeals {
	
	WebDriver driver =	this.driver = SpiceJet_WelcomeBoard.driver;

	@Given("user already fill passenger details and user is on Add-on page")
	public void user_already_fill_passenger_details_and_user_is_on_add_on_page() {
	   System.out.println("Passenger Page");
	}

	@When("user first select seat")
	public void user_first_select_seat() {
	   
	}

	@And("user book private row or extra seat for extra comfort and safety")
	public void user_book_private_row_or_extra_seat_for_extra_comfort_and_safety() {
		//Seat select
				driver.findElement(By.xpath("(//*[text()=\"2A\"])[1]")).click();
				
				//Adjacent Seat
				driver.findElement(By.xpath("(//*[@viewBox=\"0 0 18 18\"])[2]")).click();
	}

	@And("user accept terms and conditions for extra seat")
	public void user_accept_terms_and_conditions_for_extra_seat() {
		//Accept
		driver.findElement(By.xpath("//*[@style=\"height: 26px; width: 26px;\"]")).click();
	}

	@And("click on continue button and user click on meals button")
	public void click_on_continue_button_and_user_click_on_meals_button() {
		driver.findElement(By.xpath("(//*[text()=\"Continue\"])[2]")).click();
		//meal button
				driver.findElement(By.xpath("(//*[text()=\"Select Meals\"]//..)[1]")).click();
	}

	@And("user select meals and click on done button")
	public void user_select_meals_and_click_on_done_button() {
		//select meal
				driver.findElement(By.xpath("//*[text()=\"Cucumber, tomato & cheese in multigrain bread\"]")).click();
				//done
				driver.findElement(By.xpath("(//*[text()=\"Done\"]//..)[1]")).click();
	}

	@Then("user nevigate to Add-on page")
	public void user_nevigate_to_add_on_page_and_click_on_continue_button() {
	  System.out.println("All done..");
	}
	
	@And("click on continue button again")
	public void user_nevigate_to_add_on_page() {
		//continue
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("(//*[text()=\"Continue\"]//..)[1]")).click();
	}
	
	@Then("user nevigate to payment page")
	public void user_nevigate_to_next_button() {
	   System.out.println("Test 4 is Successfull..");
	}
}
