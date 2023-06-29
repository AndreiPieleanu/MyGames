import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Port here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Port extends Decorations
{
    /**
     * Act - do whatever the Port wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img = new GreenfootImage("decorations/port.png");
    public Port(){
        img.scale(50*img.getWidth()/100, 50*img.getHeight()/100);
        setImage(img);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
