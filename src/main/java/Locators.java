import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Locators {
    //Локатор кнопки Начинки
    public static By getIngredientsLocatorButton() {
        return By.xpath("//span[@class='text text_type_main-default' and text()='Начинки']");
    }
    //Локатор кнопки Соусы
    public static By getSouciLocatorButton() {
        return By.xpath("//span[@class='text text_type_main-default' and text()='Соусы']");
    }
    //Локатор кнопки Булочки
    public static By getBunsLocatorButton() {
        return By.xpath("//span[@class='text text_type_main-default' and text()='Булки']");
    }
    //Локатор секции Начинки
    public static By getIngredientsSectionLocator() {
        return By.xpath("//h2[@class='text text_type_main-medium mb-6 mt-10' and text()='Начинки']");
    }
    //Локатор секции Соусов
    public static By getSouciSectionLocator() {
        return By.xpath("//h2[@class='text text_type_main-medium mb-6 mt-10' and text()='Соусы']");
    }
    //Локатор секции Булочек
    public static By getBunsSectionLocator() {
        return By.xpath("//h2[@class='text text_type_main-medium mb-6 mt-10' and text()='Булки']");
    }
    //Локатор кнопки "Личный кабинет"
    public static By getClickPersonalAccountLocatorButton() {
        return By.xpath("//p[@class='AppHeader_header__linkText__3q_va ml-2' and text()='Личный Кабинет']");
    }

    //Локатор кнопки "Зарегистрироваться" на странице Логина
    public static By getClickRegistrationLocatorButton() {
        return By.xpath("//a[@class='Auth_link__1fOlj']");
}

    //Локатор полей Ввода для Регистрации
    public static By getLocatorsFields() {
        return By.xpath("//input[@class='text input__textfield text_type_main-default']");
}

    //Локатор кнопки "Зарегистрироваться" на странице регистрации
        public static By getRegistrationOnPageLocatorButton() {
            return By.xpath("//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']");
    }

    //Локатор текста уведомления "Некорректный пароль"
    public static By getNotificationLocatorText() {
        return By.xpath("//p[@class='input__error text_type_main-default']");
    }
    //Локатор кнопки "Войти в аккаунт" на главной
    public static By getAuthorisationLocatorButton() {
        return By.xpath("//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg']");
    }
    //Локатор кнопки "Войти" на странице регистрации и восстановления пароля
    public static By getAuthorisationOnPageRegistrationLocatorButton() {
        return By.xpath("//a[@class='Auth_link__1fOlj']");
    }
    //Локатор кнопки Конструктор
    public static By getLocatorConstructorButton() {
        return By.xpath("//p[@class='AppHeader_header__linkText__3q_va ml-2']");
    }

    //Локатор логотипа Stellar Burgers.
    public static By getLocatorLogo() {
        return By.xpath("//div[@class='AppHeader_header__logo__2D0X2']");
    }

    //Локатор кнопки "выход"
    public static By getLocatorExitButton() {
        return By.xpath("//button[@class='Account_button__14Yp3 text text_type_main-medium text_color_inactive']");
    }

    //Локатор кнопки "Оформить заказ"
    public static By getLocatorOrderButton() {
        return By.xpath("//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg']");
    }

    //Локатор Текста "В этом разделе вы можете изменить свои персональные данные"
    public static By getLocatorText() {
        return By.xpath("//p[@class='Account_text__fZAIn text text_type_main-default']");
    }
    //Локатор элементов интерфейса личного кабинета
    public static By getLocatorPersonalAccountElement() {
        return By.xpath("  //li[@class='Account_listItem__35dAP']");
    }
}