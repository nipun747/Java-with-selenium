package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://fm.prismerp.cloud/");
		String a=driver.getTitle();
		
		String b=driver.getCurrentUrl();
		System.out.println(a);
		System.out.println(b);
		

	}

}
