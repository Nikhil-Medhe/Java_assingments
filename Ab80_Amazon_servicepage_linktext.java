package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ab80_Amazon_servicepage_linktext {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		WebElement e2=driver.findElement(By.linkText("Customer Service"));
		e2.click();
	}

}
