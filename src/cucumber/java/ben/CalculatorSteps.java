package ben;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.*;

import static org.junit.Assert.assertEquals;

/**
 * Calculator Steps.
 */
public class CalculatorSteps {

    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    private Main main;

    @Before
    public void before() {
        System.setOut(new PrintStream(output));
        main = new Main();
    }

    @After
    public void after() {
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
    }

    @When("^the system is run with arguments ([0-9]+) and ([0-9]+)$")
    public void the_user_enters(int a, int b) {
        main.run(new String[] { Integer.toString(a), Integer.toString(b) });
    }

    @Then("^the system displays ([0-9]+)$")
    public void the_system_displays(int expectedOutput) {
        int actualOutput = Integer.parseInt(output.toString().trim());
        assertEquals("The system should display " + expectedOutput, expectedOutput, actualOutput);
    }
}
