package headfirst.singleton.chocolate;

public class ChocolateController{
  public static void main(String args[]){
    Chocolateboiler boiler = Chocolateboiler.getInstance();
    boiler.fill();
    boiler.boil();
    boiler.drain();
    
    Chocolateboiler boiler2 = chocolateBoiler.getInstance();
  }
}