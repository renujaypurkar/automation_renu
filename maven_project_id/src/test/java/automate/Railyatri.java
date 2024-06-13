package automate;

import dynamic_code.base_class;

public class Railyatri extends base_class{


	public static void main(String[] args) {
	launch_browser("edge");
	
		Hiturl("www.railyatri.com");
		
	}

	public static void Hiturl(String string) {
		driver.get(string);
		System.out.println(driver.getTitle());
		
	}

	}

