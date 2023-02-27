package servicenow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ServiceNow {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://dev140572.service-now.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("P-qQ7@umSYz8");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("filter")).sendKeys("service catalog");
		driver.findElement(By.xpath("(//div[text()='Service Catalog'])[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//strong[text()='iPhone 6s']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		WebElement dropdown1 = driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[1]"));
		Select dd1=new Select(dropdown1);
		dd1.selectByVisibleText("Gold");
		WebElement dropdown2 = driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[2]"));
		Select dd2=new Select(dropdown2);
		dd2.selectByVisibleText("128");
		driver.findElement(By.id("oi_order_now_button")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		WebElement ele1 = driver.findElement(By.xpath("//div[@class='notification notification-success']"));
		String order = ele1.getText();
		System.out.println(order);
		WebElement ele2 = driver.findElement(By.id("requesturl"));
		String ordernumber = ele2.getText();
		System.out.println(ordernumber);
		
	}
	
	

}
