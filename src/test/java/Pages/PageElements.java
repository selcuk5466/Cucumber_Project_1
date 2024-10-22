package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageElements {

    public PageElements(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(linkText = "Register")
    public WebElement registerButton;

    @FindBy(id = "customer.firstName")
    public WebElement name;

    @FindBy(id = "customer.lastName")
    public WebElement surname;

    @FindBy(id = "customer.address.street")
    public WebElement address;

    @FindBy(id = "customer.address.city")
    public WebElement city;

    @FindBy(id = "customer.address.state")
    public WebElement state;

    @FindBy(id = "customer.address.zipCode")
    public WebElement zipCode;

    @FindBy(id = "customer.phoneNumber")
    public WebElement phoneNumber;

    @FindBy(id = "customer.ssn")
    public WebElement ssn;

    @FindBy(id = "customer.username")
    public WebElement userName;

    @FindBy(id = "customer.password")
    public WebElement password;

    @FindBy(id = "repeatedPassword")
    public WebElement confirmPassword;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement registerButtonForm;

    @FindBy(xpath = "//div[@id='rightPanel']/p")
    public WebElement confirmMessage;

    @FindBy(css = "[name='username']")
    public WebElement userNameLogin;

    @FindBy(css = "[name='password']")
    public WebElement passwordLogin;

    @FindBy(xpath = "(//input[@type='submit'])[1]")
    public WebElement loginButton;

    @FindBy(linkText = "Log Out")
    public WebElement log_out;

    @FindBy(linkText = "Bill Pay")
    public WebElement billPay;

    @FindBy(name = "payee.name")
    public WebElement billName;

    @FindBy(name = "payee.address.street")
    public WebElement billAddress;

    @FindBy(name = "payee.address.city")
    public WebElement billCity;

    @FindBy(name = "payee.address.state")
    public WebElement billState;

    @FindBy(name = "payee.address.zipCode")
    public WebElement billzipCode;

    @FindBy(name = "payee.phoneNumber")
    public WebElement billphoneNumber;

    @FindBy(name = "payee.accountNumber")
    public WebElement billAccount;

    @FindBy(name = "verifyAccount")
    public WebElement verifyAccount;

    @FindBy(name = "amount")
    public WebElement billAmount;

    @FindBy(xpath = "//input[@type='button']")
    public WebElement sendPayment;


    public WebElement getWebElement(String elementName){
        switch (elementName){
            case "registerButton": return registerButton;
            case "name":return name;
            case "surname":return surname;
            case "address":return address;
            case "city":return city;
            case "state":return state;
            case "zipCode":return zipCode;
            case "phoneNumber":return phoneNumber;
            case "ssn":return ssn;
            case "userName":return userName;
            case "password":return password;
            case "confirmPassword": return confirmPassword;
            case "registerButtonForm":return registerButtonForm;
            case "confirmMessage": return confirmMessage;
            case "userNameLogin":return userNameLogin;
            case "pesswordLogin":return passwordLogin;
            case "loginButton":return loginButton;
            case "log_out":return log_out;
            case "billPay":return billPay;
            case "billName":return billName;
            case "billAddress":return billAddress;
            case "billCity":return billCity;
            case "billState":return billState;
            case "billZipCode":return billzipCode;
            case "billphoneNumber":return billphoneNumber;
            case "billAccount":return billAccount;
            case "verifyAccount":return verifyAccount;
            case "billAmount":return billAmount;
            case "billsendPayment":return sendPayment;

        }
    return null;}


}
