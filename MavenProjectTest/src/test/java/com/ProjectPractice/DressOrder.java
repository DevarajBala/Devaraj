package com.ProjectPractice;

import java.awt.Robot;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DressOrder {

	public static void main(String[] args) throws InterruptedException, Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deva\\eclipse-workspace\\WebDriver\\Chrom\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS	);
		
        //Mouse action hover and click
		Actions Ac = new Actions(driver);
		Thread.sleep(2000);
		WebElement Mus = driver.findElementByXPath("//a[@title='Women']");
		Ac.moveToElement(Mus).build().perform(); // hover the mouse
		
		Thread.sleep(2000);
		WebElement Mus1 = driver.findElementByXPath("(//a[text()='T-shirts'])[1]");
		Ac.click(Mus1).build().perform(); // Click		
				
		driver.findElementByXPath("//a[@title='List']").click();
		
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//WebElement Logo = driver.findElementByXPath("//a[@itemprop='url']//img[@itemprop ='image']");			
		//js.executeScript("arguments[0].scrollIntoView();", Logo);
		js.executeScript("window.scrollBy(0,500);");
		driver.findElementByXPath("//span[text()='More']").click();
		
		for (int i = 1; i < 10; i++) {
			driver.findElementByXPath("//i[@class='icon-plus']").click();
		}
		
		WebElement List = driver.findElement(By.xpath("//select[@id='group_1']"));
		Select S = new Select(List);
		S.selectByValue("2");
		driver.findElementByXPath("//a[@name ='Blue']").click();
		driver.findElementByXPath("//span[text()='Add to cart']").click();
		driver.findElementByXPath("//a[@title ='Proceed to checkout']").click();
		driver.findElementByXPath("//span[text()='Proceed to checkout']").click();
		
		driver.findElementByXPath("//input[@id='email']").sendKeys("devwrkact@gmail.com");
		driver.findElementByXPath("//input[@id='passwd']").sendKeys("Dev@123");
		driver.findElementByXPath("//button[@id=\"SubmitLogin\"]/span/i").click();
		driver.findElementByXPath("//span[text()='Proceed to checkout']").click();
		driver.findElementByXPath("//input[@id='cgv']").click();
		driver.findElementByXPath("//button[@name='processCarrier']//following-sibling::span").click();
		driver.findElementByXPath("//span[text() ='(order processing will be longer)']").click();
		driver.findElementByXPath("//button[@type='submit']//span[text()='I confirm my order']").click();
	
		TakesScreenshot Snap = (TakesScreenshot)driver; // narrow casting
		File scr = Snap.getScreenshotAs(OutputType.FILE);
		File Store = new File("C:\\Users\\Deva\\eclipse-workspace\\WebDriver\\Screenshot\\Image3.png");
		FileUtils.copyFile(scr, Store);
		driver.quit();
		
	}

}
