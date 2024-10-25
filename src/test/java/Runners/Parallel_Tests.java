package Runners;

import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags = "@RegressionTest or @SmokeTest",
        features = {"src/test/java/FeatureFiles/User_Login.feature",
                    "src/test/java/FeatureFiles/User_Login.feature",
                    "src/test/java/FeatureFiles/Bill_Payment.feature",
                    "src/test/java/FeatureFiles/Account_Creation.feature"},
        glue={"StepDefinitions"},
        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class Parallel_Tests extends AbstractTestNGCucumberTests {

   @BeforeClass
   @Parameters("browserTipi")
    public void BeforeClass(String browserTipi){
       GWD.threadBrowserName.set(browserTipi);
    }
}
