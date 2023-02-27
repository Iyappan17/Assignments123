package servicenow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewProposal {
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
		driver.findElement(By.id("filter")).sendKeys("proposal");
		driver.findElement(By.xpath("//div[text()='My Proposals']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[@class='icon icon-lightbulb']")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> value = new ArrayList<>(windowHandles);
		driver.switchTo().window(value.get(1));
		driver.findElement(By.xpath("//a[text()='Issue with networking']")).click();
		driver.switchTo().window(value.get(0));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();

	}
}