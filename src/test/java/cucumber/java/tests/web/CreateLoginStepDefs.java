package cucumber.java.tests.web;

import com.Quidco.qa.pageobjects.CreateLoginPageInterface;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Random;

import static com.Quidco.qa.functionlib.WebNavigation.*;

/**
 * Created by IntelliJ IDEA.
 * User: ggogia
 * Date: 8/22/16
 * Time: 4:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreateLoginStepDefs {

    @Given("^I am on the login page$")
    public static void onLoginPage(){

        openWebPage("https://www.shoop.fr/je-m-inscris/?email");
        System.out.println("Site successfully opened");
    }

    @When("^I enter the login details$")
    public static void enterLoginDetails(){

        String randomStringForEmail = getRandomAlphabetString(6);
        String newEmail = randomStringForEmail+"@gmail.com";
        enterAnyTextInAField(CreateLoginPageInterface.emailTextBox, newEmail);
        System.out.println("New email address successfully entered");
        enterAnyTextInAField(CreateLoginPageInterface.passwordTextbox, "tester");
        System.out.println("Password successfully entered");
        checkACheckBoxWithCssLocator(CreateLoginPageInterface.tAndCCheckbox);
        System.out.println("Checkbox clicked successfully");

        clickALinkWithCssLocator(CreateLoginPageInterface.cookiesMsgCloseBtn);
        System.out.println("Cookies msg closed successfully");

        clickALinkWithCssLocator(CreateLoginPageInterface.createLoginBtn);
        System.out.println("Create Login Button clicked successfully");

    }

    @Then("^a new login account is created successfully$")
    public static void loginCreated(){

        clickALinkWithCssLocator(CreateLoginPageInterface.modeBtnInTheTopTab);
        System.out.println("Mode Button clicked successfully");

        closeBrowser();
        System.out.println("Bye");
    }

    public static String getRandomAlphabetString(int size) {

        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String output = sb.toString();
        return output;
    }
}
