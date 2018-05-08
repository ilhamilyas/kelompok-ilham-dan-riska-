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
    public void act() 
    {
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
<<<<<<< HEAD:Selamatkan Sang Kekasih/falppy.java
<<<<<<< HEAD:game/pesawat.java
        if(jeda>0)jeda--;
        if(jeda==1)getWorld().addObject(new peluru(), getX()+100,getY());
        if(jeda==0)jeda=5;
   
     if (getOneIntersectingObject(musuh.class)!=null){
        Greenfoot.stop ();
        getWorld().addObject(new gagal(),
        getWorld().getWidth()/2,
        getWorld().getHeight()/2);
        
        }
    }  
    
   
=======
}
>>>>>>> parent of fc6a298... pertama:Selamatkan Sang Kekasih/falppy.java
=======
        if(jeda>0)jeda--;
        if(jeda==1)getWorld().addObject(new peluru(), getX()+100,getY());
        if(jeda==0)jeda=5;
    }    
>>>>>>> b5d137bcb77977fd155f60c56efed87e3ba8bb17:game/pesawat.java
}
