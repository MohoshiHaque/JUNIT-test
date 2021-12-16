package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

import org.junit.Test;

public class SearchFeatureTest {
	
	@Test
	public void searchProductByKeyword() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");		
		WebDriver drive2 =new ChromeDriver();
		drive2.get("http://automationpractice.com");
		drive2.findElement(By.id("search_query_top")).sendKeys("Printed Dress");
		drive2.findElement(By.name("submit_search")).click();
		int total_number = drive2.findElements(By.xpath("//img[@itemprop='image']")).size();
		
		Assert.assertEquals(5, total_number);
				
	}
	
	public void searchProductBtId() {
		
		
	}

}
