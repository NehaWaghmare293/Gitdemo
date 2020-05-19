import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durgesh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.cssSelector("#content > a:nth-child(7)")).click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
		String str=element.getText();
		System.out.println(str);
	
	}

}
