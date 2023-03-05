package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SortOrder extends BaseClass {
	@Test
	public void sortOrder() {
		String title1 = driver.getTitle();
		driver.findElement(By.xpath("//span[text()='Dashboard Name']")).click();
		String title2 = driver.getTitle();
		if (title1.equals(title2)) {
			
			System.out.println(" Dashboard Display not in ascending order by dashboard name ");
		} else {
			System.out.println(" Dashboard Display in ascending order by dashboard name ");
		}

		
		
		
		
		
		
	}

}
