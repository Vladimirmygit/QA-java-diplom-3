import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ConstructorPage extends BaseTest {
    public void openConstructorPage(){
        Selenide.open("");
    }
    public void clickSectionIngredientsButton() {
        SelenideElement Filling = $(Locators.getIngredientsLocatorButton());
        Filling.shouldBe(Condition.visible).click();
    }
    public void clickSectionSouciButton() {
        SelenideElement Filling = $(Locators.getSouciLocatorButton());
        Filling.shouldBe(Condition.visible).click();
    }
    public void clickSectionBunsButton() {
        SelenideElement Filling = $(Locators.getBunsLocatorButton());
        Filling.shouldBe(Condition.visible).click();
    }
    public void checkMoveToIngredients() {
        SelenideElement Filling = $(Locators.getIngredientsSectionLocator());
        Filling.shouldBe(Condition.visible);
    }
    public void checkMoveToSouci() {
        SelenideElement Filling = $(Locators.getSouciSectionLocator());
        Filling.shouldBe(Condition.visible);
    }
    public void checkMoveToBuns() {
        SelenideElement Filling = $(Locators.getBunsSectionLocator());
        Filling.shouldBe(Condition.visible);
    }
    public void clickPersonalAccountButton() {
        SelenideElement PersonalAccount = $(Locators.getClickPersonalAccountLocatorButton());
        PersonalAccount.shouldBe(Condition.visible).click();
    }
    public void clickAuthorisationMainPageButton() {
        SelenideElement Authorisation = $(Locators.getAuthorisationLocatorButton());
        Authorisation.shouldBe(Condition.visible).click();
    }
    public void checkAuthorisationText() {
        $(Locators.getLocatorOrderButton())
                .shouldHave(text("Оформить заказ"));
    }
}
