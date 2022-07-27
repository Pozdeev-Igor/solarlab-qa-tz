package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class ModalWindow {
    

    private final SelenideElement
            chckBoxLabel = $(
                    "div.modal-settings-filter__main > div:nth-child(2) > div:nth-child(3) > div > div > div:nth-child(3) label");
    private final SelenideElement
            excludeJointPurchasesLabel = $(
                    "div.modal-settings-filter__main > div:nth-child(1) > div:nth-child(3) > div > div > div:nth-child(3) label");
    private final SelenideElement
            regionCollapse = $x(
                    "//*[@id=\"ftfbn-portal\"]/div[2]/div/div/div/div[1]/div[5]/div[7]/div[1]/div");
    private final SelenideElement
            altayLabel = $x(
                    "//*[@id=\"ftfbn-portal\"]/div[2]/div/div/div/div[1]/div[5]/div[7]/div[5]/div/ul/li[1]/label");
    private final SelenideElement
            dateFilterCollapse = $x(
                    "//*[@id=\"ftfbn-portal\"]/div[2]/div/div/div/div[1]/div[5]/div[12]/div/div");
    private final SelenideElement
            dateInputFrom = $x(
                    "//*[@id=\"ftfbn-portal\"]/div[2]/div/div/div/div[1]/div[5]/div[12]/div[2]/div/div/div[2]" +
                                    "/div[2]/div[1]/div/div/input");
    private final SelenideElement
            dateInputTo = $x(
                    "//*[@id=\"ftfbn-portal\"]/div[2]/div/div/div/div[1]/div[5]/div[12]/div[2]/div/div/div[2]" +
                                    "/div[2]/div[3]/div/div/input");
    private final SelenideElement
            currentDay1 = $x(
                    "//*[@id=\"ftfbn-portal\"]/div[2]/div/div/div/div[1]/div[5]/div[12]/div[2]/div/div/div[2]" +
                                    "/div[2]/div[1]/div/div[2]/div/div/div[2]/div[2]/div[5]/div[1]");
    private final SelenideElement
            currentDay2 = $x(
                    "//*[@id=\"ftfbn-portal\"]/div[2]/div/div/div/div[1]/div[5]/div[12]/div[2]/div/div/div[2]" +
                                    "/div[2]/div[3]/div/div[2]/div/div/div[2]/div[2]/div[5]/div[1]");
    private final SelenideElement
            submitButton = $x(
                    "//*[@id=\"ftfbn-portal\"]/div[2]/div/div/div/div[1]/div[6]/div/div/button");

    public void clckCheckbox(String check) {

        chckBoxLabel.click();
    }

//    public void isVisible() {
//        System.out.println(chckBox615.isDisplayed());
//    }
    public void jointPurchasesClick(String check) {

        excludeJointPurchasesLabel.click();
    }
    public void clickOnRegionCollapse(String str) {
        regionCollapse.click();
        altayLabel.click();
    }

    public void selectDate() {
        dateFilterCollapse.click();
        dateInputFrom.click();
        currentDay1.click();

        dateInputTo.click();
        currentDay2.click();
    }

    public void clickSubmitButton(String str) {
        submitButton.click();
    }
}
