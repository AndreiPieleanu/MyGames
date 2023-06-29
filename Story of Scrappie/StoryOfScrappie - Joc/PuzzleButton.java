import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PuzzleButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PuzzleButton extends Buttons
{
    /**
     * Act - do whatever the PuzzleButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PuzzleButton(){
        setImage(new GreenfootImage("Am colectat piesele", 30, 
        Color.BLACK, Color.WHITE));
    }
    public void act() 
    {
        if(Greenfoot.mousePressed(this)){
            Greenfoot.setWorld(new Puzzle());
        }
        // Add your action code here.
    }  
}
