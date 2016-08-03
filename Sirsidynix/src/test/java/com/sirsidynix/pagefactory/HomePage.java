package com.sirsidynix.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Created by gpaez
 */
public class HomePage {

    @FindBy(id = "edit-search-block-form--2")
    WebElement searchInput;

    @FindBy(id = "edit-submit")
    WebElement searchSubmitButton;

    /**
     * This method complete the search input
     * @param searchText String with the text to search
     * */
    public void completeSearchInput(String searchText){
        Reporter.log("Home Page | Search the text '"+searchText+"'.\n");
        searchInput.sendKeys(searchText);
    }

    /**
     * Submit search
     * */
    public void submitSearch(){
        Reporter.log("Home Page | Click 'Search'.\n");
        searchSubmitButton.click();
    }


}
