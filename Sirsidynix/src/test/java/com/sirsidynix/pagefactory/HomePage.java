package com.sirsidynix.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by gpaez on 2/8/2016.
 */
public class HomePage  extends  BasePage {

    @FindBy(id = "edit-search-block-form--2")
    WebElement searchInput;

    @FindBy(id = "edit-submit")
    WebElement searchSubmitButton;

    /**
     * This method complete the search input
     * @param searchText String with the text to search
     * */
    public void completeSearchInput(String searchText){
        searchInput.sendKeys(searchText);
    }

    /**
     * Submit search
     * */
    public void submitSearch(){
        searchSubmitButton.click();
    }


}
