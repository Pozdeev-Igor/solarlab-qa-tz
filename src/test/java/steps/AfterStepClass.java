package steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;

public class AfterStepClass {

    @After
    public void teardown() {
        WebDriverRunner.getWebDriver().quit();
    }

//    @AfterStep
//    public void screenCapture() {
//        Selenide.screenshot(
//                System.currentTimeMillis() + "__step");
//    }
}


