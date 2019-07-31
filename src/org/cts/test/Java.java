package org.cts.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Java {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gokul\\eclipse-workspace\\Selenium\\drv\\chromedriver.exe");
	WebDriver Driver = new ChromeDriver();
Driver.get(" http://toolsqa.com/automation-practice-table/");
List<WebElement> lstrow = Driver.findElements(By.tagName("tr"));
for(int i=0;i<lstrow.size(); i++) {
if (i % 2 == 1) {
	WebElement oddrow = lstrow.get(i);
	List<WebElement> lstdata = oddrow.findElements(By.tagName("td"));
	for(int j=0; j<lstdata.size();j++) {
		WebElement oddrow1=lstdata.get(j);
		String name = oddrow1.getText();
		System.out.println(name);
		Driver.quit();
		
	}
	
			
}
}
	





   



Driver.quit();
}
}
                                                                                                                                                                                                                                                                                                                                                                                                        