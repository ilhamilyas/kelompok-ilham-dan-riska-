import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class latar extends World
{
    skor Skor = new skor("skor: "); 
    private int jeda=0;
    public latar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(600, 400, 1,false);
        addObject(Skor,565,20);
        
              
        addObject (new pesawat(), 100,200);
      
    }
    public void act()
    {
        if(jeda>0)jeda--;
        else jeda=100;
        if(jeda==1){
        int randomHeight=Greenfoot.getRandomNumber (getHeight());
        addObject (new musuh(-(Greenfoot.getRandomNumber (90))), getWidth()+100,randomHeight);
        }
    }
    public void tambah(){
        Skor.add(5);
    }     
   
}
