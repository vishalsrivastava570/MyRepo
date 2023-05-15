package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation2 {
	
	@Test
	public void dell() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dell.com/en-in");
		WebElement dellLogo = driver.findElement(By.xpath("//*[name()='svg'][@class='dellTechLogo mh-show-DeskTop-Tab']"));
       Assert.assertTrue(dellLogo.isDisplayed());
       driver.close();
	}

}
