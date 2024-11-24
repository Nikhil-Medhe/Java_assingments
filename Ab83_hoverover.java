package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ab83_hoverover {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement e1=driver.findElement(By.xpath("//span[.='Fashion'][1]"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		Thread.sleep(3000);
		WebElement e2=driver.findElement(By.xpath("(//object/a)[4]"));
		a1.moveToElement(e2).perform();
		Thread.sleep(3000);
		WebElement e3=driver.findElement(By.xpath("(//object/a)[13]"));
		e3.click();
			}

	}


