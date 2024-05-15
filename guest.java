import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class guest {
    public static void handleguest() {
        System.out.println("Pick your preferred drink! ");
        System.out.println("1. Non Coffee \n2. Coffee");

        Scanner sc = new Scanner(System.in); // creating the scanner, named "sc"

        Integer user_input = sc.nextInt(); // user input

        switch (user_input) {
            case 1: // non coffee
                
                // creating the hashmap ( Key, Value )
                HashMap<Integer, String> Non_Coffee_Menu = new HashMap<>();

                // adding to the hashmap
                Non_Coffee_Menu.put(1, "Lychee Tea");
                Non_Coffee_Menu.put(2, "Olong Tea");
                Non_Coffee_Menu.put(3, "Green Tea");
                Non_Coffee_Menu.put(4, "Jasmine Tea");

                // printing it out
                for (Map.Entry<Integer, String> entry : Non_Coffee_Menu.entrySet()) {
                    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
                }
                break;

                // user input


            case 2: // coffee
                // creating the hashmap ( Key, Value )
                HashMap<Integer, String> Coffee_Menu = new HashMap<>();

                // adding to the hashmap
                Coffee_Menu.put(1, "Americano");
                Coffee_Menu.put(2, "Latte");
                Coffee_Menu.put(3, "Cappucino");
                Coffee_Menu.put(4, "Cold Brew");

                // printing it out
                for (Map.Entry<Integer, String> entry : Coffee_Menu.entrySet()) {
                    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
                }
                break;
                    
        }
    }
}


