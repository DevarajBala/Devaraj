package projectwork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deva\\eclipse-workspace\\WebDriver\\Chrom\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		Actions Ac = new Actions(driver);
		
		WebElement Mus = driver.findElementByXPath("//a[text()='Mobiles']");
		Ac.moveToElement(Mus).build().perform(); // hover the mouse
		
		Thread.sleep(2000);
		WebElement Mus1 = driver.findElementByXPath("//a[text()='Mobiles']");
		Ac.click(Mus1).build().perform(); // Click
		
		Thread.sleep(2000);
		WebElement Mus2 = driver.findElementByXPath("(//span[contains(text(),'Mobiles & Accessories')])[2]");
		Ac.doubleClick(Mus2).build().perform(); // Double click
		
		
	}

}
