package q6;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Pizza Factory");
        if (args.length == 0) {
            System.out.println("Usage: java q6.Main <pizza_type_id1> <pizza_type_id2> ...");
            System.out.println("Types: 1: NY, 2: Chicago, 3: Hawaiian, 4: Sicilian");
            return;
        }
        for(String arg : args) {
            try {
                processPizzaChoice(arg);
            } catch (IllegalArgumentException e) {
                System.err.println("Error processing choice '" + arg + "': " + e.getMessage());
            }
        }
        System.out.println("All orders processed. Program Terminated.");
    }

    private static void processPizzaChoice(String arg) {
        int choice;
        try {
            choice = Integer.parseInt(arg);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Input must be a valid number (1-4).");
        }
        q6.Pizza pizza = q6.PizzaFactory.createPizza(choice);
        if (pizza == null) {
            throw new IllegalArgumentException("No pizza found for ID: " + choice);
        }
        displayPizzaDetails(pizza);
    }



    static void displayPizzaDetails(Pizza pizza) {
        String dough = pizza.GetDough();
        String toppings = pizza.GetToppings();
        System.out.println("Dough: " + dough);
        System.out.println("Toppings: " + toppings);
        pizza.bake();
        pizza.cut();
        pizza.deliver();
    }
}
