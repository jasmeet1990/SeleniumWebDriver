import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshworks.com");
		
	List<WebElement> LinksList =driver.findElements(By.tagName("a"));
	System.out.println("Total No of Links are"+ LinksList.size());
	
		for(int i=0;i<LinksList.size();i++) {
			String text = LinksList.get(i).getText();
			if(!text.isEmpty()) {
			System.out.println(i+"--->"+text.trim());
			
			String hrefText = LinksList.get(i).getAttribute("href");
			System.out.println(hrefText);
			}
		}

	}

}
