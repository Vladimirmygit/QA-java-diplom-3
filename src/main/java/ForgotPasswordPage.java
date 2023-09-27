import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ForgotPasswordPage extends BaseTest {
    public void openForgotPasswordPage() {
        Selenide.open("forgot-password");
    }

}
