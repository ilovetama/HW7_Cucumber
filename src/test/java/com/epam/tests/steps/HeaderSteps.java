package com.epam.tests.steps;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import com.epam.training.driver.DriverManager;
import com.epam.training.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import org.openqa.selenium.interactions.Actions;

public class HeaderSteps {

  private final HomePage homePage = new HomePage();
  Actions action = new Actions(DriverManager.getDriver());

  @Given("the user opens onliner home page")
  public void userOpensOnlinerHomePage() {
    homePage.openOnlinerHomePage();
  }

  @When("the user hovers over a menu item {string}")
  public void userHoversOverAMenuItem(String menuItem) {
    action.moveToElement(homePage.hoverOverAMenuItem(menuItem)).perform();
  }

  @Then("submenu appears")
  public void submenuAppears() {
    assertThat(homePage.checkSubmenu().isDisplayed()).isTrue();
  }

  @Then("price section is displayed")
  public void priceSectionIsDisplayed(List<String> arg) {
    assertThat(homePage.getElementsFromHeader().containsAll(arg))
        .as("Price section is not displayed")
        .isTrue();
  }

  @Then("city section is displayed")
  public void citySectionIsDisplayed(List<String> arg) {
    assertThat(homePage.getElementsFromHeader().containsAll(arg))
        .as("City section is not displayed")
        .isTrue();
  }

  @Then("brand section is displayed")
  public void brandSectionIsDisplayed(List<String> arg) {
    assertThat(homePage.getElementsFromHeader().containsAll(arg))
        .as("Brand section is not displayed")
        .isTrue();
  }

  @Then("rooms section is displayed")
  public void roomsSectionIsDisplayed(List<String> arg) {
    assertThat(homePage.getElementsFromHeader().containsAll(arg))
        .as("Rooms section is not displayed")
        .isTrue();
  }
}
