package com.vaadin.tests.components.ui;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.vaadin.tests.tb3.SingleBrowserTest;

public class InvalidViewportTest extends SingleBrowserTest {

    @Test
    public void testInvalidViewport() {
        openTestURL();

        WebElement heading = findElement(By.tagName("h2"));

        assertTrue("Unexpected heading: " + heading.getText(),
                heading.getText().startsWith("HTTP ERROR 500"));
    }

}
