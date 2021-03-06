package day19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImplicitWaitExample {

	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		
		driver=new FirefoxDriver();
		driver.get("http://pvrcinemas.com");
	}
	@Test
	public void waitTest()
	{
		driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
		driver.findElement(By.className("modal-skip")).click();
		
		driver.findElement(By.xpath("//*[@id='carousel-example-generic']/div/div[2]/div/div/div/span/a")).click();
		
	}
}
