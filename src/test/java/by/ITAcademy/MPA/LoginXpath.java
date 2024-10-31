package by.ITAcademy.MPA;

public class LoginXpath {
    public static final String BUTTON_ENTER_LOGIN_PAGE_XPATH = "//*[@id=\"userbar\"]/div[2]/div/div/div[1]";

    public static final String INPUT_NICK_OR_EMAIL_XPATH = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[1]/div/div[2]/div/div/div/div/input";
    public static final String INPUT_PASSWORD_XPATH = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[2]/div/div/div/div/input";
    public static final String BUTTON_LOGIN_XPATH = "//button[@class='auth-button auth-button_primary auth-button_middle auth-form__button auth-form__button_width_full']";
    public static final String BUTTON_SHOW_PASSWORD_XPATH = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[2]/div/div/div/div/div";

    public static final String OUTPUT_ERROR_EMPTY_NICK_OR_EMAIL_XPATH = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[1]/div/div[2]/div/div/div[2]/div";
    public static final String OUTPUT_ERROR_EMPTY_PASSWORD_XPATH = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[2]/div/div/div[2]/div";
    public static final String OUTPUT_ERROR_INVALID_CREDENTIALS_XPATH = "//div[@class='auth-form__description auth-form__description_error auth-form__description_base auth-form__description_extended-other']";
}
