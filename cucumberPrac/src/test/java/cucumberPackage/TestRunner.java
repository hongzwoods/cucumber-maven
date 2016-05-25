package cucumberPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/MyApplication.feature",glue="StepDefination")

public class TestRunner {

}
