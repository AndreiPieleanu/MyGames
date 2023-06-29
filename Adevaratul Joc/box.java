import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class box here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class box extends Actors
{
    /**
     * Act - do whatever the box wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void moveW()
    {
        setLocation(getX(),getY()-70);
    }
    public void moveA()
    {
        setLocation(getX()-70,getY());
    }
    public void moveS()
    {
        setLocation(getX(),getY()+70);
    }
    public void moveD()
    {
        setLocation(getX()+70,getY());
    }
    public void act() 
    {
        
    }    
}
