package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/liveGuru/features", //Duong dan toi file feature
		glue = "liveGuru.stepsDefinitions",// tim den package step def
		//dryRun = true,
		monochrome = true,
		
		plugin = {"pretty","html:target/site/cucumber-report-default","json:target/site/cucumber.json"},
		snippets = SnippetType.CAMELCASE,
		tags = {"@register_login"})

public class LiveGuruTestRunner {

}
