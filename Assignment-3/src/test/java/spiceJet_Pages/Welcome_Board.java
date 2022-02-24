package spiceJet_Pages;

import org.openqa.selenium.By;

public class Welcome_Board extends ChromeBrowser {

	
	
	public void fromLocation(String from) {
		
		objDriver1.findElement(By.xpath("//*[text()=\"From\"]")).click();
			String fromXpath = "//*[text()=\"from\"]";
			objDriver1.findElement(By.xpath(fromXpath.replace("from", from))).click();
			System.out.println(fromXpath.replace("from", from));
		}
		
	
	public void toLocation(String to) {
		String toXpath = "//*[text()=\"to\"]";
	    objDriver1.findElement(By.xpath(toXpath.replace("to",to))).click();
	}
	
	public void departureDate(String date) {
		String xpath = "//*[@data-testid=\"undefined-month-months\"]//div[text()=\"date\"]";
		String split[] = date.split("-",2);
		xpath = xpath.replace("months", split[1]);
		
		objDriver1.findElement(By.xpath(xpath.replace("date", split[0]))).click();
		System.out.println(xpath.replace("date", split[0]));
	}
	
	public void searchButton() {
		
		objDriver1.findElement(By.xpath("//*[@data-testid=\"home-page-flight-cta\"]")).click();
	}
	
	
		
		
		
	}
	
	
	

