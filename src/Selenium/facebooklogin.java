package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class facebooklogin {

	public static void main(String[] args) {
   WebDriver driver=new EdgeDriver();
   driver.get("https://www.facebook.com/");
   driver.manage().window().maximize();
   driver.findElement(By.name("email")).sendKeys("etlaramya@gmail.com");
   driver.findElement(By.name("pass")).sendKeys("Rocky@1203");
   driver.findElement(By.name("login")).click();
	}

}
