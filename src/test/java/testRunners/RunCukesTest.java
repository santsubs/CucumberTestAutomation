package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(tags = {"@test1 or @test2"}, features = {"classpath:features/"},
glue="com.first.stepDefinitions",
plugin = {"json:target/reports/cucumber.json",
		"pretty", 
		"html:target/cucumber",
        "rerun:target/rerun.txt"})
public class RunCukesTest {
}
