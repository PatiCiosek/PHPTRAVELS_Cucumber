package StepDefinitions;

import PageObjects.examplePage;
import io.cucumber.java.en.Given;

import static StepDefinitions.Hooks.driver;

public class exampleSTeps {
    examplePage example;
    public exampleSTeps(){example = new examplePage(driver);}

    @Given("example1")
    public void example1() {

    }
}
