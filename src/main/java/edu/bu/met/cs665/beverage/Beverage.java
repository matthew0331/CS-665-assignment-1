
    package edu.bu.met.cs665.beverage;

    public abstract class Beverage {
        protected String description = "Unknown Beverage";
        protected double price = 0.0;

        public String getDescription() {
            return description;
        }

        public double getPrice() {
            return price;
        }

        public abstract double cost();
    }
    