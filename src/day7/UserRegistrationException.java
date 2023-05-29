package day7;

class FirstName{
    public static void checkFirstName(String firstName)	{
        if(UserRegistration.firstName(firstName) != true) {
            try {
                throw new UserRegistrationException();
            }catch (UserRegistrationException e) {
                e.printStackTrace();
                System.out.println("invalid First Name");
            }

        }else {
            System.out.println(" Valid First Name");
        }
    }
}
class LastName{
    public static void checkLastName(String lastName)	{
        if(UserRegistration.lastName(lastName) != true) {
            try {
                throw new UserRegistrationException();
            }catch (UserRegistrationException e) {
                e.printStackTrace();
                System.out.println(" invalid  last Name");
            }

        }else {
            System.out.println(" Valid  last Name");
        }
    }
}
class Email{
    public static void checkEmail(String email)	{
        if(UserRegistration.email(email) != true) {
            try {
                throw new UserRegistrationException();
            }catch (UserRegistrationException e) {
                e.printStackTrace();
                System.out.println(" Valid email");
            }

        }else {
            System.out.println(" Valid email");
        }
    }
}

class MobileNumber{
    public static void checkMobileNumber(String mobile)	{
        if(UserRegistration.mobileNumber(mobile) != true) {
            try {
                throw new UserRegistrationException();
            }catch (UserRegistrationException e) {
                e.printStackTrace();
                System.out.println(" invalid mobile number ");
            }

        }else {
            System.out.println(" Valid mobile number ");
        }
    }
}
class Password{
    public static void checkPassword(String password)	{
        if(UserRegistration.password(password) != true) {
            try {
                throw new UserRegistrationException();
            }catch (UserRegistrationException e) {
                e.printStackTrace();
                System.out.println(" Invalid password");
            }

        }else {
            System.out.println(" Valid password ");
        }
    }
}
public class UserRegistrationException extends RuntimeException {
    public static void printCause() {
        System.out.println(" Invalid data enter");
    }
}