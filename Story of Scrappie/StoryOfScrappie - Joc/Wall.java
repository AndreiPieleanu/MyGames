import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Obstacles
{
    /**
     * Act - do whatever the Wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img = new GreenfootImage("wall.jpg");
    private Actor a;
    public Wall(){
        GreenfootImage i = getImage();
        img.scale(150*i.getWidth()/100, 300*i.getHeight()/100);
        setImage(img);
    }
    
    int distance = 0;
    public void moveUpDown(){
        distance++;
        a = getOneIntersectingObject(Scrappie.class);
        if(distance<=60){
            if(a!=null){
                Scrappie s = (Scrappie) a;
                s.setLocation(s.getX(), s.getY() - 1);
            }
            setLocation(getX(), getY()-1);
        }
        if(distance>60 && distance<=150)
            setLocation(getX(), getY());
        if(distance>150 && distance<=340){
            if(a!=null){
                Scrappie s = (Scrappie) a;
                s.setLocation(s.getX(), s.getY()+1);
            }
            setLocation(getX(), getY()+1);
        }
        if(distance>340 && distance <430)
            setLocation(getX(), getY());
        if(distance > 430 && distance<=560){
            if(a!=null){
                Scrappie s = (Scrappie) a;
                s.setLocation(s.getX(), s.getY() - 1);
            }
            setLocation(getX(), getY()-1);
        }
        
        if(distance == 561){
            distance = 0;
            return;
        }

    }
    boolean weirdWall;
    public void setWeirdWall(boolean weirdWall){
        this.weirdWall = weirdWall;
    }
    public boolean getWeirdWall(){
        return this.weirdWall;
    }
    public void act() 
    {
        if(weirdWall)
            moveUpDown();
        // Add your action code here.
    }    
}
