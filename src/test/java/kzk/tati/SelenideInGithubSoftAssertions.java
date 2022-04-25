package kzk.tati;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.itemWithText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideInGithubSoftAssertions {
    @Test
    void selenideInGithubJUnitCode() {
        open("https://github.com/");
        $("[data-test-selector=nav-search-input]").setValue("Selenide").pressEnter();
        $$("ul.repo-list li").first().$("[href]").click();
        $("#wiki-tab").click();
        $("div#wiki-body h1").shouldHave(text("Welcome to the selenide wiki!"));
        $$("#wiki-pages-box li").find(Condition.text("SoftAssertions"));
        $$(".markdown-body ul li").get(6).$("[href]").shouldHave(text("Soft assertions"));
        $$(".markdown-body ul li").get(6).$("[href]").click();
        $(".gh-header").shouldHave(text("SoftAssertions"));
        $$(".markdown-body h4").shouldHave(itemWithText("3. Using JUnit5 extend test class:"));


    }
}
