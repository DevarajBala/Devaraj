package projectwork;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class ListOptions {


	public static void main(String[] args)throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deva\\eclipse-workspace\\WebDriver\\Chrom\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
			
		WebElement List = driver.findElement(By.xpath("//select[@id=\"cars\"]"));
		Select S = new Select(List);
		S.selectByValue("saab");
		S.selectByIndex(0);
		S.selectByVisibleText("Audi");
		
		//S.deselectAll();
		
		List<WebElement> option = S.getOptions();
		for(int i=0; i<option.size(); i++) {
		System.out.println(option.get(i).getText());
		}
		
		List<WebElement> Selopt = S.getAllSelectedOptions();
		for(int i=0; i<Selopt.size(); i++) {
		System.out.println(Selopt.get(i).getText());
		}
		
		WebElement Fisrtoption = S.getFirstSelectedOption();
		System.out.println(Fisrtoption.getText());

		
	//Screenshot
	TakesScreenshot Snap = (TakesScreenshot)driver; // narrow casting
	File scr = Snap.getScreenshotAs(OutputType.FILE);
	File Store = new File("C:\\Users\\Deva\\eclipse-workspace\\WebDriver\\Screenshot\\Image1.png");
	FileUtils.copyFile(scr, Store);
	
		
		
	
		}
		
}


