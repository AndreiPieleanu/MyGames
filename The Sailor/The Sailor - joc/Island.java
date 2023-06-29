import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Island here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Island extends Decorations
{
    /**
     * Act - do whatever the Island wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img;
    public Island(int type, int p1, int p2){
        img = new GreenfootImage("decorations/island" + type + ".png");
        img.scale(p1*img.getWidth()/100, p2*img.getHeight()/100);
        setImage(img);
    }
    private void boatCollision(){
        Actor boat = getOneIntersectingObject(boat.class);
        if(boat != null){
            
        }
    }
    public void act() 
    {
        boatCollision();
        // Add your action code here.
    }    
}
