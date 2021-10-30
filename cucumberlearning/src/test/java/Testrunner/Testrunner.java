package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
    @CucumberOptions(
    features= {"feature"},
    glue= {"facebook"},
    plugin= {"pretty","html:Report1"},
    dryRun= false,
    strict=true,
    monochrome=true
    //tags="@p4"

    )
    public class Testrunner {
}

