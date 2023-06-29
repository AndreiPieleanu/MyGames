import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lock extends LockUnlock
{
    /**
     * Act - do whatever the Lock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Lock(){
        GreenfootImage i = getImage();
        i.scale(25*i.getWidth()/100, 25*i.getHeight()/100);
        setImage(i);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
