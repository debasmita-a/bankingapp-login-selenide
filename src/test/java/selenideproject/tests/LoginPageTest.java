package selenideproject.tests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import selenideproject.basetest.BaseTest;
import selenideproject.entities.LoginDetails;
import selenideproject.testdata.LoginTestData;

public final class LoginPageTest extends BaseTest{

    private LoginPageTest(){}
    
    LoginDetails loginDetails = LoginTestData.getValidaLoginDetails();

    @Test
    public void doLogintest() throws InterruptedException{
        String message = loginPage.doLogin(loginDetails).enter2Factor(loginDetails)
                              .getWelcomeMessage();
        System.out.println(message);
        Assertions.assertEquals("Hello World!", message);
        Thread.sleep(5000);
    }
}
