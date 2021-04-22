package tests;
import org.openqa.selenium.By;

public class Paths {

	//login
	
    public static final By signinButton = By.xpath("(//div[contains(@class,'Header')]/div/a[contains(text(),'Sign in')])[1]");
    public static final By UsernameField = By.id("login_field");
    public static final By EmailField = By.xpath("//input[@name='user[email]']");
    public static final By PasswordField = By.id("password");
    public static final By SigninSubmitButton = By.xpath("//input[@type='submit']");
    public static final By Errorlogin = By.xpath("//div[@class='container-lg px-2']");
    public static final By profileicon = By.xpath("(//img[@alt='@tiagorafa91'])[2]");
    
    //Menu
    public static final By Searchmenu = By.xpath("//input[@data-unscoped-placeholder='Search or jump to…']");
    public static final By PullRequestButton = By.xpath("//a[@aria-label='Pull requests you created']");
    public static final By IssuesButton = By.xpath("//a[@aria-label='Issues you created']");
    public static final By MarketplaceButton = By.xpath("//a[@data-octo-click='marketplace_click']");
    public static final By ExploreButton = By.xpath("//a[@data-ga-click='Header, click, Nav menu - item:explore']");
    public static final By HeaderLinkButton = By.xpath("//summary[@class='Header-link']");
    public static final By NewrepoButton = By.xpath("//a[@data-ga-click='Header, create new repository']");
    public static final By NewGistButton = By.xpath("//a[@data-ga-click='Header, create new gist']");
    public static final By NeworgButton = By.xpath("//a[@data-ga-click='Header, create new organization']");
    public static final By NewProjectButton = By.xpath("//a[@data-ga-click='Header, create new project']");
    public static final By ImportRepoButton = By.xpath("//a[@data-ga-click='Header, import a repository']");
    
    //Create repository
    public static final By Repoowner = By.xpath("//summary[@id='repository-owner']");
    public static final By RepoName = By.xpath("//input[@id='repository_name']");   
    public static final By RepoDescr = By.xpath("//input[@id='repository_description']"); 
    public static final By RepoVisi = By.xpath("//input[@id='repository_visibility_public']");
    public static final By RepoReadme = By.xpath("//input[@id='repository_auto_init']"); 
    public static final By RepoIgnore = By.xpath("//input[@id='repository_gitignore_template_toggle']"); 
    public static final By RepoLicence = By.xpath("//input[@id='repository_license_template_toggle']"); 
    public static final By CreateRepoButton = By.xpath("//button[@data-disable-with='Creating repository…']"); 
    public static final By YourRepoButton = By.xpath("//a[contains(text(),'Your repositories')]");
    public static final By RepoGoContact = By.xpath("//a[contains(text(),'GoContact')]");
 
    //Repository details
    public static final By RepoCode = By.xpath("//span[contains(text(),'Code')]");
    public static final By RepoIssues = By.xpath("//span[contains(text(),'Issues')]");
    public static final By RepoPullrequest = By.xpath("//span[contains(text(),'Pull requests')]");
    public static final By RepoActions = By.xpath("//span[contains(text(),'Actions')]");
    public static final By RepoProjects = By.xpath("//span[contains(text(),'Projects')]");
    public static final By RepoWiki = By.xpath("//span[contains(text(),'Wiki')]");
    public static final By RepoSecurity = By.xpath("//span[contains(text(),'Security')]");
    public static final By RepoInsights = By.xpath("//span[contains(text(),'Insights')]");
    public static final By RepoSettings = By.xpath("//span[contains(text(),'Settings')]");
    
    //project
    public static final By CreateProjectButton = By.xpath("//a[contains(text(),'Create a project')]");
    public static final By ProjectName = By.xpath("//input[@id='project_name']");
    public static final By SubmitProject = By.xpath("//button[contains(text(),'Create project')]");
    public static final By Addcolumn = By.xpath("//button[contains(text(),'Add a column')]");
    public static final By ColumnName = By.xpath("//input[@id='project-column-name-']");
    public static final By AddcolumnButton = By.xpath("//button[contains(text(),'Create column')]");
    
    //issue
    public static final By NewIssue = By.xpath("//span[text()='New issue']");
    public static final By Issuetitle = By.xpath("//input[@id='issue_title']");
    public static final By SubmitNewIssue = By.xpath("//button[contains(text(),'Submit new issue')]");
    
    //delete
    public static final By DeleteButton = By.xpath("//summary[contains(text(),'Delete this repository')]");
    public static final By confirm = By.xpath("(//input[@name='verify' and contains(@aria-label,'Type in the name')])[3]");
    public static final By confirmButton = By.xpath("    (//span[contains(text(),'I understand the consequences')])[2]");

    //logout
    public static final By LogoutButton = By.xpath("//button[contains(text(),'Sign out')]");
    
}

