package selpack;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Selclass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\RK\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://fb.com");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.chord(Keys.CONTROL,"j"));
		System.out.println("sent");
		act.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		act.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		
		
	}
}
