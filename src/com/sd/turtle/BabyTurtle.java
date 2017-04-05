package com.sd.turtle;

import java.util.Observable;
import java.util.Observer;
import java.awt.geom.Point2D.Double;
import ch.aplu.turtle.*;
import java.util.ArrayList;

public class BabyTurtle extends Observable{
  
  Turtle baby;
  ArrayList<Observer> obs;
  Double myCurpos;
  
  public void addObserver(Observer o){
    obs.add(o);
  }
  
  public void notifyObservers(){
    for(Observer o:obs)
    o.update(this,1);
  }
  
  protected void setChanged(){
    myCurpos = baby.getPos();
   // notyfyObservers();
  }
  
  public void move(int x, int y){
    baby.moveTo(x,y);
  }
}
    