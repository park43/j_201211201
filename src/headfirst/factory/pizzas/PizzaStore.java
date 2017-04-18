package headfirst.factory.pizzas;

public class PizzaStore{
  SimplePizzaFactory f;
  public PizzaStore(SimplePizzaFactory factory){
    this.f=factory;
  }
  
  public Pizza orderPizza(String type){
    Pizza pizza;
    pizza=f.createPizza(type);
    pizza.prepare();
    pizza.cut();
    pizza.box();
    pizza.bake();
    return pizza;
  }
}