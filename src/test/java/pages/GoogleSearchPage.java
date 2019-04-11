package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleSearchPage {

    @FindBy(how = How.CSS, using = "input[title=Pesquisar]")
    private WebElement searchField;

    public GoogleSearchPage fillSearchField(String searchWord) {
        searchField.sendKeys(searchWord, Keys.ENTER);
        return this;
    }

}
