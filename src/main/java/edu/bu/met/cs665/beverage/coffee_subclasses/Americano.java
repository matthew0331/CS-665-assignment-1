
    package edu.bu.met.cs665.beverage.coffee_subclasses;

    import edu.bu.met.cs665.beverage.Coffee;

    public class Americano extends Coffee {
        public Americano() {
            description = "Americano";
            price = 2.0;
        }

        @Override
        public double cost() {
            return price;
        }
    }
    