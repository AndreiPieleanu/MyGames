import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CloseIcon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CloseIcon extends Actor
{
    /**
     * Act - do whatever the CloseIcon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World goToWorld = null;
    public CloseIcon(){
        
    }
    public CloseIcon(World w){
        if(goToWorld == null){
            goToWorld = w;
        }
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(goToWorld);
        }
        // Add your action code here.
    }    
}
