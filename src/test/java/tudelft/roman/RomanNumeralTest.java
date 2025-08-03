package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {


    @Test
    public void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }

     @Test
    public void numberWithComplexDigits() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("XLIX");
        Assertions.assertEquals(49, result);
    }

    @Test
    public void numberWithWrongDigits() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("LVIII");
        Assertions.assertNotEquals(22, result);
    }

    // IIII is invalid input. but it's giving correct result
    @Test
    public void numberWithInvalidDigits() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IIII");
        Assertions.assertNotEquals(4, result);
    }
}
