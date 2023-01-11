package com.selenium15nov;

import java.util.concurrent.TimeUnit;

import javax.tools.DocumentationTool.Location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Booking_Cancellation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\niraj\\eclipse-workspace\\Selenium_14nov\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("NirajNj56");
		driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.id("login")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement loc = driver.findElement(By.id("location"));
		Select s = new Select(loc);
		s.selectByValue("London");
		WebElement Hotel = driver.findElement(By.id("hotels"));
		Select se = new Select(Hotel);
		se.selectByValue("Hotel Hervey");
		WebElement room = driver.findElement(By.id("room_type"));
		Select sel = new Select(room);
		sel.selectByValue("Super Deluxe");
		WebElement roomnum = driver.findElement(By.id("room_nos"));
		Select sele = new Select(roomnum);
		sele.selectByIndex(3);
		WebElement chkindate = driver.findElement(By.id("datepick_in"));
		chkindate.clear();
		chkindate.sendKeys("4/12/2022");
		WebElement chkoutdate = driver.findElement(By.id("datepick_out"));
		chkoutdate.clear();
		chkoutdate.sendKeys("8/12/2022");
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select selee = new Select(adult);
		selee.selectByIndex(3);
		WebElement child = driver.findElement(By.id("child_room"));
		Select seleeC = new Select(child);
		seleeC.selectByIndex(3);
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("first_name")).sendKeys("Niraj");
		driver.findElement(By.name("last_name")).sendKeys("manivannan");
		driver.findElement(By.name("address")).sendKeys("CHN");
		driver.findElement(By.name("cc_num")).sendKeys("7904128181234500");
		WebElement cc = driver. findElement(By.id("cc_type"));
		Select s6 = new Select (cc) ;
		s6.selectByIndex (3);
		WebElement ccexp = driver. findElement(By.id("cc_exp_month")) ;
		Select s7 = new Select (ccexp);
		s7. selectByIndex (12);
		WebElement ccyear = driver. findElement(By. id("cc_exp_year"));
		Select s8 = new Select (ccyear);
		s8.selectByIndex (12);
		driver.findElement(By.id("cc_cvv")).sendKeys("256") ; 
		driver.findElement(By. name ("book_now")) .click();
		driver.findElement(By. name ("my_itinerary")) .click();
		driver.findElement(By.xpath("//input[@name='ids[]']")).click();
		driver.findElement(By.xpath("//input[@name='cancelall']")).click();
		driver.switchTo().alert().accept();
		driver. findElement(By.id("logout")) .click () ;
		System.out.println("Logged out");
		





	

	}

}
