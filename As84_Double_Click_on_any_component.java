package selenium;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class As84_Double_Click_on_any_component{

		public static void main(String[] args) {
			
	ChromeDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.flipkart.com/");
	WebElement e1=driver.findElement(By.xpath("//span[.='Login']"));
	Actions a1=new Actions(driver);
	a1.doubleClick(e1).perform();
	
		}

	}
