package runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/features/testAdminLogin.feature",
        plugin = { "json:target/cucumber.json", "pretty", "html:target/cucumber-reports" }
)
class RunAdminGLearning {
}