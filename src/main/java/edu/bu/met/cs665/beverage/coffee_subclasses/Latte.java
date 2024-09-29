
    package edu.bu.met.cs665.beverage.coffee_subclasses;

    import edu.bu.met.cs665.beverage.Coffee;

    public class Latte extends Coffee {
        public Latte() {
            description = "Latte";
            price = 3.0;
        }

        @Override
        public double cost() {
            return price;
        }
    }
    