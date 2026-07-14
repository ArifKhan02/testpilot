package in.co.selenium.automation.ui.uiCommonStepDefs;

import in.co.selenium.automation.base.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
import java.time.Duration;

public class demoWebShopStepDef {

    private WebDriver driver;
    private LoginPage loginPage;

    @Given("Load the demoWebShop {string}")
    public void load_the_demo_web_shop(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        // FIX: Instantiating the page object and providing it the active driver session
        loginPage = new LoginPage(driver);
    }

    @When("Enter the credentials {string} and {string} in the demoWebShop")
    public void enter_the_credentials_and_in_the_demo_web_shop(String username, String password) {
        // FIX: Instead of rewriting low-level interaction code, call your reusable POM method
        loginPage.login(username, password);
    }

    @Then("Validate that user moved to Home page")
    public void validate_that_user_moved_to_home_page() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        boolean isHomePageVisible = wait.until(ExpectedConditions.urlContains("https://demowebshop.tricentis.com/"));
        Assert.assertTrue("User is not on the home page", isHomePageVisible);


    }
}
