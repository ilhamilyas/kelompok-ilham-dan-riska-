import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class next extends Actor
{
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new step2());
            
        }
    }    
}
