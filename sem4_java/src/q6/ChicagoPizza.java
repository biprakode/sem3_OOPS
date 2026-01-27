package q6;

public class ChicagoPizza extends Pizza {

    ChicagoPizza() {
        dough = "Bread Flour, Cornmeal, Yeast";
        toppings = "Mozzarella Cheese, Sausage, Peppers, Onions";
    }

    public String GetDough() {
        return dough;
    }
    
    public String GetToppings() {
        return toppings;
    }
    
    @Override
    public void bake() {
        System.out.println("Chicago style pizza is baking");
        try { Thread.sleep(5000); } catch (InterruptedException e) { }
        System.out.println("Chicago style pizza is baked");
    }

    @Override
    public void cut() {
        System.out.println("Chicago style pizza is cut");
    }

    @Override
    public void deliver() {
        System.out.println("Chicago style pizza is delivered");
    }
}
