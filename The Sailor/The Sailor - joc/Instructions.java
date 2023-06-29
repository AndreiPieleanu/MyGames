import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Button
{
    /**
     * Act - do whatever the Instructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Instructions(){
        setImage("decorations/pergament1.png");
    }
    public void act() 
    {
        if (Greenfoot.mouseMoved(this))
            setImage("decorations/pergament2.png");
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
            setImage("decorations/pergament1.png");
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Instructiuni());
        }
        // Add your action code here.
    }    
}
