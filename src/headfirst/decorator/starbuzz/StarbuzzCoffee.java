package headfirst.decorator.starbuzz;

public class StarbuzzCoffee {
  
  public static void main(String args[]) {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + " $" + beverage.cost());//�ƹ��͵�  �����ʾ����Ƿ� espresso���ݸ� å��
    
    Beverage beverage2 = new DarkRoast();
    beverage2 = new Mocha(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);
    System.out.println(beverage2.getDescription() + " $" + beverage2.cost());//DarkRoast�� 2Mocha 1Whip�� ���� ����
    
    Beverage beverage3 = new HouseBlend();
    beverage3 = new Soy(beverage3);
    beverage3 = new Mocha(beverage3);
    beverage3 = new Whip(beverage3);
    System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    
    //ī��� �������� -  syrup  whip milk  espresso
    Beverage beverage4 = new Espresso();
    beverage4 = new Whip(beverage4);
    beverage4 = new Milk(beverage4);
    beverage4 = new Syrup(beverage4);
    System.out.println("ī��� �������� : "  + beverage4.getDescription() + "$" + beverage4.cost());
  }
}