package headfirst.decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage{
//  Beverage.b;
 // public condimentDecorator(Beverage b){
  //  this.b=b;
 // }
 // String description="Unknown Beverage";
  
  public abstract String getDescription();//다른 클래스에서 사용위해 딜레이시킴
  
 // public abstract double cost();
}