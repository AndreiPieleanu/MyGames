import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UpgradeHull here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UpgradeHull extends Icons
{
    /**
     * Act - do whatever the UpgradeHull wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public UpgradeHull(){
        super.modifyImage();
    }
    public void act() 
    {
        super.pressOnThis("Hull");
        // Add your action code here.
    }    
}
