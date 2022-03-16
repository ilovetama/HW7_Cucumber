package com.epam.training.pages;

import com.epam.training.driver.DriverManager;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

  private static final int DRIVER_WAIT_TIME = 10;

  public BasePage() {
    PageFactory.initElements(DriverManager.getDriver(), this);
  }

  public WebElement findElement(By by) {
    return DriverManager.getDriver().findElement(by);
  }

  public List<WebElement> waitForElementsVisible(By by) {
    Wait<WebDriver> wait = new WebDriverWait(DriverManager.getDriver(),
        Duration.ofSeconds(DRIVER_WAIT_TIME));
    return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
  }

  public List<String> getTextsFromWebElements(List<WebElement> webElements, String splitByRegex) {
    return webElements.stream()
        .map(a -> StringUtils.split(a.getText(), splitByRegex))
        .flatMap(Arrays::stream)
        .filter(StringUtils::isNotEmpty)
        .collect(Collectors.toList());
  }

  public List<String> getTextsFromWebElements(List<WebElement> webElements) {
    return getTextsFromWebElements(webElements, StringUtils.EMPTY);
  }
}
