package StepDefinitions;

import Pages.PageElements;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class US_602_Login {

        PageElements pageElements=new PageElements();
        ParentPage parentPage=new ParentPage();

        @When("Fill the username and password on login panel then click the login button")
         public void loginWithUsernameAndPassword(){
            parentPage.mySendKeys(pageElements.userNameLogin,"Team_10");
            parentPage.mySendKeys(pageElements.passwordLogin,"1234512345");
            parentPage.myClick(pageElements.loginButton);
            Assert.assertTrue(pageElements.log_out.isDisplayed(),"Giriş başarısız");        }

    @And("Close the website")
    public void closeTheWebsite() {
        GWD.quitDriver();
    }
}

