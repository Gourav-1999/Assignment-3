package spiceJet_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import spiceJet_Steps.SpiceJet_WelcomeBoard;

public class Welcome_Board extends ChromeBrowser{

	
	public ChromeBrowser objDriver1;
	
	public Welcome_Board(WebDriver objDriver1) {
		super(objDriver1);
		// TODO Auto-generated constructor stub
	}

	
	
	
	public void fromLocation() {
		
		objDriver1.findElement(By.xpath("//*[text()=\"From\"]")).click();
		objDriver1.findElement(By.xpath("//*[text()=\"India\"]")).click();
		objDriver1.findElement(By.xpath("//*[text()=\"Delhi\"]")).click();
	}
	
	public void toLocation() {
		
		objDriver1.findElement(By.xpath("//*[text()=\"Bengaluru\"]")).click();
	}
	
	public void departureDate() {
		
		objDriver1.findElement(By.xpath("//*[@data-testid=\"undefined-month-March-2022\"]//div[text()=\"18\"]")).click();
		
	}
	
	public void searchButton() {
		
		objDriver1.findElement(By.xpath("//*[@data-testid=\"home-page-flight-cta\"]")).click();
	}
	
	
	
}
