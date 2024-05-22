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
                
                // creating the hashmap ( Key, Value ) non coffee options
                HashMap<Integer, String> Non_Coffee_Menu = new HashMap<>();

                // adding to the hashmap
                Non_Coffee_Menu.put(1, "Lychee Tea"); //3$
                Non_Coffee_Menu.put(2, "Olong Tea"); //3$
                Non_Coffee_Menu.put(3, "Green Tea"); //3$
                Non_Coffee_Menu.put(4, "Jasmine Tea"); //3$
                Non_Coffee_Menu.put(5, "Lemon Tea"); //3$
                Non_Coffee_Menu.put(6, "Strawberry Milk"); //6.52$
                Non_Coffee_Menu.put(7, "Chocolate Milk"); //6.52$
                Non_Coffee_Menu.put(8, "Mineral Water"); //1$
                Non_Coffee_Menu.put(9, "Coke"); // 4$
                Non_Coffee_Menu.put(10, "Hojicha"); //4.42$
                Non_Coffee_Menu.put(11, "Milk Tea"); //3.39$

                System.out.println("Here are the available coffee drinks from the menu: ");
                System.out.println(" ");

                // creating the prices of each drink with hashmap, according to its key
                HashMap<Integer, Double> Non_Coffee_Prices = new HashMap<>();

                //Adding the prices to each key and storing to its according value
                Non_Coffee_Prices.put(1, 3.00); // in dollars $ 
                Non_Coffee_Prices.put(2, 3.00);
                Non_Coffee_Prices.put(3, 3.00);
                Non_Coffee_Prices.put(4, 3.00);
                Non_Coffee_Prices.put(5, 3.00);
                Non_Coffee_Prices.put(6, 6.52);
                Non_Coffee_Prices.put(7, 6.52);
                Non_Coffee_Prices.put(8, 1.00);
                Non_Coffee_Prices.put(9, 4.00);
                Non_Coffee_Prices.put(10, 4.42);
                Non_Coffee_Prices.put(11, 3.39);


                // printing it out
                for (Map.Entry<Integer, String> entry : Non_Coffee_Menu.entrySet()) {
                    
                    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
                }

                // user input
                System.out.println("Type in the name of your coffee from the menu: ");
                System.out.println(" ");

                Scanner NonCoffee_Input = new Scanner(System.in);

                String NonCoffee = NonCoffee_Input.nextLine(); 

                // Finding the key for the entered value
                Integer key = null;
                for (Map.Entry<Integer, String> entry : Non_Coffee_Menu.entrySet()) {
                    if (entry.getValue().equals(NonCoffee)) {
                        key = entry.getKey();
                        break;
                    }
                }

                if (key != null) {
                    System.out.println("You have chosen " + Non_Coffee_Menu.get(key));
                    System.out.println("Price: $" + Non_Coffee_Prices.get(key));
                } else {
                    System.out.println("The entered drink is not available in the menu.");
                }

                NonCoffee_Input.close();
                

                
                break;

                
            


            case 2: // coffee
                // creating the hashmap ( Key, Value )
                HashMap<Integer, String> Coffee_Menu = new HashMap<>();

                // adding to the hashmap
                Coffee_Menu.put(1, "Americano"); //3.60$
                Coffee_Menu.put(2, "Latte"); //4.32$
                Coffee_Menu.put(3, "Cappucino"); //5.26$
                Coffee_Menu.put(4, "Cold Brew"); //4.02$
                Coffee_Menu.put(5, "Long Black"); //5.28$
                Coffee_Menu.put(6, "Mocha"); //3.56$
                Coffee_Menu.put(7, "Macchiato"); //6.58$

                //ADD THE PRICES, CREATE NEW HASHMAP

                // printing it out
                for (Map.Entry<Integer, String> entry : Coffee_Menu.entrySet()) {
                    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
                }

                // user input
                System.out.println("Type in the name of your drink from the menu: ");
                System.out.println(" ");
                
                Scanner Coffee_Input = new Scanner(System.in);

                String Coffee = Coffee_Input.nextLine(); 


                // Finding the key for the entered value
                key = null;
                for (Map.Entry<Integer, String> entry : Coffee_Menu.entrySet()) {
                    if (entry.getValue().equals(Coffee)) {
                        key = entry.getKey();
                        break;
                    }
                }

                if (key != null) {
                    System.out.println("You have chosen " + Coffee_Menu.get(key));
                } else {
                    System.out.println("The entered drink is not available in the menu.");
                } 
                
                Coffee_Input.close();
                
                break;
                






    
        }
    }
}


