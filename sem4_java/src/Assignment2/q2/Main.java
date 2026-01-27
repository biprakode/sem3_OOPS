package Assignment2.q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("--- Circular Linked List Creator ---");

        do {
            System.out.println("\n1. Add Node\n2. Display List\n3. Show Even Sum\n0. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add: ");
                    int val = scanner.nextInt();
                    list.add(val);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    list.evenSum();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        scanner.close();
    }
}