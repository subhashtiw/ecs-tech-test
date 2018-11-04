package util;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,
        format = { "pretty", "html: cucumber-html-reports",
                "json: cucumber-html-reports/cucumber.json" },
        features ={ "classpath:features"},
        glue = {"steps"},
        tags = {"@Test1,@Test2,@Test3"})
public class runner {
}

