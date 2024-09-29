
    package edu.bu.met.cs665.beverage;

    import edu.bu.met.cs665.beverage.coffee_subclasses.*;
    import edu.bu.met.cs665.beverage.tea_subclasses.*;
    public class Main {
        public static void main(String[] args) {
            VendingMachine vendingMachine = new VendingMachine();

            // User selects an Espresso, adding 2 units of milk and 3 units of sugar
            Beverage espresso = new Espresso();
            int milkUnits = 2;
            int sugarUnits = 3;

            System.out.println("User selected: " + espresso.getDescription());
            vendingMachine.calculateFinalPrice(espresso, milkUnits, sugarUnits);

            // User selects an Americano, adding 3 units of milk and 4 units of sugar (will be limited to 3)
            Beverage americano = new Americano();
            milkUnits = 3;
            sugarUnits = 4;

            System.out.println(" User selected: " + americano.getDescription());
            vendingMachine.calculateFinalPrice(americano, milkUnits, sugarUnits);
        }
    }
    