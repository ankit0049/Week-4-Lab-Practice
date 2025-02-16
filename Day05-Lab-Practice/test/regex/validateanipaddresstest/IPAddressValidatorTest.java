package regex.validateanipaddresstest;

import static org.junit.jupiter.api.Assertions.*;

import com.regex.validateanipaddress.IPAddressValidator;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;

public class IPAddressValidatorTest {

    @Test
    void testIPAddressValidation() {
        // List of valid IP addresses that should pass validation
        List<String> validIPs = Arrays.asList(
            "192.168.1.1",
            "255.255.255.255",
            "0.0.0.0",
            "127.0.0.1",
            "172.16.0.1"
        );

        // List of invalid IP addresses that should fail validation
        List<String> invalidIPs = Arrays.asList(
            "256.100.50.25",
            "192.168.300.1",
            "192.168.1",
            "192.168.1.1.1",
            "abcd.efgh.ijkl.mnop",
            "192.168.-1.1"
        );

        // Checking if all valid IP addresses pass the validation test
        for (String ip : validIPs) {
            assertTrue(IPAddressValidator.isValidIPAddress(ip), "Failed for valid IP: " + ip);
        }

        // Checking if all invalid IP addresses fail the validation test
        for (String ip : invalidIPs) {
            assertFalse(IPAddressValidator.isValidIPAddress(ip), "Failed for invalid IP: " + ip);
        }
    }
}
