
import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.RegistrationPage;
import pages.SignUpLocalizationPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static utility.PageUtility.BASE_URL;

import org.junit.Assert;

public class RegistrationPageTests extends TestBase {
    private static final By cookiesBanner = By.id("onetrust-group-container");
    private static final By cookiesButton = By.id("onetrust-accept-btn-handler");
    RegistrationPage registrationPage = new RegistrationPage();

    SignUpLocalizationPage signUpLocalizationPage;

    @BeforeEach
    public void openRegisterPage() {
        registrationPage = open(BASE_URL, RegistrationPage.class);
        acceptCookies();
        Configuration.browserSize = "1920x1080";
    }

    @Test
    public void acceptCookiesTest() {
        $(cookiesBanner).shouldBe(hidden);
    }

    @Test
    public void registrationTest() {
        registrationPage.fillInRegistrationData();
        signUpLocalizationPage = registrationPage.clickOnSubmittButton();

        $(signUpLocalizationPage.returnForm()).shouldBe(visible);
        // Assert.assertTrue(signUpLocalizationPage.returnForm().isDisplayed());
    }

    @Test
    public void incorrectFillOutFormTest() {
        registrationPage.fillOutRegistrationFormWithOutBusinessName();
        registrationPage.clickOnSubmittButton();

        $(registrationPage.getErrorMessage()).shouldBe(visible);

    }

    @Test
    public void fillOutFormWithoutPhoneNumberTest(){
        registrationPage.fillInRegistrationData();
        registrationPage.clickOnSubmittButton();
        $(registrationPage.getErrorMessage()).shouldHave(text("Введіть дійсний номер телефону\n"));
    }

}
