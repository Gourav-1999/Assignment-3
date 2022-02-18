package spiceJet_Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class SpiceJet_WelcomeBoard {
	
   public static WebDriver driver;

   @Before
   public void browserSetup() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\gourav.vig\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
   }
  
	@Given("user is on spiceJet welcome board page")
	public void user_is_on_spice_jet_welcome_board_page() {
		System.out.println("This is welcome board page");
	}

	@When("user select from and to cities")
	public void user_select_from_location_and_to_location() {
		// From page
		driver.findElement(By.xpath("//*[text()=\"From\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"India\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Delhi\"]")).click();

		// To page
		driver.findElement(By.xpath("//*[text()=\"Bengaluru\"]")).click();

	}

	@And("user select Departure date from calender")
	public void user_select_departure_date() {
		// Select departure date
		driver.findElement(By.xpath("//*[@data-testid=\"undefined-month-March-2022\"]//div[text()=\"18\"]")).click();
	}

	@And("user click on search flight")
	public void user_click_on_search_flight() {
		// click next
		driver.findElement(By.xpath("//*[@data-testid=\"home-page-flight-cta\"]")).click();
	}

	@Then("user nevigate to flights page")
	public void user_nevigate_to_next_page() {
		System.out.println("Test 1 Succesfull..");
	}
	
}
