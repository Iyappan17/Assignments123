package salesforce;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateNewDashboard extends BaseClass {
	@Test
	public void newDashboard() throws InterruptedException {

		driver.findElement(By.xpath("//div[text()='New Dashboard']")).click();
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//input[@class='slds-input'])[1]")).sendKeys("iyappan");

		driver.findElement(By.xpath("//button[text()='Create']")).click();
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		
	}
}