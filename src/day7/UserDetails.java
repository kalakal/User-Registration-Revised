package day7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {

    Scanner scanner = new Scanner(System.in);
    public void firstName(){
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");

        System.out.print("Enter Firstname: ");
        String firstName = scanner.next();

        Matcher match = pattern.matcher(firstName);
        if (match.matches())
            System.out.println("Firstname is Valid");
        else
            System.out.println("Invalid Firstname");
    }
    public void lastName(){
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
        System.out.println("Enter Last name");
        String lastName = scanner.next();

        Matcher match = pattern.matcher(lastName);
       if (match.matches())
           System.out.println("Last Name is valid");
       else
           System.out.println("invalid last name");
    }
    void phoneNumber(){
        Pattern pattern = Pattern.compile("^[9][1]\\s[6-9][0-9]{9}$");
        System.out.println("Enter user Phone number");

        String phoneNumber = scanner.next();

        Matcher match = pattern.matcher(phoneNumber);
        if (match.matches())
            System.out.println("Phone Number is Valid");
        else
            System.out.println("Invalid Phone Number");

    }

    void checkPassword(){
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z]).{8,}$");
        System.out.println("Enter user Password");

        String password = scanner.nextLine();

        Matcher match = pattern.matcher(password);
        if (match.matches())
            System.out.println("password is Valid");
        else
            System.out.println("password is InValid");
    }


    public static void main(String[] args) {
          UserDetails usrdetails = new UserDetails();
//        usrdetails.firstName();
//        usrdetails.lastName();
//        usrdetails.phoneNumber();
          usrdetails.checkPassword();

    }
}

