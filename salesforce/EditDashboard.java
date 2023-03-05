package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EditDashboard extends BaseClass {
	@Test
	public void editDashboard() throws InterruptedException {
		driver.findElement(By.xpath("//input[contains(@class,'search-text-field slds')]")).sendKeys("iyappan");
		Thread.sleep(4000);
		WebElement edit = driver.findElement(By.xpath("(//button[@class='slds-button slds-button_icon-border slds-button_icon-x-small'])[1]//following::lightning-primitive-icon"));
		Actions dd1=new Actions(driver);
		dd1.moveToElement(edit).perform();
		edit.click();
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		//driver.switchTo().defaultContent();
        Thread.sleep(4000);
        driver.switchTo().frame(0);
        //Thread.sleep(4000);
	    driver.findElement(By.xpath("//button[@title='Edit Dashboard Properties']")).click();
		
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Salesforce");
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
		
        driver.findElement(By.xpath("//button[text()='Save']")).click();
	}

}
