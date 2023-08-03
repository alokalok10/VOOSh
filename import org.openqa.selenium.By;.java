import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonNavigationMenuTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/user/chinnaiah.harish/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
       
        // Launch Amazon website
        driver.get("https://www.amazon.com");
       
        // Verify main menu items
        verifyMainMenuItems(driver);
       
        // Verify sub-menu items
        verifySubMenuItems(driver);
       
        // Verify navigation menu redirection
        verifyMenuRedirection(driver);
       
        // Verify responsive behavior
        verifyResponsiveBehavior(driver);
       
        // Verify search functionality
        verifySearchFunctionality(driver);
       
        // Close the browser
        driver.quit();
    }
