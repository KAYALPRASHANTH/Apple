package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JSUtility extends Utility{

    public static void scrollIntoView(By locator){
        WebElement element = driver.findElement(locator);
        String JSScript = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(JSScript , element);
    }
    public static void clickJS(By locator){
        WebElement element = driver.findElement(locator);
        String JSScript = "arguments[0].click();";
        ((JavascriptExecutor)driver).executeScript(JSScript , element);
    }
}
