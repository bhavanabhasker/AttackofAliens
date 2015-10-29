import greenfoot.*;

/**
 * Write a description of class AlienWord here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlienWord extends World
{

    /**
     * Constructor for objects of class AlienWord.
     * 
     */
    public AlienWord()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    public void act() {
     if(Greenfoot.getRandomNumber(1000) < 20) 
        {
          Enemy e = new Enemy();
          addObject(e,Greenfoot.getRandomNumber(getWidth()-20)+10,-30);
        }
    }
}
