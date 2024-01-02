import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.example.Validator;
import com.example.InvalidDataException;

public class UserTest {

    public static Validator validator;

    @BeforeAll
    public static void init() {
        validator = new Validator();
    }

    @ParameterizedTest
    @ValueSource(strings = { "Raghav", "Patidar", "Aditya", "Yadav", "Kushal", "Pandey" })
    public void validateCorrectNameHappy(String str) throws InvalidDataException {
        assertTrue(validator.validateName(str));
    }

    @ParameterizedTest
    @ValueSource(strings = { "raghav", "PaTidar", "ADTtya", "yaDav", "K232ushal", "Pan@#$dey" })
    public void validateInCorrectNameSad(String str) {
        try {
            assertFalse(validator.validateName(str));
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.co",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.a",
            "abc@1.com",
            "abc@gmail.com.co",
            "abc+100@gmail.co",
    })
    public void validateCorrectEmailHappy(String email) throws InvalidDataException {
        assertTrue(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "abc",
            "abc@.com.my",
            "abc123@gmail.a ",
            "abc123@.com ",
            "abc123@.com.com",
            ".abc@abc.com ",
            "abc()*@gmail.com ",
            "abc@%*.com ",
            "abc..2002@gmail.com ",
            "abc.@gmail.com ",
            "abc@abc@gmail.com",
            "abc@gmail.com.1a",
            "abc@gmail.com.aa.au",
    })
    public void validateInCorrectEmailSAD(String email) {
        try {
            assertFalse(validator.validateEmail(email));
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "91 9977649723", "989 9988665533", "1 7788554411" })
    public void validateCorrectPhoneHappy(String phone) throws InvalidDataException {
        assertTrue(validator.validatePhone(phone));
    }

    @ParameterizedTest
    @ValueSource(strings = { "91 99776497", "9899988665533", "1 778855441a" })
    public void validateInCorrectPhonesad(String phone) {
        try {
            assertFalse(validator.validatePhone(phone));
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "@Reur985", "!@#$98754addFas", "!1Aa123awsed" })
    public void validateCorrectPasswordhappy(String password) throws InvalidDataException {
        assertTrue(validator.validatePassword(password));
    }

    @ParameterizedTest
    @ValueSource(strings = { "asd", "raghav", "!1a123awsed", "raghavP1123" })
    public void validateInCorrectPasswordsad(String password) {
        try {
            assertFalse(validator.validatePassword(password));
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
    }

}
