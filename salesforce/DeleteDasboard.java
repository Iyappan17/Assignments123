package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DeleteDasboard extends BaseClass{
	@Test
	public void deleteDasboard() throws InterruptedException {
		driver.findElement(By.xpath("//input[contains(@class,'search-text-field slds')]")).sendKeys("iyappan");
		Thread.sleep(3000);
        WebElement delete = driver.findElement(By.xpath("(//button[@class='slds-button slds-button_icon-border slds-button_icon-x-small'])[1]//following::lightning-primitive-icon"));
		Actions dd1=new Actions(driver);
		dd1.moveToElement(delete).perform();
		delete.click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		
		driver.findElement(By.xpath("(//span[text()='Delete'])[2]")).click();
	}

}
