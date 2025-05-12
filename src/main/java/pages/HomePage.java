package pages;
import helpers.ActionHelper;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class HomePage {

    private By signUpBtn = By.id("signin2");
    private By userName = By.id("sign-username");
    private By password = By.id("sign-password");
    private By submitBtn = By.xpath("(//button['@type=button'])[6]");

    SoftAssert myAssert = new SoftAssert();
    Credentials credentials = new Credentials();
    @Step("sign up to profile => step")
    public void signUpToProfile(){
        ActionHelper.clickAction(signUpBtn);
    }
    @Step("enter the credentials => step")
    public void enterYourCredentials(){
        ActionHelper.implicitWait();
        ActionHelper.sendKeys(userName,credentials.getUserName());
        ActionHelper.sendKeys(password,credentials.getPassword());
    }
    @Step("submit the form => step")
    public void submitForm(){
        ActionHelper.implicitWait();
        ActionHelper.clickAction(submitBtn);
        ActionHelper.implicitWait();
        ActionHelper.acceptAlert();

    }
    @Attachment(value = "data", type = "text/plain", fileExtension = ".txt")
    @Step("check the title => step")
    public void checkTheTitle(String expected){
        myAssert.assertEquals(ActionHelper.getThePageTitle(), expected);
        ActionHelper.implicitWait();
        myAssert.assertAll();

    }

}
