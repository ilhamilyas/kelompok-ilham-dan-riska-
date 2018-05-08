import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

<<<<<<< HEAD:game/ledakan.java

public class ledakan extends Actor
{
   private int jeda=0;
   public void addToWorld(World Latar)
   {
       GreenfootImage image=new GreenfootImage(100,100);
        image.setColor(Color.WHITE);
        image.fillOval(20,20,image.getWidth()-20,image.getHeight()-20);
        image.fillOval(20,20,image.getWidth()-41,image.getHeight()-41);
        setImage(image);
        jeda=0;
   }
   public void act() 
    {
        if(jeda>0)jeda--;
        else getWorld().removeObject(this);
=======
/**
 * Write a description of class ledakan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ledakan extends Actor
{
    /**
     * Act - do whatever the ledakan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
<<<<<<< HEAD:Selamatkan Sang Kekasih/pipabawah.java
         setLocation(getX()-3,getY());

  
>>>>>>> parent of fc6a298... pertama:Selamatkan Sang Kekasih/pipabawah.java
=======
>>>>>>> b5d137bcb77977fd155f60c56efed87e3ba8bb17:game/ledakan.java
    }    
}
