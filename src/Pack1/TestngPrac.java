package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestngPrac {

	@Test
	public void demo_Method()
	{
		//System.out.println("Hello Testng");
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		
	System.out.println(driver.getTitle());
driver.switchTo().window("https://facebook.com");
	driver.quit();
	}
}
