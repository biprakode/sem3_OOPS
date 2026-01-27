package Assignmen1.q6;

public class PizzaFactory {
    public static Pizza createPizza(int choice) {
        switch (choice) {
            case 1:
                return new NewYorkPizza();
            case 2:
                return new ChicagoPizza();
            case 3:
                return new HawaiianPizza();
            case 4:
                return new SicillianPizza();
            default:
                return null;
        }
    }
}
