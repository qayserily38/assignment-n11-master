package com.n11.steps;

import com.n11.manager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.net.MalformedURLException;

public class Hooks {
    @Before
    public void start() throws MalformedURLException {
        DriverManager.setDriver("chrome");
    }

    @After
    public void end(Scenario scenario) {
//        byte[] picture;
//        if (scenario.isFailed()) {
//            // take screenshot and save it in /failed
//            picture = CommonMethods.takeScreenshot("failed/" + scenario.getName());
//        } else {
//            // take screenshot and put it in /passed folder
//            picture = CommonMethods.takeScreenshot("passed/" + scenario.getName());
//        }
//        scenario.attach(picture, "image/png", scenario.getName());
        DriverManager.tearDown();
    }
}
