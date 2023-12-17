package io.qameta.allure.examples.cucumber7;

import io.cucumber.java.AfterStep;

public class Hooks {
    @AfterStep
    public void waitForSeconds() throws InterruptedException {
        Thread.sleep(Long.parseLong(System.getProperty("wait")));
    }
}
