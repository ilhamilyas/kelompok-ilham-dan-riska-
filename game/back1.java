import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class back1 extends Actor
{
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new step1());
        }
    }    
}
