import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level3 extends LockUnlock
{
    /**
     * Act - do whatever the level3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public level3(){
        setImage(new GreenfootImage("Nivelul 3", 25, 
        Color.BLACK, Color.WHITE));
    }
    public void act() 
    {
        if(Greenfoot.mousePressed(this)){
            SelectLevel.levelSituation = 3;
            Greenfoot.setWorld(new Nivel3());

        }
    }    
}
