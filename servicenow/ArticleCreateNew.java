package servicenow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArticleCreateNew {
	public static void main(String[] args)  {
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://dev140572.service-now.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("P-qQ7@umSYz8");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("filter")).sendKeys("article");
		driver.findElement(By.xpath("(//div[text()='Create New'])[5]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='sys_display.kb_knowledge.kb_knowledge_base']")).sendKeys("IT",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='kb_knowledge.short_description']")).sendKeys("QA engineer");
		driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
		driver.quit();
		

}
}