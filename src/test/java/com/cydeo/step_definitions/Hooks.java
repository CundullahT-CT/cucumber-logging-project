package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;

public class Hooks {

    @Before
    public void setupMethod() {
        System.out.println("@Before: RUNNING BEFORE EACH SCENARIO");
    }

    @BeforeStep
    public void beforeStep() {
        System.out.println("@BeforeStep: RUNNING BEFORE EACH STEP");
    }

    @AfterStep
    public void afterStep() {
        System.out.println("@AfterStep: RUNNING AFTER EACH STEP");
    }

    @After
    public void teardownMethod() {

        System.out.println("@After: RUNNING AFTER EACH SCENARIO");

        BrowserUtils.sleep(1);
        Driver.closeDriver();

    }

}
