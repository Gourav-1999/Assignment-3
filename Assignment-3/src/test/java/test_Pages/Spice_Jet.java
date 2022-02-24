/*package test_Pages;

import io.cucumber.datatable.DataTable;
import spiceJet_Pages.ChromeBrowser;
import spiceJet_Pages.PassengerDetails;
import spiceJet_Pages.Payment;
import spiceJet_Pages.Select_Flight;
import spiceJet_Pages.Select_Seat_Meals;
import spiceJet_Pages.Welcome_Board;

public class Spice_Jet extends ChromeBrowser {

	
	public static void main(String[] args) throws InterruptedException {
		
		welcomeBoard(from,to,date);
		selectFlight();
		contactDetails();
		passengerDetails();
		selectSeatAndMeal();
		payment();
		objDriver1.quit();
		
	}
	
	
	public static void setUp() {
		ChromeBrowser browser = new ChromeBrowser();
		browser.launch_ChromeBrowser();
	}
	
	public static void welcomeBoard(String from, String to,String date) {
		Welcome_Board WB = new Welcome_Board();
		WB.fromLocation(from);
		WB.toLocation(to);
		WB.departureDate(date);
		WB.searchButton();
	}
	
	public static void selectFlight() {
		Select_Flight SF = new Select_Flight();
		SF.selectFlight();
		SF.continueButton();
	}
	
	public static void contactDetails(DataTable table1) {
		PassengerDetails PD = new PassengerDetails();
		PD.contactDetails(table1);
	}
	
	public static void passengerDetails(DataTable table2) {
		PassengerDetails PD = new PassengerDetails();
		PD.passengerDetails(table2);
		PD.continueButton2();
	}
	
	public static void selectSeatAndMeal() throws InterruptedException {
		Select_Seat_Meals SM = new Select_Seat_Meals();
		SM.selectSeat();
		SM.adjacentSeat();
		SM.accept();
		SM.cont_Meal_Button();
		SM.selectMeal();
		SM.continueButtonAgain();
	}
	
	public static void payment() {
		Payment pay = new Payment();
		pay.fetchData();
		pay.verifyData();
		pay.convenienceFee();
	}
	
}*/
