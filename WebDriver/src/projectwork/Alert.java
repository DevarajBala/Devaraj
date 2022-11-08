package projectwork;

import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deva\\eclipse-workspace\\WebDriver\\Chrom\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//button[@onclick = 'alertbox()']").click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		driver.findElementByXPath("//a[contains(text(),'Alert with OK & Cancel')]").click();
		driver.findElementByXPath("//button[@onclick='confirmbox()']").click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Alert with Textbox ']").click();
		driver.findElementByXPath("//button[@onclick='promptbox()']").click();
		driver.switchTo().alert().sendKeys("Deva");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		

	}

}
