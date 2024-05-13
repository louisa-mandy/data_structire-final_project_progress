import java.util.Scanner;

public class login {
    public static void handlelogin() {

        Scanner login = new Scanner(System.in); // create the scanner

        System.out.println(" ");
        System.out.println("Login");

        System.out.println("Enter your email : ");
        String enteredEMAIL = login.next();
        System.out.println(" ");

        System.out.println("Enter your password : ");
        String enteredPASSWORD = login.next();

        signin.handleSignIn();

        boolean found = signin.verifyCredentials(enteredEMAIL, enteredPASSWORD);

            if (found) {
                System.out.println(" ");
                System.out.println("Login Successful!");


            } else {
                System.out.println("Invalid email or password. Please try again.");
            }
            
            

}
}


