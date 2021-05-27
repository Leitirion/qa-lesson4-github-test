
import org.junit.jupiter.api.Test;


import java.util.Random;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class SelenideGithubTest {
    Random randomGenerator = new Random();
    int i = randomGenerator.nextInt();

    @Test

     void AutomationFormTest() {
        open("https://github.com/selenide/selenide"+"?q="+i);
        $x("//span[text()=\"Wiki\"]").click();
        $x("//input[@id=\"wiki-pages-filter\"]").setValue("SoftAssertions").pressEnter();
        $(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));

    }
    
}