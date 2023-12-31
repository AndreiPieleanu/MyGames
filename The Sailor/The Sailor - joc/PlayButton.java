import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayButton extends Button
{
    /**
     * Act - do whatever the PlayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseMoved(this))
            setImage("play2.png");
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
            setImage("play1.png");
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new SelectLevel());
        }
    }  
}
