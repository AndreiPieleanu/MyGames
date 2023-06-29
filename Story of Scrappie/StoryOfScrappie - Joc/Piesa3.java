import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Piesa3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piesa3 extends SimpleObjects
{
    /**
     * Act - do whatever the Piesa3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img = new GreenfootImage("Piesa3.png");
    int x = 0;
    public void act() 
    {
        if(x == 0){
            if(getWorld() != null){
                if(getWorld() instanceof Nivel3){
                    img.scale(13*getImage().getWidth()/100, 13*getImage().getHeight()/100);
                }
                else if (getWorld() instanceof Puzzle)
                    img.scale(getImage().getWidth(), getImage().getHeight());
                setImage(img);
                x = 1;
            }
        }
        
        super.deleteAtCollisionOnce(this);
        // Add your action code here.
    }      
}

