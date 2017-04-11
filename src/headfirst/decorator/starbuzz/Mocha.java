package headfirst.decorator.starbuzz;

public class Mocha extends CondimentDecorator{
  Beverage beverage;
  String description="Mocha";
  
  public Mocha(Beverage b){
    this.beverage=b;//Mocha가 만들어짐과 동시에  생성되므로 강한 has-a 관계 
  }//미리 올려두면  실행시점 후에는 빨라짐
  
  public String getDescription(){
    return beverage.getDescription()+"adding Mocha ";//beverage에 mocha를 decorating했다.
  }
  
  public double cost(){
    return beverage.cost() + .20;
  }
}