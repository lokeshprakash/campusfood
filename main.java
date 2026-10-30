
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("   COLLEGE FOOD BOOKING SYSTEM");
        System.out.println("================================");
        System.out.println("Welcome, Student!");

        System.out.println("Available options:\n1.REC_mart\n2.REC_cafe\n3.REC_hutcafe\nENTER YOUR CHOICE");
        int n = in.nextInt();

        if (n == 1) {
            System.out.println("You have selected REC_mart");

            fooditem item1 = new fooditem("Burger", 50);
            fooditem item2 = new fooditem("Pizza", 100);
            fooditem item3 = new fooditem("Sandwich", 30);

            System.out.println("1.");
            item1.display();
            System.out.println("2.");
            item2.display();
            System.out.println("3.");
            item3.display();

            System.out.print("Enter your food choice: ");
            int foodChoice;
            while(true){
                try {
                    foodChoice = in.nextInt();
                    break; // Exit the loop if input is valid
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    in.next(); // Clear the invalid input
                }
            } 
            fooditem selectedFood = null;
            if (foodChoice == 1) {
                selectedFood = item1;
            } else if (foodChoice == 2) {
                selectedFood = item2;
            } else if (foodChoice == 3) {
                selectedFood = item3;
            } else {
                System.out.println("Invalid food choice.");
            }

            if (selectedFood != null) {
                System.out.println("Selected Food: " + selectedFood.itemname);
                System.out.println("Price: Rs. " + selectedFood.itemprice);

                System.out.print("Enter quantity: ");
                int p;
                    while (true){
                        try{
                            p=in.nextInt();
                            break;
                        }
                        catch(InputMismatchException e){
                            System.out.println("Invalid input. Please enter a number.");
                            in.next(); // Clear the invalid input                    
                        }
                    }
                if (p > 0) {
    int total = selectedFood.itemprice * p;

    reference b = new reference();
    b.generateReferenceCode();

    System.out.println("Quantity: " + p);
    System.out.println("Total Price: Rs. " + total);
    b.displayReferenceCode();

                } else {
                    System.out.println("Invalid quantity!");
                }
            }

        } else if (n == 2) {
            System.out.println("You have selected REC_cafe");

            fooditem food1 = new fooditem("Biscuits", 10);
            fooditem food2 = new fooditem("Chips", 20);
            fooditem food3 = new fooditem("Chocolate", 25);

            System.out.println("1.");
            food1.display();
            System.out.println("2.");
            food2.display();
            System.out.println("3.");
            food3.display();

            System.out.print("Enter your food choice: ");
            int foodChoice;
            while(true){
                try {
                    foodChoice = in.nextInt();
                    break; // Exit the loop if input is valid
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    in.next(); // Clear the invalid input
                }
            }

            fooditem selectedFood = null;

            if (foodChoice == 1) {
                selectedFood = food1;
            } else if (foodChoice == 2) {
                selectedFood = food2;
            } else if (foodChoice == 3) {
                selectedFood = food3;
            } else {
                System.out.println("Invalid food choice.");
            }

            if (selectedFood != null) {
                System.out.println("Selected Food: " + selectedFood.itemname);
                System.out.println("Price: Rs. " + selectedFood.itemprice);

                System.out.print("Enter quantity: ");
                int p;
                while(true){
                    try {
                        p = in.nextInt();
                        break; // Exit the loop if input is valid
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        in.next(); // Clear the invalid input
                    }
                }
                if (p > 0) {
    int total = selectedFood.itemprice * p;

    reference b = new reference();
    b.generateReferenceCode();

    System.out.println("Quantity: " + p);
    System.out.println("Total Price: Rs. " + total);
    b.displayReferenceCode();

                } else {
                    System.out.println("Invalid quantity!");
                }
            }

        } else if (n == 3) {
            System.out.println("You have selected REC_hutcafe");

            fooditem food4 = new fooditem("Noodles", 40);
            fooditem food5 = new fooditem("Pasta", 60);
            fooditem food6 = new fooditem("Burger", 50);
            fooditem food7 = new fooditem("Pizza", 100);

            System.out.println("1.");
            food4.display();
            System.out.println("2.");
            food5.display();
            System.out.println("3.");
            food6.display();
            System.out.println("4.");
            food7.display();

            System.out.print("Enter your food choice: ");
            int foodChoice;
            while(true){
                try {
                    foodChoice = in.nextInt();
                    break; // Exit the loop if input is valid
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    in.next(); // Clear the invalid input
                }
            }

            fooditem selectedFood = null;

            if (foodChoice == 1) {
                selectedFood = food4;
            } else if (foodChoice == 2) {
                selectedFood = food5;
            } else if (foodChoice == 3) {
                selectedFood = food6;
            } else if (foodChoice == 4) {
                selectedFood = food7;
            } else {
                System.out.println("Invalid food choice.");
            }

            if (selectedFood != null) {
                System.out.println("Selected Food: " + selectedFood.itemname);
                System.out.println("Price: Rs. " + selectedFood.itemprice);

                System.out.print("Enter quantity: ");
                int p;
                while(true){
                    try {
                        p = in.nextInt();
                        break; // Exit the loop if input is valid
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        in.next(); // Clear the invalid input
                    }
                }
                if (p > 0) {
    int total = selectedFood.itemprice * p;

    reference b = new reference();
    b.generateReferenceCode();

    System.out.println("Quantity: " + p);
    System.out.println("Total Price: Rs. " + total);
    b.displayReferenceCode();

} else {
    System.out.println("Invalid quantity!");
}              
            }

        } else {
            System.out.println("Invalid input");
        }


    }
}
