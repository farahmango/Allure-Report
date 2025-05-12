package helpers;

import base.BaseClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait extends BaseClass {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public void waitUntilAlertDisplay(){
        wait.until(ExpectedConditions.alertIsPresent());
    }
}

