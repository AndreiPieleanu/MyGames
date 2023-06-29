import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Robotel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Robotel1 extends Enemies
{
    /**
     * Act - do whatever the Robotel1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private final int speed = 1;
    private int hp = 10;
    private final int attack = 5;
    private int frame = 0;
    private int frame2 = 0;
    private int deathFrame = 0;
    private int dimensiune;
    private int distanta;
    char stanga_dreapta;
    
    
    private GreenfootImage img1 = new GreenfootImage("Robot1prototip1.png");
    private GreenfootImage img2 = new GreenfootImage("Robot1prototip2.png");
    private GreenfootImage img3 = new GreenfootImage("Robot1prototip3.png");
    private GreenfootImage img4 = new GreenfootImage("Robot1distrus.png"); 
    private GreenfootImage img5 = new GreenfootImage("Robot1distrus2.png");
    
    List<GreenfootImage> images = new ArrayList<>();
    public int getHP(){
        return this.hp;
    }
    public boolean collision(){
        return (getOneIntersectingObject(Wall.class) != null || getOneIntersectingObject(WallPereteV.class) != null || getOneIntersectingObject(WallPereteO.class) != null);
    }
    public void setDistanta(int distanta){
        this.distanta = distanta;
    }
    public int getDistanta(){
        return this.distanta;
    }
    public void setStanga_dreapta(char stanga_dreapta){
        this.stanga_dreapta = stanga_dreapta;
    }
    public char getStanga_dreapta(){
        return this.stanga_dreapta;
    }
    public Robotel1(){
        GreenfootImage i = getImage();
        
        if(SelectLevel.levelSituation!=2){
            dimensiune = 15;
        }
        if(SelectLevel.levelSituation == 2){
            dimensiune = 25;
        }
        img1.scale(dimensiune*i.getWidth()/100, dimensiune*i.getHeight()/100);
        img2.scale(dimensiune*img2.getWidth()/100, dimensiune*img2.getHeight()/100);
        img3.scale(dimensiune*img3.getWidth()/100, dimensiune*img3.getHeight()/100);
        img4.scale(img3.getWidth(), img3.getHeight());
        img5.scale(img3.getWidth(), img3.getHeight());
        setImage(img1);
        
        images.add(img1);
        images.add(img2);
        images.add(img3);
        images.add(img4);
        images.add(img5);
    }
    void objectsCollision(){
        Actor a  = getOneIntersectingObject(LaserBeam.class);

        if(a!=null){
            getWorld().removeObject(a);
            hp-=Scrappie.attack;
            if(hp <= 0){
                setImage(img4);
            }
            
        }
        Actor b = getOneIntersectingObject(Bomba.class);
        if(b!=null){
            Bomba bmb = (Bomba) b;
            if(bmb.getAgressive()){
                hp-=30;
                if(hp <= 0){
                    setImage(img4);
                }
            }
            else{
                if(getStanga_dreapta() == 's'){
                    reverseImages();
                    setStanga_dreapta('d');
                    moveRight();
                }
                else if(getStanga_dreapta() == 'd'){
                    reverseImages();
                    setStanga_dreapta('s');
                    moveLeft();
                }
            }
        }
    }
    void reverseImages(){
        images.stream().map(e -> getReversedImage(e)).count();
    }
    GreenfootImage getReversedImage(GreenfootImage i){
        i.mirrorHorizontally();
        return i;
    }
    boolean once = true;
    void destroyRobot(){
            deathFrame++;
            if(once){
                GreenfootSound boomSound = new GreenfootSound("boom.mp3"); 
                boomSound.setVolume(50);
                boomSound.play();
                once = false;
            }
            if(deathFrame>=1 && deathFrame<100)
                setImage(img4);
            else if (deathFrame>=100 && deathFrame<200){
                setImage(img5);
                return;
            }
            else if (deathFrame == 200){
                getWorld().removeObject(this);
                deathFrame = 0;
                Random r = new Random();
                Scrappie.money+=(r.nextInt(12)+6);
                
                return;
            }
    }
    
    void moveLeft(){
        if(collision()){
            setLocation(getX() + 10*speed, getY());
            reverseImages();
            setStanga_dreapta('d');
            
        }
        else{
            setLocation(getX() - speed, getY());
            
            animate();
        }
    }
    public void animate(){
        frame++;
        if (frame>=1 && frame <= 15){
            setImage(img1);
        }
        else if (frame> 15 && frame<=30){
            setImage(img2);
        }
        else if (frame> 30 && frame<=45){
            setImage(img3);
        }
        else if(frame > 45 && frame <= 60){
            setImage(img2);

        }
        else if (frame>60){
            frame = 0;
            return;
        }
    }
    void moveRight(){
        if(collision()){
            setLocation(getX() - 10*speed, getY());
            reverseImages();
            
            setStanga_dreapta('s');
        }
        
        else{
            setLocation(getX() + speed, getY());
            animate();
        }
    }
    int odata = 0;
    protected void takeDamageFromMelee(){
        Actor a = getOneIntersectingObject(Melee.class);
        if(a != null){
            if (odata == 0){
                hp-=Scrappie.attack;
                if(hp<=0)
                    destroyRobot();
                odata = 1;
            }
        }
        else
            odata = 0;
    }
    
    //ataca-l pe Scrappie iar daca il atingi, da-i un anumit timp ca acesta sa fuga
    int timer = 0;
    int x = 0;
    private void attackScrappie(){
        if(getOneIntersectingObject(Scrappie.class)!=null){
            if(timer == 40){
                timer = 0;
                x = 0;
            }
            if(x != 1){
                Scrappie.hp-=attack;
                x = 1;
            }
            if(timer<40)
                timer++;
        }
    }
    
    public void act() 
    {
        if(hp > 0){
            attackScrappie();
            takeDamageFromMelee();
            if(getStanga_dreapta() == 's')
                moveLeft();
            else if (getStanga_dreapta() == 'd'){
                moveRight();
            }
        }
        else{
            destroyRobot();
        }
        if(getWorld() != null && hp>0)
            objectsCollision();
        // Add your action code here.
    }    
}
