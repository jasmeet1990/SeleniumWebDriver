import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownFacebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement CreateAccount = driver.findElement(By.xpath("//a[@id='u_0_2']"));
		CreateAccount.click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String date = "14-Jul-1990";
		System.out.println(date.split("-")[0]);
		System.out.println(date.split("-")[1]);
		System.out.println(date.split("-")[2]);

		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");

		ElementUtil el = new ElementUtil(driver);
		el.doSelectByVisibleText(day, date.split("-")[0]);
		el.doSelectByVisibleText(month, date.split("-")[1]);
		el.doSelectByVisibleText(year, date.split("-")[2]);

	}

}
