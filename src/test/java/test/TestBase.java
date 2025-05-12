package test;
import base.BaseClass;
import io.qameta.allure.*;
import org.testng.annotations.*;
import pages.HomePage;

@Epic("Web Application Regression Testing => epic")
@Feature("Login Page Tests => feature")
@Story("Title of Login Page=> story ")
public class TestBase extends BaseClass {
    @BeforeClass
    public void setUpDriver(){
       setupApplication();
    }

    HomePage homePage = new HomePage();
    @Test
    @Description("This is a test => description")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Farah Mango")
    @Link(name = "Website => link", url = "https://dev.example.com/")
    @Issue("AUTH-123 => Issue")
    @TmsLink("TMS-456 => Tms Link")
    public void signInToDemoBlaze(){
        homePage.signUpToProfile();
        homePage.enterYourCredentials();
        homePage.submitForm();
    }
    @Description("Assert the title")
    @Test
    public void checkTheTitle(){
        homePage.checkTheTitle("STORE");
    }
    @AfterClass
    public void closeDriver(){
        driver.close();
    }
}
