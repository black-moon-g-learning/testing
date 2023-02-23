package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;
import static java.lang.System.*;




public class AdminLogin {
    WebDriver driver = null;
    String projectPath = System.getProperty("user.dir");

    @Given("administrators is on admin login page")
    public void administrators_is_on_admin_login_page() throws Throwable {
        System.out.println("Welcome to admin login page");
        System.setProperty("Webdriver.chrome.driver", projectPath + "/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://g-learning.click/admin/login");

    }


    @Given("verify login page")
    public void verify_login_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        //Verify url
        String loginPageUrl = driver.getCurrentUrl();
        Assert.assertEquals(loginPageUrl, "https://g-learning.click/admin/login");
        //Verify title
        String loginPageTitle = driver.getTitle();
        Assert.assertEquals(loginPageTitle, "G - Learnig");
        Thread.sleep(2 * 1000);

    }


    /*Select customer*/

    @When("^input email as (.+)$")
    public void input_email_as(String email) throws InterruptedException {
        driver.findElement(By.xpath("/html/body/main/section/div/div/div/div[1]/div/div[2]/form/div[1]/input")).sendKeys(email);
        Thread.sleep(2*1000);
    }
    /*Login*/

    @And("^input password as (.+)$")
    public void input_password_as(String password) throws InterruptedException {
        driver.findElement(By.xpath("/html/body/main/section/div/div/div/div[1]/div/div[2]/form/div[2]/input")).sendKeys(password);
        Thread.sleep(2*1000);
    }

    @Then("administrators click on login button")
    public void user_click_on_login_button() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/main/section/div/div/div/div[1]/div/div[2]/form/div[3]/button")).click();
        Thread.sleep(2 * 1000);
    }

    @Then("^the (.+) will be display$")
    public void the_will_be_display(String message) {
        driver.quit();
        out.println("Result: "+ message);
    }


}
