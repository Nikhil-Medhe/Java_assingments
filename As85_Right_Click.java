package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class As85_Right_Click {

	public static void main(String[] args) {
		
ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	WebElement  e1=driver.findElement(By.xpath("//a[@title='Become a Seller']"));
	Actions a1=new Actions(driver);
	a1.contextClick(e1).perform();


	}

}
