import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.browserSize;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TestPracticeForm {

    @BeforeAll
    static void beforeAll() {
        browserSize = "1920x1080";
    }

    @Test
    void fillFormTest() {
        open("https://demoqa.com/automation-practice-form");
        Selenide.executeJavaScript("$('#fixedban').remove()");
        Selenide.executeJavaScript("$('footer').remove()");
        File img = new File("src/test/resources/wallpaperflare.com_wallpaper (13).jpg");

        $("#firstName").setValue("Sirius");
        $("#lastName").setValue("Black");
        $("#userEmail").setValue("gavnuk@mail.ru");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("6666666666");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionByValue("8");
        $(".react-datepicker__year-select").selectOptionByValue("2020");
        $(".react-datepicker__month").$(byText("30")).click();
        $("#subjectsInput").setValue("Chemistry").pressEnter();
        $(By.cssSelector("label[for='hobbies-checkbox-1']")).click();
        $("#uploadPicture").uploadFile(img);
        $("#currentAddress").setValue("Izmir");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("Uttar Pradesh")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Agra")).click();
        $("#submit").click();

        $(".modal-body").shouldHave(text("Sirius Black"), text("gavnuk@mail.ru"), text("Male"),
                text("6666666666"), text("30 August,2020"), text("Chemistry"), text("Sports"),
                text("wallpaperflare.com_wallpaper (13).jpg"), text("Izmir"), text("wallpaperflare.com_wallpaper (13).jpg"));
        $("#closeLargeModal").click();


    }


}
