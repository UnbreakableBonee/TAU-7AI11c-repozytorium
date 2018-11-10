package pl.sebastiankisiel.tau.labthree.sebablog.Domain.User;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/pl/sebastiankisiel/tau/labthree/sebablog/resources/user.feature"
)

public class RunUserServiceTest {
}
