import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class latar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class latar extends World
{
    skor Skor = new skor("skor: "); 
    private int jeda=0;
    public latar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(600, 400, 1,false);
        addObject(Skor,300,20);
        
              
        addObject (new pesawat(), 100,200);
      
    }
    public void act()
    {
        if(jeda>0)jeda--;
        else jeda=50;
        if(jeda==1){
        int py=Greenfoot.getRandomNumber (getHeight());
        addObject (new musuh(-(Greenfoot.getRandomNumber (3))), getWidth()+100,py);
        }
    }
    public void tambah(){
        Skor.add(5);
    }     
   
}
