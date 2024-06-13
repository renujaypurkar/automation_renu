package automate;

import dynamic_code.base_class;

public class Facebook extends base_class{

	public static void main(String[] args) {
	launch_browser("chrome");
	
	Hiturl("https://www.facebook.com/login/");

	}
	
  public static void Hiturl(String url) {
	  driver.get(url);
	  System.out.println(driver.getTitle());
}

}
