package headfirst.iterator.dinermerger.before;

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
}