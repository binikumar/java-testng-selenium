package com.github.jsdevel.testng.selenium.fixtures.pageproxyfactory;

public interface FixtureComponentThatFailsToPassTypeParametersToANestedComponent<P> extends FixtureComponentThatExpectsTypeParameters {
  P something();
}
