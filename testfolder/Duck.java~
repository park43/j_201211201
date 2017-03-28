package headfirst.strategy;

public abstract class Duck {
  
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;
  
  public Duck() {
  }
  
  public void setQuackBehavior(Quackbehavior qb){
    quackBehavior = qb;
  }
  public void setFlyBehavior (FlyBehavior fb) {
    flyBehavior = fb;
  }
 
  abstract void display();

  public void performQuack(){
    quackBehavior.quack();
  }
  public void performFly() {
    flyBehavior.fly();
  }
  
  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }
  
}