package pages;

import utils.FileUtils;

public class Credentials {

    private String userName;
    private String password;

    public Credentials() {
        this.userName = FileUtils.readPropertiesFile(System.getProperty("user.dir") +"\\src\\main\\resources\\config.properties","userName");
        this.password = FileUtils.readPropertiesFile(System.getProperty("user.dir") +"\\src\\main\\resources\\config.properties","password");
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

}
