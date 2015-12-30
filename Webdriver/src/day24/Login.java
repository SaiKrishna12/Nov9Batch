package day24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login  extends Constants{

	@Test
	public void loginTest()
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait
		                                   (15,TimeUnit.SECONDS);
		driver.get("http://opensource.demo.orangehrm.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
	}

}

