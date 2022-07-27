package pages;

import com.codeborne.selenide.SelenideElement;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class SearchResult {

    private final SelenideElement loadMoreButton = $x("//*[@id=\"load-more\"]");
    private final SelenideElement content = $("#content");

    public void iterateElements() {

        loadMoreButton.click();
        List<SelenideElement> elements = $$(".cards .cards:only-of-type");
//         int numberOfElements = elements.size();

        for (WebElement element : elements) {

            System.out.println(element.getText());
        }


    }
}
