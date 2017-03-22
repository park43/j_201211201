package headfirst.strategy;

public class MallardDuck extends Duck{
  
  public MallardDuck(){
    setFlyBehavior (new FlyWithWings());
  }
  public void display(){
    System.out.println("mallard...");
  }
}