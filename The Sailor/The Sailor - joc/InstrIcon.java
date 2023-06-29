import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstrIcon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstrIcon extends Decorations
{
    /**
     * Act - do whatever the InstrIcon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public InstrIcon(GreenfootImage img, int p1, int p2){
        img.scale(p1*img.getWidth()/100, p2*img.getHeight()/100);
        setImage(img);
    }
    public String getXY(){
        return this.getX() + " " + this.getY();
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
