import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;


public class LoginTests extends BaseTest {
    ConstructorPage constructorPage = new ConstructorPage();
    LoginPage loginPage = new LoginPage();
    ApiUtils apiUtils = new ApiUtils();
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
    @Test
    @DisplayName("Авторизация")
    @Description("Этот тест проверяет вход по кнопке «Войти в аккаунт» на главной")
    public void testAuthorisationJoinButton() {
        apiUtils.createNewUser();
        constructorPage.openConstructorPage();
        constructorPage.clickAuthorisationMainPageButton();
        loginPage.enterValidEmailAndPassInFields();
        loginPage.clickJoinButton();
        constructorPage.checkAuthorisationText();
        apiUtils.deleteUser();
    }
    @Test
    @DisplayName("Авторизация")
    @Description("Этот тест проверяет вход по кнопке «Личный Кабинет» на главной")
    public void testMainPageAuthorisation() {
        apiUtils.createNewUser();
        constructorPage.openConstructorPage();
        constructorPage.clickPersonalAccountButton();
        loginPage.enterValidEmailAndPassInFields();
        loginPage.clickJoinButton();
        Selenide.sleep(1000);
        constructorPage.checkAuthorisationText();
        apiUtils.deleteUser();
    }
    @Test
    @DisplayName("Авторизация")
    @Description("Этот тест проверяет вход по кнопке «Войти» в форме регистрации")
    public void testRegistrationPageAuthorisation() {
        apiUtils.createNewUser();
        constructorPage.openConstructorPage();
        constructorPage.clickPersonalAccountButton();
        loginPage.enterValidEmailAndPassInFields();
        loginPage.clickJoinButton();
        Selenide.sleep(1000);
        constructorPage.checkAuthorisationText();
        apiUtils.deleteUser();
    }
    @Test
    @DisplayName("Авторизация")
    @Description("Этот тест проверяет вход по кнопке «Войти» в фомре восстановления пароля")
    public void testForgotPassPageAuthorisation() {
        apiUtils.createNewUser();
        forgotPasswordPage.openForgotPasswordPage();
        constructorPage.clickPersonalAccountButton();
        loginPage.enterValidEmailAndPassInFields();
        loginPage.clickJoinButton();
        Selenide.sleep(1000);
        constructorPage.checkAuthorisationText();
        apiUtils.deleteUser();
    }
}
