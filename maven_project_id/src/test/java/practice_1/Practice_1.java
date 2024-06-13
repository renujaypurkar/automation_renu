package practice_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_1 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver() ;
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.railyatri.in/");
	driver.findElement(By.xpath("(//div[@class=\"VfPpkd-Jh9lGc\"])[1]"));
	}

}
