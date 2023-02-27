import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class PracticeForm {




    @BeforeAll
    static void beforeAll(){ browserSize= "1920x1080"; }

    @Test
    void fillFormTest(){
       open( "https://demoqa.com/automation-practice-form");
       $("#firstName").setValue("Sirius");
       $("#lastName").setValue("Black");
       $("#userEmail").setValue("gavnuk@mail.ru");
       $("#genterWrapper").$(byText("Male")).click();
       $("#userNumber").setValue("666");
       $("#dateOfBirthInput").click();
       $(".react-datepicker__month-select").selectOptionByValue("8");
       $(".react-datepicker__year-select").selectOptionByValue("2020");
       $(".react-datepicker__month").$(byText("30")).click();
       $("#subjectsInput").setValue("Chemistry").pressEnter();
       $(By.cssSelector("label[for='hobbies-checkbox-1']")).click();





    }



}