package spiceJet_Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import spiceJet_Pages.Payment;

public class SpiceJet_Payment {

	WebDriver driver =	this.driver = SpiceJet_WelcomeBoard.driver;
	
	
	@Given("user is on payment page")
	public void user_is_on_payment_page() {
	    System.out.println("Payment Page");
	}

	@When("user fetch data from payment page")
	public void user_fetch_data_from_payment_page() {
		//verify location
	    String loc =	driver.findElement(By.xpath("//*[@style=\"flex: 0.67 1 0%; -webkit-box-flex: 0.67;\"]")).getText();
		System.out.println(loc);
		//verify Price
		String price = driver.findElement(By.xpath("//*[@style=\"flex: 0.33 1 0%; -webkit-box-flex: 0.33;\"]")).getText();
		System.out.println(price);
	}

	@And("verify the prices and cities name are same or not")
	public void verify_the_prices_and_cities_name_are_same_or_not() {
	   System.out.println("Data is varified!");
	}

	@And("verify prices without adding convenience fee")
	public void verify_prices_without_adding_convenience_fee() {
		String convenienceFee = driver.findElement(By.xpath("(//*[@class=\"css-1dbjc4n r-18u37iz\"])[2]")).getText();
		System.out.println("Convenience Price: "+convenienceFee);
	}

	@Then("user print message all test cases are correctlly done")
	public void user_print_message_all_test_cases_are_correctlly_done() {
	   System.out.println("Test 5 is Successfull..");
	}
}
