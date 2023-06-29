import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RestartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RestartButton extends Buttons
{
    /**
     * Act - do whatever the RestartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public RestartButton(){
        setImage(new GreenfootImage("Restart", 30, 
        Color.WHITE, Color.BLACK));
    }
    public void act() 
    {
        if(Greenfoot.mousePressed(this)){
            Greenfoot.setWorld(new StoryofScrappie());
            SelectLevel.levelSituation = 1;
            SelectLevel.levelsUnlocked = 1;
        }
        // Add your action code here.
    }    
}
