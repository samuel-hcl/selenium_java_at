package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleResultsPage {

    @FindBy(how = How.CSS, using = "div.srg > div.g")
    private WebElement firstSearchResult;

    public String getFirstSearchResult() {
        return firstSearchResult.getText();
    }

}
