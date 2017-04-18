package headfirst.factory.pizzas;

public class PotatoPizza extends Pizza{
  public CheesePizza(){
    name="Potato Pizza";
    dough="Cheese Crust";
    sauce="Marinara Pizza Sauce";
    toppings.add("Fresh Mozzarella");
    toppings.add("Parmassan");
    toppings.add("Potato");
  }
}