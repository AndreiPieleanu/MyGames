import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class boat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boat extends Ships
{
    /**
     * Act - do whatever the boat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //private GreenfootImage img1 = new GreenfootImage("boat01-f.png");
    
    private GreenfootImage img1 = new GreenfootImage("textura_basic_pirat.png");
    private int dimensiune = 50;
    int ok=0;
    int acceleratie = 1;
    int viteza = 0;
    int delay = 0, delayTurn = 0;
    int startMove = 0;
    private boolean isFiring = false;
    private int sansa=0, cannonDelay;
    int numarDeTunuri;
    Random randomNumber;
    private String key = "default";
    private int turnRotation;
    private int echipaj = boatProperties.echipaj;
    GreenfootSound cannon;
    public int getEchipaj(){
        return this.echipaj;
    }
    public void setEchipaj(int echipaj){
        this.echipaj = echipaj;
    }
    public void loseCrew(int x){
        this.echipaj  = this.echipaj - x;
    }
    public boat(){
        cannon = new GreenfootSound("Cannon_SFX.mp3");
        turnRotation = boatProperties.turn;
        if(boatProperties.hullLevel == 3 && boatProperties.catargLevel == 3){
            img1 = new GreenfootImage("ironcladpirat1.png");
        }
        getImage().scale(dimensiune*img1.getWidth()/100, dimensiune*img1.getHeight()/100);
        randomNumber = new Random();
        numarDeTunuri = boatProperties.tunuri;
        cannonDelay = boatProperties.cannonDelay;
        
        if(boatProperties.nivelulNavei == 0){
            boatProperties.nivelulNavei = 1;
        }
        setImage(img1);
    }
    private boolean aTrasStanga = false, aTrasDreapta = false;
    
    void fire(){
        if(sansa == 0)
            sansa = randomNumber.nextInt(5);
        if(numarDeTunuri != 0){
            if(sansa != 0){
                sansa--;
            }
            
            if(sansa == 0){
                //if(getRotation() <= 45)
                //if(getRota)
                
                ball b = new ball(this);
                if(Greenfoot.getRandomNumber(8)<3 && boatProperties.sunetInLupte){
                    if(boatProperties.sunetInLupte){
                        cannon.setVolume(30);
                        cannon.play();
                    }
                }
                
                int fiftyfifty = randomNumber.nextInt(2);
                boolean fireLeft = true, fireRight = false;
                isFiring = true;
                final int randomgetX = getImage().getWidth()/4;
                final int distantaFataDeNava = 20;
                if(b.fata){
                    if(fiftyfifty == 1){
                        getWorld().addObject(b, getX()-randomNumber.nextInt(randomgetX), getY()-distantaFataDeNava);
                    }else{
                        getWorld().addObject(b, getX()+randomNumber.nextInt(randomgetX), getY()-distantaFataDeNava);
                    }
                }else{
                    if(fiftyfifty == 1)
                        getWorld().addObject(b, getX()-randomNumber.nextInt(randomgetX), getY()+distantaFataDeNava);
                    else
                        getWorld().addObject(b, getX()+randomNumber.nextInt(randomgetX), getY()+distantaFataDeNava);
                }
                
                //if(getRotation() > 45 && getRotation() < 90)
                numarDeTunuri--;
                
            }
        }
    }
    int increase = 0;
    void increaseSpeed(boolean fata){

        
        increase++;
        if(increase == 30){
            if(fata){
                if(viteza < boatProperties.viteza)
                    viteza++;
            }else{
                if(-viteza > -boatProperties.viteza)
                    viteza--;
            }
            increase = 0;
        }
    }
    void move(){
        delay++;
        if(Greenfoot.isKeyDown("w")){
            startMove++;
            increaseSpeed(true);
            if(startMove <= 60){
                if(viteza == 0)
                    viteza = 1;
                
                move(viteza);
                //boatProperties.viteza = 1;
            }else{
                ok=1;
            }
            /*if(delay<=200){
                move(1);
                if(delay == 150){
                    ok=0;
                    delay=0;
                }
            }*/
            /*if(delay>=60){
                if(viteza <= 2){
                    viteza = viteza+acceleratie;
                    delay = 0;
                }else
                    delay=0;
                //ok=1;
            }*/
            
            
        }
        
        
        if(Greenfoot.isKeyDown("d")){
                delayTurn++;
                if(delayTurn == 3){
                    turn(turnRotation);
                    delayTurn=0;
                }
                //turn = turnRotation;
        }
        if(Greenfoot.isKeyDown("a")){
                delayTurn++;
                if(delayTurn == 3){
                    turn(-turnRotation);
                    delayTurn=0;
                }
                //viteza = 0;
                //turn = -turnRotation;
        }
        if(Greenfoot.isKeyDown("s")){
            startMove++;
            increaseSpeed(false);
            if(startMove <= 60){
                viteza = -1;
                move(viteza);
                //boatProperties.viteza = -1;
            }else{
                ok=1;
            }
            /*if(delay>=60){
                if(viteza >= -2){
                    viteza = viteza-acceleratie;
                    delay = 0;
                }else
                    delay=0;
                
            }*/
        }
        
        
        if(!Greenfoot.isKeyDown("w") || !Greenfoot.isKeyDown("a") || !Greenfoot.isKeyDown("s") || !Greenfoot.isKeyDown("d") || !Greenfoot.isKeyDown("space")){
            move(viteza);
            if(viteza != 0){
                if(delay>=60){
                    if(viteza > 0)
                        viteza--;
                    if(viteza < 0)
                        viteza++;
                    if(viteza == 0){
                        startMove = 0;
                    }
                    delay=0;
                }
            }
        }
       
        //boatProperties.viteza = viteza;
        
    }
    private int hp = boatProperties.hp;
    private int mana = boatProperties.mana;
    public int getHit(int x){
        this.hp-=x;
        for(int i=0;i<getWorld().getObjects(Mesaje.class).size();i++){
                            if(getWorld().getObjects(Mesaje.class).get(i).toString().contains("/")){
                                getWorld().getObjects(Mesaje.class).get(i).update(this.getHp() + "/" + boatProperties.hp);
                                break;
                            }
                        }
                        
        return this.hp;
    }
    public int getViteza(){
        return this.viteza;
    }
    public int getHp(){
        return this.hp;
    }
    public int getUsedMana(int x){
        this.mana-=x;
        return this.mana;
    }
    public int getMana(){
        return this.mana;
    }
    public void destroyShip(){
        if(this.hp <= 0 || this.echipaj <= 0){
            /*System.out.println("ai pierdut");
            Greenfoot.stop();*/
            //getWorld().removeObject(this);
            Greenfoot.setWorld(new Defeat());
        }
    }
    
    
    public void act() 
    {
        //System.out.println(boatProperties.dmg);
        otherCollisions(Island.class, 50);
        otherCollisions(Port.class, 80);
        otherCollisions(TaskBar.class, 40);
        key = Greenfoot.getKey();
        move();
        isFiring = false;
        if(Greenfoot.isKeyDown("space")){
            isFiring = true;
            fire();
        }
        destroyShip();
        //System.out.println(getWorld().getObjects(Mesaje.class).size());
    }
    
    private void wallCollision(){
        Actor a = getOneIntersectingObject(Barrier.class);
        if (a != null){
            if(viteza > 0)
                move(-viteza-1);
            if(viteza < 0)
                move(-viteza+1);
            if(viteza == 0){
                if(getX() <= 100){
                    setLocation(getX()+1, getY());
                }
                if(getX() >= 550){
                    setLocation(getX()-1, getY());
                }
                if(getY() <= 100){
                    setLocation(getX(), getY()+1);
                }
                if(getY() >= 850){
                    setLocation(getX(), getY()-1);
                }
            }
        }
    }

    private void otherCollisions(Class cls, int range){
        List<?> list = getObjectsInRange(range, cls);
        if(!list.isEmpty()){
            if(viteza > 0)
                move(-6);
            else
                move(6);
            for(int i=0;i<list.size();i++){
                //getWorld().addObject(new GoldCoinIcon(), getX(), getY());
                
            }
        }
    }
    private void stop(){
        System.out.println("stop");
        Greenfoot.stop();
    }
}
