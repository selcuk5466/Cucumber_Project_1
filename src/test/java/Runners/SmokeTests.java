package Runners;

import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        tags = "@SmokeTest",
        features ={"src/test/java/FeatureFiles/"},
        glue={"StepDefinitions"},
        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class SmokeTests extends AbstractTestNGCucumberTests {
    @AfterClass
    public  static void writeExtendReport()
    {

        ExtentService.getInstance().setSystemInfo("Windows User Name", System.getProperty("user.name"));
        ExtentService.getInstance().setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        ExtentService.getInstance().setSystemInfo("User Name", "Selcuk Aydin");
        ExtentService.getInstance().setSystemInfo("Application Name", "Parabank");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name"));
        ExtentService.getInstance().setSystemInfo("Department", "QA");
        ExtentService.getInstance().setSystemInfo("Test group", "Smoke Tests");
        ExtentService.getInstance().setSystemInfo("Test Açıklaması", "Bu testte Parabank sitesinin kullanıcı hesabı oluşturma" +
                " siteye giriş yapma, banka hesap açma, fatura ödeme fonksiyonları test edilmiştir.");

    }

}
