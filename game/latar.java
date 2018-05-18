  import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class latar extends World
{
    skor Skor = new skor("skor: "); 
    private int jeda=0;
    public latar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

<<<<<<< HEAD
        super(600, 400, 1,true);
        addObject(Skor,300,20);

=======
        super(800, 500, 1,false);
        addObject(Skor,756,20);
        
              
>>>>>>> 637744871217aca2f65cb05ecfc832e07ae00fa6
        addObject (new pesawat(), 100,200);
        prepare();
    }


    public void act()
    {
        if(jeda>0)jeda--;
        else jeda=25;
        if(jeda==1){
            int randomHeight=Greenfoot.getRandomNumber (getHeight());
            addObject (new musuh(-(Greenfoot.getRandomNumber (90))), getWidth()+100,randomHeight);
        }
        
    }

    public void tambah(){}
       Skor.add(5);
<<<<<<< HEAD
    }  

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
=======
    
    }
    
    
   
>>>>>>> 637744871217aca2f65cb05ecfc832e07ae00fa6
}
   

