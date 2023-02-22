package assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import sun.awt.SunHints.Value;

public class NykaaLearn {
	public static void main(String[] args)  {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement mouse = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions ele1 = new Actions(driver);
		ele1.moveToElement(mouse);
		ele1.perform();
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		driver.findElement(By.xpath("(//img[@alt='banner'])[5]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.className("arrow-icon")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();

		WebElement filter = driver.findElement(By.className("css-19j3ean"));
		String filter1 = filter.getText();
		System.out.println(filter1);

		driver.findElement(By.className("css-11gn9r6")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> value = new ArrayList<>(windowHandles);
		driver.switchTo().window(value.get(1));

		WebElement dropdown = driver.findElement(By.className("css-2t5nwu"));
		Select dd = new Select(dropdown);
		dd.selectByVisibleText("180ml");
		WebElement price = driver.findElement(By.xpath("(//div[@class='css-1d0jf8e'])[1]"));
		String MRP = price.getText();
		System.out.println(MRP);

		driver.findElement(By.className("btn-text")).click();
		driver.findElement(By.className("css-g4vs13")).click();

		driver.switchTo().frame(0);
		WebElement totalprice1 = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']"));
		String amount1 = totalprice1.getText();
		System.out.println("Grand amount=" + amount1);

		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		driver.findElement(By.xpath("//span[@class='css-175whwo ehes2bo0']")).click();

		WebElement totalprice2 = driver.findElement(By.xpath("//p[@class='css-1e59vjt eka6zu20']"));
		String amount2 = totalprice2.getText();
		System.out.println("final ampount=" + amount2);
		if (amount1.equals(amount2)) {

			System.out.println("The grand total amount is same as final amount");
		}
		driver.quit();

	}

}
