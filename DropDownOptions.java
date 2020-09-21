import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOptions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement CreateAccount = driver.findElement(By.xpath("//a[@id='u_0_2']"));
		CreateAccount.click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");
		ArrayList<String> dayList = doGetDropDownOptions(driver,day);
		int dayListsize = doDropDownOptionsSize(driver,day);
		System.out.println("Total options in Day DropDownList is"+dayListsize);
		System.out.println(dayList);
		
		ArrayList<String> monthList =doGetDropDownOptions(driver,month);
		int monthListsize = doDropDownOptionsSize(driver,month);
		System.out.println("Total options in Month DropDownList is"+monthListsize);
		System.out.println(monthList);
		
		ArrayList<String> yearList = doGetDropDownOptions(driver,year);
		int yearListsize = doDropDownOptionsSize(driver,month);
		System.out.println("Total options in Month DropDownList is"+yearListsize);	
		System.out.println(yearList);
//		Select selectDay = new Select(driver.findElement(day));
//		List<WebElement> DayOptions= selectDay.getOptions();
//		for(int i=0;i<DayOptions.size();i++) {
//			String text = DayOptions.get(i).getText();
//			System.out.println(text);
		}

	public static int doDropDownOptionsSize(WebDriver driver,By locator) {
		
				return doGetDropDownOptions(driver,locator).size();
	}
	
	public static ArrayList<String> doGetDropDownOptions(WebDriver driver,By locator) {
		ArrayList<String> ar = new ArrayList<String>();
		Select select = new Select(driver.findElement(locator));
		List<WebElement>OptionsList = select.getOptions();
		for(int i=0;i<OptionsList.size();i++) {
			String text = OptionsList.get(i).getText();
			ar.add(text);
			//System.out.println(text);
		}
			return ar;
		
	}

}
