package headfirst.decorator.starbuzz;

public class Syrup extends CondimentDecorator {
  Beverage beverage;
  
  public Syrup(Beverage beverage) {
    this.beverage = beverage;
  }
  
  public String getDescription() {
    return beverage.getDescription() + "adding Syrup ";
  }
  
  public double cost() {
    return .10 + beverage.cost();
  }
}