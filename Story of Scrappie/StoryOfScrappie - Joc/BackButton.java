import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackButton extends Buttons
{
    /**
     * Act - do whatever the BackButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BackButton(){
        setImage(new GreenfootImage("Back", 30, 
        Color.BLACK, Color.WHITE));
        
    }
    public void act() 
    {
        if(Greenfoot.mousePressed(this)){
            Greenfoot.setWorld(new SelectLevel());
        }
        // Add your action code here.
    }   
}
