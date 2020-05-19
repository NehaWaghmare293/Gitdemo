import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoDropdown {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durgesh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
	    //System.out.println(driver.findElement(By.id("ui-id-11")).getText());
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String sript= "return document.getElementById(\"fromPlaceName\").value;";
        String text=(String)js.executeScript(sript);
        System.out.println(text);
        System.out.println("1234");
       
	}

}
