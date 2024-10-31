package by.ITAcademy.MPA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonEnterLoginPage(){
        driver.findElement(By.xpath(LoginXpath.BUTTON_ENTER_LOGIN_PAGE_XPATH)).click();
    }

    public void clickButtonLogin() {
        driver.findElement(By.xpath(LoginXpath.BUTTON_LOGIN_XPATH)).click();
    }

    public String getErrorEmptyNickOrEmailMessage() {
        return driver.findElement(By.xpath(LoginXpath.OUTPUT_ERROR_EMPTY_NICK_OR_EMAIL_XPATH)).getText();
    }

    public String getErrorEmptyPasswordMessage() {
        return driver.findElement(By.xpath(LoginXpath.OUTPUT_ERROR_EMPTY_PASSWORD_XPATH)).getText();
    }

    public void sendNickOrEmail(String nickOrEmail) {
        By nickOrEmailBy = By.xpath(LoginXpath.INPUT_NICK_OR_EMAIL_XPATH);
        driver.findElement(nickOrEmailBy).sendKeys(nickOrEmail);
    }

    public void sendPassword(String password) {
        By passwordBy = By.xpath(LoginXpath.INPUT_PASSWORD_XPATH);
        driver.findElement(passwordBy).sendKeys(password);
    }

    public void clickButtonShowPassword(){
        driver.findElement(By.xpath(LoginXpath.BUTTON_SHOW_PASSWORD_XPATH)).click();
    }

    public String getErrorInvalidCredentials() {
        return driver.findElement(By.xpath(LoginXpath.OUTPUT_ERROR_INVALID_CREDENTIALS_XPATH)).getText();
    }

    public String getInputPassword() {
        return driver.findElement(By.xpath(LoginXpath.INPUT_PASSWORD_XPATH)).getAttribute("value");
    }
}
