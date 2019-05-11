package cucumber_tests;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/Reports"},features="src/test/resources/features",glue="cucumber_tests")
public class CalculatorTest {
    


}
