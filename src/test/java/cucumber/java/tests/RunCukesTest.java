package cucumber.java.tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by IntelliJ IDEA.
 * User: ggogia
 * Date: 8/22/16
 * Time: 4:10 PM
 * To change this template use File | Settings | File Templates.
 */

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/cucumber"},tags={"@Test"})

public class RunCukesTest {
}
