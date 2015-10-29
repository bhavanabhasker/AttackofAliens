import greenfoot.*;

/**
 * Write a description of class Alien1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien1 extends Actor
{
    /**
     * Act - do whatever the Alien1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        followMouse();
    }   
    
    public void followMouse()
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
        if(mi != null ) setLocation(mi.getX(),mi.getY());
    }
}
