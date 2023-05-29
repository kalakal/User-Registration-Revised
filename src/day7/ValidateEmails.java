package day7;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmails{
        public static boolean email (String email){
            String regex = "^[a-z]{3,}[.+-_]*[a-z0-9]*{3,}[@][a-z0-9]{1,}[.][a-z]{2,}[.]*[a-z]*{2,}$";
            Pattern p = Pattern.compile(regex);
            Matcher match = p.matcher(email);
            if (match.matches()) {
                System.out.println(email + " : is a valid email ");
                return true;
            } else {
                System.out.println(email + " : is a invalid email ");
                return false;
            }

        }

    }
