import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Actor
{
    private int cutiiTotal = 5;
    private int cutiiPuse = 0;
    /**
     * Act - do whatever the Scoreboard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Flori culese: "+cutiiPuse+"/"+cutiiTotal,24,Color.GREEN,Color.BLACK));
    }  
    public void addScore()
    {
        cutiiPuse++;
        if (cutiiPuse == cutiiTotal)
        {
            World world = getWorld();
            getWorld().removeObjects(getWorld().getObjects(liftClosed.class));
            world.addObject(new liftOpen(),887,413);
        }
    }
}
