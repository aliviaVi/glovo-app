package pages;

import org.openqa.selenium.By;
import utility.Page;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class RegistrationPage extends Page {
    RegistrationPage registrationPage;
    private String countryCode = "+34";
    private String businessTypeName = "Аптека";

    private static final By countryUASelector = By.cssSelector("//*[@id='start-selling']/div/div[1]/form/div[2]/select/option[2]");
    private static final By citySelector = By.xpath("(//input[@placeholder='Місто'])[1]");
    private static final By businessName = By.xpath("(//input[@placeholder='Назва бізнесу'])[1]");
    private static final By name = By.xpath("//*[@id='start-selling']/div/div[1]/form/div[3]/div[1]/input");
    private static final By surname = By.xpath("(//input[@placeholder='Прізвище'])[1]");
    private static final By email = By.xpath("(//input[@placeholder='Електронна пошта'])[1]");
    private static final By phoneCodeCountry = By.xpath("(//select[@id='prefix'])[1]");
    private static final By phone = By.xpath("(//input[@placeholder='Телефон'])[1]");
    private static final By businessType = By.id("vertical"); //By.xpath("//*[@id='vertical']");
    private static final By businessTypeFlowers = By.xpath("//*[@id='vertical']/option[5]");
    private static final By movedBusiness = By.id("glovoActs");//"(//option[@value='false'][contains(text(),'Ні')])[1]");
    private static final By checkBoxPrivacy  = By.xpath("(//input[@id='privacy'])[1]");
    private static final By submittButton = By.xpath("//*[@id='landing_submitted']");



    public void fillInRegistrationData(){
      //  $(countryUASelector).click();
        $(citySelector).setValue(CITY);
        $(businessName).setValue(BUSINESS_NAME);
        $(name).setValue(NAME);
        $(surname).setValue(SURNAME);
        $(email).setValue(EMAIL);
        $(phoneCodeCountry).selectOptionByValue(countryCode);
        $(phone).setValue(PHONE);
        $(businessType).selectOption("Магазин квітів");
        $(movedBusiness).selectOption("Ні");
        $(checkBoxPrivacy).click();

    }


    public SignUpLocalizationPage clickOnSubmittButton(){
        $(submittButton).click();
        return page(SignUpLocalizationPage.class);
    }






}
