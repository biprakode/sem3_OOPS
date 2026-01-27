package Assignmen1.q6;

public abstract class Pizza {
	protected String dough = "";
	protected String toppings = "";
	abstract public void bake();
	abstract public void cut();
	abstract public void deliver();
	abstract public String GetDough();
	abstract public String GetToppings();
}
