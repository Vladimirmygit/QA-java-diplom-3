import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LoginPage {
    public void clickRegistrationButton() {
        SelenideElement Registration = $(Locators.getClickRegistrationLocatorButton());
        Registration.shouldBe(Condition.visible).click();
    }
    public void enterValidEmailAndPassInFields() {
        ElementsCollection Fields = $$(Locators.getLocatorsFields());

        SelenideElement email = Fields.get(0);
        email.shouldBe(Condition.visible).click();
        email.setValue(TestData.VALID_EMAIL);

        SelenideElement pass = Fields.get(1);
        pass.shouldBe(Condition.visible).click();
        pass.setValue(TestData.VALID_PASSWORD);
    }
    public void clickJoinButton() {
        SelenideElement Join = $(Locators.getRegistrationOnPageLocatorButton());
        Join.shouldBe(Condition.visible).click();

    }

}
