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
   
    public void act() 
    {
       gerakPeluru();
 
        }    public void gerakPeluru(){
        int myX=getX();
        int myY=getY();
        int newX=myX+5;
        int newY=myY;
        setLocation(newX,newY); 
        if (isAtEdge()){
            latar mw = (latar) getWorld();
            mw.removeObject(this);
        
        }
    }    
}
