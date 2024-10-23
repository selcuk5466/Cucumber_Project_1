package StepDefinitions;

import Pages.PageElements;
import Pages.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class US_607_Update_Contact_Info {
    ParentPage parentPage=new ParentPage();
    PageElements pageElements=new PageElements();

    @Then("Click on the update contact info button")
    public void clickOnTheUpdateContactInfoButton() {
       parentPage.myClick(pageElements.contactInfo);
    }

    @And("Update on the profil form info")
    public void updateOnTheProfilFormInfo() {
        parentPage.mySendKeys(pageElements.name,"Team10_10");
        parentPage.mySendKeys(pageElements.address,"Sakarya");
        parentPage.mySendKeys(pageElements.phoneNumber,"26578865434");
        parentPage.myClick(pageElements.sendPayment);
    }
}
