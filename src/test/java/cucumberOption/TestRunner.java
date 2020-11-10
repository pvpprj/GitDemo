package cucumberOption;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue="stepDefinations",stepNotifications=true,
		 tags="@SeleniumTest",monochrome=true,
		plugin= {"pretty","html:target/cucumber","junit:target/cukes.xml"})

public class TestRunner {
	
}