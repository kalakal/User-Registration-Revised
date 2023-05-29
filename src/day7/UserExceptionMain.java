package day7;

import java.util.Scanner;

public class UserExceptionMain {

    public static void main(String[] args) {
        System.out.println("Welcome in User registration program using Regex");
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "What do want enter \n1. First Name \n2. Last Name \n3. E-mail \n4. Mobile number \n5. Password ");
        int option = sc.nextInt();
        switch (option) {

            case 1:
                System.out.println("Enter First Name");
                String firstName = sc.next();
                FirstName.checkFirstName(firstName);
                break;

            case 2:
                System.out.println("Enter last Name");
                String lastName = sc.next();
                LastName.checkLastName(lastName);
                break;
            case 3:
                System.out.println("Enter e-mail");
                String email = sc.next();
                Email.checkEmail(email);
                break;
            case 4:
                System.out.println("Enter Mobile Number");
                String mobile = sc.next();
                MobileNumber.checkMobileNumber(mobile);
                break;
            case 5:
                System.out.println("Enter Password ");
                String password = sc.next();
                Password.checkPassword(password);
                break;
        }
    }

}