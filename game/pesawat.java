import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pesawat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pesawat extends Actor
{
    /**
     * Act - do whatever the pesawat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        mover(); //call a method
    }    
    public void mover()
    {
        if (Greenfoot.isKeyDown("Up"))
        {
            setLocation(getX(),getY()-10);
        }
        if (Greenfoot.isKeyDown("Down"))
        {
             setLocation(getX(),getY()+10);
            }
}
}
