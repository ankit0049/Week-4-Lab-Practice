package regex.validatecreditcardnumbertest;

import static org.junit.jupiter.api.Assertions.*;

import com.regex.validatecreditcardnumber.CreditCardValidator;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;

public class CreditCardValidatorTest {

    @Test
    void testCreditCardValidation() {
        // List of valid credit card numbers that should pass validation
        List<String> validCards = Arrays.asList(
            "4532756279624064",
            "5200828282828210"
        );

        // List of invalid credit card numbers that should fail validation
        List<String> invalidCards = Arrays.asList(
            "340000000000009",
            "6011000990139424",
            "45327562796240",
            "4532756279624064789",
            "4532A56279624064"
        );

        // Checking if all valid credit cards pass the validation test
        for (String card : validCards) {
            assertTrue(CreditCardValidator.isValidCreditCard(card), "Failed for valid card: " + card);
        }

        // Checking if all invalid credit cards fail the validation test
        for (String card : invalidCards) {
            assertFalse(CreditCardValidator.isValidCreditCard(card), "Failed for invalid card: " + card);
        }
    }
}
