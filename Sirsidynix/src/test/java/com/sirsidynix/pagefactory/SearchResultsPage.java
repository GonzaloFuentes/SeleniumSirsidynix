package com.sirsidynix.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by gpaez on 2/8/2016.
 */
public class SearchResultsPage  extends  BasePage {
    @FindBy(xpath = "//div[@id='search-page-results']/descendant::a")
    private List<WebElement> searchResults;

    public void clickSecondSearchResult(){
        searchResults.get(1).click();
    }
}
