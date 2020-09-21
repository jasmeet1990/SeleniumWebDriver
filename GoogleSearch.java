import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearch {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='aajZCb']/ul/li/descendant::div[@class='sbl1']/span"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			String text =list.get(i).getText();
			System.out.println(text);
			if(text.contains("javascript tutorial")) {
				list.get(i).click();
				break;
			}
		}
		

	}

}
