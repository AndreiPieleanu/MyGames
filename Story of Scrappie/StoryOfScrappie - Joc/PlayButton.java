import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayButton extends Buttons
{
    /**
     * Act - do whatever the PlayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PlayButton(){
        setImage(new GreenfootImage("Start", 40, 
        Color.BLACK, Color.WHITE));
    }
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
            Greenfoot.setWorld(new SelectLevel());
    }    
}
