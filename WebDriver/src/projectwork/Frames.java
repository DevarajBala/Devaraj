package projectwork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deva\\eclipse-workspace\\WebDriver\\Chrom\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		//Single Frame 
		//driver.switchTo().frame("singleframe");
		//WebElement frame = driver.findElementByXPath("//iframe[@id ='singleframe']");
		driver.switchTo().frame(0);
		
		driver.findElementByXPath("//input[@type='text']").sendKeys("Java");
		driver.switchTo().defaultContent(); // to come out from frame
		
		//Multi frame
		
		driver.findElementByXPath("//a[text()='Iframe with in an Iframe']").click();
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		
		driver.findElementByXPath("//input[@type = 'text']").sendKeys("Deva");
		driver.switchTo().parentFrame(); // come out from child frame
		driver.switchTo().defaultContent(); // come out from all the frame it will come to default place.
		
		
		
		
		
		
		
		
		
		
		

	}

}
