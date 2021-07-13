package HandlingWaits;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class imorexp 
{
	public static void main(String args[])throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prapul mc\\Eclipse Workspace\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String url="http://demo.automationtesting.in/Register.html";
		driver.get(url);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		WebElement Refresh = driver.findElement(By.id("Button1"));

		sendKeys(driver,firstName,10,"tom");
		sendKeys(driver,lastName,5,"jerry");
		clickOn(driver,Refresh,10);
		
	}
	
	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value)
	{
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		
	}
	
	public static void clickOn(WebDriver driver, WebElement element, int timeout)
	{
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	}
}
