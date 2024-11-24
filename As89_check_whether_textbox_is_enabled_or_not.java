package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class As89_check_whether_textbox_is_enabled_or_not {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		WebElement e1=driver.findElement(By.name("lname"));
		boolean b1=e1.isDisplayed();
		boolean b2=e1.isEnabled();
		if(b1==true && b2==true)
		{
			e1.sendKeys("Nikhil");
		}
		System.out.println(e1.isDisplayed());
		System.out.println(e1.isEnabled());
	
	}

}
