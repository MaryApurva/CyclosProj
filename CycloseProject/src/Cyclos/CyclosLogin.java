package Cyclos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CyclosLogin {

	WebDriver driver;
	
	@Given("^Open Chrome and start application$")
	public void open_Chrome_and_start_application() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver", "E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		  
		driver.get("http://localhost:8585/do/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
	}

	@When("^I provide valid username and password$")
	public void i_provide_valid_username_and_password() throws Throwable {

		driver.findElement(By.id("cyclosUsername")).sendKeys("apurva");
		driver.findElement(By.id("cyclosPassword")).click();
		driver.findElement(By.xpath("//body[@class='login']/div[@id='topContainer']/div[@class='topContainerBorder']/div[@id='topTable']/div[@id='tdContents']/table[@class='loginTable']/tbody/tr/td[@class='loginFormContainer']/table[@class='nested loginFormTable']/tbody/tr/td[@class='loginForm']/form[@id='cyclosLogin']/table[@class='nested']/tbody/tr/td/div[@id='virtualKeyboard']/div/input[1]")).click();
		
		driver.findElement(By.xpath("//body[@class='login']/div[@id='topContainer']/div[@class='topContainerBorder']/div[@id='topTable']/div[@id='tdContents']/table[@class='loginTable']/tbody/tr/td[@class='loginFormContainer']/table[@class='nested loginFormTable']/tbody/tr/td[@class='loginForm']/form[@id='cyclosLogin']/table[@class='nested']/tbody/tr/td/div[@id='virtualKeyboard']/div/input[2]")).click();
		
		driver.findElement(By.xpath("//body[@class='login']/div[@id='topContainer']/div[@class='topContainerBorder']/div[@id='topTable']/div[@id='tdContents']/table[@class='loginTable']/tbody/tr/td[@class='loginFormContainer']/table[@class='nested loginFormTable']/tbody/tr/td[@class='loginForm']/form[@id='cyclosLogin']/table[@class='nested']/tbody/tr/td/div[@id='virtualKeyboard']/div/input[3]")).click();
		
		driver.findElement(By.xpath("//input[4]")).click();

	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		
		driver.findElement(By.xpath("//div[@id='virtualKeyboard']//div//input[@class='button']")).click();

	}

	@Given("^Links should be displayed$")
	public void links_should_be_displayed() throws Throwable {

		
	}

	@When("^Click on Account link$")
	public void click_on_Account_link() throws Throwable {
		
		driver.findElement(By.xpath("//span[@class='menuText'][contains(text(),'Account')]")).click();

	}

	@Then("^links should get displayed$")
	public void links_should_get_displayed() throws Throwable {


	}

	@Given("^Search transactions$")
	public void search_transactions() throws Throwable {


	}

	@When("^Click on Account Information link$")
	public void click_on_Account_Information_link() throws Throwable {

		driver.findElement(By.xpath("//span[contains(text(),'Account Information')]")).click();
	}

	@Then("^Search transactions on Member account page with all the transactions should get displayed$")
	public void search_transactions_on_Member_account_page_with_all_the_transactions_should_get_displayed() throws Throwable {


	}

	@Given("^Transactions details should be displayed$")
	public void transactions_details_should_be_displayed() throws Throwable {


	}

	@When("^Click on View icon of Particular transaction$")
	public void click_on_View_icon_of_Particular_transaction() throws Throwable {

		driver.findElement(By.xpath("//tr[2]//td[5]//img[1]")).click();

	}

	@Then("^Transaction details page containing detailed transaction should get displayed$")
	public void transaction_details_page_containing_detailed_transaction_should_get_displayed() throws Throwable {


	}

	@Given("^Display all transactions$")
	public void display_all_transactions() throws Throwable {


		
	}

	@When("^Click on Back button$")
	public void click_on_Back_button() throws Throwable {

		driver.findElement(By.id("backButton")).click();
		driver.findElement(By.id("backButton")).click();
		
	}

	@Then("^All the transactions should get displayed$")
	public void all_the_transactions_should_get_displayed() throws Throwable {
	    
		
		
	}

	
}
