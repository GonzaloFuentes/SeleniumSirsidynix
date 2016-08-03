package com.sirsidynix.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

/**
 * Created by gpaez
 */
public class SearchResultsPage {
    @FindBy(xpath = "//div[@id='search-page-results']/descendant::a")
    private List<WebElement> searchResults;

    public void clickSecondSearchResult(){
        Reporter.log("Search Results page | Select second result.\n");
        searchResults.get(1).click();
    }
}
