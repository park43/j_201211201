package headfirst.decorator.starbuzz;

public class StarbuzzCoffee {
  
  public static void main(String args[]) {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + " $" + beverage.cost());//아무것도  섞지않았으므로 espresso가격만 책정
    
    Beverage beverage2 = new DarkRoast();
    beverage2 = new Mocha(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);
    System.out.println(beverage2.getDescription() + " $" + beverage2.cost());//DarkRoast에 2Mocha 1Whip을 섞은 가격
    
    Beverage beverage3 = new HouseBlend();
    beverage3 = new Soy(beverage3);
    beverage3 = new Mocha(beverage3);
    beverage3 = new Whip(beverage3);
    System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    
    //카라멜 마끼아토 -  syrup  whip milk  espresso
    Beverage beverage4 = new Espresso();
    beverage4 = new Whip(beverage4);
    beverage4 = new Milk(beverage4);
    beverage4 = new Syrup(beverage4);
    System.out.println("카라멜 마끼아토 : "  + beverage4.getDescription() + "$" + beverage4.cost());
  }
}