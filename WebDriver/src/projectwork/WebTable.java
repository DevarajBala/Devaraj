package projectwork;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deva\\eclipse-workspace\\WebDriver\\Chrom\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Table = driver.findElementById("customers");
		List<WebElement> Headers = Table.findElements(By.tagName("th"));
		for (WebElement Header : Headers) {
			String text = Header.getText();
			System.out.println(text);	
		}
		List<WebElement> Col = Table.findElements(By.xpath("//table/tbody/tr[2]/td"));
		for (WebElement column : Col) {
			String colname = column.getText();
			System.out.println(colname);
		}
	}

}
