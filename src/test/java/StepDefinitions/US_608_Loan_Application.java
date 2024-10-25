package StepDefinitions;

import Pages.PageElements;
import Pages.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class US_608_Loan_Application {

    PageElements pageElements=new PageElements();
    ParentPage parentPage=new ParentPage();

    @Then("Click on the request loan button")
    public void clickOnTheRequestLoanButton() {
       parentPage.myClick(pageElements.loanRequest);
    }

    @And("Fill the loan info the form on right and click on the apply now button")
    public void fillTheLoanInfoTheFormOnRightAndClickOnTheApplyNowButton() {
        parentPage.mySendKeys(pageElements.amount,"5000");
        parentPage.mySendKeys(pageElements.downPayment,"500");
        parentPage.myClick(pageElements.applyNow);
    }

    @Then("Should be show result message")
    public void shouldBeShowResultMessage() {
        parentPage.VerifyContainsText(pageElements.loanResult,("Loan Request Processed"));
    }

}
