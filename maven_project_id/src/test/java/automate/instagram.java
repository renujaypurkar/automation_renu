package automate;

import java.io.File;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {

	public static  <Takescreenshot> void main(String[] args)throws Throwable {

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

TakesScreenshot sc = (TakesScreenshot) driver;
File source = sc.getScreenshotAs(OutputType.FILE);

File target = new File("/screenshot/instagram.png");

driver.get("https://www.instagram.com/");
System.out.println(driver.getTitle());

TakesScreenshot r =(TakesScreenshot) driver;
File sourceA=r.getScreenshotAs(OutputType.FILE);

File targetA = new File("./screenshot/instagram.png");
org.openqa.selenium.io.FileHandler.copy(sourceA, targetA);

driver.findElement(By.id("id=\"splash-screen"));



	}
}
