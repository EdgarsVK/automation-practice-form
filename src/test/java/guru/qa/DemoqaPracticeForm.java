package guru.qa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class DemoqaPracticeForm {
    @Test
    void beforeEach() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("firstName");
        $("#lastName").setValue("lastName");
        $("#userEmail").setValue("email@gmail.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("1234567890");

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("April");
        $(".react-datepicker__year-select").selectOption("1993");
        $(".react-datepicker__day--0" + 14 ).click();


        // Пауза на 10 секунд
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
