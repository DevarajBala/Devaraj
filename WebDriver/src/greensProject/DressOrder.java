package greensProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DressOrder {

	public static void main(String[] args) throws InterruptedException {
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
		
		WebElement Mus2 = driver.findElementByXPath("(//a[text()='T-shirts'])[1]");
		Ac.click(Mus2).build().perform(); // Click
		

	}

}
