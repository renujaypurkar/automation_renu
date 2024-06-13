package automate;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import dynamic_code.base_class;

public class Jeevansathi extends base_class{

public static void main(String[] args) throws Throwable {
		
		launch_browser("edge");
		takesscreenshot("edge_browser");
		
		Hiturl("https://www.jeevansathi.com/");
		takesscreenshot("jeevansathi_webpage");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("windows.scrollBy(0,500)");
		takesscreenshot("afterpagescroll");
		
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		takesscreenshot("scroll_to_bottom");
		
		js.executeScript("window.history.go(0)");
		takesscreenshot("forback");
		
		js.executeScript("window.history.back()");
		takesscreenshot("back_to_browser");
		
		js.executeScript("window.history.forward()");
		takesscreenshot("return_to_jeevansathi");
		
		
	driver.findElement(By.xpath("//div[@id='relationshipblock']")).click();
	takesscreenshot("select");
	
	
	driver.findElement(By.xpath("//li[text()='Relative/Friend']")).click();
	takesscreenshot("option_selectd");
	
	
	driver.findElement(By.cssSelector("div#gender")).click();
	takesscreenshot("select_gender");
	
	driver.close();
	
	
	
	}		
	}

    
