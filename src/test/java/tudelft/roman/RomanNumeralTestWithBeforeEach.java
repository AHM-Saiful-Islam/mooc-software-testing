package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTestWithBeforeEach {

    private RomanNumeral roman;

    @BeforeEach
    public void initialize() {
        this.roman = new RomanNumeral();
    }

    @Test
    public void singleNumber() {
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }

    // new test case
    @Test
    public void numberWithComplexDigits() {
        int result = roman.convert("XCIX");
        Assertions.assertEquals(99, result);
    }
    
    // new test case
    @Test
    public void numberWithWrongDigits() {
        int result = roman.convert("IX");
        Assertions.assertNotEquals(11, result);
    }

    // VV is invalid input. but it's giving correct result. new test case
    @Test
    public void numberWithInvalidDigits() {
        int result = roman.convert("VV");
        Assertions.assertNotEquals(10, result);
    }

    // IC is invalid input. but it's giving correct result. new test case
    @Test
    public void numberWithInvalidDigits2() {
        int result = roman.convert("IC");
        Assertions.assertNotEquals(99, result);
    }

    // IL is invalid input. but it's giving correct result. new test case
    @Test
    public void numberWithInvalidDigits3() {
        int result = roman.convert("IL");
        Assertions.assertNotEquals(49, result);
    }
}
