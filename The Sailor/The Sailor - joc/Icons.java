import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Icons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Icons extends Actor
{
    /**
     * Act - do whatever the Icons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dimensiune = 50;
    int ok=0;
    void modifyImage(){
        getImage().scale((dimensiune-10)*getImage().getWidth()/100, dimensiune*getImage().getHeight()/100);
        getImage().setTransparency(110);
    }
    void pressOnThis(String message){
        if(Greenfoot.mouseClicked(this)){
            if(getWorld().getObjects(ShopIcon.class).size() < 1){
                //getWorld().addObject(new ShopIcon(message), getWorld().getWidth()/2, getWorld().getHeight()/2);
                Greenfoot.setWorld(new ShopIcons(message));
            }
        }
        
        
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
