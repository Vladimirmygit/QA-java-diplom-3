import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

public class RegistrationTests extends BaseTest {
    ConstructorPage constructorPage = new ConstructorPage();
    RegistrationPage registrationPage = new RegistrationPage();
    LoginPage loginPage = new LoginPage();
    ApiUtils apiUtils = new ApiUtils();

    @Test
    @DisplayName("Регистрация")
    @Description("Этот тест проверяет фукционал регистрации")
    public void testRegistration() {
        constructorPage.openConstructorPage();
        constructorPage.clickPersonalAccountButton();
        loginPage.clickRegistrationButton();
        registrationPage.enterNameInfield();
        registrationPage.enterEmailInfield();
        registrationPage.enterValidPassInfield();
        registrationPage.clickRegistrationButton();
        apiUtils.loginAccount();
        apiUtils.deleteUser();
    }
    @Test
    @DisplayName("Валидация поля с паролем")
    @Description("Этот тест проверяет валидацию с невалидными данными")
    public void testInvalidPassword() {
        registrationPage.openPageRegister();
        registrationPage.enterInvalidPassInfield();
        registrationPage.clickRegistrationButton();
        registrationPage.checkNotificationMessage();
    }
}
