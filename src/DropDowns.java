import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durgesh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		
		
		  WebElement ad= driver.findElement(By.id("Adults"));
		  Select adult = new Select(ad);
		  adult.selectByVisibleText("7"); 
		  //adult.selectByIndex(6);
		  
		  WebElement ch= driver.findElement(By.id("Childrens"));
		  Select child = new Select(ch);
		  child.selectByVisibleText("2"); 
		  //child.selectByIndex(6);
	
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Malaysia Airlines");
		
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
	    
	}

}
