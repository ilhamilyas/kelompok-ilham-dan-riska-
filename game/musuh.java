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

    public void act() 
    {
        if(!toRemove)move();
        else getWorld().removeObject(this);
    }    
}
