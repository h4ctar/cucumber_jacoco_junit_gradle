# Cucumber, JaCoCo and JUnit with Gradle
Sample Gradle project with Cucumber and JUnit tests covered by Jacoco.

## Overview
To meet a high safety standard, a piece of software can have high and low level software requirements, assuming these requirements are validated, once verified, the quality of the software should be high.

The goal of this sample project is to show how the high and low level requirements can be captured and how to automate the verification process, it also shows how to validate that the requirements are complete by checking if there is any code that does not get executed when all the requirements are tested.

This sample project does not yet contain the infrastructure to trace the requirements.

## High Level Requirements
The first step in developing safe software is to gather high level software requirements.
High level requirements will be captured in Cucumber Gherkin scripts and will describe how the piece of software as a whole should behave.
Cucumber has the advantage that they are more than just requirements; they are specifications that can be executed.

``` gherkin
Feature: Calculator

  Scenario Outline: Multiply two integers
    When the system is run with arguments <a> and <b>
    Then the system displays <product>

    Examples:
      | a  | b  | product |
      |  6 |  7 |  42     |
```

## Low Level Requirements
Once the high level requirements have been written, software design can be performed.
Software design should produce two documents: the design doc and the low level software requirements.
The design doc normally splits the software into units and describes how the interact with each other, it is these interactions that dictate the requirements of the software units.
Low level requirements will be tested using JUnit.

``` java
@Test
public void testAdd() {
    int actualProduct = calculator.multiply(A, B);
    assertEquals("Product should be " + EXPECTED_PRODUCT, EXPECTED_PRODUCT, actualProduct);
}
```

## Coverage
