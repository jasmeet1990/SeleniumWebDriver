import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it =handler.iterator();
		String parentWindowId = it.next();
		String child1WindowId = it.next();
		String child2WindowId = it.next();
		String child3WindowId = it.next();
		
		String child1Title = driver.switchTo().window(child1WindowId).getTitle();
		System.out.println(child1Title);
		driver.close();
		String child2Title = driver.switchTo().window(child2WindowId).getTitle();
		System.out.println(child2Title);
		driver.close();
		String child3Title = driver.switchTo().window(child3WindowId).getTitle();
		System.out.println(child3Title);
		driver.close();
		String parentWindowTitle = driver.switchTo().window(parentWindowId).getTitle();
		System.out.println(parentWindowTitle);
		driver.close();
	}

}
