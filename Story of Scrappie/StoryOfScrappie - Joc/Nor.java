import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Nor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nor extends SimpleObjects
{
    /**
     * Act - do whatever the Nor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage i = new GreenfootImage("Nor.png"); 
    int speed;
    Random r = new Random();
    //creeaza un nor si de fiecare data cand atinge limitele hartii, modifica-i coordonatele,
    //dimensiunea si viteza random
    public Nor(){
        i.scale((r.nextInt(15)+40)*i.getWidth()/100, (r.nextInt(15)+40)*i.getHeight()/100);
        editTheCloud();
        setImage(i);
        speed = new Random().nextInt(4)+1;
    }
    private void move(){
        setLocation(getX() + speed, getY());
        if(getX() >= getWorld().getWidth()){
            setLocation(r.nextInt(20)-1000, r.nextInt(50)+80);
            editTheCloud();
        }
    }
    private void editTheCloud(){
        speed = r.nextInt(4)+1;
    }
    public void act() 
    {
        move();
        // Add your action code here.
    }    
}
