package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        driver.manage().window().maximize();
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
        Assert.assertEquals(loginPageTitle, "G - Learning");
        Thread.sleep(2 * 1000);

    }

    @Given("login successfully")
    public void loginSuccessfully() throws Throwable {
        administratorsIsOnAdminLoginPage();
        verifyLoginPage();
        driver.findElement(By.xpath("/html/body/main/section/div/div/div/div[1]/div/div[2]/form/div[1]/input")).sendKeys("Admin@gmail.com");
        driver.findElement(By.xpath("/html/body/main/section/div/div/div/div[1]/div/div[2]/form/div[2]/input")).sendKeys("password");
        adminClickOnLoginButton();
        //driver.navigate().to("https://g-learning.click/admin/countries/1");
        Thread.sleep(2 * 200);
    }


    @When("^input email as (.+)$")
    public void inputEmailAs(String email) throws InterruptedException {
        driver.findElement(By.xpath("/html/body/main/section/div/div/div/div[1]/div/div[2]/form/div[1]/input")).sendKeys(email);
        Thread.sleep(2 * 1000);
    }

    @And("^input password as (.+)$")
    public void inputPasswordAs(String password) throws InterruptedException {
        driver.findElement(By.xpath("/html/body/main/section/div/div/div/div[1]/div/div[2]/form/div[2]/input")).sendKeys(password);
        Thread.sleep(2 * 1000);
    }

    @Then("administrators click on login button")
    public void adminClickOnLoginButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/main/section/div/div/div/div[1]/div/div[2]/form/div[3]/button")).click();
        Thread.sleep(2 * 1000);
    }

    /* Edit on countries*/
    @And("navigate to countries category")
    public void navigateToCountriesCategory() throws InterruptedException {
        //driver.navigate().to("https://g-learning.click/admin/countries");
        driver.findElement(By.id("category-4")).click();
        Thread.sleep(2 * 1000);
    }


    @When("click on edit button")
    public void clickOnEditButton() {
        //driver.navigate().to("https://g-learning.click/admin/countries/1");
        driver.findElement(By.xpath("//*[@id=\"click\"]")).click();
    }

    @Then("^edit data on (.+) field 1$")
    public void editDataOnNameField(String name) throws Throwable {
        driver.findElement(By.id("example-text-input")).clear();
        driver.findElement(By.id("example-text-input")).sendKeys(name);
        Thread.sleep(2 * 1000);

    }

    @Then("^edit data on (.+) field 2$")
    public void editDataOnDescriptionField(String description) throws Throwable {
        driver.findElement(By.id("exampleFormControlTextarea1")).clear();
        driver.findElement(By.id("exampleFormControlTextarea1")).sendKeys(description);
        Thread.sleep(2 * 1000);
    }
    /* Cases: blank*/

    @Then("^edit name field = blank$")
    public void editNameFieldEqualBlank() throws Throwable {
        driver.findElement(By.id("example-text-input")).clear();
        driver.findElement(By.id("example-text-input")).sendKeys("");
        Thread.sleep(2 * 1000);

    }

    @Then("^edit description field = blank$")
    public void editDescriptionFieldEqualBlank() throws Throwable {
        driver.findElement(By.id("exampleFormControlTextarea1")).clear();
        driver.findElement(By.id("exampleFormControlTextarea1")).sendKeys("");
        Thread.sleep(2 * 1000);
    }

    @And("change image by choose file from computer device")
    public void changeImageByChooseFileFromComputerDevice() throws InterruptedException {
        WebElement upload_file = driver.findElement(By.xpath("/html/body/main/div[1]/div/form/div[4]/input"));
        Thread.sleep(2 * 1000);
        upload_file.sendKeys("C:\\Users\\phuongho\\3D Objects\\1.jpg");
        Thread.sleep(6 * 1000);
    }

    @Then("^the (.+) will be display$")
    public void theWillBeDisplay(String message) {
        driver.quit();
        out.println("Result: " + message);
    }


}
