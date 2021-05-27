
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;


import java.util.Random;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class SelenideGithubTest {
    Random randomGenerator = new Random();
    int i = randomGenerator.nextInt();

    @Test

     void GithubTest() {
        open("https://github.com/selenide/selenide"+"?q="+i);
        $x("//span[text()=\"Wiki\"]").click();
        $x("//input[@id=\"wiki-pages-filter\"]").setValue("SoftAssertions").pressEnter();
        $(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));

    }

    @Test
    void HerokuDragAndDropTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $x("//div[@id=\"column-a\"]").shouldHave(text("A"));
        $("#column-b").shouldHave(text("B"));
        $("#column-a").dragAndDropTo($("#column-b"));
        $x("//div[@id=\"column-a\"]").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }


}