package spiceJet_Pages;

import org.openqa.selenium.By;

public class Select_Flight extends ChromeBrowser {

	public void selectFlight() {
		objDriver1.findElement(By.xpath("(//*[@data-testid=\"spicemax-flight-select-radio-button-3\"]//..)[1]")).click();
		String fNumber = objDriver1.findElement(By.xpath("//div[text()=\"SG 191\"]")).getText();
		System.out.println(fNumber);
		String fPrice = objDriver1.findElement(By.xpath("(//*[text()=\"5,619\"])[1]")).getText();
		System.out.println("Rupees"+"="+ fPrice);
		
	}

	public void continueButton() {
		try {
			objDriver1.findElement(By.xpath("(//*[@data-testid=\"continue-search-page-cta\"])[3]")).click();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
