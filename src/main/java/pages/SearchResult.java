package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import java.util.List;
import static com.codeborne.selenide.Selenide.*;

public class SearchResult {
    private final SelenideElement loadMoreButton = $x("//*[@id=\"load-more\"]");
    private final SelenideElement content = $("#content");

    public void iterateElements() {

        if (loadMoreButton.isDisplayed()){
                loadMoreButton.click();
        }

        List<SelenideElement> elements = $$(".cards .cards:only-of-type");
            if (!elements.isEmpty()){
                for (WebElement element : elements) {
                System.out.println(element.getText());
            }
        }
    }
}
