import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LaserBattery here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaserBattery extends GoodObjects
{
    /**
     * Act - do whatever the LaserBattery wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public LaserBattery(){
        GreenfootImage i = new GreenfootImage("LaserBattery.png");
        i.scale(30*i.getWidth()/100, 30*i.getHeight()/100);
        setImage(i);
    }
    
    public void act() 
    {

        // Add your action code here.
    }    
}
