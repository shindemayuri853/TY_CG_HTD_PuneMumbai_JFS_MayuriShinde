package com.capgemini.seleniumTool.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicitely will handles exception
		// enter url
		driver.get("https://www.gmail.com");
		// enter valid username
		driver.findElement(By.id("identifierId")).sendKeys("shindemayuri853@gmail.com");
		// click on next
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		// enter valid password
		driver.findElement(By.name("password")).sendKeys("shindemayuri853@");
		// login
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//Compose
		driver.findElement(By.cssSelector("div[class='T-I J-J5-Ji T-I-KE L3']")).click();
	}// end of method

}// end of class
