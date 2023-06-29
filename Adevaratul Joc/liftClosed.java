import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class liftClosed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class liftClosed extends Actors
{
    public liftClosed()
    {
        GreenfootImage newImg = getImage();
        int new_Height = (int)70*newImg.getHeight()/100;
        int new_Width = (int)90*newImg.getWidth()/100;
        newImg.scale(new_Height,new_Width);
    }
    /**
     * Act - do whatever the liftClosed wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
