import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WallPereteO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WallPereteO extends Obstacles
{
    /**
     * Act - do whatever the WallPereteO wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img = new GreenfootImage("wall.jpg");
    public WallPereteO(){
        GreenfootImage i = getImage();
        img.scale(20*i.getWidth()/100, 3*i.getHeight()/100);
        setImage(img);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
