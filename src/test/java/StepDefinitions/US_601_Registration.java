package StepDefinitions;

import Pages.ParentPage;
import Pages.PageElements;
import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class US_601_Registration {
    PageElements pageElements=new PageElements();
    ParentPage parentPage=new ParentPage();

    @Given("Navigate to Parabank")
    public void navigate_to_parabank(){
        GWD.getDriver().get("https://parabank.parasoft.com/");
        }

    @When("Click the register button on the website")
    public void clickTheRegisterButtonOnTheWebsite() {
        parentPage.myClick(pageElements.registerButton);
    }

    @Then("Fill info of the register form and click on the register button of form")
    public void fillInfoOfTheRegisterFormAndClickOnTheRegisterButtonOfForm() {
        parentPage.mySendKeys(pageElements.name,"selcuk");
        parentPage.mySendKeys(pageElements.surname,"team10");
        parentPage.mySendKeys(pageElements.address,"1.Sokak");
        parentPage.mySendKeys(pageElements.city,"İstanbul");
        parentPage.mySendKeys(pageElements.state,"Bos");
        parentPage.mySendKeys(pageElements.zipCode,"323233");
        parentPage.mySendKeys(pageElements.phoneNumber,"1111111111");
        parentPage.mySendKeys(pageElements.ssn,"3443");
        parentPage.mySendKeys(pageElements.userName,"Team_10");
        parentPage.mySendKeys(pageElements.password,"1234512345");
        parentPage.mySendKeys(pageElements.confirmPassword,"1234512345");
        parentPage.myClick(pageElements.registerButtonForm);
        Assert.assertTrue(pageElements.confirmMessage.getText().contains("success"));
    }
}
