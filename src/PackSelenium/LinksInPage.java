package PackSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksInPage {

	WebDriver driver;
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\Chrome Driver New\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();		
		

		WebElement cookies = driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
		cookies.click();
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links in this page: "+links.size());
		
		
		for(int i=0;i<links.size();i++) {
			
			System.out.println("Links on the page are: "+links.get(i).getAttribute("href"));
			System.out.println("Name of Links on the page: "+links.get(i).getText());
		}
		
	}

}
