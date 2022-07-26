package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class ModalWindow {
    private final SelenideElement
            chckBoxLabel = $("div.modal-settings-filter__main > " +
                                        "div:nth-child(2) > div:nth-child(3) > " +
                                            "div > div > div:nth-child(3) label");
    private final SelenideElement
            excludeJointPurchasesLabel = $("div.modal-settings-filter__main > " +
                                                        "div:nth-child(1) > div:nth-child(3) > " +
                                                            "div > div > div:nth-child(3) label");
    private final SelenideElement
            regionCollapse = $("div.modal-settings-filter__main > " +
                                            "div:nth-child(7) > div > div");
    private final SelenideElement
            altayLabel = $("div.modal-settings-filter__main > " +
                                        "div:nth-child(7) > div:nth-child(5) > " +
                                            "div > ul > li:nth-child(1) > label");
    private final SelenideElement
            activeLabel = $("div.modal-settings-filter__main > " +
                                        "div:nth-child(3) > div.grid > div > " +
                                            "div:nth-child(1) > label");
    private final SelenideElement
            dateFilterCollapse = $("div.modal-settings-filter__main > " +
                                                "div:nth-child(12) > div > div");
    private final SelenideElement
            dateInputFrom = $("div.modal-settings-row > div > div > div:nth-child(1) > " +
                                            "div.form-group.form-group--nowrap > div:nth-child(1)");
    private final SelenideElement
            dateInputTo = $("div.modal-settings-row > div > div > div:nth-child(1) > " +
                                            "div.form-group.form-group--nowrap > div:nth-child(3)");
    private final SelenideElement
            currentDay1 = $("div[tabindex=\"0\"]");
    private final SelenideElement
            submitButton = $(".bottomCenterSearch > div > div > button");
    private final SelenideElement activeCheckbox = $("div.modal-settings-filter__main > " +
                                                                "div:nth-child(3) > div.grid > div > " +
                                                                    "div:nth-child(1) > input[type=checkbox]");

    public void clckCheckbox(String check) {

        chckBoxLabel.click();
        if (activeCheckbox.isSelected()) {
            activeLabel.click();
        }

    }
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
//               $x("//*[@id=\"ftfbn-portal\"]/div[2]/div/div/div/div[1]/div[5]/div[12]/div[2]/div/div/div[1]/div[2]/div[1]/div/div[2]/div/div/div[2]/div[2]/div[5]/div[5]").click();
                currentDay1.click();
                    dateInputTo.click();
                        currentDay1.click();
    }

    public void clickSubmitButton(String str) {
        submitButton.click();
    }
}
