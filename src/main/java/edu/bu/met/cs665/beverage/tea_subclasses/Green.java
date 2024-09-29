
    package edu.bu.met.cs665.beverage.tea_subclasses;

    import edu.bu.met.cs665.beverage.Tea;

    public class Green extends Tea {
        public Green() {
            description = "Green Tea";
            price = 2.5;
        }

        @Override
        public double cost() {
            return price;
        }
    }
    