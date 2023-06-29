import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WallColt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WallColt extends Obstacles
{
    /**
     * Act - do whatever the WallColt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img = new GreenfootImage("Colt.png");
    public WallColt(){
        GreenfootImage i = getImage();
        img.scale(10*i.getWidth()/100, 10*i.getHeight()/100);
        setImage(img);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
