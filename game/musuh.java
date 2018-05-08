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
    public void addedToWorld(World latar)
    {
        setRotation(180);
    }
    public void move()
    {
        setLocation(getX()+vx,getY());
        if(getX()<-200)toRemove=true;
    }
<<<<<<< HEAD
    public void ledakan()
    {
        for(int i=0;i<10;i++){
        int px=-20+Greenfoot.getRandomNumber(40);
        int py=-20+Greenfoot.getRandomNumber(40);
        getWorld().addObject(new pecahan(getImage()),getX()+px,getY()+py);
        }
        getWorld().addObject(new ledakan(),getX(),getY());
        toRemove=true;
    }
=======
>>>>>>> b5d137bcb77977fd155f60c56efed87e3ba8bb17

    public void act() 
    {
        if(!toRemove)move();
        else getWorld().removeObject(this);
    }    
}
