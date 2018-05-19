import greenfoot.*;
public class musuh extends Actor
{
    private int vx=0;
    private boolean toRemove=false;    
    public musuh()
    {
        
        
    }
    
    public musuh (int v)
    {
        vx=v;
    }
       
    public void kenatembak(){
        //removeTouching(ufo.class);
        pecah();
        latar my =(latar)getWorld();
        if (isAtEdge())toRemove=false;
        Greenfoot.playSound("ledakan1.mp3");
    }
        
    public void gerak()
    {
        World w = getWorld();
        move(-7);
        if(isAtEdge())
        {
            w.removeObject(this);
        }
    }
    
    public void ledakan()
    {
       
    }
     public void pecah()
    {
        for(int i=0;i<10;i++){
        int px=-20+Greenfoot.getRandomNumber(40);
        int py=-20+Greenfoot.getRandomNumber(40);
        getWorld().addObject(new pecahan(getImage()),getX()+px,getY()+py);
        }
        toRemove=true;
    }

    public void act() 
    {
         latar my =(latar)getWorld();        
        if (isTouching(peluru.class)){
         kenatembak();
        }
        if (isTouching(peluru.class)){
        ((latar)getWorld()).tambah();
        }
        
        if(!toRemove)gerak();
        else getWorld().removeObject(this);
    }    
}
