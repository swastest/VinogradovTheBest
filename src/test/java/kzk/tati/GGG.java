package kzk.tati;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GGG {
    @Test
    void tryTry() {
        open("https://github.com/selenide/selenide/wiki");
        SelenideElement qw = $("div h2");
        SelenideElement qq = $("div").$("h2");
        System.out.println("в одном " + qw);
        System.out.println("раздельно " + qq);

        /*
        разница есть, как видим, qw элемент нашелся, а qq - нет, потому что в qq нашелся первый div, а в нем нет тега h2
         */
    }
}
