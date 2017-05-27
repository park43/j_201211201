package headfirst.iterator.dinermerger.after;

import headfirst.iterator.dinermerger.before.MenuItem;

public class DinerMenu{
  MenuItem[] menuItems;
  static final int MAX_ITEMS=3;
  int numberOfItems=0;
  public DinerMenu(){
    menuItems=new MenuItem[MAX_ITEMS];
    addItem("BLT", "Bacon, Lettuce, Tomato", true, 2.99);
    addItem("BLT 2", "Bacon 2, Lettuce 2, Tomato 2", true, 2.99);
  }
  
  public void addItem(String n, String d, boolean v, double p){
    MenuItem m= new MenuItem(n,d,v,p);
    menuItems[numberOfItems]=m;
    numberOfItems++;
  }
  
  public MenuItem[] getMenuItems(){
    return menuItems;
  }
  public Iterator createIterator(){
    return new DinerMenuIterator(menuItems);//DinerMenuIterator는 직접 만들지않고 DinerMenu에서 만들어지면 생성한다.
                                                                        //Iterator iter = d.createIterator();사용 
  }
}