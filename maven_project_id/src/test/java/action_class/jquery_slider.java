package action_class;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import dynamic_code.base_class;

public class jquery_slider extends base_class {
	


	public static void main(String[] args) throws InterruptedException {
		
		launch_browser("chrome");
		Hiturl("https://jqueryui.com/slider/");
		
		WebElement frame1 = driver.findElement(By.className("iframe.demo-frame"));
		driver.switchTo().frame(frame1);
		
		Actions action2 = new Actions(driver);
		
		WebElement slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'"));
		action2.moveToElement(slider).clickAndHold().moveByOffset(500,0).release().build().perform();
		 
		Thread.sleep(2000);
		action2.dragAndDropBy(slider,-400,0).build().perform();
		  
	    Thread.sleep(2000);
		action2.clickAndHold(slider).moveByOffset(400,0).release(slider).build().perform();
		 
		

	}

}
