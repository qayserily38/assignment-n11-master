package com.n11.pages;

import com.n11.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstCase extends DriverManager {
    /*Locators*/
    @FindBy(xpath = "/html/body/div[1]/div[3]/div/div[2]/div/div[1]/ul/li[4]/div/h3")
    public WebElement btn_allStore;

    @FindBy(xpath = "//*[@id=\"contentSellerList\"]/div/div[2]/div/div[2]/div[4]/div[1]/span[22]")
    public WebElement btn_sStore;

    @FindBy(xpath = "//*[@id=\"contentSellerList\"]/div/div[2]/div/div[2]/div[4]/div[2]/ul/li[1]/a")
    public WebElement btn_oneTheStore;

    @FindBy(xpath = "//*[@id=\"breadCrumb\"]/ul/li[2]/a/span")
    public WebElement txt_oneTheStore;

    public FirstCase() { PageFactory.initElements(driver, this); }

}
