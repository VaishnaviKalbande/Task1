package Task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

@Test
public class Customer {
	WebDriver driver = new ChromeDriver();
  //@Parameters({"customerName","customerEmail","customerPhone"})
  public void addCustomer(String name, String email, String phone)
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://testffc.nimapinfotech.com/");
	  
	  WebElement nameField = driver.findElement(By.xpath("//*[@id=\"mat-dialog-1\"]/kt-customers-edit-dialog/div[1]/form/div/div[4]/div[4]/mat-form-field/div/div[1]/div"));
	  nameField.sendKeys("vaishnavikalbande");
	   
	  WebElement emailField = driver.findElement(By.xpath("//*[@id=\"mat-input-49\"]"));
	   emailField.sendKeys("vaishnavikalbande13.sfdc@gmail.com");
	   
	   WebElement phoneField = driver.findElement(By.xpath("//*[@id=\"mat-input-53\"]"));
	   phoneField.sendKeys("9322699711");
	   
	   
	   WebElement contactpersonField = driver.findElement(By.xpath("//*[@id=\"mat-input-52\"]"));
	   contactpersonField.sendKeys("xyz");
	   
	   WebElement contactField = driver.findElement(By.xpath("//*[@id=\"mat-input-56\"]"));
	   contactField.sendKeys("ABC");
	   
	   
	   
  }
}
