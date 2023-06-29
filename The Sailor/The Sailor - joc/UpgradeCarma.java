import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UpgradeCarma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UpgradeCarma extends Icons
{
    /**
     * Act - do whatever the UpgradeCarma wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public UpgradeCarma(){
        super.modifyImage();
    }
    public void act() 
    {
        super.pressOnThis("carma");
        // Add your action code here.
    }    
}
