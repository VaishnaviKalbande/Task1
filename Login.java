package Task_1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Login{
    
	WebDriver driver = new ChromeDriver();
	

	
	@Test(priority=0)
	public void setup() {
		
		driver=new FirefoxDriver();
		driver.get(" https://testffc.nimapinfotech.com/");
		}
	
	public void testLogin(String username,String Password) {
		driver.findElement(By.id("mat-input-11")).sendKeys("vaishnavikalbande13.sfdc@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='mat-input-12']")).sendKeys("Vaishnavi@1");
		driver.findElement(By.xpath("//*[@id=\"kt_login_signin_submit\"]")).click();
	}
	
	

		
	}
	