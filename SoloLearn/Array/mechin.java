package SoloLearn.Array;
import java.util.Scanner;

public class mechin {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        //your code goes here

        int choice;

        // check if the input is an integer
        if (sc.hasNextInt()) {
            choice = sc.nextInt();

            // check if the choice is within the valid range
            if (choice >= 0 && choice < menu.length){
                String selectedDrink = menu[choice];
                System.out.println(selectedDrink);
            }else{
                System.out.println("Invalid");
            }
        }else{
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        sc.close();
    }
}
