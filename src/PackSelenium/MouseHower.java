package PackSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHower {

	WebDriver driver; 
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\Chrome Driver New\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.ca/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement sneakersElement = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[8]"));
		
		
		Actions actions = new Actions(driver);
		actions.moveToElement(sneakersElement).perform();

	}

}
