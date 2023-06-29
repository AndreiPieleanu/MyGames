import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MeleeIcon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MeleeIcon extends Decorations
{
    /**
     * Act - do whatever the MeleeIcon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static GreenfootSound sword = new GreenfootSound("Sword_SFX.mp3");
    private GreenfootImage img = new GreenfootImage("decorations/meleeAttack.png");
    public MeleeIcon(){
        img.scale(getImage().getWidth()*200/100, getImage().getHeight()*200/100);
        setImage(img);
    }
    private int transparency = 255;
    private boolean capat = false;
    
    public void act() 
    {
        if(boatProperties.sunetInLupte){
            sword.setVolume(40);
            sword.play();
        }
        img.setTransparency(transparency);
        if(transparency > 0 && !capat)
            transparency-=5;
        if(transparency == 0){
            capat = true;
        }
        if(capat && transparency < 255)
            transparency+=5;
        if(transparency == 255)
            capat = false;
        // Add your action code here.
    }    
}
