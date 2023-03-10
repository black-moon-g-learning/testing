package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepDefinition {
    WebDriver driver = null;
    String projectPath = System.getProperty("user.dir");
    @Given("^User navigates to Login page$")
    public void user_navigates_to_login_page() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\HanhTester\\Setup\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://itviec.com/sign_in");
        Thread.sleep(2000);
    }

    @When("^User enters valid email address (.+)$")
    public void user_enters_valid_email_address(String email) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys(email);
        Thread.sleep(2000);
    }


    @And("^Enters valid password (.+)$")
    public void entersValidPasswordPassword(String password) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(password);
        Thread.sleep(2000);
    }

    @And("^Clicks on Login button$")
    public void clicksOnLoginButton() throws InterruptedException {
        driver.findElement(By.xpath("//button[contains(text(),'Sign in with Email')]")).click();
        Thread.sleep(2000);
    }

    @When("^User enters invalid email address (.+)$")
    public void userEntersInvalidEmailAddressEmail(String email) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys(email);
        Thread.sleep(2000);
    }

    @And("^Enters invalid password (.+)$")
    public void entersInvalidPasswordPassword(String password) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(password);
        Thread.sleep(2000);
    }

    @Then("^The message is displayed$")
    public void theMessageIsDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
        System.out.println("Successfully execution");
    }

    @Given("^User navigates to Register Account page$")
    public void userNavigatesToRegisterAccountPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\HanhTester\\Setup\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://itviec.com/sign_up");
        Thread.sleep(2000);
    }

    @When("^User enters valid name (.+)$")
    public void userEntersValidNameName(String Name) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys(Name);
        Thread.sleep(2000);
    }

    @And("^Enters valid email (.+)$")
    public void entersValidEmailEmail(String Email) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys(Email);
        Thread.sleep(2000);
    }

    @And("^Enters valid the password (.+)$")
    public void entersValidThePasswordPassword(String Password) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(Password);
        Thread.sleep(2000);
    }

    @And("^User do not enter details into any fields$")
    public void userDoNotEnterDetailsIntoAnyFields() throws InterruptedException {
        Thread.sleep(2000);
    }

    @And("^Clicks on SignUp button$")
    public void clicksOnSignUpButton() throws InterruptedException {
        driver.findElement(By.xpath("//button[contains(text(),'Sign up with Email')]")).click();
        Thread.sleep(2000);
    }

}