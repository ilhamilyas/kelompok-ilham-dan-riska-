import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pesawat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pesawat extends Actor
{
   private int jeda=0;
   private boolean toRemove=false;
    public void act() 
    {
        if (Greenfoot.isKeyDown("up")){
        setLocation(getX(),getY()-5);
        }
        if (Greenfoot.isKeyDown("down")){
        setLocation(getX(),getY()+5);
        }
        if (Greenfoot.isKeyDown("left")){
        setLocation(getX()-5,getY());
        }
        if (Greenfoot.isKeyDown("right")){
        setLocation(getX()+5,getY());
        }
        if(jeda>0)jeda--;
        if(jeda==1)getWorld().addObject(new peluru(), getX()+100,getY());
        if(jeda==0)jeda=5;
    }    
}
