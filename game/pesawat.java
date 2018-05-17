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
<<<<<<< HEAD
        // Add your action code here.
        mover(); //call a method
    }    
    public void mover()
    {
        if (Greenfoot.isKeyDown("Up"))
        {
            setLocation(getX(),getY()-10);
=======
       
             
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
            if(jeda==0)jeda=5;
>>>>>>> 637744871217aca2f65cb05ecfc832e07ae00fa6
        }
        if (Greenfoot.isKeyDown("Down"))
        {
             setLocation(getX(),getY()+10);
            }
}
}
