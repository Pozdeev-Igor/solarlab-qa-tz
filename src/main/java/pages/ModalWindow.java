package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ModalWindow {

    private final SelenideElement chckBox615 = $x("//*[@id=\"ftfbn-portal\"]/div[2]/div/div/div/div[1]/div[5]/div[2]/div[3]/div/div/div[3]/input");
    private final SelenideElement collapseBttn = $x("//*[@id=\"ftfbn-portal\"]/div[2]/div/div/div/div[1]/div[5]/div[2]/div/div");
    private final SelenideElement chckBoxLabel = $x("//*[@id=\"ftfbn-portal\"]/div[2]/div/div/div/div[1]/div[5]/div[2]/div[3]/div/div/div[3]/label");

    public void clckCheckbox(String check) {
        chckBoxLabel.click();
    }

    public void isVisible() {
        System.out.println(chckBox615.isDisplayed());
    }
    public void clckCollapseBttn() {
        collapseBttn.click();
    }
}
