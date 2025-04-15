import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        CoffeeMaker cafeCoffeeMaker = new CoffeeMaker();

        while (true) {
            System.out.println("\nWelcome to the Coffee Machine!");
            System.out.println("Select an option to continue:");
            System.out.println("1. Espresso");
            System.out.println("2. Latte");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1, 2, or 3): ");

           int choice = keyboard.nextInt();

           switch (choice) {
               case 1:
                   String espressoName = "Espresso";

                   double espressoPrice = 2.50;

                   System.out.print("What Roast would you like? (light, medium, dark): ");
                   String espressoRoast = keyboard.next();

                   System.out.print("How many servings would you like? (a number please): ");
                   int numberOfShots = keyboard.nextInt();

                   // Pass the espressoName, espressoRoast, espressoPrice, and numberOfShots as arguments in the correct order
                   Espresso myFavoriteEspresso = new Espresso(espressoName, espressoRoast, espressoPrice, numberOfShots);

                   // Call the prepareCoffee() method from the CoffeeMaker class and pass the Espresso object as argument
                   cafeCoffeeMaker.prepareCoffee(myFavoriteEspresso);

                   // Call the printInfo() method on the Espresso object
                   myFavoriteEspresso.printInfo();

                   break;

               case 2:

                   String latteName = "Latte";

                   double lattePrice = 3.50;

                   System.out.print("What Roast would you like? (light, medium, dark): ");
                   String latteRoast = keyboard.next();

                   System.out.print("What milk type would you like? (whole, skim, almond, oat): ");
                   String milkType = keyboard.next();

                   System.out.print("Would you like syrup? (yes/ no): ");
                   String syrupWanted = keyboard.next();

                   String syrupFlavor = "no";

                   if(syrupWanted.equals("yes")){
                       System.out.print("Which flavor would you like? (vanilla, caramel, hazelnut): ");
                       syrupFlavor = keyboard.next();
                   }

                   // Create an object of Latte class using the parameterized constructor
                   // Pass the latteName, latteRoast, lattePrice, milkType, and syrupFlavor as arguments in the correct order
                   Latte myFavoriteLatte = new Latte(latteName, latteRoast, lattePrice, milkType, syrupFlavor);

                   // Call the prepareCoffee() method from the CoffeeMaker class and pass the Latte object as argument
                   cafeCoffeeMaker.prepareCoffee(myFavoriteLatte);

                   // Call the printInfo() method on the Latte object
                   myFavoriteLatte.printInfo();

                   break;

               case 3:
                   System.out.println("Thank you for using the Coffee Machine!");
                   return;

               default:
                     System.out.println("Invalid choice. Please enter 1, 2, or 3.");
           }
        }
    }
}

