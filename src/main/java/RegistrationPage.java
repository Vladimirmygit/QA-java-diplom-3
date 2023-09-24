import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage extends BaseTest {

    public void openPageRegister() {
        open("register");
    }
    public void enterNameInfield() {
        ElementsCollection Fields = $$(Locators.getLocatorsFields());
        SelenideElement name = Fields.get(0);
        name.shouldBe(Condition.visible).click();
        name.setValue(TestData.VALID_NAME);
    }
    public void enterEmailInfield() {
        ElementsCollection Fields = $$(Locators.getLocatorsFields());
        SelenideElement email = Fields.get(1);
        email.shouldBe(Condition.visible).click();
        email.setValue(TestData.VALID_EMAIL);
    }

    public void enterValidPassInfield() {
        ElementsCollection Fields = $$(Locators.getLocatorsFields());
        SelenideElement pass = Fields.get(2);
        pass.shouldBe(Condition.visible).click();
        pass.setValue(TestData.VALID_PASSWORD);
    }
    public void enterInvalidPassInfield() {
        ElementsCollection Fields = $$(Locators.getLocatorsFields());
        SelenideElement pass = Fields.get(2);
        pass.shouldBe(Condition.visible).click();
        pass.setValue(TestData.INVALID_PASSWORD);
    }
    public void clickRegistrationButton() {
        SelenideElement Registration = $(Locators.getRegistrationOnPageLocatorButton());
        Registration.shouldBe(Condition.visible).click();
    }
    public void checkNotificationMessage() {
        SelenideElement Notification = $(Locators.getNotificationLocatorText());
        Notification.shouldBe(Condition.visible);
    }
}
