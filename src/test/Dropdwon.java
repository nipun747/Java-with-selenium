package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdwon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demoshasha.prismerp.cloud/");
		driver.findElement(By.id("username")).sendKeys("mnc");
		driver.findElement(By.id("pwd")).sendKeys("P#Adm@&sha!");
		driver.findElement(By.id("login")).click();
		driver.navigate().to("http://demoshasha.prismerp.cloud/style/add/");
		driver.findElement(By.xpath("/html//input[@id='ufd_Style_branch_id']")).click();
		WebElement inputElement = driver.findElement(By.xpath("/html//input[@id='ufd_Style_branch_id']"));

        // Click on the input field to trigger the dropdown
        inputElement.click();

        // Find the select element that holds the options
        WebElement selectElement = driver.findElement(By.tagName("select"));

        // Create a Select object to interact with the dropdown
        Select select = new Select(selectElement); 

        // Select option "n1" by value
        select.selectByValue("1");
		
	}

}
