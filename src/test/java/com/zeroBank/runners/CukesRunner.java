package com.zeroBank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "json:target/cucumber.json","html:target/default-cucumber-reports",
                "rerun:@target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/zeroBank/step_defenitions",
        dryRun =false,
        tags = "@PFC"
)
public class CukesRunner {

}
