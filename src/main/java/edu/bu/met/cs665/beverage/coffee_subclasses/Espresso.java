
    package edu.bu.met.cs665.beverage.coffee_subclasses;

    import edu.bu.met.cs665.beverage.Coffee;

    public class Espresso extends Coffee {
        public Espresso() {
            description = "Espresso";
            price = 1.5;
        }

        @Override
        public double cost() {
            return price;
        }
    }
    