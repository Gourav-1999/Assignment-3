package spiceJet_Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import spiceJet_Pages.ChromeBrowser;
import spiceJet_Pages.Welcome_Board;

public class SpiceJet_WelcomeBoard extends ChromeBrowser {
	

   public SpiceJet_WelcomeBoard(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

Welcome_Board WB = new Welcome_Board(driver);
   
  /* @Before
   public void browserSetup() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\gourav.vig\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
   }*/
  
	@Given("user is on spiceJet welcome board page")
	public void user_is_on_spice_jet_welcome_board_page() {
		System.out.println("This is welcome board page");
		
		
	}

	@When("user select from and to cities")
	public void user_select_from_location_and_to_location() {
		WB.fromLocation();
		WB.toLocation();

	}

	@And("user select Departure date from calender")
	public void user_select_departure_date() {
		// Select departure date
		WB.departureDate();
	}

	@And("user click on search flight")
	public void user_click_on_search_flight() {
		// click next
		WB.searchButton();
	}

	@Then("user nevigate to flights page")
	public void user_nevigate_to_next_page() {
		System.out.println("Test 1 Succesfull..");
	}
	
}
