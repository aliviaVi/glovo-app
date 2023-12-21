
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import pages.SignUpLocalizationPage;
import static com.codeborne.selenide.Selenide.open;
import static utility.PageUtility.BASE_URL;
import org.junit.Assert;
public class RegistrationPageTests {
    RegistrationPage registrationPage = new RegistrationPage();



    @Test
    public void registrationTest(){
        registrationPage = open(BASE_URL, RegistrationPage.class);
        registrationPage.fillInRegistrationData();
        registrationPage.clickOnSubmittButton();

        Assert.assertEquals(SignUpLocalizationPage.class, SignUpLocalizationPage.class);
    }
}
