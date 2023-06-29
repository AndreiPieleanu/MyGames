import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Optiuni here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Optiuni extends Button
{
    /**
     * Act - do whatever the Optiuni wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img1 = new GreenfootImage("optiuni1.png");
    private GreenfootImage img2 = new GreenfootImage("optiuni2.png");
    public Optiuni(){
        img1.scale(60*img1.getWidth()/100, 60*img1.getHeight()/100);
        img2.scale(60*img2.getWidth()/100, 60*img2.getHeight()/100);
        setImage(img1);
    }
    public void act() 
    {
        if (Greenfoot.mouseMoved(this))
        setImage(img2);
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
        setImage(img1);
        if(Greenfoot.mouseClicked(this)){
            String[] args = {""};
            new Options().main(args);
            
        }
    }  
}
