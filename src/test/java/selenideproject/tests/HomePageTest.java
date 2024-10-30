package selenideproject.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import selenideproject.basetest.BaseTest;

public final class HomePageTest extends BaseTest{

    private HomePageTest(){}

    @BeforeEach
    public void doHomePageSetup(){
        homePage = loginPage.doLogin().enter2Factor();
    }
    
    @Test
    public void doLogoutTest(){
        homePage.doLogout();
        Assertions.assertTrue(loginPage.isPrivateLinkAvailable());
    }
}
