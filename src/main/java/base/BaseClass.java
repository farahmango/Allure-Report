package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.FileUtils;

public class BaseClass {

    public static WebDriver driver;

    public static void setupApplication(){
        driver= initializeDriver();
        driver.get(FileUtils.readPropertiesFile(System.getProperty("user.dir") +"\\src\\main\\resources\\config.properties","url"));
    }


    public static WebDriver initializeDriver(){
        String driverType = FileUtils.readPropertiesFile(System.getProperty("user.dir") +"\\src\\main\\resources\\config.properties","browser");
        switch(driverType){
            case "chrome":
                driver=new ChromeDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
        return driver;
    }
}
