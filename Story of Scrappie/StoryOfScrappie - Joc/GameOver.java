import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GameOver(){
        setImage(new GreenfootImage("Game Over!\n Apasa pe restart pentru a incepe din nou", 25, Color.WHITE, Color.BLACK));
        RobotulMalefic.hp=300;
        Scrappie.hp=25;
        Scrappie.speed=2;
        Scrappie.attack=5;
    }
}
