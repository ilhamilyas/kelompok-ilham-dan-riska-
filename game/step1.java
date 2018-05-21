import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class step1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class step1 extends World
{

    /**
     * Constructor for objects of class step1.
     * 
     */
    public step1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        
        addObject (new back(), 80,440);
        addObject (new next(), 720,440);
    }
}
