package pages;

import org.openqa.selenium.By;
import utility.Page;

import static com.codeborne.selenide.Selenide.$;

public class SignUpLocalizationPage extends Page {
    SignUpLocalizationPage signUpLocalizationPage;
    private static final By companyName = By.xpath("(//input[@placeholder='Піцерія Олексій'])[1]");
    private static final By companyAddress = By.xpath("(//input[@placeholder='10 Haharina Avenue, 79000, Kyiv'])[1]");
    private static final By goOnButton = By.xpath("(//button[contains(text(),'Далі')])[1]");

    public void fillFormOut(){
        $(companyName).setValue(BUSINESS_NAME);
        $(companyAddress).setValue(ADDRESS);
        $(goOnButton).click();
    }

}
