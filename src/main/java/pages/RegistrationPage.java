package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Page;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class RegistrationPage extends Page {
    RegistrationPage registrationPage;
    private String countryCode = "+34";
    private String businessTypeName = "Аптека";
    private String country = "ES";

    private static final By countrySelector =By.xpath("//form[@class='signupForm']/div[2]/select[@class = 'input form-control']"); // By.cssSelector("//*[@id='start-selling']/div/div[1]/form/div[2]/select/option[2]");
    private static final By citySelector = By.xpath("//form/div/input"); //By.xpath("(//input[@placeholder='Місто'])[1]");
    private static final By businessName = By.xpath("//form/input"); //By.xpath("(//input[@placeholder='Назва бізнесу'])[1]");
    private static final By name = By.xpath("//form[@class='signupForm']/div[3]/div[1]/input[1]"); //By.xpath("//*[@id='start-selling']/div/div[1]/form/div[3]/div[1]/input");
    private static final By surname = By.xpath("//form[@class='signupForm']/div[3]/div[2]/input"); // By.xpath("(//input[@placeholder='Прізвище'])[1]");
    private static final By email = By.xpath("//form[@class='signupForm']/input[2]"); //By.xpath("(//input[@placeholder='Електронна пошта'])[1]");
    private static final By phoneCodeCountry = By.xpath("(//select[@id='prefix'])[1]");
    private static final By phone = By.xpath("//form[@class='signupForm']/div[@class='formFlex']/div[2]/input");//By.xpath("(//input[@placeholder='Телефон'])[1]");
    private static final By businessType = By.id("vertical"); //By.xpath("//*[@id='vertical']");
    private static final By businessTypeFlowers = By.xpath("//form[@class='signupForm']/select[@id='vertical']/option[@value='Flowers']");// By.xpath("//*[@id='vertical']/option[5]");
    private static final String businessTypeString = "Flowers";
    private static final By movedBusiness = By.id("glovoActs");//"(//option[@value='false'][contains(text(),'Ні')])[1]");
    private static final String movedBusinessString = "Ні";
    private static final By checkBoxPrivacy  = By.xpath("(//input[@id='privacy'])[1]");
    private static final By submittButton = By.xpath("//*[@id='landing_submitted']");
    private static final By errorMessage  = By.xpath("//p[@class = 'error']");



    public void fillInRegistrationData(){
        $(countrySelector).selectOptionByValue(country);
        $(citySelector).setValue(CITY);
        $(businessName).setValue(BUSINESS_NAME);
        $(name).setValue(NAME);
        $(surname).setValue(SURNAME);
        $(email).setValue(EMAIL);
        $(phoneCodeCountry).selectOptionByValue(countryCode);
        $(phone).setValue(PHONE);
        $(businessType).selectOptionByValue(businessTypeString);
        $(movedBusiness).selectOption(movedBusinessString);
        $(checkBoxPrivacy).click();

    }

    public void fillOutRegistrationFormWithOutBusinessName(){
        $(countrySelector).selectOptionByValue(country);
        $(citySelector).setValue(CITY);

    }
    public By getErrorMessage(){
        return errorMessage;
    }


    public SignUpLocalizationPage clickOnSubmittButton(){
        $(submittButton).click();
        return page(SignUpLocalizationPage.class);
    }






}
