package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginNotOk {
	
	@Test
	public void LoginNotok() throws InterruptedException{
		WebDriver driver=null;
		String errorlogin="Incorrect username or password.";
		System.setProperty("webdriver.chrome.driver", "/Users/tiagomonteiro/Downloads/Gocontact/src/test/resources/chromedriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com");
		Thread.sleep(2000);
		driver.findElement(Paths.signinButton).click();
		Thread.sleep(2000);
		driver.findElement(Paths.SigninSubmitButton).click();
		assertEquals(driver.findElement(Paths.Errorlogin).getText(), errorlogin);
		driver.findElement(Paths.UsernameField).sendKeys("test");
		driver.findElement(Paths.SigninSubmitButton).click();
		assertEquals(driver.findElement(Paths.Errorlogin).getText(), errorlogin);
		driver.findElement(Paths.UsernameField).clear();
		driver.findElement(Paths.UsernameField).sendKeys("tiagorafa91@gmail.com");
		driver.findElement(Paths.PasswordField).sendKeys("test");
		driver.findElement(Paths.SigninSubmitButton).click();
		assertEquals(driver.findElement(Paths.Errorlogin).getText(), errorlogin);
		driver.quit();
		
	}
}
