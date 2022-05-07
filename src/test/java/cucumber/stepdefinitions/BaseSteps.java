package cucumber.stepdefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.MyntraHomePage;
import pages.OnlineMyntraHomePage;
import pages.WikiHomePage;

/**
 * this class is used to initialize page classes with driver.
 */
public class BaseSteps {
  protected WikiHomePage bsAppScreen;
  protected MyntraHomePage myntraHomePage;
  protected OnlineMyntraHomePage onlineMyntraHomePage;

  public void setupScreens(AppiumDriver<MobileElement> driver) {
    myntraHomePage = new MyntraHomePage(driver);
    bsAppScreen = new WikiHomePage(driver);
  }

  public void setupScreensOnline(RemoteWebDriver driver) {
    onlineMyntraHomePage = new OnlineMyntraHomePage(driver);
  }
}