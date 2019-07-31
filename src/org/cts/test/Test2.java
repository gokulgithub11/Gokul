package org.cts.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
public static void main(String[] args) {
	System.setProperty("webdriver.crome.driver","C:\\Users\\Gokul\\eclipse-workspace\\Selenium\\drv\\chromedriver.exe" );
	WebDriver D=new ChromeDriver();
	D.get("http://gmail.com/");
	String t = D.getTitle();
	System.out.println(t);
	String URL = D.getCurrentUrl();
	System.out.println(URL);
	D.quit();

}
}


