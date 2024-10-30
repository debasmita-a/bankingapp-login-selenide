package selenideproject.tests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import selenideproject.basetest.BaseTest;

public final class LoginPageTest extends BaseTest{

    private LoginPageTest(){}

    @Test
    public void doLogintest() throws InterruptedException{
        String message = loginPage.doLogin().enter2Factor()
                              .getWelcomeMessage();
        System.out.println(message);
        Assertions.assertEquals("Hello World!", message);
        Thread.sleep(5000);
    }
}
