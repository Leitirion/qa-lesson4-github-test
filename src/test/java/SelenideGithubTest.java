

import org.junit.jupiter.api.Test;

import java.util.Random;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class SelenideGithubTest {


    @Test

     void githubTest() {
        open("https://github.com/selenide/selenide");
        $(byText("Wiki")).click();
        $("#wiki-pages-filter").setValue("SoftAssertions").pressEnter();
        $(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));

    }

    @Test
    void herokuDragAndDropTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").shouldHave(text("A"));
        $("#column-b").shouldHave(text("B"));
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }

    @Test


    void test() {
        String URL = "https://demoqa.com/automation-practice-form";
        String firstName = "firstName";
        String lastName = "lastName";
        String StudentEmail = "userEmail@gmail.com";
        String userNumber = "1234567890";

        open(URL);

        $("#firstName").setValue(firstName);

        $("#lastName").setValue(lastName);

        $("#userEmail").setValue(StudentEmail);
        $("#userNumber").setValue(userNumber);
        $x("//input[@id=\"gender-radio-2\"][@value=\"Female\"]").doubleClick();
        $x("//input[@id=\"dateOfBirthInput\"]").click();
        $x("//select[@class=\"react-datepicker__year-select\"]//option[@value=\"2001\"][text()=\"2001\"]").click();
        $x("//select[@class=\"react-datepicker__month-select\"]//option[@value=\"3\"][text()=\"April\"]").click();
        $x("//div[@class=\"react-datepicker__month\"]//div[text()=1]").click();

        $("#subjectsInput").setValue("History").pressEnter();
        $("[for='hobbies-checkbox-3']").click();
        $("#currentAddress").setValue("Russia, Ufa.");
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#react-select-4-input").setValue("Noida").pressEnter();
        $("#submit").pressEnter();

        //        Вместо $("h1 div"); и $("h1").$("div") использовал $("tr td") и $("tr").$("td")
        //      $("tr td") ищет все tr в которых есть td, выбирает из них первый tr td
        //        $("tr").$("td") ищет все tr, выбирает первый из них, в нем ищет td и выбирает первый, если такого нет, то тест падает

        $("tr td").should(exist);
        $("tr").$("td").should(exist);
       // Element not found {tr/td}

    }
}