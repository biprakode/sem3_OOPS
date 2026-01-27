package Assignmen1.q6;

public class SicillianPizza extends Pizza {

    SicillianPizza() {
        dough = "Thick Crust Dough";
        toppings = "Mozzarella Cheese, Tomato Sauce, Olives";
    }

    public String GetDough() {
        return dough;
    }
    
    public String GetToppings() {
        return toppings;
    }
    
    @Override
    public void bake() {
        System.out.println("Sicilian style pizza is baking");
        try { Thread.sleep(5000); } catch (InterruptedException e) { }
        System.out.println("Sicilian style pizza is baked");
    }

    @Override
    public void cut() {
        System.out.println("Sicilian style pizza is cut");
    }

    @Override
    public void deliver() {
        System.out.println("Sicilian style pizza is delivered");
    }
}
