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
    public void administratorsIsOnAdminLoginPage() throws Throwable {
        System.out.println("Welcome to admin login page");
        System.setProperty("Webdriver.chrome.driver", projectPath + "/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://g-learning.click/admin/login");

    }


    @Given("verify login page")
    public void verifyLoginPage() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        //Verify url
        String loginPageUrl = driver.getCurrentUrl();
        Assert.assertEquals(loginPageUrl, "https://g-learning.click/admin/login");
        //Verify title
        String loginPageTitle = driver.getTitle();
        Assert.assertEquals(loginPageTitle, "G - Learnig");
        Thread.sleep(2 * 1000);

    }




    @When("^input email as (.+)$")
    public void inputEmailAs(String email) throws InterruptedException {
        driver.findElement(By.xpath("/html/body/main/section/div/div/div/div[1]/div/div[2]/form/div[1]/input")).sendKeys(email);
        Thread.sleep(2*1000);
    }

    @And("^input password as (.+)$")
    public void inputPasswordAs(String password) throws InterruptedException {
        driver.findElement(By.xpath("/html/body/main/section/div/div/div/div[1]/div/div[2]/form/div[2]/input")).sendKeys(password);
        Thread.sleep(2*1000);
    }

    @Then("administrators click on login button")
    public void userClickOnLoginButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/main/section/div/div/div/div[1]/div/div[2]/form/div[3]/button")).click();
        Thread.sleep(2 * 1000);
    }

    @Then("^the (.+) will be display$")
    public void theWillBeDisplay(String message) {
        driver.quit();
        out.println("Result: "+ message);
    }


}
