package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class SearchWindow {
    private final SelenideElement tuneButton = $("span[class=\"filter__open-modal\"]");

    public void clcTuneButton(String link) {
        tuneButton.click();
    }
}
