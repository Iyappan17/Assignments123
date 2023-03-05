package salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
  
	ChromeDriver driver;
	@BeforeMethod
	public void baseClass() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://qeagle-dev-ed.my.salesforce.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.id("password")).sendKeys("Leaf@123");
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Dashboards");
	driver.findElement(By.xpath("//mark[text()='Dashboards']")).click();
	}
	@AfterMethod
	public void after() {
		driver.quit();
		
	}

}