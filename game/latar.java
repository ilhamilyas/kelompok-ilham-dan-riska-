import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class latar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class latar extends World
{
<<<<<<< HEAD
    skor Skor = new skor("skor: "); 
=======

>>>>>>> b5d137bcb77977fd155f60c56efed87e3ba8bb17
   private int jeda=0;
    public latar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
<<<<<<< HEAD
        super(600, 400, 1,false);
        addObject(Skor,400,20);
        
=======
        super(600, 400, 1,false); 
>>>>>>> b5d137bcb77977fd155f60c56efed87e3ba8bb17
        
        addObject (new pesawat(), 100,200);
      
    }
    public void act()
    {
        if(jeda>0)jeda--;
<<<<<<< HEAD
        else jeda=50;
        if(jeda==1){
        int py=Greenfoot.getRandomNumber (getHeight());
        addObject (new musuh(-(Greenfoot.getRandomNumber (3))), getWidth()+100,py);
        }
    }
    public void tambah(){
        Skor.add(5);
    }
=======
        else jeda=20;
        if(jeda==1){
        int py=Greenfoot.getRandomNumber (getHeight());
        addObject (new musuh(-(Greenfoot.getRandomNumber (3))), getWidth()+200,py);
        }
    }
>>>>>>> b5d137bcb77977fd155f60c56efed87e3ba8bb17
}
