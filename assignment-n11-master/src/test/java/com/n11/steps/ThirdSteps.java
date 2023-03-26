package com.n11.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.n11.utils.CommonMethods;
import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import static com.n11.utils.Constants.*;

public class ThirdSteps extends CommonMethods {

//    @Given("user open base url")
//    public void user_open_base_url() {
//        getDriver().get(N11_BASE_URL);
//    }
    @When("user search for telefon with using search bar")
    public void user_search_for_telefon_with_using_search_bar() {
        sendText(thirdCase.txtBox_search, TEST_TEXT_SEARCH);
        click(thirdCase.btn_search);

    }

    @And("user picks second brand listed on the page")
    public void user_picks_second_brand_listed_on_the_page() throws InterruptedException {
        js.executeScript("window.scrollBy(0,500)", "");
        click(thirdCase.btnBox_secondBrand);
        Thread.sleep(2000);

    }

    @Then("user should see second brand")
    public void user_should_see_second_brand() {
        String versionText = thirdCase.txt_brandTitle.getText();
        Assert.assertEquals(versionText,"Xiaomi");
    }

    @When("user sorted items by using number of comments")
    public void user_sorted_items_by_using_number_of_comments() throws InterruptedException {
        Thread.sleep(2000);
        click(thirdCase.btn_sortBy);
        Thread.sleep(2000);
        click(thirdCase.choose_comments);

    }

    @Then("user should see the items are sorted in the correct order")
    public void user_should_see_the_items_are_sorted_in_the_correct_order() {
        driver.getPageSource().contains("Yorum sayısı");
    }

    @When("user picks free delivery on the page")
    public void user_picks_free_delivery_on_the_page() throws InterruptedException {
        js.executeScript("window.scrollBy(0,3000)", "");
        Thread.sleep(2000);
        click(thirdCase.btn_freeDelivery);
    }

    @Then("user should see all products are listed with free delivery")
    public void user_should_see_all_products_are_listed_with_free_delivery() {
        String versionText = thirdCase.txt_freeDelivery.getText();
        Assert.assertEquals(versionText,"ÜCRETSİZ KARGO");

    }

}
