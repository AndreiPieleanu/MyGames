import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class info here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class info extends Actors
{
    /**
     * Act - do whatever the info wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public info()
    {
        GreenfootImage newImg = getImage();
        int new_Height = (int)30*newImg.getHeight()/100;
        int new_Width = (int)40*newImg.getWidth()/100;
        newImg.scale(new_Height,new_Width);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
