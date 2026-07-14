package in.co.selenium.automation.ui.uiCommonStepDefs;

import in.co.selenium.automation.base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends Base {

    // Extends Base to inherit the active static driver reference directly
    public Hooks() {
        super(driver);
    }

    @After
    public void tearDown(Scenario scenario) {
        if (driver != null) {
            if (scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "Failed_Scenario_Screenshot");
            }
            // Close browser directly using inherited driver variable
            driver.quit();
            driver = null;
        }
    }
}
