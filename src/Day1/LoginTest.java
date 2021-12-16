package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		
		WebDriver drive1 =new ChromeDriver();
		drive1.get("http://automationpractice.com");
		
		WebElement element =drive1.findElement(By.className("login"));
		element.click();
		
		element=drive1.findElement(By.id("email"));
		element.sendKeys("mohoshihaque@gmail.com");
		
		//enter password
		
		drive1.findElement(By.id("passwd")).sendKeys("@bswbsw123@");
		
		//click button
		
		
		//
		WebElement name1= drive1.findElement(By.className("navigation_page"));
		String name1_text= name1.getText();
		System.out.println(name1_text);
		
		if(name1_text.equals("Authentication")) {
			
			System.out.println("Test case is passed"); 
		}
		
		

	}

}
