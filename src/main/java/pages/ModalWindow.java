package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ModalWindow {

    private final SelenideElement chckBox615 = $x("//*[@id=\"ftfbn-portal\"]/div[2]/div/div/div/div[1]/div[5]/div[2]/div[3]/div/div/div[3]/input");
    private final SelenideElement collapseBttn = $x("//*[@id=\"ftfbn-portal\"]/div[2]/div/div/div/div[1]/div[5]/div[2]/div/div");
    private final SelenideElement chckBoxLabel = $x("//*[@id=\"ftfbn-portal\"]/div[2]/div/div/div/div[1]/div[5]/div[2]/div[3]/div/div/div[3]/label");
    private final SelenideElement excludeJointPurchasesLabel = $x("//*[@id=\"ftfbn-portal\"]/div[2]/div/div/div/div[1]/div[5]/div[1]/div[3]/div/div/div[3]/label");
    private final SelenideElement regionCollapse = $x("//*[@id=\"ftfbn-portal\"]/div[2]/div/div/div/div[1]/div[5]/div[7]/div[1]/div");
    private final SelenideElement altayLabel = $x("//*[@id=\"ftfbn-portal\"]/div[2]/div/div/div/div[1]/div[5]/div[7]/div[5]/div/ul/li[1]/label");


    public void clckCheckbox(String check) {
        chckBoxLabel.click();
    }

    public void isVisible() {
        System.out.println(chckBox615.isDisplayed());
    }
    public void jointPurchasesClick(String check) {
        excludeJointPurchasesLabel.click();
    }
    public void clickOnRegionCollapse(String str) {
        regionCollapse.click();
        System.out.println("алтайский край visible? = " + altayLabel.isDisplayed());
        altayLabel.click();
        System.out.println("алтайский край selected? = " + altayLabel.isSelected());
    }
}
