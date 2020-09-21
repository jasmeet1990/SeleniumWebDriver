import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExplicitlyWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		By ClickforJSAlert = By.xpath("//button[text()='Click for JS Alert']");
		
		ElementUtil elementUtil = new ElementUtil(driver);
		//elementUtil.WaitForElementToBeClickable(ClickforJSAlert, 5).click();
		elementUtil.ClickWhenReady(ClickforJSAlert, 5);
		
		
		Alert alert = elementUtil.WaitForAlert(5);
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		

	}

}
