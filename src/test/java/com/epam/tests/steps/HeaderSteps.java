package com.epam.tests.steps;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import com.epam.training.driver.DriverManager;
import com.epam.training.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class HeaderSteps {

  private final HomePage homePage = new HomePage();
  Actions action = new Actions(DriverManager.getDriver());

  @Given("the user opens onliner home page")
  public void userOpensOnlinerHomePage() {
    homePage.openOnlinerHomePage();
  }

  @When("the user hovers over a menu item {string}")
  public void theUserHoversOverAMenuItem(String menuItem) {
    action.moveToElement(homePage.hoverOverAMenuItem(menuItem)).perform();
  }

//  @Then("following sections are displayed {string}")
//  public void submenuAppearsAndDisplaysSectionsDivisionByPriceByCityAndBrand(String section) {
//    assertThat(homePage.isElementDisplayed(section)).isTrue;
//  }

  @Then("submenu appears")
  public void submenuAppears() {
    assertThat(homePage.checkSubmenu().isDisplayed()).isTrue();
  }
}
