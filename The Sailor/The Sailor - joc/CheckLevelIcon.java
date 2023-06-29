import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CheckLevelIcon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CheckLevelIcon extends Actor
{
    /**
     * Act - do whatever the CheckLevelIcon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img1 = new GreenfootImage("LevelLock.png");
    private GreenfootImage img2 = new GreenfootImage("LevelOpen.png");
    private int situation, index;
    public CheckLevelIcon(int index, int situation){
        this.index = index;
        this.situation = situation;
        img1.scale(img1.getWidth()*55/100, img1.getWidth()*55/100);
        img2.scale(img2.getWidth()*55/100, img2.getWidth()*55/100);
    }
    public CheckLevelIcon(){
        
    }
    public int returnLevelIndex(){
        return this.index;
    }
    private boolean finishedStatus = false;
    public void setFinishedStatus(boolean finishedStatus){
        this.finishedStatus = finishedStatus;
    }
    public void act() 
    {
        if (Greenfoot.mouseMoved(this)){
            if(situation == 1)
                setImage(img2);
            else
                setImage(img1);
        }
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)){
            if(situation == 1){
                setImage(img1);
            }
            else
                setImage(img1);
        }
        
        if(Greenfoot.mouseClicked(this)){
            if(boatProperties.niveluriTerminate[this.index] != 0)
                Greenfoot.setWorld(new Level(index));
                
            //System.out.println(index);
        }
       // Add your action code here.
    }    
}
