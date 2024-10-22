package StepDefinitions;

import Pages.PageElements;
import Pages.ParentPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class US_603_Bill_Payment {

    PageElements pageElements=new PageElements();
    ParentPage parentPage=new ParentPage();

    @Then("Click the Bill Pay button")
    public void ClickTheBillPayButton(){
        parentPage.myClick(pageElements.billPay);
    }

    @Then("Fill info of the pay form and click the send payment button")
    public void fillInfoOfThePayFormAndClickTheSendPaymentButton() {

        parentPage.mySendKeys(pageElements.billName,"Elektrik");
        parentPage.mySendKeys(pageElements.billAddress,"Sokak 1");
        parentPage.mySendKeys(pageElements.billCity,"İstanbul");
        parentPage.mySendKeys(pageElements.billState,"Bulunmuyor");
        parentPage.mySendKeys(pageElements.billzipCode,"344532");
        parentPage.mySendKeys(pageElements.billphoneNumber,"1234567534");
        parentPage.mySendKeys(pageElements.billAccount,"3456754");
        parentPage.mySendKeys(pageElements.verifyAccount,"3456754");
        parentPage.mySendKeys(pageElements.billAmount,"100");
        parentPage.myClick(pageElements.sendPayment);

        parentPage.myClick(pageElements.billPay);

        parentPage.mySendKeys(pageElements.billName,"Su");
        parentPage.mySendKeys(pageElements.billAddress,"Sokak 1");
        parentPage.mySendKeys(pageElements.billCity,"İstanbul");
        parentPage.mySendKeys(pageElements.billState,"Bulunmuyor");
        parentPage.mySendKeys(pageElements.billzipCode,"344532");
        parentPage.mySendKeys(pageElements.billphoneNumber,"1234567534");
        parentPage.mySendKeys(pageElements.billAccount,"5687654");
        parentPage.mySendKeys(pageElements.verifyAccount,"5687654");
        parentPage.mySendKeys(pageElements.billAmount,"10");
        parentPage.myClick(pageElements.sendPayment);
    }
}
