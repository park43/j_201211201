package headfirst.strategy;

public class miniduckSimulator1{
  public static void main(String args[]){
    
    Duck mallard=new MallardDuck();
    mallard.display();
    mallard.performFly();
    
    Duck model = new ModelDuck();
    model.display();
    model.performFly();
    model.performQuack();
  }
}