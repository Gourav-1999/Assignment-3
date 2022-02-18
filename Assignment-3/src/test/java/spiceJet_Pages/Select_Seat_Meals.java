package spiceJet_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Select_Seat_Meals {

	WebDriver driver = null;
	
	public Select_Seat_Meals(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectSeat() {
		driver.findElement(By.xpath("(//*[text()=\"2A\"])[1]")).click();
	}
	
	public void adjacentSeat() {
		driver.findElement(By.xpath("(//*[@viewBox=\"0 0 18 18\"])[2]")).click();
	}
	
	public void accept() {
		driver.findElement(By.xpath("//*[@style=\"height: 26px; width: 26px;\"]")).click();
	}
	
	public void cont_Meal_Button() {
		//continue
		driver.findElement(By.xpath("(//*[text()=\"Continue\"])[2]")).click();
		//meal button
		driver.findElement(By.xpath("(//*[text()=\"Select Meals\"]//..)[1]")).click();
	}
	
	public void selectMeal() {
		//select meal
		driver.findElement(By.xpath("//*[text()=\"Cucumber, tomato & cheese in multigrain bread\"]")).click();
		//done
		driver.findElement(By.xpath("(//*[text()=\"Done\"]//..)[1]")).click();
	}
	
	public void continueButtonAgain() {
		//continue
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.findElement(By.xpath("(//*[text()=\"Continue\"]//..)[1]")).click();
			}
	}