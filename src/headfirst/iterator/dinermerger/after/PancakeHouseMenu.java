package headfirst.iterator.dinermerger.after;

import java.util.ArrayList;
import headfirst.iterator.dinermerger.before.MenuItem;

public class PancakeHouseMenu implements Menu{
  
  ArrayList<MenuItem> menuItems;

  
  public PancakeHouseMenu(){
    menuItems = new ArrayList<MenuItem>();
    addItem("K&B's Pancake Breakfast",  "Pancakes with scrambled eggs, and toast", true, 2.99);
    addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
    addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
    addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
  }
  
  public void addItem(String n, String d, boolean v, double p){
    MenuItem m= new MenuItem(n,d,v,p);
    menuItems.add(m);
  }
  
  public Iterator createIterator(){
    return new PancakeHouseMenuIterator(menuItems);
  }
  
  public ArrayList<MenuItem> getMenuItems(){
    return menuItems;
  }
}