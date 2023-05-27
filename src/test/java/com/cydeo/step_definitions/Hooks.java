package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Hooks {

    @Before
    public void setupMethod() {
        log.debug("@Before: RUNNING BEFORE EACH SCENARIO");
    }

    @BeforeStep
    public void beforeStep() {
        log.warn("@BeforeStep: RUNNING BEFORE EACH STEP");
    }

    @AfterStep
    public void afterStep() {
        log.error("@AfterStep: RUNNING AFTER EACH STEP");
    }

    @After
    public void teardownMethod() {

        System.out.println("@After: RUNNING AFTER EACH SCENARIO");

        BrowserUtils.sleep(1);
        Driver.closeDriver();

    }

}
