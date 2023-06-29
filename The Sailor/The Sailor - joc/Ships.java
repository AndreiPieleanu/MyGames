import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ships here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ships extends Actor
{
    /**
     * Act - do whatever the Ships wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void turnTheShipAtAngles(Ships s){
        /*if(eb.getRotation() >= 315 && eb.getRotation() <= 45){
            System.out.println("dreapta");
        }
        if(eb.getRotation() >= 135 && eb.getRotation() <= 235){
            System.out.println("stanga");
        }*/
        if(s.getRotation() > 235 && s.getRotation() < 315){
            System.out.println("intors");
        }
        else{
            System.out.println("in fata");
        }
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
