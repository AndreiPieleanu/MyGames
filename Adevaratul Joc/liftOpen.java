import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class liftOpen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class liftOpen extends Actors
{
    public liftOpen()
    {
        GreenfootImage newImg = getImage();
        int new_Height = (int)70*newImg.getHeight()/100;
        int new_Width = (int)90*newImg.getWidth()/100;
        newImg.scale(new_Height,new_Width);
    }
    /**
     * Act - do whatever the liftOpen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor actor = getOneIntersectingObject(maistrul.class);
        if (actor!=null)
        {
            getWorld().removeObject(actor);
        }
        // Add your action code here.
    }    
}
