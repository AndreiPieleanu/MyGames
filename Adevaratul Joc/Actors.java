import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Actors here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Actors extends Actor
{
    public void SCOR()
    {
        Scoreboard scoreboard = (Scoreboard)(getWorld().getObjects(Scoreboard.class).get(0));
        scoreboard.addScore();
    }
    public void Speedy(int x)
    {
        for (int y=x;y>=0;y--)
            move(y);
    }
    public void getXY()
    {
        System.out.println( getX()+" "+getY()+" "+getWorld().getWidth()+" "+getWorld().getHeight());
    }
    public void act() 
    {
        
    }      
}
