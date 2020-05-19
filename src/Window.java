import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durgesh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();

		String MainWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();

		while (i1.hasNext()) {
			String ChildWindow = i1.next();

			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

				// Switching to Child window
				driver.switchTo().window(ChildWindow);
				
				driver.switchTo().window(ChildWindow);
				System.out.println("Child window "+driver.getTitle());
				

			}

		}
		driver.switchTo().window(MainWindow); 
		System.out.println("Parent window "+driver.getTitle());

	}
}
