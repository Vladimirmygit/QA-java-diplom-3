import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonalAccountTests extends BaseTest {
    ConstructorPage constructorPage = new ConstructorPage();
    PersonalAccountPage personalAccountPage = new PersonalAccountPage();
    ApiUtils apiUtils = new ApiUtils();
    LoginPage loginPage = new LoginPage();
    @Before
    public void setUp() {
        apiUtils.createNewUser();
        constructorPage.openConstructorPage();
        constructorPage.openConstructorPage();
        constructorPage.clickPersonalAccountButton();
        loginPage.enterValidEmailAndPassInFields();
        loginPage.clickJoinButton();
    }
    @After
    public void tearDown() {
        apiUtils.deleteUser();
    }
    @Test
    @DisplayName("Переход в личный кабинет ")
    @Description("Проверь переход по клику на «Личный кабинет».")
    public void testGoTOPersonalDataButton() {
        constructorPage.clickPersonalAccountButton();
        personalAccountPage.checkProfilePage();

    }
    @Test
    @DisplayName("Переход из личного кабинета в конструктор ")
    @Description("Проверь переход по клику на «Конструктор»")
    public void testGoTOConstructorButton() {
        personalAccountPage.clickConstructorButton();
        constructorPage.checkAuthorisationText();
    }
    @Test
    @DisplayName("Переход из личного кабинета в конструктор ")
    @Description("Проверь переход по клику на на логотип Stellar Burgers.")
    public void testGoTOConstructorLogoButton() {
        personalAccountPage.clickLogoButton();
        constructorPage.checkAuthorisationText();
    }
    @Test
    @DisplayName("Выход из аккаунта")
    @Description("Проверка выхода из аккаунта по кнопке «Выйти» в личном кабинете.")
    public void testLogOutAccount() {
        constructorPage.clickPersonalAccountButton();
        personalAccountPage.clickLogOutButton();
        personalAccountPage.checkPersonalAccountElements();
    }
}
