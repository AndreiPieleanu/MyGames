import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text extends Buttons
{

    /**
     * Constructor for objects of class Text.
     * 
     */
    public Text(String s)
    {
        GreenfootImage img = new GreenfootImage(s, 20, Color.BLACK, Color.CYAN);
        setImage(img);
    }
}
