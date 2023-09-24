import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

public class PersonalAccountTests extends BaseTest {
    ConstructorPage constructorPage = new ConstructorPage();
    PersonalAccountPage personalAccountPage = new PersonalAccountPage();
    ApiUtils apiUtils = new ApiUtils();
    LoginPage loginPage = new LoginPage();
    @Test
    @DisplayName("Переход в личный кабинет ")
    @Description("Проверь переход по клику на «Личный кабинет».")
    public void testGoTOPersonalDataButton() {
        apiUtils.createNewUser();
        constructorPage.openConstructorPage();
        constructorPage.clickPersonalAccountButton();
        loginPage.enterValidEmailAndPassInFields();
        loginPage.clickJoinButton();
        constructorPage.clickPersonalAccountButton();
        personalAccountPage.checkProfilePage();
        apiUtils.deleteUser();

    }
    @Test
    @DisplayName("Переход из личного кабинета в конструктор ")
    @Description("Проверь переход по клику на «Конструктор»")
    public void testGoTOConstructorButton() {
        apiUtils.createNewUser();
        constructorPage.openConstructorPage();
        constructorPage.clickPersonalAccountButton();
        loginPage.enterValidEmailAndPassInFields();
        loginPage.clickJoinButton();
        constructorPage.clickPersonalAccountButton();
        personalAccountPage.clickConstructorButton();
        constructorPage.checkAuthorisationText();
        apiUtils.deleteUser();
    }
    @Test
    @DisplayName("Переход из личного кабинета в конструктор ")
    @Description("Проверь переход по клику на на логотип Stellar Burgers.")
    public void testGoTOConstructorLogoButton() {
        apiUtils.createNewUser();
        constructorPage.openConstructorPage();
        constructorPage.clickPersonalAccountButton();
        loginPage.enterValidEmailAndPassInFields();
        loginPage.clickJoinButton();
        constructorPage.clickPersonalAccountButton();
        personalAccountPage.clickLogoButton();
        constructorPage.checkAuthorisationText();
        apiUtils.deleteUser();
    }
    @Test
    @DisplayName("Выход из аккаунта")
    @Description("Проверка выхода из аккаунта по кнопке «Выйти» в личном кабинете.")
    public void testLogOutAccount() {
        apiUtils.createNewUser();
        constructorPage.openConstructorPage();
        constructorPage.clickPersonalAccountButton();
        loginPage.enterValidEmailAndPassInFields();
        loginPage.clickJoinButton();
        constructorPage.clickPersonalAccountButton();
        personalAccountPage.clickLogOutButton();
        personalAccountPage.checkPersonalAccountElements();
        apiUtils.deleteUser();
    }
}
