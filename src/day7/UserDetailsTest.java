package day7;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
public class UserDetailsTest {
    private static UserDetailsMain user;
    @BeforeAll
    public static void initiate(){
        user = new UserDetailsMain();
    }

    @Test
    public void givenTextWhenItContainsFirstCapsInFirstNameAndMinThreeAlphabetsShouldReturnTrue() {

        String actual = user.validFirstName("Abhijeet");
        String expected = "Valid";
        Assertions.assertSame(actual, expected);
    }

    @Test
    public void givenTextWhenItDoesNotContainsFirstCapsInFirstNameShouldReturnTrue() {
        String actual = user.validFirstName("abhijeet");
        String expected = "Invalid";
        Assertions.assertSame(actual, expected);
    }

    @Test
    public void givenTextWhenItContainsFirstCapsInFirstNameButNotMinThreeCharShouldReturnTrue() {
        String actualResult = user.validFirstName("Ab");
        String expectedResult = "Invalid";
        Assertions.assertSame(actualResult, expectedResult);
    }

    @Test
    public void givenTextWhenItDoesNotContainsFirstCapsInLastNameShouldReturnTrue() {
        String actualResult = user.validFirstName("tripathi");
        String expectedRes = "Invalid";
        Assertions.assertSame(actualResult, expectedRes);
    }

    @Test
    public void givenTextWhenItContainsFirstCapsInLastNameButNotMinThreeCharShouldReturnTrue() {
        String actualResult = user.validLastName("Tr");
        String expectedRes = "Invalid";
        Assertions.assertSame(actualResult, expectedRes);
    }
    @Test
    public void givenTextWhenItContainsFirstCapsInSnameShouldReturnTrue() {
        String actual = user.validFirstName("Abhishek");
        String expected = "Valid";
        Assertions.assertSame(actual, expected);
    }

    @Test
    public void givenEmailWhenDoesNotContainsAtTheRateShouldReturnFalse() {

        String actualResult = user.validEmailId("kuabc.yahoo.com");
        String expectedRes = "Invalid";
        Assertions.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenEmailWhenDoesNotContainsABCShouldReturnFalse() {

        String actualResult = user.validEmailId("xyz.yahoo.co.in");
        String expectedRes = "Invalid";
        Assertions.assertSame(actualResult, expectedRes);
    }

    @Test
    public void givenEmailWhenItContainsMoreThanThreeCharAtLastShouldReturnFalse() {

        String actualResult = user.validEmailId("xyz.yahoo.co.india");
        String expectedRes = "Invalid";
        Assertions.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenEmailWhenItContainsMoreThanTwoTLDShouldReturnFalse() {

        String actualResult = user.validEmailId("xyz.yahoo.co.in.co");
        String expectedRes = "Invalid";
        Assertions.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenEmailWhenItContainsOneCharInTLDShouldReturnFalse() {

        String actualResult = user.validEmailId("xyz.yahoo.co.i");
        String expectedRes = "Invalid";
        Assertions.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenEmailWhenItContainsDoubleDotsShouldReturnFalse() {

        String actualResult = user.validEmailId("xyz..yahoo.co.i");
        String expectedRes = "Invalid";
        Assertions.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenEmailWhenItContainsSpecialCharacterShouldReturnFalse() {
        String actualResult = user.validEmailId("xyz.yahoo.c@.i");
        String expectedRes = "Invalid";
        Assertions.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenEmailWhenItContainsDigitsInTLDShouldReturnFalse() {

        String actualResult = user.validEmailId("xyz.yahoo.c1.i");
        String expectedRes = "Invalid";
        Assertions.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenEmailWhenAccordingToProperReqShouldReturnTrue() {
        String actualResult = user.validEmailId("abc.xyz@bl.co.in");
        String expectedRes = "Valid";
        Assertions.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenMobileNumberWithSpaceAndProperNumberShouldReturnTrue() {
        String actualResult = user.validPhoneNumber("91 9066939699");
        String expectedRes = "Valid";
        Assertions.assertSame(actualResult, expectedRes);
    }

    @Test
    public void givenMobileNumberWithoutSpaceAndProperNumberShouldReturnFalse() {

        String actualResult = user.validPhoneNumber("919066939699");
        String expectedRes = "Invalid";
        Assertions.assertSame(actualResult, expectedRes);
    }

    @Test
    public void givenMobileNumberWithSpaceButNotProperCountryCodeShouldReturnFalse() {

        String actualResult = user.validPhoneNumber("349066939699");
        String expectedRes = "Invalid";
        Assertions.assertSame(actualResult, expectedRes);
    }

    @Test
    public void givenPasswordWithoutAnUpperCaseShouldReturnFalse() {

        String actualResult = user.validPassword("abccc@123");
        String expectedRes = "Invalid";
        Assertions.assertSame(actualResult, expectedRes);
    }

    @Test
    public void givenPasswordWithoutASpecialCharShouldReturnFalse() {

        String actualResult = user.validPassword("abccc123");
        String expectedRes = "Invalid";
        Assertions.assertSame(actualResult, expectedRes);
    }

    @Test
    public void givenPasswordWithoutALowerCaseShouldReturnFalse() {

        String actualResult = user.validPassword("AAAAAAA@123");
        String expectedRes = "Invalid";
        Assertions.assertSame(actualResult, expectedRes);
    }

    @Test
    public void givenPasswordWithoutMinNumOfCharShouldReturnFalse() {

        String actualResult = user.validPassword("Ac@123");
        String expectedRes = "Invalid";
        Assertions.assertSame(actualResult, expectedRes);
    }

    @Test
    public void givenPasswordWithProperRequirementsShouldReturnTrue() {

        String actualResult = user.validPassword("Abccc@123");
        String expectedRes = "Valid";
        Assertions.assertEquals(actualResult, expectedRes);
    }

}

