package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/demoWebShopLogin.feature"},
        glue = {"in.co.selenium.automation.ui.uiCommonStepDefs"}, // Step definitions package
        plugin = {
                "pretty",                                    // Console output
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "html:target/cucumber-reports.html",           // HTML report
                "json:target/cucumber.json",                   // JSON report
                "junit:target/cucumber.xml"                    // JUnit XML report
        },
        tags="@demoWebShopLogin",
        monochrome = false
)

public class runners {
}
