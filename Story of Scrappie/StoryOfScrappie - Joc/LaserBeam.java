import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LaserBeam here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaserBeam extends GoodObjects
{
    /**
     * Act - do whatever the LaserBeam wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   private int direction, speed, damage = 5;
   GreenfootImage i = new GreenfootImage("laserbeam.png");
   //adauga un laser pe harta in functie de viteza si coordonate
    public LaserBeam(int dir, int speed){

        i.scale(8*i.getWidth()/100, 8*i.getHeight()/100);
        setImage(i);
        direction = dir;
        this.speed = speed;
    }
    
    public void deleteLaserBeam(){
        Actor a = getOneIntersectingObject(Wall.class);
        Actor b = getOneIntersectingObject(WallPereteV.class);
        Actor c = getOneIntersectingObject(WallPereteO.class);
        if(a!=null || b!=null || c!=null){
            getWorld().removeObject(this);
        }
        
        if(getWorld()!=null)
            if (isAtEdge()){
                getWorld().removeObject(this);
            }
    }
    
    public void act() 
    {
        setRotation(direction);
        move(speed);
        deleteLaserBeam();
        // Add your action code here.
    }    
}
