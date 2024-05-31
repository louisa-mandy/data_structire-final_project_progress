
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class signup {
    
    static Map<String, String> Name = new HashMap<>(); // using HashMap to store user data
    static Map<String, String> Username = new HashMap<>();
    static Map<String, String> Address = new HashMap<>();
    static Map<String, String> Email = new HashMap<>();
    static Map<String, String> Phone = new HashMap<>(); // using HashMap to store user data ( integer = phone number )
    static Map<String, String> Password = new HashMap<>();


    public static void handleSignUp() {

        Scanner sc = new Scanner(System.in);  // Create a Scanner object

        // create a different user input? store the data to a linked list?
        System.out.println(" ");

        System.out.println("Enter Your Name : "); // string
        String name = sc.next();

        System.out.println("Enter Your Username : "); // string
        String username = sc.next();

        System.out.println("Enter Your Address : "); // string
        String address = sc.next();

        System.out.println("Enter Your Email : "); // string
        String email = sc.next();

        System.out.println("Enter Your Phone Number : "); // string
        String phone = sc.next();

        System.out.println("Enter Your Password : "); // string
        String password = sc.next();
        

        // email is used as the identifier later when we check its coorespondence 
        Name.put(email, name);
        Username.put(email, username);
        Address.put(email, address);
        Email.put(email, email); // Using email as the key for Email map
        Phone.put(email, phone);
        Password.put(email, password); // Using email as the key for Password map

        System.out.println("You have successfully created an account!");
        System.out.println(" ");
        System.out.println("Name : " + name); // displaying the acc info from the user input
        System.out.println("Username : " + username);
        System.out.println("Address : " + address);
        System.out.println("Email : " + email);
        System.out.println("Phone Number : " + phone);

        System.out.println(" ");
        System.out.println("You have successfully made an account");
        // System.out.println("Login Now? ( 'yes' / 'no' )");

        // Scanner user_input = new Scanner(System.in);
        // String input = user_input.next();

        // if(input == "yes"){
        //     Menu.handleMenu();
        // }else if (input == "no"){
        //     Main.main(null);
        // }else{
        //     System.out.println("invalid input");
        // }

    }

    // this verify credentials is used to connect the data inside this signup class towards the main class.
    // in order to check the inputted acc info from the user.

    public static boolean verifyCredentials(String email, String password) {
        // Check if the entered email and password match the stored data
        if (Password.containsKey(email)) {
            String storedPassword = Password.get(email);
            if (storedPassword.equals(password)) {
                return true;
            }
        }
        return false;
    }
    
    
}

