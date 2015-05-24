package com.github.jsdevel.testng.selenium.fixtures.pagefactoryproxyfactory;

import com.github.jsdevel.testng.selenium.PageFactory;

public interface FixturePageFactoryWithoutDefaultFactoryMethods extends PageFactory {
  FixtureBooPage getFixtureBooPage(String boo); 
  FixtureFooPage getFixtureFooPage(String foo); 
}
