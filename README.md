# :computer: Проект по автоматизации тестирования
### <a target="_blank" href="https://online.vtb.ru/login">Страница авторизации сайта ВТБ</a>

<p align="center">
<img title="VTB_logo" src="images/screens/VTB_logo.png">
</p>

## :open_file_folder: Содержание:

- Технологии и инструменты
- Список проверок
- Запуск тестов (сборка в Jenkins)
- Allure-отчет
- Интеграция с Allure TestOps
- Видео пример прохождения тестов

## :wrench: Технологии и инструменты:

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://qameta.io/"><img src="images/logo/Allure_TO.svg" width="50" height="50"  alt="Allure TestOps"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
</p>

## :white_check_mark: Список проверок
### Автотесты

- [x] Проверка входа несущесвующего пользователя
- [x] Проверка работы кнопки-чата
- [x] Проверка появления кнопки для отправки сообщения
- [x] Проверка смены цветовой темы

## :electric_plug: Запуск тестов

###  Локальный запуск :
Пример командной строки:
```bash
gradle clean ui_test
```
### Удаленный запуск с параметрами:
Пример настройки параметров Jenkins
```bash
clean 
ui_test
"-Dbrowser=${BROWSER}"
"-DbrowserVersion=${BROWSER_VERSION}"
"-DbrowserSize=${BROWSER_SIZE}"
"-Dremote=${REMOTE}"
```

###  Проект в Jenkins:
#### 1. Открыть <a target="_blank" href="https://jenkins.autotests.cloud/job/C17-Slabodenyuk_Anatoly-VTB_tests/">проект</a>

![This is an image](images/screens/Jenkins1.png)

#### 2. Выбрать пункт "Собрать с параметрами"
#### 3. В случае необходимости изменить параметры, выбрав значения из выпадающих списков
#### 4. Нажать "Собрать"
#### 5. Результат запуска сборки можно посмотреть в отчёте Allure

## <img src="images/logo/Allure.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/C17-Slabodenyuk_Anatoly-VTB_tests/1/allure/">Allure report</a>

###  Главное окно

<p align="center">
<img title="Allure Overview Dashboard" src="images/screens/Allure_Report1.png">
</p>

###  Тесты

<p align="center">
<img title="Allure Tests" src="images/screens/Allure_Report2.png">
</p>

###  Графики

<p align="center">
<img title="Allure Graphics" src="images/screens/Allure_Report3.png">
</p>


## <img src="images/logo/Allure_TO.svg" width="25" height="25"  alt="Allure"/></a> Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/1952/dashboards">Allure TestOps</a>
### Общий список всех кейсов: ручных и авто
<p align="center">
<img title="Allure Graphics" src="images/screens/allureTO-report.png">
</p>

### Dashboard с общими результатами тестирования
<p align="center">
<img title="Allure Graphics" src="images/screens/allureTO_dashboard.png">
</p>

## <img src="images/logo/Selenoid.svg" width="25" height="25"  alt="Allure"/></a> Пример видео прохождения теста
### Тест #4 Проверка входа несущесвующего пользователя
<p align="center">
<img title="Selenoid Video" src="images/gifs/video.gif" width="1280" height="720"  alt="videoUItests.mp4"> 

</p>
