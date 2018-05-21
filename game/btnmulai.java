import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class btnmulai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class btnmulai extends Actor
{
    /**
     * Act - do whatever the btnmulai wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new step1());
        }
    }    
}
