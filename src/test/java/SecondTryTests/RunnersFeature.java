package SecondTryTests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;



	@RunWith(CucumberWithSerenity.class)
	//@CucumberOptions(features = { "src/test/resources/features"  }, glue = {"SecondTryDefinitions" })
	@CucumberOptions(features = { "src/test/resources/features"  }, glue = {"SecondTryDefinitions" }, tags = {"@Tag"})
	
	public class RunnersFeature {
		
	}

