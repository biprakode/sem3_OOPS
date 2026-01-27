package Assignmen1.q6;

public class NewYorkPizza extends Pizza {

    NewYorkPizza() {
        dough = "High Protein, Bread Flour";
        toppings = "Tomato Sauce, Mozzarella Cheese, Pepperoni";
    }
    
    public String GetDough() {
        return dough;
    }
    
    public String GetToppings() {
        return toppings;
    }
    
    @Override
    public void bake() {
        System.out.println("New York style pizza is baking");
        try { Thread.sleep(5000); } catch (InterruptedException e) { }
        System.out.println("New York style pizza is baked");
    }

    @Override
    public void cut() {
        System.out.println("New York style pizza is cut");
    }

    @Override
    public void deliver() {
        System.out.println("New York style pizza is delivered");
    }
}
