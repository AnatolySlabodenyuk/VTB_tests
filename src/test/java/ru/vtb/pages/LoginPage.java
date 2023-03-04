package ru.vtb.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    private SelenideElement
            loginData =  $("#login"),
            UserLoginInput = $("[label=\"Логин (или УНК)\"]"),
            UserPasswordInput = $("[type=\"password\"]"),
            submitButton = $("[type=\"submit\"]"),
            failModal = $("[type=\"fail\"]"),
            chatButton = $("[title=\"Открыть Чат с банком\"]"),
            chatModal = $("[data-test-id=\"webchat_chat\"]"),
            chatValue =  $("[data-test-id=\"webchat_chat_inputField\"]"),
            chatSendButton =  $("[data-test-id=webchat_chat_sendButton]"),
            themeChangeButton =  $("[class=\"sc-pcJja iJIRrC\"]"),
            themeChangeIsTrue =  $("[data-widget-theme]");

    public LoginPage openPage() {
        open("/login");
        return this;
    }
    public LoginPage clickLoginData() {
        loginData.click();
        return this;
    }
    public LoginPage setUserLogin(String value) {
        UserLoginInput.setValue(value);
        return this;
    }
    public LoginPage setUserPassword(String value) {
        UserPasswordInput.setValue(value);
        return this;
    }
    public LoginPage submitButton() {
        submitButton.click();
        return this;
    }
    public LoginPage failModalAppear() {
        failModal.should(appear);
        return this;
    }
    public LoginPage submitChatButton() {
        chatButton.click();
        return this;
    }
    public LoginPage chatModalAppear() {
        chatModal.should(appear);
        return this;
    }
    public LoginPage setChatValue(String value) {
        chatValue.setValue(value);
        return this;
    }
    public LoginPage sendButtonAppear() {
        chatSendButton.should(appear);
        return this;
    }
    public LoginPage submitThemeChangeButton() {
        themeChangeButton.click();
        return this;
    }
    public LoginPage themeIsLight() {
        themeChangeIsTrue.equals("LIGHT");
        return this;
    }


}
