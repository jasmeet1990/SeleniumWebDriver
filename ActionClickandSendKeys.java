import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClickandSendKeys {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

//		Actions action = new Actions(driver);
//		action.sendKeys(username, "jasmeetchadha1990@gmail.com").build().perform();
//		action.sendKeys(password, "Gracefulgod@11").build().perform();
//		action.click(loginButton).build().perform();
		doSendKeysActions(driver,username,"jasmeetchadha1990@gmail.com");
		doSendKeysActions(driver,password,"Gracefulgod@11");
		doClickActions(driver,loginButton);
	}

	public static void doClickActions(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.click(element).build().perform();
	}
	
	public static void doSendKeysActions(WebDriver driver,WebElement element,String value) {
		Actions action = new Actions(driver);
		action.sendKeys(element, value).build().perform();
	}
}
