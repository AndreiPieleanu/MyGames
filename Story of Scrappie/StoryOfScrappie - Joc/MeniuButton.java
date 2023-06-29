import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MeniuButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MeniuButton extends Buttons
{
    /**
     * Act - do whatever the MeniuButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public MeniuButton(){
        setImage(new GreenfootImage("Meniu", 30, 
        Color.BLACK, Color.WHITE));
    }
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
            Greenfoot.setWorld(new StoryofScrappie());
        // Add your action code here.
    }    
}
