package headfirst.singleton.chocolate;

public class ChocolateBoiler{
  
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler uniqueInstance;
  private static int numCalled=0;
  
  private ChocolateBoiler(){
    empty = true;
    boiled = false;
  }
  
  public static ChocolateBoiler getInstance(){
    if(uniqueInstance == null){
      System.out.println("Creating unique instance of Chocolate Boiler");
      uniqueInstance = new ChocolateBoiler();
    }
    System.out.println("Returning instance of chocolate Boiler");
    System.out.println("number called"+numCalled++);
    return uniqueInstance;
  }
  
  public void fill(){
    if(isEmpty()){
      System.out.println("it is now empty and is being filled...");
      empty = false;
      boiled = false;
    }
  }
  public void drain(){
        if(!isEmpty() && isBoiled()){
      empty = true;
    }
  }
  
  public void boil(){
    if(!isEmpty() && !isBoiled()){
      boiled = true;
    }
  }
  
  public boolean isEmpty(){
   return empty; 
  }
  public boolean isBoiled(){
    return boiled;
  }
}