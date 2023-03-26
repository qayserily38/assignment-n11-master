package com.n11.steps;

import com.n11.manager.DriverManager;
import com.n11.pages.FirstCase;
import com.n11.utils.CommonMethods;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.net.MalformedURLException;
import java.time.Duration;
import static com.n11.utils.Constants.*;

public class FirstSteps extends CommonMethods {

    @Given("user goes to the web site store url")
    public void user_goes_to_the_web_site_store_url() {
        getDriver().get(N11_STORE_URL);
    }

    @When("user clicks all store")
    public void user_clicks_all_store() {
        click(firstCase.btn_allStore);
    }

    @And("user picks S from the list on the page")
    public void user_picks_S_from_the_list_on_the_page() throws InterruptedException {
        Thread.sleep(5000);
        click(firstCase.btn_sStore);
        Thread.sleep(5000);
    }

    @And("user clicks one of the stores listed below")
    public void user_clicks_one_of_the_stores_listed_below() throws InterruptedException {
        Thread.sleep(2000);
        click(firstCase.btn_oneTheStore);
    }

    @Then("user should see the selected store")
    public void user_should_see_the_selected_store() {
        String versionText = firstCase.txt_oneTheStore.getText();
        Assert.assertEquals(versionText,"syd");
    }

}
