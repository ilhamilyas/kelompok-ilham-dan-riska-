import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class step2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class step2 extends World
{

    /**
     * Constructor for objects of class step2.
     * 
     */
    public step2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        
        addObject (new back1(), 80,440);
        addObject (new next1(), 720,440);
        
    }
}
