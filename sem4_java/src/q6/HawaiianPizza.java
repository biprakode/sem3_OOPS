package q6;

public class HawaiianPizza extends Pizza {

    HawaiianPizza() {
        dough = "Classic Pizza Dough";
        toppings = "Mozzarella Cheese, Ham, Pineapple";
    }

    public String GetDough() {
        return dough;
    }
    
    public String GetToppings() {
        return toppings;
    }
    
    @Override
    public void bake() {
        System.out.println("Hawaiian style pizza is baking");
        try { Thread.sleep(5000); } catch (InterruptedException e) { }
        System.out.println("Hawaiian style pizza is baked");
    }

    @Override
    public void cut() {
        System.out.println("Hawaiian style pizza is cut");
    }

    @Override
    public void deliver() {
        System.out.println("Hawaiian style pizza is delivered");
    }
}
