package projectwork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickandholdmouse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deva\\eclipse-workspace\\WebDriver\\Chrom\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		WebElement Drag = driver.findElementById("form:drag_content"); //Drag and drop the element
		WebElement Drop = driver.findElementById("form:drop_content");
		Thread.sleep(2000);
		ac.clickAndHold(Drag).build().perform();
		ac.dragAndDrop(Drag, Drop).build().perform();
		
		WebElement Drag2 = driver.findElementById("form:conpnl_content"); // move the element using mouse
		Thread.sleep(3000);
		ac.clickAndHold(Drag2).build().perform();
		ac.moveToElement(Drag2, 200, 0).build().perform();
		
		
	}

}
