
    package edu.bu.met.cs665;

    import edu.bu.met.cs665.beverage.*;
    import edu.bu.met.cs665.beverage.coffee_subclasses.*;
    import edu.bu.met.cs665.beverage.tea_subclasses.*;
    import org.junit.Before;
    import org.junit.Test;

    import static org.junit.Assert.assertEquals;

    public class VendingMachineTests {

        private VendingMachine vendingMachine;

        @Before
        public void setup() {
            vendingMachine = new VendingMachine();
        }

        @Test
        public void testEspressoPriceWithoutCondiments() {
            Beverage espresso = new Espresso();
            double finalPrice = vendingMachine.calculateFinalPrice(espresso, 0, 0);
            assertEquals(1.5, finalPrice, 0);
        }

        @Test
        public void testAmericanoPriceWithCondiments() {
            Beverage americano = new Americano();
            double finalPrice = vendingMachine.calculateFinalPrice(americano, 2, 3); // 2 milk, 3 sugar
            assertEquals(4.25, finalPrice, 0);
        }

        @Test
        public void testLatteWithExcessCondiments() {
            Beverage latte = new Latte();
            double finalPrice = vendingMachine.calculateFinalPrice(latte, 4, 4); // Excess condiments, will be limited
            assertEquals(5.25, finalPrice, 0);
        }

        @Test
        public void testBlackTeaPriceWithoutCondiments() {
            Beverage blackTea = new Black();
            double finalPrice = vendingMachine.calculateFinalPrice(blackTea, 0, 0);
            assertEquals(2.5, finalPrice, 0);
        }

        @Test
        public void testGreenTeaWithSomeCondiments() {
            Beverage greenTea = new Green();
            double finalPrice = vendingMachine.calculateFinalPrice(greenTea, 1, 1); // 1 milk, 1 sugar
            assertEquals(3.5, finalPrice, 0);
        }
    }
    