package regex.validatehexcolorcodetest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.regex.validatehexcolorcode.HexColorValidator.isValidHexColor;

public class HexColorValidatorTest {

    @Test
    public void testOfHexColorValidate(){
	   // Defining test hex color codes
	   String[] testColors = {"#FFA500", "#ff4500", "#123", "#HIJKL", "#abcDEF", "#1A2B3C", "123456"};

	   // Defining the expectedColor status to validate the actual status
	   boolean [] expectedColorStatus = {true , true, false ,false , true , true , false};

	   // Creating a list to store the valid hex color code
	   List<String> validHex = new ArrayList<>();

	   // Iterating through testColor and passing it to the HexColorValidator and check isHexColorValidator works fine
	   for(int color = 0; color < testColors.length; color++){

		  // Creating a variable and store the status of the isHexColorValidator
		  boolean colorValidateStatus = isValidHexColor( testColors [color]);

		  if(colorValidateStatus) validHex.add(testColors[color]);

		  // Testing weather given color status is same as expected
		  Assertions.assertEquals(expectedColorStatus[color] , colorValidateStatus, "Color code is Invalid");
	   }
	   System.out.println("Valid hex are :" + validHex);
    }
}
