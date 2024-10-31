package by.ITAcademy.MPA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.*;

import java.time.Duration;

public class LoginTest {
    private static WebDriver driver;
    private static LoginPage loginPage;

    @BeforeMethod
    public static void setUp() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.onliner.by/");
        loginPage.clickButtonEnterLoginPage();
    }

    @Test
    public void noCredentialsTest() {
        loginPage.clickButtonLogin();

        AssertJUnit.assertEquals(LoginMessage.EMPTY_NICK_OR_EMAIL, loginPage.getErrorEmptyNickOrEmailMessage());
        AssertJUnit.assertEquals(LoginMessage.EMPTY_PASSWORD, loginPage.getErrorEmptyPasswordMessage());
    }

    @Test
    public void sendNickOrEmailOnlyTest() {
        loginPage.sendNickOrEmail("test@test.com");
        loginPage.clickButtonLogin();

        AssertJUnit.assertEquals(LoginMessage.EMPTY_PASSWORD, loginPage.getErrorEmptyPasswordMessage());
    }

    @Test
    public void sendPasswordOnlyTest() {
        loginPage.sendPassword("HelloKitty333");
        loginPage.clickButtonLogin();

        AssertJUnit.assertEquals(LoginMessage.EMPTY_NICK_OR_EMAIL, loginPage.getErrorEmptyNickOrEmailMessage());
    }

    @Test
    public void sendInvalidCredentialsTest() {
        loginPage.sendNickOrEmail("test@test.com");
        loginPage.sendPassword("HelloKitty333");
        loginPage.clickButtonLogin();

        AssertJUnit.assertEquals(LoginMessage.INVALID_CREDENTIALS, loginPage.getErrorInvalidCredentials());
    }

    @Test
    public void buttonShowPasswordTest() {
        String password = "HelloKitty333";
        loginPage.sendPassword(password);
        loginPage.clickButtonShowPassword();

        AssertJUnit.assertEquals(password, loginPage.getInputPassword());
    }

    @AfterMethod
    public static void tearDown() {
        driver.quit();
    }
}
