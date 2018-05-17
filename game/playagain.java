import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class playagain extends Actor
{
    
    public void act(String buttonName) 
    {
    if (Greenfoot.mouseClicked(this)){
        setImage(buttonName +".png");
        Greenfoot.delay(5);
        if (buttonName.equalsIgnoreCase("playagain"))Greenfoot.setWorld(new latar());
        
    }    
}
}
