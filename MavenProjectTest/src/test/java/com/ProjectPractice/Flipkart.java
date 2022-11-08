package com.ProjectPractice;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deva\\eclipse-workspace\\WebDriver\\Chrom\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS	);
		
//		Actions Ac = new Actions(driver);
//		Thread.sleep(2000);
//		WebElement Mus = driver.findElementByXPath("//a[@title='Women']");
//		Ac.moveToElement(Mus).build().perform(); // hover the mouse
		
		//Fetch All the Products Text
		List<WebElement> list_of_products = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		List<WebElement> list_of_products_price = driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
		
		//Use of HashMaop to store Products and Their prices(after conversion to Integer)
		String product_name;
		String product_price;
		int int_product_price;
		HashMap<Integer, String> map_final_products = new HashMap<Integer,String>();
		for(int i=0;i<list_of_products.size();i++) {
			product_name = list_of_products.get(i).getText();//Iterate and fetch product name
			product_price = list_of_products_price.get(i).getText();//Iterate and fetch product price
			product_price = product_price.replaceAll("[^0-9]", "");//Replace anything wil space other than numbers
			int_product_price = Integer.parseInt(product_price);//Convert to Integer
			map_final_products.put(int_product_price,product_name);//Add product and price in HashMap
		
		}

	}
}
