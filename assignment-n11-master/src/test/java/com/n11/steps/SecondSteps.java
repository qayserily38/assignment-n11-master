package com.n11.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.n11.manager.PageInitializer.secondCase;
import static com.n11.utils.Constants.*;
import com.n11.utils.CommonMethods;
import org.testng.Assert;

public class SecondSteps extends CommonMethods {

    @Given("user goes to base url")
    public void user_goes_to_base_url() {
        getDriver().get(N11_BASE_URL);
    }

    @When("user search for iPhone with using search bar")
    public void user_search_for_iPhone_with_using_search_bar(){
        click(secondCase.btn_cookies);
        sendText(secondCase.txtBox_search,TEST_TEXT_SEARCH_FİRST);
        click(thirdCase.btn_search);

    }
    @Then("user should see the entered value is listed as iPhone")
    public void user_should_see_the_entered_value_is_listed_as_iPhone() {
        String versionText = secondCase.txt_phoneBrand.getText();
        Assert.assertEquals(versionText,"iphone");
    }
    @When("user adds the first and the last product listed on the page to the cart")
    public void user_adds_the_first_and_the_last_product_listed_on_the_page_to_the_cart() throws InterruptedException {
        js.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(2000);
        click(secondCase.btn_basket);
        driver.switchTo().frame(0);
        click(secondCase.btnBox_color);
        click(secondCase.btnBox_ram);
        click(secondCase.btnBox_addBasket);
    }

    @When("user goes to cart page as a guest user")
    public void user_goes_to_cart_page_as_a_guest_user() throws InterruptedException {
        click(secondCase.basket);
        Thread.sleep(2000);
        click(secondCase.btn_buy);
    }

    @Then("user should see the checkout page")
    public void user_should_see_the_checkout_page() {

    }


}
