package utility;

import com.github.javafaker.Faker;

public abstract class Page {
    static Faker faker = new Faker();


    public static String CITY = faker.address().city();
    public static String BUSINESS_NAME = faker.funnyName().toString();
    public static String NAME = String.valueOf(faker.name().firstName());
    public static String SURNAME = faker.name().lastName();
    public static String EMAIL = "test@gmail.com";
    public static String PHONE = "626 87 87 87"; //faker.phoneNumber().phoneNumber();

    public static String INCORRECT_PHONE = "345";
    public static String ADDRESS = faker.address().streetAddress();



}
