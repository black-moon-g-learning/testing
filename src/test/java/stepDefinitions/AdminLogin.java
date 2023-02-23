package stepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class CustomerLoginBank {
    WebDriver driver = null;
    String projectPath = System.getProperty("user.dir");

    @Given("user is on customer login page")
    public void user_is_on_login_page() throws Throwable {
        System.out.println("Welcome to customer login page");
        System.setProperty("Webdriver.chrome.driver", projectPath + "/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer");

    }


    @Given("verify login page")
    public void verify_login_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        //Verify url
        String loginPageUrl = driver.getCurrentUrl();
        Assert.assertEquals(loginPageUrl, "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer");
        //Verify title
        String loginPageTitle = driver.getTitle();
        Assert.assertEquals(loginPageTitle, "XYZ Bank");
        Thread.sleep(2 * 1000);

    }


    /*Select customer*/
    @When("user select on your name")
    public void user_select_on_your_name() throws Throwable {
        driver.findElement(By.id("userSelect")).click();
        driver.findElement(By.xpath("//*[@id=\"userSelect\"]/option[2]")).click();
        Thread.sleep(2 * 1000);
    }

    /*Login*/
    @And("user click on login button")
    public void user_click_on_login_button() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/form/button")).click();
        Thread.sleep(2 * 1000);
    }

    /*Customer made deposit successfully*/
    @When("click on 'Deposit' button")
    public void click_on_Deposit_button() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[3]/button[2]")).click();
        Thread.sleep(2 * 1000);
    }

    @And("input amount")
    public void input_amount() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("500");
        Thread.sleep(1000);
    }

    @Then("click on 'Deposit' button to deposit")
    public void click_on_Deposit_button_to_deposit() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/form/button")).click();
        Thread.sleep(1000);
    }

    /*Transaction*/
    @When("click on 'Transaction' button")
    public void click_on_Transaction_button() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[3]/button[1]")).click();
        Thread.sleep(1000);
    }

    /*Users want to back homepage when they are in the Transaction*/
    @When("click on 'Back' button")
    public void click_on_Back_button() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/button[1]")).click();
        Thread.sleep(2 * 1000);
    }

    @Then("click on 'Reset' button")
    public void click_on_Reset_button() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/button[2]")).click();
        Thread.sleep(2*1000);
    }
    @Then("message will be display")
    public void message_will_be_display() {
        driver.quit();
        System.out.println("Successful execution");
    }


}
