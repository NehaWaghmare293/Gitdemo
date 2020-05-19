import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_All {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durgesh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("checkBoxOption3")).click();
		String chk_text = driver.findElement(By.id("checkBoxOption3")).getAttribute("value");
		System.out.println(chk_text);

		WebElement drop = driver.findElement(By.id("dropdown-class-example"));
		Select opt = new Select(drop);
		opt.selectByValue(chk_text);

		driver.findElement(By.id("name")).sendKeys(chk_text);

		driver.findElement(By.id("alertbtn")).click();

		String popup = (driver.switchTo().alert().getText());
	    
		if(popup.contains(chk_text))
		{
			System.out.println("yes");
		}
		driver.switchTo().alert().accept();

	}
}
