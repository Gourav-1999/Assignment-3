package spiceJet_Pages;

import org.openqa.selenium.By;

public class Payment extends ChromeBrowser{


	String loc;
	String price;
	
	public void fetchData() {
		//verify location
	    loc =	objDriver1.findElement(By.xpath("//*[@style=\"flex: 0.67 1 0%; -webkit-box-flex: 0.67;\"]")).getText();
		System.out.println(loc);
		//verify Price
	    price = objDriver1.findElement(By.xpath("//*[@style=\"flex: 0.33 1 0%; -webkit-box-flex: 0.33;\"]")).getText();
		System.out.println(price);
	}
	
	public void verifyData() {
		System.out.println("Data is verified!");
		
	}
	
	public void convenienceFee() {
		String convenienceFee = objDriver1.findElement(By.xpath("(//*[@style=\"flex: 0.3 1 0%; -webkit-box-flex: 0.3;\"])[2]")).getText();
		System.out.println("Convenience Price: "+convenienceFee);
	}
}
