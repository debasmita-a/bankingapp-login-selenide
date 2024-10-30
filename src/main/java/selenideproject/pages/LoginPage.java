package selenideproject.pages;

import com.codeborne.selenide.SelenideElement;

import selenideproject.entities.LoginDetails;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;
import java.time.Duration;

import org.openqa.selenium.By;

public final class LoginPage {

    private static final SelenideElement USERNAME = $(By.id("username"));
    private static final SelenideElement PASSWORD = $(By.name("password"));
    private static final SelenideElement LOGIN_BTN = $(byTagAndText("button", "Login"));
    private static final SelenideElement OTP_CODE = $(byId("otp-code"));
    private static final SelenideElement OTP_CONFIRM = $(byId("login-otp-button"));
    private static final SelenideElement PRIVATE_LINK = $(byLinkText("Private"));

    public LoginPage doLogin(LoginDetails loginDetails){
        USERNAME.shouldBe(visible, Duration.ofSeconds(5)).setValue(loginDetails.getUsername());
        PASSWORD.shouldBe(visible).setValue(loginDetails.getPassword());
        LOGIN_BTN.shouldBe(enabled).pressEnter();
        return this;
    }

    public HomePage enter2Factor(LoginDetails loginDetails){
        OTP_CODE.shouldBe(enabled, Duration.ofSeconds(2)).val(loginDetails.getOtpCode());
        OTP_CONFIRM.pressEnter();
        return new HomePage();
    }

    public boolean isPrivateLinkAvailable(){
        return PRIVATE_LINK.is(exist);
    }
}
