import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Barrier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barrier extends OtherIcons
{
    /**
     * Act - do whatever the Barrier wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage img = new GreenfootImage("barrier.png");
    
    public Barrier(){
        img.setTransparency(0);
        setImage(img);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
