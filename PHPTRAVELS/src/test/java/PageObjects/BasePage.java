package PageObjects;

import org.openqa.selenium.WebDriver;

abstract public class BasePage {
    WebDriver driver;
    BasePage(WebDriver driver){
        this.driver= driver;
    }
}
