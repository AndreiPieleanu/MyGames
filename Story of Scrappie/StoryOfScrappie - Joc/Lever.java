import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lever here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lever extends SimpleObjects
{
    /**
     * Act - do whatever the Lever wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private final int dim = 20;
    private GreenfootImage i = new GreenfootImage("lever.png");
    public Lever(){

        i.scale(dim*i.getWidth()/100, dim*i.getHeight()/100);
        setImage(i);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
