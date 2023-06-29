import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShopButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShopButton extends Buttons
{
    /**
     * Act - do whatever the ShopButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ShopButton(){
        setImage(new GreenfootImage("Magazin", 30, 
        Color.BLACK, Color.WHITE));
    }
    public void act() 
    {
       if(Greenfoot.mousePressed(this))
            Greenfoot.setWorld(new Magazin());
    }    
}
