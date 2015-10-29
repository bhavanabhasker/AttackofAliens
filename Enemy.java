import greenfoot.*;

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public void act() 
    {
        
       setLocation(getX() , getY() + 1);
       Actor alien;
       alien = getOneObjectAtOffset(0,0,Alien1.class);
       if ( alien != null)
       {
            World world;
            world = getWorld();
            world.removeObject(alien);
        }
    }    
}
