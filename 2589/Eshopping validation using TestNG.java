package com.htc.amazon.eshopping;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonShopping {
	
	WebDriver driver=new ChromeDriver();
	
	//this method is to navigate to Amazon
		@BeforeClass
		public void navigate() {
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.amazon.com/");
			
					
			
		}
	
	//Login to Amazon
	@Test
	public void loginAmazontest() {
		
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
		driver.findElement(By.id("ap_email")).sendKeys("username");
		driver.findElement(By.id("ap_password")).sendKeys("password");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#signInSubmit")).click();
		
	}
	//search and select product
	@Test
	public void searchSelectProducttest() {
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("polk speaker bar");
		driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
		
		String css="#result_2 > div > div > div > div.a-fixed-left-grid-col.a-col-right > div.a-row.a-spacing-small > div:nth-child(1) > a > h2";
		
		driver.findElement(By.cssSelector(css)).click();
		
		driver.findElement(By.cssSelector("#add-to-cart-button")).click();
		
		
					
			
		}
		
	

	//add to wish list
	@Test
	public void wishListtest() {
		
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone x case");
		
		driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
		
		driver.findElement(By.cssSelector("#result_0 > div > div > div > div.a-fixed-left-grid-col.a-col-right > div.a-row.a-spacing-small > div.a-row.a-spacing-none.scx-truncate-medium.sx-line-clamp-2 > a > h2")).click();
		
		driver.findElement(By.id("add-to-wishlist-button-submit")).click();
		
		Alert a=driver.switchTo().alert();
		a.accept();
		
	}
	
	
	
	
	@AfterTest
	public void removeFromChart() {
		
		driver.findElement(By.id("nav-cart")).click();
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"activeCartViewForm\"]/div[2]/div/div[4]/div/div[1]/div/div/div[2]/div/span[1]/span/input")).click();
		
	}
	

	@AfterClass
	public void terminateBrowser() {
		
		 driver.close();
	}
	

}
