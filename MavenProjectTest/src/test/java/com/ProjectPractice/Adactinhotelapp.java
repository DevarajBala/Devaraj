package com.ProjectPractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactinhotelapp {

	public static void main(String[] args) throws InterruptedException, IOException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deva\\eclipse-workspace\\WebDriver\\Chrom\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS	);

		//New user Registration 
		
//		driver.findElementByXPath("//a[contains(text(),'New User Register Here')]").click();
//		driver.findElementByXPath("//input[@id= 'username']").sendKeys("Devaprakash");
//		driver.findElementByXPath("//input[@id= 'password']").sendKeys("De@123");
//		driver.findElementByXPath("//input[@id= 're_password']").sendKeys("De@123");
//		driver.findElementByXPath("//input[@id= 'full_name']").sendKeys("Devaraj");
//		driver.findElementByXPath("(//input[@maxlength = '50'])[2]").sendKeys("devwrkact@gmail.com");
//		
//		//Captcha 
//		String str = JOptionPane.showInputDialog("Enter Captcha") ;
//		WebElement element = driver.findElementByXPath("//input[@name = 'captcha']");
//		element.sendKeys(str);
//		
//		driver.findElementByXPath("//input[@type = 'checkbox']").click();
//		driver.findElementByXPath("//input[@type = 'submit']").click();
//		driver.findElementByXPath("//a[contains(text(),'Click here to login')]").click();
		
		//Login
		driver.findElementByXPath("//input[@id= 'username']").sendKeys("Devaprakash");
		driver.findElementByXPath("//input[@id= 'password']").sendKeys("De@123");
		driver.findElementByXPath("//input[@id= 'login']").click();
		
		//Select
		WebElement List = driver.findElement(By.xpath("//select[@id='location']"));
		Select S = new Select(List);
		S.selectByVisibleText("New York");
		
		WebElement List1 = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select S1 = new Select(List1);
		S1.selectByIndex(2);
		
		WebElement List2 = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select S2 = new Select(List2);
		S2.selectByValue("Deluxe");
		
		WebElement List3 = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select S3 = new Select(List3);
		S3.selectByValue("4");
		
		//TodayDate
		
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		LocalDate localDate = LocalDate.now();
//		driver.findElementByXPath("//input[@id='datepick_in']").sendKeys(dtf.format(localDate));
		
		WebElement Checkin = driver.findElementByXPath("//input[@id='datepick_in']");
		Checkin.clear();
		Checkin.sendKeys("18/10/2022");
		
		WebElement Checkout = driver.findElementByXPath("//input[@id='datepick_out']");
		Checkout.clear();
		Checkout.sendKeys("20/10/2022");
			
		WebElement List4 = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select S4 = new Select(List4);
		S4.selectByValue("3");
		
		WebElement List5 = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select S5 = new Select(List5);
		S5.selectByValue("4");
		
		driver.findElementByXPath("//input[@id='Submit']").click();
		driver.findElementByXPath("//input[@type='radio']").click();		
		driver.findElementByXPath("//input[@id='continue']").click();
		
		//Book a hotel page
		driver.findElementByXPath("//input[@id= 'first_name']").sendKeys("Deva");
		driver.findElementByXPath("//input[@id= 'last_name']").sendKeys("B");
		driver.findElementByXPath("//textarea[@id= 'address']").sendKeys("20 Siva st chennai");
		driver.findElementByXPath("//input[@id= 'cc_num']").sendKeys("1000 0000 0000 0000");
		
		WebElement List6 = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select S6 = new Select(List6);
		S6.selectByValue("VISA");
		
		WebElement List7 = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select S7 = new Select(List7);
		S7.selectByValue("VISA");
		
		WebElement List8 = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select S8 = new Select(List8);
		S8.selectByValue("6");
		
		WebElement List9 = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select S9 = new Select(List9);
		S9.selectByValue("2021");
		
		driver.findElementByXPath("//input[@id= 'cc_cvv']").sendKeys("1000");
		driver.findElementByXPath("//input[@id= 'book_now']").click();
		Thread.sleep(5000);
		//Screenshot
		TakesScreenshot Snap = (TakesScreenshot)driver; // narrow casting
		File scr = Snap.getScreenshotAs(OutputType.FILE);
		File Store = new File("C:\\Users\\Deva\\eclipse-workspace\\WebDriver\\Screenshot\\Image1.png");
		FileUtils.copyFile(scr, Store);
		
		driver.findElementByXPath("//input[@id= 'logout']").click();
		
		File scr1 = Snap.getScreenshotAs(OutputType.FILE);
		File Store1 = new File("C:\\Users\\Deva\\eclipse-workspace\\WebDriver\\Screenshot\\Image2.png");
		FileUtils.copyFile(scr1, Store1);
		driver.quit();
		
		

	}

}