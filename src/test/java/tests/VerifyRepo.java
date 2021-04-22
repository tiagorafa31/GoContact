package tests;
import tests.Paths;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyRepo {
	
	
	@Test
	public void verifyRepo() throws InterruptedException{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "/Users/tiagomonteiro/Downloads/Gocontact/src/test/resources/chromedriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com");
		Thread.sleep(2000);
		driver.findElement(Paths.signinButton).click();
		Thread.sleep(2000);
		driver.findElement(Paths.UsernameField).sendKeys("tiagorafa91@gmail.com");
		driver.findElement(Paths.PasswordField).sendKeys("TiagoMonteiro1");
		driver.findElement(Paths.SigninSubmitButton).click();
		Thread.sleep(2000);
		driver.findElement(Paths.profileicon).click();
		Thread.sleep(1000);
		driver.findElement(Paths.YourRepoButton).click();
		driver.findElement(Paths.RepoGoContact).click();
		
		driver.findElement(Paths.RepoCode).click();
		driver.findElement(Paths.RepoIssues).click();
		driver.findElement(Paths.RepoPullrequest).click();
		driver.findElement(Paths.RepoActions).click();
		driver.findElement(Paths.RepoProjects).click();
		driver.findElement(Paths.RepoWiki).click();
		driver.findElement(Paths.RepoSecurity).click();
		driver.findElement(Paths.RepoInsights).click();
		driver.findElement(Paths.RepoSettings).click();
		driver.quit();
		
	}
	

}