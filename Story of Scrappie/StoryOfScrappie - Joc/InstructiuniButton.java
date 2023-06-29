import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructiuniButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructiuniButton extends Buttons
{
    /**
     * Act - do whatever the InstructiuniButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public InstructiuniButton(){
        setImage(new GreenfootImage("Instructiuni", 30, 
        Color.BLACK, Color.WHITE));
    }
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
            Greenfoot.setWorld(new Instructiune1());
    }    
}
