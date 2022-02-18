package spiceJet_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Payment {

	WebDriver driver = null;
	
	public Payment(WebDriver driver) {
		this.driver=driver;
	}
	
	public void fetchData() {
		//verify location
	    String loc =	driver.findElement(By.xpath("//*[@style=\"flex: 0.67 1 0%; -webkit-box-flex: 0.67;\"]")).getText();
		System.out.println(loc);
		//verify Price
		String price = driver.findElement(By.xpath("//*[@style=\"flex: 0.33 1 0%; -webkit-box-flex: 0.33;\"]")).getText();
		System.out.println(price);
	}
	
	public void verifyData() {
		System.out.println("Data is verified!");
	}
	
	public void convenienceFee() {
		String convenienceFee = driver.findElement(By.xpath("(//*[@class=\"css-1dbjc4n r-18u37iz\"])[2]")).getText();
		System.out.println("Convenience Price: "+convenienceFee);
	}
}
