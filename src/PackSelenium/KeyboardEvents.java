package PackSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents {

	WebDriver driver;
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\Chrome Driver New\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();		
		
		
		WebElement actualText = driver.findElement(By.xpath("//*[@id=\"dropZone\"]//div[6]/div[1]"));
		
		WebElement targetText = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]"));
		
		Actions actions = new Actions(driver);
		actions.keyDown(actualText, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    actions.keyDown(targetText, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();	
	
		
	}

}
