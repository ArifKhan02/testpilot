package in.co.selenium.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.mapping;

public class LoginPage extends Base {

    // FIX: Do not make this static; initialize it inside the constructor instead
    private mapping mappingHelper;

    public LoginPage(WebDriver driver) {
        super(driver);
        // FIX: Pass the active driver session into the mapping helper utility
        this.mappingHelper = new mapping(driver);
    }

    @FindBy(xpath = "//*[@id='Email']")
    private WebElement usernameInput;

    @FindBy(id = "Password")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@class='button-1 login-button']")
    private WebElement loginButton;

    @FindBy(id = "welcomeMsg")
    private WebElement welcomeMessage;

    public boolean isHomePageDisplayed() {
        return mappingHelper.isDisplayed(welcomeMessage);
    }

    public void login(String username, String password) {
        // FIX: Removed the illegal line: driver.findElement((By) usernameInput)...
        mappingHelper.type(usernameInput, username);
        mappingHelper.type(passwordInput, password);
        mappingHelper.click(loginButton);
    }
}
