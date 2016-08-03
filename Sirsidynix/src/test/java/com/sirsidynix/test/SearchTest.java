package com.sirsidynix.test;

import com.sirsidynix.pagefactory.HomePage;
import com.sirsidynix.pagefactory.SearchResultsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by gpaez
 */
public class SearchTest extends  BaseTest{

    @Test
    public void homePageSearch(){
        driver.get("http://www.sirsidynix.com/");

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.completeSearchInput("cosugi 2016");
        homePage.submitSearch();

        SearchResultsPage searchResultsPage = PageFactory.initElements(driver,SearchResultsPage.class);
        searchResultsPage.clickSecondSearchResult();

        String expectedUrl = "http://www.sirsidynix.com/blog/2016/05/09/" +
                             "your-cosugi-compendium-everything-you-need-to-know-about";
        String currentUrl = driver.getCurrentUrl();
        String message = "The current URL is incorrect.";

        Assert.assertEquals(currentUrl,expectedUrl,message);
    }
}
