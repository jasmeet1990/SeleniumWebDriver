import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "../SeleniumSessions/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
      WebElement CreateAccount = driver.findElement(By.xpath("//a[@id='u_0_2']"));
      CreateAccount.click();
      Thread.sleep(5000);
      WebElement firstName = driver.findElement(By.name("firstname"));
      firstName.sendKeys("Jasmeet");
      WebElement lastName = driver.findElement(By.name("lastname"));
      lastName.sendKeys("Kaur");
      
      WebElement emailId = driver.findElement(By.name("reg_email__"));
      emailId.sendKeys("jasmeetchadha1990@gmail.com");
      
      WebElement ConfirmEmailId = driver.findElement(By.name("reg_email_confirmation__"));
      ConfirmEmailId.sendKeys("jasmeetchadha1990@gmail.com");
      WebElement password = driver.findElement(By.xpath("//input[@data-type='password']"));
      password.sendKeys("Testing@11");
      
      WebElement day = driver.findElement(By.id("day"));
      Select dayDropdown = new Select(day);
      dayDropdown.selectByIndex(14);
            
      WebElement month = driver.findElement(By.id("month"));
      Select monthDropdown = new Select(month);
      monthDropdown.selectByVisibleText("Jul");
      
      WebElement year = driver.findElement(By.id("year"));
      Select yearDropdown = new Select(year);
      yearDropdown.selectByValue("1991");
      
      WebElement Gender = driver.findElement(By.xpath("//label[text()='Female']"));
      Gender.click();
      WebElement SignUpButton = driver.findElement(By.name("websubmit"));
      SignUpButton.click();
      driver.close();
	}

}
