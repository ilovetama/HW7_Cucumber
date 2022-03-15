package com.epam.tests.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = "pretty",
    monochrome = true,
//    tags = "@test",
    glue = "com.epam.tests",
    features = "classpath:com.epam.tests.features"
)

public class TestRunner {

}
