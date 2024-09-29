
    package edu.bu.met.cs665.beverage.tea_subclasses;

    import edu.bu.met.cs665.beverage.Tea;

    public class Black extends Tea {
        public Black() {
            description = "Black Tea";
            price = 2.5;
        }

        @Override
        public double cost() {
            return price;
        }
    }
    