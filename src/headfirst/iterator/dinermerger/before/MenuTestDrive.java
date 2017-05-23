package headfirst.iterator.dinermerger.before;

import java.util.*;

public class MenuTestDrive{
  public static void main(String args[]){
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
    
    printMenu();
  }
  public static void printMenu(){
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
    
    ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();//ArrayList
    
    for(int i = 0; i< breakfastItems.size();i++){
      MenuItem menuItem = (MenuItem)breakfastItems.get(i);
      System.out.print(menuItem.getName());
      System.out.print("\t\t" + menuItem.getPrice());
      System.out.println("\t"+menuItem.getDescription());
    }
    
    MenuItem[] lunchItems = dinerMenu.getMenuItems();//Array
    
    for(int i = 0 ; i<lunchItems.length; i++){
      MenuItem menuItem = lunchItems[i];
      System.out.print(menuItem.getName());
      System.out.print("\t\t"+menuItem.getPrice());
      System.out.println("\t"+menuItem.getDescription());
    }
  }
}
