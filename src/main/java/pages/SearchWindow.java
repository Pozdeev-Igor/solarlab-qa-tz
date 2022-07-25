package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SearchWindow {
    private final SelenideElement tuneButton = $x("//*[@id=\"chexboxestab-container\"]/span");

    public void clcTuneButton(String link) {
        tuneButton.click();
    }
}
