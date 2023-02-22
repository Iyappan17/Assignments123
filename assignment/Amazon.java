package assignment;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
public static void main(String[] args) throws IOException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
	String price1 = driver.findElement(By.className("a-price-whole")).getText();
	System.out.println(price1);
	
	 
	String rating = driver.findElement(By.xpath("(//span[@class='a-size-base'])[1]")).getText();
	System.out.println("rating"+ rating);
	driver.findElement(By.xpath("//span[text()='(Renewed) OnePlus 9 Pro 5G (Pine Green, 12GB RAM, 256GB Storage)']")).click();
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> value = new ArrayList<>(windowHandles);
	driver.switchTo().window(value.get(1));
	File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
	File destination=new File("./snap/img.png");
	FileUtils.copyFile(screenshotAs, destination);
	driver.findElement(By.id("add-to-cart-button")).click();
	String price2 = driver.findElement(By.className("a-price-whole")).getText();
	System.out.println(price2);
	if (price1.equals(price2)) {
		System.out.println("verifyed");
		
	
	}
	driver.quit();
	
	
}
}
