package com.Quidco.qa.functionlib;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static cucumber.java.tests.SharedDriver.getDriver;

/**
 * Created by IntelliJ IDEA.
 * User: ggogia
 * Date: 8/22/16
 * Time: 4:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class WebNavigation {

    public static void openWebPage(String url) {
        getDriver().get(url);
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //To Click a Link
    public static void clickALinkWithCssLocator(String cssLocator){

        getDriver().findElement(By.cssSelector(cssLocator)).click();
    }

    public static void enterAnyTextInAField(String cssLocator, String text){
        getDriver().findElement(By.cssSelector(cssLocator)).clear();
        getDriver().findElement(By.cssSelector(cssLocator)).sendKeys(text);
    }

    public static void checkACheckBoxWithCssLocator(String checkBoxCssLocator){
        WebElement element = getDriver().findElement(By.cssSelector(checkBoxCssLocator));

        try{
                element.click();
            }
            catch (Exception e){
                e.printStackTrace();
            }
    }

    public static void closeBrowser(){

        getDriver().close();
    }
}