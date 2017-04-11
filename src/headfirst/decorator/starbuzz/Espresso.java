package headfirst.decorator.starbuzz;

public class Espresso extends Beverage{
        
    public Espresso(){
      description="Esspresso ";
    }
  //public String getDescription(){
  //  return description;
  //}
  
    public double cost(){
      return 1.9;
    }
}