package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/register.php");
		driver.manage().window().maximize();
		Select dropdown=new Select(driver.findElement(By.id("user_title")));
		dropdown.selectByIndex(3);
		Thread.sleep(2000);
		dropdown.selectByValue("Ms");
		Thread.sleep(2000);
		dropdown.selectByVisibleText("Major");
		//firstname
		driver.findElement(By.id("user_firstname")).sendKeys("Ramya");
		driver.findElement(By.id("user_surname")).sendKeys("Etla");
		driver.findElement(By.id("user_phone")).sendKeys("9973924898");
		Select Year=new Select(driver.findElement(By.id("user_dateofbirth_1i")));
		Year.selectByValue("1995");
		Select Month=new Select(driver.findElement(By.id("user_dateofbirth_2i")));
		Month.selectByValue("3");
		Select Date=new Select(driver.findElement(By.id("user_dateofbirth_3i")));
		Date.selectByValue("12");
		Select Licenceperiod=new Select(driver.findElement(By.id("user_licenceperiod")));
		Licenceperiod.selectByValue("26");
		Select dropdown1=new Select(driver.findElement(By.id("user_occupation_id")));
		dropdown1.selectByIndex(7);
		Thread.sleep(2000);
		dropdown1.selectByValue("6");


		
		
		
		

		
		
		
		
		
	}

}
