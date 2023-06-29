import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wall extends Actors
{
    /**
     * Act - do whatever the wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public wall()
    {
        GreenfootImage brick_img = getImage();
        int new_Height = (int)300*brick_img.getHeight()/100;
        int new_Width = (int)150*brick_img.getWidth()/100;
        brick_img.scale(new_Height,new_Width);
    }
    public void act() 
    {
        
    } 
}
