package projectwork;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Testcases {

	public static void main(String[] args) throws InterruptedException, IOException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deva\\eclipse-workspace\\WebDriver\\Chrom\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement Signup = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		Signup.click();
		Thread.sleep(1000);
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		FirstName.sendKeys("Deva");
		WebElement Surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		Surname.sendKeys("Bala");
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("devaraj@gmail.com");
		Thread.sleep(1000);
		WebElement email1 = driver.findElement(By.xpath("//input[@name ='reg_email_confirmation__']"));
		email1.sendKeys("devaraj@gmail.com");
		WebElement Password = driver.findElement(By.xpath("//input[@data-type='password']"));
		Password.sendKeys("XXXXXXX");
		
		//Date selection using select
		WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
		Select Dy = new Select(Day);
		Dy.selectByValue("9");
		WebElement Mon = driver.findElement(By.xpath("//select[@id='month']"));
		Select Mo = new Select(Mon);
		Mo.selectByIndex(2);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select Ye = new Select(year);
		Ye.selectByVisibleText("2018");
		//Thread.sleep(2000);
		WebElement Gender = driver.findElement(By.xpath("//input[@value='2']"));
		Gender.click();
		
		
		
		//Screenshot
		TakesScreenshot Snap = (TakesScreenshot)driver; // narrow casting
		File scr = Snap.getScreenshotAs(OutputType.FILE);
		File Store = new File("C:\\Users\\Deva\\eclipse-workspace\\WebDriver\\Screenshot\\Image.png");
		FileUtils.copyFile(scr, Store);
		
		//Frame 
		
		
		
		
		
		
		
		
	}

}
