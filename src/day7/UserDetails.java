package day7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {
    public void firstName(){
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");

        Scanner scanner = new Scanner(System.in);
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Last name");
        String lastName = scanner.next();

        Matcher match = pattern.matcher(lastName);
       if (match.matches())
           System.out.println("Last Name is valid");
       else
           System.out.println("invalid last name");
    }

    public static void main(String[] args) {
        UserDetails usrdetails = new UserDetails();
        usrdetails.firstName();
        usrdetails.lastName();

    }
}

