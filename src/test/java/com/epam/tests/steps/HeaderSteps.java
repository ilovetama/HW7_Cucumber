package com.epam.tests.steps;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import com.epam.training.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;

public class HeaderSteps {

  private final HomePage homePage = new HomePage();

  @Given("the user opens onliner home page")
  public void userOpensOnlinerHomePage() {
    homePage.openOnlinerHomePage();
  }

  @When("the user hovers over a menu item {string}")
  public void userHoversOverAMenuItem(String menuItem) {
    homePage.action.moveToElement(homePage.hoverOverAMenuItem(menuItem)).perform();
  }

  @Then("submenu appears")
  public void submenuAppears() {
    assertThat(homePage.checkSubmenu().isDisplayed())
        .as("Submenu is not displayed")
        .isTrue();
  }

  @Then("price section is displayed")
  public void priceSectionIsDisplayed(List<String> priceList) {
    assertThat(homePage.getElementsFromHeader())
        .as("Price section is not displayed")
        .containsAll(priceList);
  }

  @Then("city section is displayed")
  public void citySectionIsDisplayed(List<String> cityList) {
    assertThat(homePage.getElementsFromHeader())
        .as("City section is not displayed")
        .containsAll(cityList);
  }

  @Then("brand section is displayed")
  public void brandSectionIsDisplayed(List<String> brandList) {
    assertThat(homePage.getElementsFromHeader())
        .as("Brand section is not displayed")
        .containsAll(brandList);
  }

  @Then("rooms section is displayed")
  public void roomsSectionIsDisplayed(List<String> roomsList) {
    assertThat(homePage.getElementsFromHeader())
        .as("Rooms section is not displayed")
        .containsAll(roomsList);
  }
}
