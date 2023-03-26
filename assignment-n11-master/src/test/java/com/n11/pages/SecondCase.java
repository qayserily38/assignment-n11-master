package com.n11.pages;

import com.n11.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondCase extends DriverManager {
    /*Locators*/
    @FindBy(id = "searchData")
    public WebElement txtBox_search;

    @FindBy(xpath = "//*[@id=\"breadCrumb\"]/ul/li[2]/a/span")
    public WebElement txt_phoneBrand;

    @FindBy(className = "btnBasket")
    public WebElement btn_basket;

    @FindBy(xpath = "/html/body/div[6]/div/div/span[1]")
    public WebElement btn_cookies;

    @FindBy(className = "btnBasket")
    public WebElement btn_addBasket;

    @FindBy(id = "sku-5151817031")
    public WebElement btnBox_color;

    @FindBy(id = "skus-762710762")
    public WebElement btnBox_ram;

    @FindBy(id = "js-addBasketSku")
    public WebElement btnBox_addBasket;

    @FindBy(className = "myBasketHolder")
    public WebElement basket;

    @FindBy(id = "js-buyBtn")
    public WebElement btn_buy;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div[4]/div/div/div[2]/a")
    public WebElement btnBox_basketButton;

    public SecondCase() { PageFactory.initElements(driver, this); }

}