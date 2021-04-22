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

public class CreateNewRepo {
	
	
	@Test
	public void createNewRepo() throws InterruptedException{
		String owner="tiagorafa91";
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
		driver.findElement(Paths.Searchmenu);
		driver.findElement(Paths.PullRequestButton);
		driver.findElement(Paths.IssuesButton);
		driver.findElement(Paths.MarketplaceButton);
		driver.findElement(Paths.ExploreButton);
		driver.findElement(Paths.profileicon);
		driver.findElement(Paths.HeaderLinkButton).click();
		driver.findElement(Paths.NewrepoButton).click();
		Thread.sleep(2000);
		assertEquals(driver.findElement(Paths.Repoowner).getText(), owner);
		driver.findElement(Paths.RepoName).sendKeys("GoContact");
		driver.findElement(Paths.RepoDescr).sendKeys("GoContact Description");
		driver.findElement(Paths.RepoVisi).click();
		driver.findElement(Paths.RepoReadme);
		driver.findElement(Paths.RepoIgnore);
		driver.findElement(Paths.RepoLicence);
		Thread.sleep(2000);

		driver.findElement(Paths.CreateRepoButton).click();
		Thread.sleep(2000);
		driver.quit();
		
	}
	

}