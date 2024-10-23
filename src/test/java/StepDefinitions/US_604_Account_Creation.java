package StepDefinitions;

import Pages.PageElements;
import Pages.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;

public class US_604_Account_Creation {

    ParentPage parentPage = new ParentPage();
    PageElements pageElements = new PageElements();

    public US_604_Account_Creation() {
    }
    @Then("Click on the open new Account button")
    public void clickOnTheOpenNewAccountButton() {
        this.parentPage.myClick(this.pageElements.newAccount);
    }

    @And("Select the account type and click the open new account button")
    public void selectTheAccountTypeAndClickTheOpenNewAccountButton() {
        Select select = new Select(this.pageElements.accountType);
        select.selectByValue("0");
        this.parentPage.myClick(this.pageElements.newAccountButton);
        this.parentPage.myClick(this.pageElements.newAccount);
        select.selectByValue("1");
        this.parentPage.myClick(this.pageElements.newAccountButton);
    }
}
