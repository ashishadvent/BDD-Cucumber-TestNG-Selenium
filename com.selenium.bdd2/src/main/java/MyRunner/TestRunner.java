/**
 * 
 */
package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author ashish
 *
 */

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="C:\\Users\\ashish\\git\\com.selenium.bdd2\\src\\main\\java\\Features"
			,glue= {"stepDefinitions"}
			//,format= {"pretty","html:test-output"}
			,dryRun=false
			)
	public class TestRunner {

}
