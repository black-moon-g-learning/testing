//package stepDefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import java.util.concurrent.TimeUnit;
//
//
//public class EditOnCountries {
//    WebDriver webDriver = null;
//
////    String projectPath = System.getProperty("user.dir");
////    @Given("click on countries category")
////    public void clickOnCountriesCategory() throws Throwable {
////    System.out.println("Welcome to admin countries page");
////    System.setProperty("Webdriver.chrome.driver", projectPath + "/driver/chromedriver.exe");
////        webDriver = new ChromeDriver();
////        webDriver.manage().window().maximize();
////        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////        webDriver.get("https://g-learning.click/admin/countries");
////
////}
////
////    @Given("verify countries page")
////    public void verifyCountriesPage() throws InterruptedException {
////        // Write code here that turns the phrase above into concrete actions
////        //Verify url
////        String countriesPageUrl = webDriver.getCurrentUrl();
////        Assert.assertEquals(countriesPageUrl,"https://g-learning.click/admin/countries");
////        //Verify title
////        String countriesPageTitle = webDriver.getTitle();
////        Assert.assertEquals(countriesPageTitle, "G - Learning");
////        Thread.sleep(2 * 1000);
////
////    }
//
//
//    @And("navigate to countries category")
//    public void navigateToCountriesCategory() throws InterruptedException {
//        webDriver.navigate().to("https://g-learning.click/admin/countries");
//        Thread.sleep(2 * 1000);
//    }
//
//
//    @When("click on edit button")
//    public void clickOnEditButton() {
//        webDriver.navigate().to("https://g-learning.click/admin/countries/1");
//    }
//
//    @Then("^  edit data on (.+) and (.+) and (.+) field$")
//    public void editDataOn(String Name, String Place, String Description) throws InterruptedException {
//        webDriver.findElement(By.id("example-text-input")).sendKeys(Name);
//        webDriver.findElement(By.id("example-search-input")).sendKeys(Place);
//        webDriver.findElement(By.id("exampleFormControlTextarea1")).sendKeys(Description);
//        Thread.sleep(2 * 1000);
//    }
//
//}
