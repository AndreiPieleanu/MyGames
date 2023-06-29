import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Dolphin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dolphin extends Decorations
{
    /**
     * Act - do whatever the Dolphin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    List<String> animationList = new ArrayList<>();
    int frame, con, timer, initialTimer;
    boolean checkRange = true;
    public Dolphin(){
        getImage().setTransparency(0);
        for(int i=0;i<8;i++){
            animationList.add("decorations/dolphin" + (i+1) + ".png");
        }
        frame = 0;
        con = 6;
    }
    public void setTimer(int initialTimer){
        this.initialTimer = initialTimer;
        timer = this.initialTimer;
    }
    public int getInitialTimer(){
        return this.initialTimer;
    }
    private boolean checkRangeToSpawn(){
        List list = getObjectsInRange(20, Ships.class);
        for (Object object : list) {
            if (object instanceof EnemyBoats || object instanceof boat){
                timer = initialTimer;
                return false;
            }
        }
        timer = initialTimer;
        return true;
    }
    private void animate(){
        frame++;
        if(frame <= 8*con){
            
            if(frame<con){
                setImage(animationList.get(0));
            }
            if(frame>=con && frame<2*con){
                setImage(animationList.get(1));
            }

                    if(frame>=2*con && frame<3*con){
                        setImage(animationList.get(2));
                    }
                    if(frame>=3*con && frame<4*con){
                        setImage(animationList.get(3));
                    }
                    if(frame>=4*con && frame<5*con){
                        setImage(animationList.get(4));
                    }
                    if(frame>=5*con && frame<6*con){
                        setImage(animationList.get(5));
                    }
                    if(frame>=6*con && frame<7*con){
                        setImage(animationList.get(6));
                    }
                    if(frame>=7*con && frame<8*con){
                        setImage(animationList.get(7));
                    }
           getImage().scale(30*getImage().getWidth()/100, 30*getImage().getHeight()/100);
        }
        else{
            //getWorld().removeObject(this);
            getImage().setTransparency(0);
            timer = -1;
            frame = 0;
        }
                    
    }
    public void act() 
    {
        
        if(timer != 0)
            timer--;
        if(timer == 0){
            if(checkRange)
                animate();
            //Greenfoot.stop();
        }
        if(timer<=-500){
            setLocation(new Random().nextInt(100) + getX() - new Random().nextInt(100), new Random().nextInt(100) + getY() - new Random().nextInt(100));
            checkRange = checkRangeToSpawn();
        }
        // Add your action code here.
    }  
    
}
