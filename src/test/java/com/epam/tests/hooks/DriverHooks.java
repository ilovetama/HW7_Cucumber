package com.epam.tests.hooks;

import com.epam.training.driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class DriverHooks {

  @Before
  public void setUpDriver() {
    DriverManager.setUpDriver();
  }

  @After
  public void closeDriver() {
    DriverManager.closeDriver();
  }

}
