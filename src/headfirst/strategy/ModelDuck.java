package headfirst.strategy;

public class ModelDuck extends Duck{

  public ModelDuck(){
    setQuackBehavior(new Quack());
    setFlyBehavior(new FlyRocketPowered());
  }
  public void display(){
    System.out.println("model..");
  }
}