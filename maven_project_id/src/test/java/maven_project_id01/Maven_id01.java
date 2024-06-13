/**
 * 
 */
package maven_project_id01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */
public class Maven_id01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.railyatri.in/");
//id
	driver.findElement(By.id("a-page"));
	driver.findElement(By.id("skiplink"));
	
	//name
	driver.findElement(By.name("site-search"));
	driver.findElement(By.name("twitter:card"));
	
	//class Name
	driver.findElement(By.className("nav-subcat"));
	driver.get("https://www.myntra.com/");
	
	//linktext
	driver.findElement(By.linkText("nav_cs_bestsellers"));
	driver.findElement(By.linkText("Mobiles"));
	//partiallinktext
	driver.findElement(By.partialLinkText("Amazon miniTV"));
	//xpath
	driver.findElement(By.xpath("Electronics "));
	driver.findElement(By.xpath("Gift Ideas	"));
//CSS
	driver.findElement(By.cssSelector("css,todays-deals,336"));
	driver.findElement(By.cssSelector("nav_cs_giftfinder"));
	}

}
