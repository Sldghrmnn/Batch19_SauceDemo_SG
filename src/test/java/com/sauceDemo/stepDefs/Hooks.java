package com.sauceDemo.stepDefs;

import com.sauceDemo.utilities.BrowserUtils;
import com.sauceDemo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hooks {

    @Before
    public void beforeMethod(){
        Driver.get().manage().window().setPosition(new Point(-1000,0));
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void afterMethod(Scenario scenario){
        if (scenario.isFailed()){
          final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
          scenario.attach(screenshot,"image/png","screenshot");
        }
       // BrowserUtils.waitFor(2);
        Driver.closeDriver();
    }
}
