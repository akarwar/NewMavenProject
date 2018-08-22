

package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featureFiles", glue="stepDeffination",
plugin= {"json:target/cucumber.json","html:target/site/cucumber-pretty"})

public class FreeCRMRunner {

}
