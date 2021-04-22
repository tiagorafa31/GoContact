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

public class CreateIssues {
	
	
	@Test
	public void Createissues() throws InterruptedException{
		WebDriver driver=null;
		String issuename ="GoContact Issue";
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
		Thread.sleep(1000);
		driver.findElement(Paths.RepoIssues).click();
		Thread.sleep(1000);
		driver.findElement(Paths.NewIssue).click();
		driver.findElement(Paths.Issuetitle).sendKeys(issuename);
		driver.findElement(Paths.SubmitNewIssue).click();
		Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//span[contains(text(),'"+issuename+"')]")).getText(), issuename);
		driver.quit();
		
	}
	
}
