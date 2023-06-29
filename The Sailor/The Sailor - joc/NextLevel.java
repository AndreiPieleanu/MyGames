import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class NextLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextLevel extends Decorations
{
    /**
     * Act - do whatever the NextLevel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img = new GreenfootImage("decorations/advance.png");
    private int currentLevel;
    private List<Integer> nextLevels;
    public NextLevel(int currentLevel, List<Integer> nextLevels){
        img.scale(30*img.getWidth()/100, 30*img.getHeight()/100);
        setImage(img);
        this.nextLevels = nextLevels;
        this.currentLevel = currentLevel;
    }
    private void collision(){
        Actor a = getOneIntersectingObject(boat.class);
        if(a != null){
            advanceToNextLevel();
            Greenfoot.setWorld(new FinishedLevel());
        }
    }
    private void advanceToNextLevel(){
        if(!nextLevels.isEmpty()){
            for(int i=0;i<nextLevels.size();i++){
                boatProperties.niveluriTerminate[i] = 1;
            }
        }
    }
    
    public void act() 
    {
        collision();
        // Add your action code here.
    }    
}
