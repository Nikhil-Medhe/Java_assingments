package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ab82_Xpath {

	

		public static void main(String[] args) {
		
	ChromeDriver driver=new ChromeDriver();
	driver.navigate().to("file:///D:/Desktop/grotechminds.html");
	driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("test");
	driver.findElement(By.xpath("(//input)[10]")).click();
		}

	}

	