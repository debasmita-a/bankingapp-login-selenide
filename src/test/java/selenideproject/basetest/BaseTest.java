package selenideproject.basetest;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.Configuration;

import selenideproject.pages.HomePage;
import selenideproject.pages.LoginPage;

import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    protected LoginPage loginPage;
    protected HomePage homePage;
    
    
    @BeforeEach
    public void setUp(){
        Configuration.baseUrl = "https://idemo.bspb.ru";
        open("/");
        loginPage = new LoginPage();
    }
}
