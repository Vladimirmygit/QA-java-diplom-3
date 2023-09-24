import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

public class ConstructorPageTests extends BaseTest {
    ConstructorPage constructorPage = new ConstructorPage();
    @Test
    @DisplayName("Тест на переход к разделам")
    @Description("Этот тест проверяет функциональность переходов к разделам: 'Булки', 'Соусы' и 'Начинки'.")
    public void testNavigateToSections() {
        constructorPage.openConstructorPage();
        constructorPage.clickSectionIngredientsButton();
        Selenide.sleep(1000);
        constructorPage.checkMoveToIngredients();
        constructorPage.clickSectionSouciButton();
        Selenide.sleep(1000);
        constructorPage.checkMoveToSouci();
        constructorPage.clickSectionBunsButton();
        Selenide.sleep(1000);
        constructorPage.checkMoveToBuns();
    }
}
