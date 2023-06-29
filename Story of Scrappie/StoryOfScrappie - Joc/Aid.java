import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aid extends GoodObjects
{
    /**
     * Act - do whatever the Aid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage i = new GreenfootImage("aid.png"); 
    public Aid(){
        i.scale(25*i.getWidth()/100, 25*i.getHeight()/100);
        setImage(i);
    }
    private void restoreHealth(){
        Actor a = getOneIntersectingObject(Scrappie.class);
        if(a != null){
            Scrappie.hp = Scrappie.maxHP;
            getWorld().removeObject(this);
        }
    }
    public void act() 
    {
        restoreHealth();
        // Add your action code here.
    }    
}
