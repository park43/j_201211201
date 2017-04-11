package headfirst.decorator.starbuzz;

public class Mocha extends CondimentDecorator{
  Beverage beverage;
  String description="Mocha";
  
  public Mocha(Beverage b){
    this.beverage=b;//Mocha�� ��������� ���ÿ�  �����ǹǷ� ���� has-a ���� 
  }//�̸� �÷��θ�  ������� �Ŀ��� ������
  
  public String getDescription(){
    return beverage.getDescription()+"adding Mocha ";//beverage�� mocha�� decorating�ߴ�.
  }
  
  public double cost(){
    return beverage.cost() + .20;
  }
}