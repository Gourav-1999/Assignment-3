package test_Pages;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import spiceJet_Pages.ChromeBrowser;
import spiceJet_Pages.PassengerDetails;
import spiceJet_Pages.Payment;
import spiceJet_Pages.Select_Flight;
import spiceJet_Pages.Select_Seat_Meals;
import spiceJet_Pages.Welcome_Board;

public class TestNG extends ChromeBrowser{

	
	
	@BeforeTest
	public void setUp() {
		ChromeBrowser b = new ChromeBrowser();
		b.launch_ChromeBrowser();
	}
	
	
	@Test(priority = 0)
	public static void welcomeBoard(String from, String to, String date) {
		Welcome_Board WB = new Welcome_Board();
		WB.fromLocation(from);
		WB.toLocation(to);
		WB.departureDate(date);
		WB.searchButton();
	}
	@Test(priority = 1)
	public static void selectFlight() {
		Select_Flight SF = new Select_Flight();
		SF.selectFlight();
		SF.continueButton();
	}
	
	@Test(priority = 2)
	public static void contactDetails(String title,String name,String lastName,String contact,String email,String city) {
		PassengerDetails PD = new PassengerDetails();
		PD.contactDetails(title,name,lastName,contact,email,city);
	}
	@Test(priority = 3)
	public static void passengerDetails(String name,String lastName,String number) {
		PassengerDetails PD = new PassengerDetails();
		PD.passengerDetails(name,lastName,number);
		PD.continueButton2();
	}
	@Test(priority = 4)
	public static void selectSeatAndMeal(String seat) throws InterruptedException {
		Select_Seat_Meals SM = new Select_Seat_Meals();
		SM.selectSeat(seat);
		SM.adjacentSeat();
		SM.accept();
		SM.cont_Meal_Button();
		SM.selectMeal();
		SM.continueButtonAgain();
	}
	@Test(priority = 5)
	public static void payment() {
		Payment pay = new Payment();
		pay.fetchData();
		pay.verifyData();
		pay.convenienceFee();
	}
	@AfterTest
	public void tearDown() {
		objDriver1.close();
		objDriver1.quit();
	}
	
}
