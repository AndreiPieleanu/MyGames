import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Chest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chest extends OtherIcons
{
    /**
     * Act - do whatever the Chest wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img = new GreenfootImage("chest.png");
    private int typeOfShip;
    public void setTypeOfShip(int typeOfShip){
        this.typeOfShip = typeOfShip;
    }
    public int getTypeOfShip(){
        return this.typeOfShip;
    }
    public Chest(){
        img.scale(getImage().getWidth()*25/100, getImage().getHeight()*25/100);
        setImage(img);
    }
    int turnRate = 0, timer = 500, transparecyRate = 255;
    private void rotate(){
        turnRate++;
        if(turnRate == 3){
            turn(1);
            turnRate = 0;
        }
    }
    private void disappear(){
        if(transparecyRate > 0){
            img.setTransparency(transparecyRate);
            transparecyRate--;
        }
        else{
            getWorld().removeObject(this);
        }
    }
    public void act() 
    {
        rotate();
        if(timer > 0)
            timer--;
        else
            disappear();
        if(getWorld() != null)
            if(getOneIntersectingObject(boat.class) != null){
                if(getTypeOfShip() == 0){
                    boatProperties.money += (new Random().nextInt(3) + 4)*10;
                    boatProperties.diamonds += new Random().nextInt(3);
                }
                if(getTypeOfShip() == 1){
                    boatProperties.money += (new Random().nextInt(12) + 4)*10;
                    boatProperties.diamonds += new Random().nextInt(5);
                }
                if(getTypeOfShip() == 2){
                    Greenfoot.setWorld(new YouWon());
                }
                for(int i=0;i<getWorld().getObjects(Mesaje.class).size();i++){
                    if(getWorld().getObjects(Mesaje.class).get(i).toString().contains("galbeni")){
                        getWorld().getObjects(Mesaje.class).get(i).update(boatProperties.money + " galbeni ");
                        break;
                    }
                }
                getWorld().removeObject(this);
            }
        // Add your action code here.
    }    
    
}
