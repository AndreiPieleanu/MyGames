import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WallPereteV here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WallPereteV extends Obstacles
{
    /**
     * Act - do whatever the WallPereteV wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img = new GreenfootImage("wall.jpg");
    public WallPereteV(){
        GreenfootImage i = getImage();
        img.scale(3*i.getWidth()/100, 20*i.getHeight()/100);
        setImage(img);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
