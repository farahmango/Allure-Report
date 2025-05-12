package helpers;

import base.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class ActionHelper extends BaseClass {

    static ExplicitWait explicitWait = new ExplicitWait();
    public static void clickAction(By element){
        driver.findElement(element).click();
    }
    public static void sendKeys(By element, String text){
        driver.findElement(element).sendKeys(text);
    }
    public static void implicitWait(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public static void acceptAlert(){
        explicitWait.waitUntilAlertDisplay();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public static String getThePageTitle(){
        return driver.getTitle();
    }
}
