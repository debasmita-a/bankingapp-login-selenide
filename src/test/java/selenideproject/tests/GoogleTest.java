package selenideproject.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class GoogleTest {

    @Test
    public void googleTest(){
        open("http://google.com");
        System.out.println(title());
    }
}
