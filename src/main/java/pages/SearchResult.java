package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.webdriver;

public class SearchResult {

    private final SelenideElement loadMoreButton = $x("//*[@id=\"load-more\"]");

    public void iterateElements() {
        loadMoreButton.click();
        List<WebElement> elements = webdriver().object().findElements(By.className("cards"));
//         int numberOfElements = elements.size();

        for (WebElement element : elements) {

            System.out.println(element.getText());
        }
    }
}
