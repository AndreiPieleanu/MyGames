import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShopIcon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShopIcon extends Icons
{
    /**
     * Act - do whatever the ShopIcon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ShopIcon(String text){
        if(text.equalsIgnoreCase("hull")){
            //getWorld().addObject(new UpgradeHull(), 94, 77);
            
        }
        if(getWorld() != null)
            getWorld().addObject(new CloseIcon(), 535, 34);
        System.out.println(getWorld());
    }
    public ShopIcon(){
        getWorld().addObject(new CloseIcon(), 535, 34);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
