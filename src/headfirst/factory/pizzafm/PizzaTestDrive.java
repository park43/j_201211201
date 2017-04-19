package headfirst.factory.pizzafm;

public class PizzaTestDrive { 
  
  public static void main(String[] args) {
    
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore smStore = new SMPizzaStore();
    
    Pizza pizza = smStore.orderPizza("potato");
    System.out.println("Park ordered a " + pizza.getName() + "\n");
    
  }
}