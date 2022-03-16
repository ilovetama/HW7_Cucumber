package com.epam.training.driver;

import static org.openqa.selenium.chrome.ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY;

import java.time.Duration;
import java.util.Optional;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

  private static final String CHROME_DRIVER_PATH =
      "src/main/resources/chromedriver.exe";
  private static final int IMPLICITLY_WAIT_TIMEOUT = 6;
  private static final int PAGE_LOAD_TIMEOUT = 20;
  private static final ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();

  private DriverManager() {
  }

  public static void setUpDriver() {
    System.setProperty(CHROME_DRIVER_EXE_PROPERTY, CHROME_DRIVER_PATH);
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITLY_WAIT_TIMEOUT));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITLY_WAIT_TIMEOUT));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIMEOUT));
    webDriverThreadLocal.set(driver);
  }

  public static WebDriver getDriver() {
    return webDriverThreadLocal.get();
  }

  public static void closeDriver() {
    Optional.ofNullable(getDriver()).ifPresent(webDriver -> {
      webDriver.quit();
      webDriverThreadLocal.remove();
    });
  }
}
