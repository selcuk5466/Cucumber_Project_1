package StepDefinitions;

import Pages.PageElements;
import Pages.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;

public class US_606_Account_Transfer {
    PageElements pageElements=new PageElements();
    ParentPage parentPage=new ParentPage();

    @Then("Click on the transfer funds button")
    public void clickOnTheTransferFundsButton() {
        parentPage.myClick(pageElements.transferFunds);
    }

    @And("Select accounts and fill amount then click on the transfer button")
    public void selectAccountsAndFillAmountThenClickOnTheTransferButton() {
        parentPage.mySendKeys(pageElements.amount,"50");
        Select select=new Select(pageElements.fromAccount);
        select.selectByIndex(0);
        Select select1=new Select(pageElements.toAccount);
        select1.selectByIndex(1);
        parentPage.myClick(pageElements.transferButton);

        parentPage.myClick(pageElements.transferFunds);
        parentPage.mySendKeys(pageElements.amount,"70");
        select.selectByIndex(1);
        select1.selectByIndex(2);
        parentPage.myClick(pageElements.transferButton);
    }


}
