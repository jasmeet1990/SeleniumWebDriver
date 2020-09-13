import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetMoveToSignUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//a[text()='Login / Signup'])[1]"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//a[text()='SpiceClub Members']"))).build().perform();
		 WebElement SignUpLink = driver.findElement(By.xpath("//a[text()='Sign up']"));
		action.moveToElement(SignUpLink).build().perform();
		SignUpLink.click();
		
}
}
