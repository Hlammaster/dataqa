import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class PracticeForm {




    @BeforeAll
    static void beforeAll(){ browserSize= "1920x1080"; }

    @Test
    void fillFormTest(){
       open( "https://demoqa.com/automation-practice-form");

        File img = new File("src/test/wallpaperflare.com_wallpaper (13).jpg");

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
       $("#uploadPicture").uploadFile(img);
       $("#currentAddress-wrapper").setValue("Izmir");
       $("#state").click();
       $("#react-select-3-option-1").click();
       $("#city").click();
       $("#react-select-4-option-0").click();






    }



}
