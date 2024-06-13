package automate;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class snapdeal {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Target = new File("./screenshot/snapdeal_browser.png");
		FileHandler.copy(source, Target);
		
		driver.get("https://www.snapdeal.com/");
		System.out.println(driver.getTitle());
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File Target1 = new File("./screenshot/snapdeal_application.png");
		FileHandler.copy(source1, Target1);
		
	
		WebElement search =driver.findElement(By.cssSelector("input#inputValEnter"));
		search.click();
		search.sendKeys("sarees");
		
		String projectpath = System.getProperty("user.dir");
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File source2 = ts2.getScreenshotAs(OutputType.FILE);
		File Target2 = new File(projectpath +"\\screenshot\\snapdeal_search.png" );
		FileHandler.copy(source2, Target2);

	}

}
