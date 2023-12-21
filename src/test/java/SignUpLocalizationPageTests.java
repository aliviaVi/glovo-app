import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import pages.SignUpLocalizationPage;
import static com.codeborne.selenide.Selenide.open;
import static utility.PageUtility.LOCAL_PAGE;

public class SignUpLocalizationPageTests {
    RegistrationPage registrationPage = new RegistrationPage();
    SignUpLocalizationPage localizationPage;

    @Test
    public void fillOutLocalizationPage1Step(){
        localizationPage = open(LOCAL_PAGE, SignUpLocalizationPage.class);
        localizationPage.fillFormOut();

    }
}
