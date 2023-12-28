import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TestBase {

    private static final By cookiesBanner = By.id("onetrust-group-container");
    private static final By cookiesButton = By.id("onetrust-accept-btn-handler");


    public void acceptCookies() {
        if ($(cookiesBanner).isDisplayed()) {
            $(cookiesButton).click();
        }
        return;
    }
}
