import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LaserBeamInamic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaserBeamInamic extends BadObjects
{
    /**
     * Act - do whatever the LaserBeamInamic wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int direction, speed, damage = 5;
    
    public LaserBeamInamic(int dir, int speed){
        GreenfootImage i = new GreenfootImage("laserbeam.png");
        if(SelectLevel.levelSituation == 1)
            i.scale(8*i.getWidth()/100, 8*i.getHeight()/100);
        if(SelectLevel.levelSituation == 2)
            i.scale(12*i.getWidth()/100, 12*i.getHeight()/100);
        if(SelectLevel.levelSituation == 3)
            i.scale(10*i.getWidth()/100, 10*i.getHeight()/100);
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
        
        if (getWorld()!=null)
            if(getOneIntersectingObject(Scrappie.class) != null){
               Scrappie.hp-=damage;
                getWorld().removeObject(this);
            }
        if(getWorld()!=null)
            if (isAtEdge())
                getWorld().removeObject(this);
                
    }
    public void act() 
    {
        setRotation(direction);
        move(speed);
        deleteLaserBeam();
        // Add your action code here.
    }      
}
