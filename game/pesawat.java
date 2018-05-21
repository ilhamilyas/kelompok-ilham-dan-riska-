import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pesawat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pesawat extends Actor
{
   private int jeda=0;
   private boolean toRemove=false;
   int skor;
   
    public void act() 
    {
       
             
         tembak();
        if (Greenfoot.isKeyDown("up")){
        setLocation(getX(),getY()-5);
        }
        if (Greenfoot.isKeyDown("down")){
        setLocation(getX(),getY()+5);
        }
        if (Greenfoot.isKeyDown("left")){
        setLocation(getX()-5,getY());
        }
        if (Greenfoot.isKeyDown("right")){
        setLocation(getX()+5,getY());
        }
        //if(jeda>0)jeda--;
        //if(jeda==1)getWorld().addObject(new peluru(), getX()+100,getY());
        //if(jeda==0)jeda=5;
     
     if (isTouching(musuh.class)){
        Greenfoot.stop ();
        getWorld().addObject(new gagal(),
        getWorld().getWidth()/2,
        getWorld().getHeight()/2);
        getWorld().addObject(new playagain(),
        getWorld().getWidth()/2,
        getWorld().getHeight()/1-150);
        
        
        }

    }
   
    public void tembak () {
            if (Greenfoot.isKeyDown("space")){
            if(jeda>0)jeda--;
            if(jeda==1) getWorld().addObject(new peluru(),getX()+50,getY());
<<<<<<< HEAD
            if(jeda==0)jeda=5;
            Greenfoot.playSound("tembak0.mp3");
=======
            if(jeda==0)jeda=20;
            Greenfoot.playSound("tembakan.mp3");
>>>>>>> 6242bc4b8b58d6fccbb1d1dab83845be5f5d53e8
        }
    }
    

}
