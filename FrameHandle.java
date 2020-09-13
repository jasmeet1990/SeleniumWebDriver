import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		int frameCount = driver.findElements(By.tagName("frame")).size();
		System.out.println(frameCount);
		
		 driver.switchTo().frame(driver.findElement(By.name("content")));

		String frame1Text = driver.findElement(By.xpath("//h1[text()='Example home page ']")).getText();
		System.out.println(frame1Text);
		driver.switchTo().defaultContent();
		
	}

}
