package pages;

import com.codeborne.selenide.SelenideElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class SearchResult {



    private static final Logger log = LogManager.getLogger(SearchResult.class);
    private final SelenideElement loadMoreButton = $("#load-more");
List<SelenideElement> elements = $$("#content > div[itemtype = \"http://schema.org/Product\"]");
    FileWriter fileWriter;

    public void iterateElements() {

WebDriverWait driverWait = new WebDriverWait(getWebDriver(), Duration.ofSeconds(20, 2));


                   driverWait.until(ExpectedConditions.elementToBeClickable(loadMoreButton.scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}")));
                           loadMoreButton.click();

        driverWait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("#content > div[itemtype = \"http://schema.org/Product\"]"), 20));
            if (!elements.isEmpty()){
                for (WebElement element : elements) {
//                System.out.println(elements.size() + ":" + element.findElement(By.cssSelector("[itemprop=\"price\"]")).getText());
                    log.info(element.findElement(By.cssSelector("[itemprop=\"price\"]")).getText());
                    log.info("НАЧАЛЬНАЯ ЦЕНА: ", element.findElement(By.cssSelector("[itemprop=\"price\"]")).getText());
                    try{fileWriter = new FileWriter("src\\test\\file_test\\file.txt", StandardCharsets.UTF_8);
                   fileWriter.write("НАЧАЛЬНАЯ ЦЕНА: " + element.findElement(By.cssSelector("[itemprop=\"price\"]")).getText());

                    } catch (
                            IOException e) {
                        throw new RuntimeException(e);
                    }

            }
        }
    }
}
