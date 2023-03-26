package com.n11.pages;

import com.n11.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdCase extends DriverManager {
    /*Locators*/
    @FindBy(id = "searchData")
    public WebElement txtBox_search;

    @FindBy(className = "searchBtn")
    public WebElement btn_search;

    @FindBy(xpath = "//*[@id=\"contentListing\"]/div/div[2]/div[1]/section[4]/div/div[2]/div[2]/label/span")
    public WebElement btnBox_secondBrand;

    @FindBy(xpath = "//*[@id=\"contentListing\"]/div/div[2]/div[1]/section[2]/div/div/div/span[1]")
    public WebElement txt_brandTitle;

    @FindBy(className = "selectedText")
    public WebElement btn_sortBy;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div/div[2]/div[2]/section/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[5]")
    public WebElement choose_comments;

    @FindBy(xpath = "//*[@id=\"freeShipmentOption\"]/span")
    public WebElement btn_freeDelivery;

    @FindBy(className = "cargoBadgeText")
    public WebElement txt_freeDelivery;


    public ThirdCase() { PageFactory.initElements(driver, this); }

}