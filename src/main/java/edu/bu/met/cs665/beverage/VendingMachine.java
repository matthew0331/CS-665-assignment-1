
    package edu.bu.met.cs665.beverage;

    public class VendingMachine {

        public double addMilk(Beverage beverage, int units) {
            if (units > 3) {
                System.out.println("You can add up to 3 units of milk. The system will limit it to 3.");
                units = 3;
            }
            System.out.println(units + " unit(s) of milk added to " + beverage.getDescription() + ".");
            return beverage.cost() + (0.75 * units);
        }

        public double addSugar(Beverage beverage, int units) {
            if (units > 3) {
                System.out.println("You can add up to 3 units of sugar. The system will limit it to 3.");
                units = 3;
            }
            System.out.println(units + " unit(s) of sugar added to " + beverage.getDescription() + ".");
            return beverage.cost() + (0.25 * units);
        }

        public double calculateFinalPrice(Beverage beverage, int milkUnits, int sugarUnits) {
            double totalCost = beverage.cost();

            if (milkUnits + sugarUnits > 6) {
                System.out.println("The total number of condiments cannot exceed 6 units. The system will limit it.");
                int excess = (milkUnits + sugarUnits) - 6;
                if (milkUnits > 3) milkUnits = 3;
                sugarUnits = Math.max(0, sugarUnits - excess);
            }

            totalCost = addMilk(beverage, milkUnits);
            totalCost = addSugar(beverage, sugarUnits);

            System.out.println("Final price: $" + totalCost);
            return totalCost;
        }
    }
    