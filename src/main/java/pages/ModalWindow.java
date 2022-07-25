package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class ModalWindow {

    private final SelenideElement
            chckBox615 = $x(
            "//*[@id=\"ftfbn-portal\"]/div[2]/div/div/div/div[1]/div[5]/div[2]/div[3]/div/div/div[3]/input");
    private final SelenideElement
            chckBoxLabel = $x(
                    "//*[@id=\"ftfbn-portal\"]/div[2]/div/div/div/div[1]/div[5]/div[2]/div[3]/div/div/div[3]/label");
    private final SelenideElement
            excludeJointPurchasesLabel = $x(
                    "//*[@id=\"ftfbn-portal\"]/div[2]/div/div/div/div[1]/div[5]/div[1]/div[3]/div/div/div[3]/label");
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
