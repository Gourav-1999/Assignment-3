package spiceJet_Pages;

import org.openqa.selenium.By;

public class Select_Seat_Meals extends ChromeBrowser {

	
	
	public void selectSeat() {
		objDriver1.findElement(By.xpath("(//*[text()=\"1A\"])[1]")).click();
	}
	
	public void adjacentSeat() {
		objDriver1.findElement(By.xpath("(//*[@viewBox=\"0 0 18 18\"])[2]")).click();
	}
	
	public void accept() {
		objDriver1.findElement(By.xpath("//*[@style=\"height: 26px; width: 26px;\"]")).click();
	}
	
	public void cont_Meal_Button() {
		//continue
		objDriver1.findElement(By.xpath("(//*[text()=\"Continue\"])[2]")).click();
		//meal button
	    objDriver1.findElement(By.xpath("(//*[text()=\"Select Meals\"]//..)[1]")).click();
	}
	
	public void selectMeal() throws InterruptedException {
		//select meal
		objDriver1.findElement(By.xpath("//*[text()=\"Cucumber, tomato & cheese in multigrain bread\"]")).click();
		//done
		objDriver1.findElement(By.xpath("(//*[text()=\"Done\"]//..)[1]")).click();
		Thread.sleep(4000);
	}
	
	public void continueButtonAgain() {
		//continue
		objDriver1.findElement(By.xpath("(//*[text()=\"Continue\"]//..)[1]")).click();
	}
}