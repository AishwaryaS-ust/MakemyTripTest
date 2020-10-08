package com.stackroute;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class MakeMyTripExercise {
	
	WebDriver driver;
	
	@BeforeClass
	public void init() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
	}
	
	@Test
	public void webElementTest01() throws InterruptedException, IOException {
			
			String baseUrl="https://www.makemytrip.com/";
			driver.manage().window().maximize();
			driver.get(baseUrl);
			String actualEle = driver.getTitle();
			System.out.println("Title of the page is " +actualEle);
			String expectedEle = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
			Assert.assertEquals(actualEle, expectedEle);
			System.out.println("Test 01 passed");
	}
	
	@Test
	public void webElementTest02() throws InterruptedException, IOException {
						
		String baseUrl1="https://www.makemytrip.com/";
		driver.get(baseUrl1);
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[6]")));
			driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[6]")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));	
			WebElement email=driver.findElement(By.id("username"));
			email.sendKeys("testmailaish20@gmail.com");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button")));
			driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.name("verifyOTPText")));	
			WebElement otptext=driver.findElement(By.name("verifyOTPText"));
			otptext.sendKeys("123456");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button")));
			driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button")).click();
			WebDriverWait wait1 = new WebDriverWait(driver, 20000);
			wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[1]/div/a")));
			driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[1]/div/a")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstName")));	
			WebElement fname=driver.findElement(By.id("firstName"));
			fname.sendKeys("Aishwarya");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));	
			WebElement pwd=driver.findElement(By.id("password"));
			pwd.sendKeys("aishu@20");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[3]/button")));
			driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[3]/button")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"SW\\\"]/div[1]/div[1]/ul/li[6]")));
			String username=driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[6]")).getText();
			String actualuser="Hey Aishwarya";
			Assert.assertEquals(username, actualuser);
			System.out.println("Test 02 Assert 01 passed");
			
	

	}
	@Test
	public void webElementTest03() throws InterruptedException, IOException {
		String baseUrl1="https://www.makemytrip.com/";
		driver.get(baseUrl1);
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[6]")));
			driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[6]")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));	
			WebElement email=driver.findElement(By.id("username"));
			email.sendKeys("testmail20@gmail.com");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button")));
			driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));	
			WebElement pwd=driver.findElement(By.id("password"));
			pwd.sendKeys("aishu@20");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button")));
			driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button")).click();
			String baseUrl2="https://www.makemytrip.com/hotels/";
			driver.get(baseUrl2);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div/input")));
			WebElement citydropdown=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div/input"));
			citydropdown.click();
			citydropdown.sendKeys("Bengaluru,Karnataka");
			citydropdown.sendKeys(Keys.ARROW_DOWN);
			citydropdown.sendKeys(Keys.ENTER);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[4]")));
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[4]")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[1]/div/div[3]/p/span[2]")));
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[1]/div/div[3]/p/span[2]")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[2]")));
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[2]")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("hsw_search_button")));
			driver.findElement(By.id("hsw_search_button")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"Listing_hotel_0\"]/a/div/div[1]/div[2]")));
			driver.findElement(By.xpath("//*[@id=\"Listing_hotel_0\"]/a/div/div[1]/div[2]")).click();
			String actualEle = driver.getTitle();
			 System.out.println("Current Title " +actualEle);
			Assert.assertTrue(actualEle.contains("MakeMyTrip"));
			String baseUrl3="https://www.makemytrip.com/hotels/hotel-details/?hotelId=201402061951219265&mtkeys=N$$s9rHC9RN7n%2F37vS3agB2ClILQ5kSgcu4W%2B6x0fquJ%2F1VdDQb5%2F91SPcR1dd0alXmNcs2iTC6uT38%2BZZHBIwqz7Il7CH8%2B9%2BHMQRQWUTy55B8fRTY6fLes%2FwZqKJc4i0B6%2F8bfAtUDbgqkzFDgnrExMQg2Bler4tBJEv8%2FD9OVD1%2BvHG8ALAaIukShr%2BGGU9BdBrSpXRA%2BJ6U7SCudWnGjOcCGklEZ5mb%2FNQ6An3N42wyUhqrzglAap0hjWuh3RNHCsoAvl2tctptgrxHUD1RhRdWNCux3JWA8SmM41Pl8sUz11fD5zmrF4dfzD1QH9YphUumQz6EtfWLgT%2BOfFVsa7kinhhHeVD3rkRM%2BCkG%2BTCDVZ08xquIUw%3D%3D&_uCurrency=INR&checkin=10142020&checkout=10192020&city=CTBLR&country=IN&lat=12.95541&lng=77.64106&locusId=CTBLR&locusType=city&rank=1&roomStayQualifier=2e0e&searchText=Bengaluru%2C%20Karnataka%2C%20India&visitorId=a755f72c-a818-4ea8-ac97-c41da01c8e37";
			driver.get(baseUrl3);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("detpg_headerright_book_now")));
			driver.findElement(By.id("detpg_headerright_book_now")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div[1]/ul/li[2]")));
			WebElement paynowopt=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div[1]/ul/li[2]"));		
			paynowopt.click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("title")));
			Select title = new Select(driver.findElement(By.id("title")));
			title.selectByVisibleText("Mrs");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fName")));	
			WebElement firstname=driver.findElement(By.id("fName"));
			firstname.sendKeys("Aishwarya");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lName")));	
			WebElement lastname=driver.findElement(By.id("lName"));
			lastname.sendKeys("Srinivasan");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div[2]/div[1]/div/a")));
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div[2]/div[1]/div/a")).click();
			String payacttitle = driver.getTitle();
			String payexptitle = "MakeMytrip Payment : Safe and Secure";
			Assert.assertEquals(payacttitle, payexptitle);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("PAYMENT_inputVpa")));	
			WebElement upadet=driver.findElement(By.id("PAYMENT_inputVpa"));
			upadet.sendKeys("aishu@newbank");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btn_gen_pmt")));
			driver.findElement(By.id("btn_gen_pmt")).click();

	}
	@AfterClass
	public void close() {
		driver.quit();
		}
}
