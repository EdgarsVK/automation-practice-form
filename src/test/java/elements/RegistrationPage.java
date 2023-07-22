/* Объявление пакета, в котором содержится класс RegistrationPage */
package elements;
//--------------------------------------------------------------

/* Импорт классов из библиотеки Selenide => SelenideElement */
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
//--------------------------------------------------------------

/* Начало объявления класса RegistrationPage. */
/* Класс содержит методы для взаимодействия с элементами на странице регистрации. */
public class RegistrationPage {
//--------------------------------------------------------------

/* Здесь определены элементы страницы, с которыми будет взаимодействовать класс RegistrationPage. */
/* Каждый элемент представлен веб-элементом типа SelenideElement. */
    static SelenideElement firstNameInput = $("#firstName");
    static SelenideElement lastNameInput = $("#lastName");
    static SelenideElement emailInput = $("#userEmail");
    static SelenideElement genderRadioMale = $("#genterWrapper").$(byText("Male"));
    static SelenideElement phoneNumberInput = $("#userNumber");
    static SelenideElement dateOfBirthInput = $("#dateOfBirthInput");
    static SelenideElement subjectsInput = $("#subjectsContainer input");
    static SelenideElement hobbiesSportsCheckbox = $("#hobbiesWrapper").$(byText("Sports"));
    static SelenideElement uploadPictureInput = $("#uploadPicture");
    static SelenideElement currentAddressInput = $("#currentAddress");
    static SelenideElement stateDropdown = $("#state");
    static SelenideElement cityDropdown = $("#city");
    static SelenideElement submitButton = $("#submit");
//--------------------------------------------------------------

/* Методы взаимодействия с элементами страницы.
Каждый метод выполняет определенное действие:
enterFirstName(String),
enterLastName(String),
enterEmail(String),
enterPhoneNumber(String),
enterCurrentAddress(String)- Заполняют текстовые поля соответствующими значениями.
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
selectGenderMale(),
selectHobbiesSports(),
clickSubmitButton() - Кликают на соответствующие элементы (радио-кнопка, чекбокс, кнопка).
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
openDateOfBirthPicker() - Кликает на поле.
selectDateOfBirth(String month, String year, String day) - Открывают и выбирают дату в поле (окне) выбора даты рождения.
enterSubjects(String subject) -  Вводит значение в поле с предметами и нажимает Enter.
uploadPicture(String picturePath) - Загружает файл, указанный по пути picturePath.
selectStateAndCity(String state, String city) - Выбор значения в выпадающих списках "State" и "City".
 */
    public static void enterFirstName(String firstName) {
        firstNameInput.setValue(firstName);
    }

    public static void enterLastName(String lastName) {
        lastNameInput.setValue(lastName);
    }

    public static void enterEmail(String email) {
        emailInput.setValue(email);
    }

    public static void selectGenderMale() {
        genderRadioMale.click();
    }

    public static void enterPhoneNumber(String phoneNumber) {
        phoneNumberInput.setValue(phoneNumber);
    }

    public static void openDateOfBirthPicker() {
        dateOfBirthInput.click();
    }

    public static void selectDateOfBirth(String month, String year, String day) {
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day.react-datepicker__day--" + day).click();
    }

    public static void enterSubjects(String subject) {
        subjectsInput.setValue(subject).pressEnter();
    }

    public static void selectHobbiesSports() {
        hobbiesSportsCheckbox.click();
    }

    public static void uploadPicture(String picturePath) {
        uploadPictureInput.uploadFromClasspath(picturePath);
    }

    public static void enterCurrentAddress(String address) {
        currentAddressInput.setValue(address);
    }

    public static void selectStateAndCity(String state, String city) {
        stateDropdown.click();
        $("#stateCity-wrapper").$(byText(state)).click();
        cityDropdown.click();
        $("#stateCity-wrapper").$(byText(city)).click();
    }

    public static void clickSubmitButton() {
        submitButton.click();
    }
}
//--------------------------------------------------------------