import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExitGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExitGame extends Buttons
{
    /**
     * Act - do whatever the ExitGame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ExitGame(){
        setImage(new GreenfootImage("Iesire", 35, 
        Color.BLACK, Color.WHITE));
    }
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
            Greenfoot.stop();
        // Add your action code here.
    }    
}
