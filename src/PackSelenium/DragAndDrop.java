package PackSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import dev.failsafe.internal.util.Assert;

public class DragAndDrop {

	WebDriver driver; 
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\Chrome Driver New\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement frame =driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(drag, drop).perform();
		
		String expMessage ="Dropped!";
		String actMessage = drop.getText();
		
		assert actMessage.equals(expMessage) : "The drag-and-drop action was not successful. Expected 'Dropped!', but got: " + actMessage;
        System.out.println("Drag and drop successful, test passed!");
		
		

	}

}
