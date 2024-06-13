package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.base_class;

public class jquery_droppable extends base_class{

	private static Actions action;

	public static void main(String[] args) {
	launch_browser("chrome");
	Hiturl("https://jqueryui.com/droppable/");

	
	 WebElement sdfg = driver.findElement(By.cssSelector("iframe.demo-frame"));
	 driver.switchTo().frame(sdfg);
	 
	 WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
	 
	 WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
	 
	//action.moveToElement(drag).clickAndHold().moveToElement(drop).release().build.perform;
	 
	 
	 //action.dragAnddrop(drag,drop).build().perform;
	 
	 action.clickAndHold( drag).moveToElement(drop).release(drag).build().perform();
	 
	 driver.switchTo().defaultContent();
	 
	 WebElement selectable = driver.findElement(By.xpath("//a[text()='Selectable']"));
	 selectable.click();
	}

}
