package servicenow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewCaller {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev140572.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("P-qQ7@umSYz8");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@placeholder='Filter navigator']")).sendKeys("callers");
		driver.findElement(By.xpath("//div[text()='Callers']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("sysverb_new")).click();
		driver.findElement(By.id("sys_user.first_name")).sendKeys("iyappan");
		driver.findElement(By.id("sys_user.last_name")).sendKeys("p");
		driver.findElement(By.id("sys_user.title")).sendKeys("IT");
		driver.findElement(By.id("sys_user.email")).sendKeys("iyappanp1708@gmail.com");
		driver.findElement(By.id("sys_user.mobile_phone")).sendKeys("+91 8870514842");
		driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
        WebElement ele1 = driver.findElement(By.className("outputmsg_text"));
        String title = ele1.getText();
        System.out.println(title);
        driver.quit();
	}
}