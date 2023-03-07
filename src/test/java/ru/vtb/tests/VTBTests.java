package ru.vtb.tests;

import static io.qameta.allure.Allure.step;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import com.github.javafaker.Faker;

public class VTBTests extends TestBase {

    Faker faker = new Faker();
    @Test
    @Tag("VTB_tests")
    @DisplayName("Проверка входа несущесвующего пользователя")
    void unsuccessfulLoginTest() {
        String login = faker.name().username();
        String password = faker.internet().password();

        step("Открыть форму авторизации", () -> {
            loginPage.openPage();
        });
        step("Перейти в режим ввода логин/пароль", () -> {
            loginPage.clickLoginData();
        });
        step("Заполнить поля формы и нажать кнопку", () -> {
            loginPage.setUserLogin(login)
                    .setUserPassword(password)
                    .submitButton();
        });
        step("Убедиться, что появилось предупреждающее окно", () -> {
            loginPage.failModalAppear();
        });
    }

    @Test
    @Tag("VTB_tests")
    @DisplayName("Проверка работы кнопки-чата")
    void chatButton() {
        step("Открыть форму авторизации", () -> {
            loginPage.openPage();
        });
        step("Нажать на кнопку запуска диалога с банком", () -> {
            loginPage.submitChatButton();
        });
        step("Проверить, что появилось окно с чатом", () -> {
            loginPage.chatModalAppear();
        });
    }

    @Test
    @Tag("VTB_tests")
    @DisplayName("Проверка появления кнопки для отправки сообщения")
    void inputButton() {
        String someText = faker.book().title();

        step("Открыть форму авторизации", () -> {
            loginPage.openPage();
        });
        step("Нажать на кнопку запуска диалога с банком", () -> {
            loginPage.submitChatButton();
        });
        step("Ввести в поле ввода любой текст", () -> {
            loginPage.setChatValue(someText);
        });
        step("Проверить, что появилась кнопка отправки сообщения", () -> {
            loginPage.sendButtonAppear();
        });
    }

    @Test
    @Tag("VTB_tests")
    @DisplayName("Проверка смены цветовой темы")
    void changeTheme() {
        step("Открыть форму авторизации", () -> {
            loginPage.openPage();
        });
        step("Нажать на кнопку смены цветовой темы", () -> {
            loginPage.submitThemeChangeButton();
        });
        step("Убедиться, что тема изменилась на темную", () -> {
            loginPage.themeIsLight();
        });
    }
}
