
    package edu.bu.met.cs665.beverage.tea_subclasses;

    import edu.bu.met.cs665.beverage.Tea;

    public class Yellow extends Tea {
        public Yellow() {
            description = "Yellow Tea";
            price = 2.5;
        }

        @Override
        public double cost() {
            return price;
        }
    }
    