package com.Quidco.qa.pageobjects;

/**
 * Created by IntelliJ IDEA.
 * User: ggogia
 * Date: 8/22/16
 * Time: 4:08 PM
 * To change this template use File | Settings | File Templates.
 */
public interface CreateLoginPageInterface {

    String emailTextBox = ".controller.ng-scope input[name='email']";
    String passwordTextbox = ".controller.ng-scope #register-password";
    String tAndCCheckbox = ".controller.ng-scope label";
    String createLoginBtn = ".form-group.submit";
    String cookiesMsgCloseBtn = "a[ng-click='close()']";
    String modeBtnInTheTopTab = "a#mode";
}
