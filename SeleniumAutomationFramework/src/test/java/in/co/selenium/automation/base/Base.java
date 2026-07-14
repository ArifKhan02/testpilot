package in.co.selenium.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Base {

    public WebDriverWait wait;
    // FIX: Changed from private to protected static so subclasses can see it
    protected static WebDriver driver;

    public Base(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
}
