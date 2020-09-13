import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement RightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions action = new Actions(driver);
		action.contextClick(RightClickMe).build().perform();
		List<WebElement> optionsList = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//li"));
		for(int i=0;i<optionsList.size();i++) {
			String text = optionsList.get(i).getText();
			System.out.println(text);
							
		}
		
	}

}
