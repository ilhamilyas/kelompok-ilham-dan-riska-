import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class peluru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class peluru extends Actor
{
    private boolean toRemove=false;
    private int vx=3;
    public void addedToWorld(World latar)
    {
        GreenfootImage image=new GreenfootImage(30,10);
        image.setColor(Color.YELLOW);
        image.drawLine(0,5,image.getWidth()-1,5);
        setImage(image);
        
    }
    public void act() 
    {
       if(!toRemove){
        setLocation(getX()+vx,getY());
        if(getX()>getWorld().getWidth()+200)toRemove=true;
        }
        else
        {
            getWorld().removeObject(this);
        }
    }    
}