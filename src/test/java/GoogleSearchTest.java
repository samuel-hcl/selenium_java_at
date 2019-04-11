import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import setup.Setup;

import pages.GoogleResultsPage;
import pages.GoogleSearchPage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class GoogleSearchTest extends Setup {

    private GoogleSearchPage searchPage;
    private GoogleResultsPage resultsPage;

    @Before
    public void initializePages(){
        searchPage = PageFactory.initElements(driver, GoogleSearchPage.class);
        resultsPage = PageFactory.initElements(driver, GoogleResultsPage.class);
    }

    @Test
    public void searchesInGoogle() {
        driver.findElement(By.cssSelector("input[title=Pesquisar]")).sendKeys("invillia", Keys.ENTER);
        String firstResult = driver.findElement(By.cssSelector("div.srg > div.g")).getText();
        assertThat(firstResult, containsString("Invillia | Transformação Digital e Engenharia de Produtos"));
    }

    @Test
    public void searchesInGoogleWithPageObject() {
        searchPage.fillSearchField("invillia");
        assertThat(resultsPage.getFirstSearchResult(), containsString("Invillia | Transformação Digital e Engenharia de Produtos"));
    }

}
