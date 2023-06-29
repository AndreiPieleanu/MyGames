import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Enemies extends Actors
{
    /**
     * Act - do whatever the Enemies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    /*
     * clasa abstracta ce descrie proprietatile ce trenuie sa le aiba fiecare inamic
     * pentru a folosi principiul Liskov in totalitate, ar fi trebuit sa o facem interfata, dar stim
     * ca acest lucru e imposibil, deoarece o interfata nu poate mosteni o clasa
     */
    public abstract void animate();
    abstract void takeDamageFromMelee();
    abstract void destroyRobot();
    abstract void objectsCollision();
    abstract void moveLeft();
    abstract void moveRight();
}
