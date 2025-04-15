public class Latte extends Coffee {
    // Declare two attributes to store the milk type and syrup flavor (String)
    String milkType;
    String syrupFlavor;

    // Constructor to initialize all attributes
    public Latte(String name, String roast, double price, String milkType, String syrupFlavor) {
        // Use super to call the Coffee constructor
        super(name, roast, price);

        this.milkType = milkType;
        this.syrupFlavor = syrupFlavor;
    }

    // Override the grindBeans() method
    @Override
    public void grindBeans() {
        System.out.println("\nGrinding coffee beans coarsely for a latte (medium grind).");
    }

    // Override the brewCoffee() method to:
    @Override
    public void brewCoffee() {

        // Simulate brewing coffee for a latte
        System.out.println("Brewing coffee for a latte...");

        // Condition to check if syrupFlavor is selected
        if (!syrupFlavor.equals("no)")) {

            System.out.println("Adding " + syrupFlavor + " syrup to the cup...");
        }

        System.out.println("Steaming " + milkType + " milk...");

        System.out.println("Combining coffee and steamed milk...");

        System.out.println("Adding a layer of foam on top...");
    }

    // Override the printInfo() method to print the common and specific details of espresso including the bill
    @Override
    public void printInfo() {
        // Call the printInfo() method from the Coffee class using super
        super.printInfo();

        System.out.println("Your latte has " + milkType + " milk and " + syrupFlavor + " flavor.");
        System.out.println("Your total bill is " + price + "$.");

    }

}
