package io.qameta.allure.examples.cucumber7;

import io.cucumber.java.AfterStep;
import io.qameta.allure.Allure;

public class Hooks {
    @AfterStep
    public void waitForSeconds() throws InterruptedException {
        Allure.attachment("info.txt", "Waiting...");
        Thread.sleep(Long.parseLong(System.getProperty("wait")));
    }
}
