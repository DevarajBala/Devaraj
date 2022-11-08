package projectwork;

import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;




public class JavaScripitforScroll {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deva\\eclipse-workspace\\WebDriver\\Chrom\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement Logo = driver.findElementByXPath("//div[@class = \"nav-logo-base nav-sprite\"]");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS	); // Implicit wait 
		
				
		js.executeScript("arguments[0].scrollIntoView();", Logo); // scroll down using web element 
		js.executeScript("window.scrollBy(0,-4000);"); //scroll up
		js.executeScript("window.scrollBy(0,4000);");  //scroll down
		
		js.executeScript("arguments[0].click();", Logo ); // click
		js.executeScript("document.getElementById('twotabsearchtextbox').value='Mobile';");// value pass
		js.executeScript("alert('hello world');"); //to show some alert 
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		js.executeScript("history.go(0)"); //Refresh
		String sText =  js.executeScript("return document.title;").toString(); //get title
		System.out.println(sText);
		js.executeScript("window.location = 'http://demo.guru99.com/'");//launch new URL
		String geturl= js.executeScript("return document.URL;").toString(); //Get URL
		System.out.println(geturl);
		//String GetText = js.executeScript("return document.documentElement.innerText;").toString();  // get entire Website texts
		//System.out.println(GetText);
		Thread.sleep(2000);
		WebElement GetTxt = driver.findElementByXPath("//input[@type='submit']");
		js.executeScript("return arguments[0].innerHTML", GetTxt).toString(); //getText 
		System.out.println(GetTxt);
		
		WebDriverWait wait = new WebDriverWait (driver,30);//Explicit wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']")));
		
		
	}

}
