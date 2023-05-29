package day7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class testEmail {

    @Test
    public void testEmail() {

        boolean result1 = ValidateEmails.email("abc@yaho.com");
        assertEquals(true, result1);
        boolean result2 = ValidateEmails.email("abc-100@yahoo.com");
        assertEquals(true, result2);
        boolean result3 = ValidateEmails.email("abc.100@yahoo.com");
        assertEquals(true, result3);
        boolean result4 = ValidateEmails.email("abc@1.com");
        assertEquals(true, result4);
        boolean result5 = ValidateEmails.email("abc@gamil.com.com");
        assertEquals(true, result5);
        boolean result6 = ValidateEmails.email("abc+100@gamil.com");
        assertEquals(true, result6);
        boolean result7 = ValidateEmails.email("abc111@abc.com");
        assertEquals(true, result7);
        boolean result8 = ValidateEmails.email(".abc@.abc.com");
        assertEquals(true, result8);
        boolean result9 = ValidateEmails.email("abc()*@gamil.com");
        assertEquals(true, result9);
        boolean result10 = ValidateEmails.email("abc@%*.com");
        assertEquals(true, result10);
        boolean result11 = ValidateEmails.email("abc..2002@gamil.com");
        assertEquals(true, result11);
        boolean result12 = ValidateEmails.email("abc@abc@gmail.com");
        assertEquals(true, result12);
        boolean result13 = ValidateEmails.email("abc@gmail.com.1a");
        assertEquals(true, result13);
        boolean result14 = ValidateEmails.email("abc@gmail.com.aa.au");
        assertEquals(true, result14);

    }

}