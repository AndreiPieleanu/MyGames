import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class EnemyBoats here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

abstract class EnemyBoats extends Actors
{
    /**
     * Act - do whatever the EnemyBoats wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    abstract void moveTrajectory();
    abstract void destroy();
    protected void moveAnimation(String [] animationArray, int con, int frame){
        frame++;
        if(frame<=3*con){
            frame++;
            if(frame<con){
                setImage(animationArray[0]);
            }
            if(frame>=con && frame<2*con){
                setImage(animationArray[1]);
            }
            if(frame>=2*con && frame<3*con){
                setImage(animationArray[2]);
            }
        }
        else{
            frame =  0;
        }
    }
    protected void rotateAndDropItem(Random r, EnemyBoats eb, int n){
        if(r. nextInt(10) <= 2){
            if(n == 0)
                turn(1);
            else
                turn(-1);
        }
        
    }
    public void act() 
    {
        // Add your action code here.
    }    
}