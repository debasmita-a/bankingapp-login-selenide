package selenideproject.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;


public final class HomePage {

    private static final SelenideElement WELCOME_MESSAGE = $(byId("user-greeting"));
    private static final SelenideElement LOGOUT_BTN = $x(""));
    private static final HomePage LoginPage = null;

    public String getWelcomeMessage(){
        return WELCOME_MESSAGE.shouldBe(visible).text();
    }

    public HomePage doLogout(){
        LOGOUT_BTN.should(appear).pressEnter();
        return LoginPage;
    }

}
