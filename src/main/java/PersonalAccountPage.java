import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.Selenide;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class PersonalAccountPage extends BaseTest {
    public void clickConstructorButton() {
        SelenideElement constructor = $(Locators.getLocatorConstructorButton());
        constructor.shouldBe(Condition.visible).click();
    }
    public void clickLogoButton() {
        SelenideElement logo = $(Locators.getLocatorLogo());
        logo.shouldBe(Condition.visible).click();
    }
    public void clickLogOutButton() {
        SelenideElement exit = $(Locators.getLocatorExitButton());
        exit.shouldBe(Condition.visible).click();
    }

    public void checkProfilePage() {
        SelenideElement element = $(Locators.getLocatorText());
        String expectedText = "В этом разделе вы можете изменить свои персональные данные";
        element.shouldHave(text(expectedText));
    }
    public void checkPersonalAccountElements() {
        SelenideElement element = $(Locators.getLocatorPersonalAccountElement());
        element.shouldNotBe(Condition.visible);
    }

}
