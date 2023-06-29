import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Boat1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boat1 extends EnemyBoats
{
    /**
     * Act - do whatever the Boat1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    private GreenfootImage img1 = new GreenfootImage("spanish_or_ vanish2 final.png");
    private String[] deathAnimationArray1 = {
        "spanish_or_ vanish2 dead1.png", 
        "spanish_or_ vanish2 dead2.png",
        "spanish_or_ vanish2 dead3.png",
        "spanish_or_ vanish2 dead4.png",
        "spanish_or_ vanish2 dead5.png",
    };
    private int dimensiune = 110;
    private Random randomNumber;
    public int speed, sansa;
    private int hp;
    private int echipaj = 50;
    public int getEchipaj(){
        return this.echipaj;
    }
    public void setEchipaj(int echipaj){
        this.echipaj = echipaj;
    }
    public void loseCrew(int x){
        this.echipaj -= x;
    }
    
    public Boat1(){
        img1.scale(80*img1.getWidth()/100, 80*img1.getHeight()/100);
        setImage(img1);
        randomNumber = new Random();
        hp = (randomNumber.nextInt(20)+10)*10;
        sansa = randomNumber.nextInt(4);
        speed = 2;
    }
    public int getHit(int x){
        this.hp-=x;
        return this.hp;
    }
    public int getHp(){
        return this.hp;
    }
    void updateCrew(int ramasi){
        for(int i=0;i<getWorld().getObjects(Mesaje.class).size();i++){
            if(getWorld().getObjects(Mesaje.class).get(i).toString().contains("oameni")){
                getWorld().getObjects(Mesaje.class).get(i).update(ramasi + " oameni ");
                break;
            }
        }
    }
    boolean showIcon = false;
    MeleeIcon melee = new MeleeIcon();
    
    int timer = 15;
    boolean isInCloseRange(){
        if(this.hp > 0 && this.echipaj > 0){
            List objects = getObjectsInRange(90, boat.class);
            for (Object object : objects) {
                if (object instanceof boat){
                    timer--;
                    if(timer <= 0){
                        //System.out.println(boatProperties.ratieInamic + " " + echipaj);
                        this.loseCrew(boatProperties.ratieInamic);
                        boat player = (boat)object;
                        player.loseCrew(1);
                        updateCrew(player.getEchipaj());
                        timer = 15;
                    }
                    if(!showIcon){
                        getWorld().addObject(melee, getX(), getY() - 100);
                        showIcon = true;
                    }
                    return true;
                }
            }
        }
        return false;
    }
    int frame=0, con=20, chance = 0, animatia_1_sau_2 = 0;
    boolean isChestDropped = true;
    int turnDirection = new Random().nextInt(2);
    void destroy(){
        if(this.hp <= 0 || this.echipaj <= 0){
            getWorld().removeObject(melee);
            if(animatia_1_sau_2 == 0){
                if(frame<=9*con){
                    frame++;
                    if(frame<con){
                        setImage(deathAnimationArray1[0]);
                    }
                    if(frame>=con && frame<2*con){
                        setImage(deathAnimationArray1[1]);
                    }
                    if(frame>=2*con && frame<3*con){
                        setImage(deathAnimationArray1[2]);
                    }
                    if(frame>=3*con && frame<4*con){
                        setImage(deathAnimationArray1[3]);
                    }
                    if(frame>=4*con && frame<5*con){
                        setImage(deathAnimationArray1[4]);
                    }
                    if(frame>=4*con && frame<9*con){
                        super.rotateAndDropItem(randomNumber, this, turnDirection);
                        if(isChestDropped){
                            Chest chest = new Chest();
                            chest.setTypeOfShip(1);
                            getWorld().addObject(chest, this.getX(), this.getY());
                            isChestDropped = false;
                        }
                    }
                }else{
                    getWorld().removeObject(this);
                    frame=0;
                }
            }
        }
    }
    /*void destroy(){
        if(this.hp <= 0){
            boatProperties.money += (randomNumber.nextInt(30) + 10)*10;
            for(int i=0;i<getWorld().getObjects(Mesaje.class).size();i++){
                if(getWorld().getObjects(Mesaje.class).get(i).toString().contains("Bani")){
                    getWorld().getObjects(Mesaje.class).get(i).update("Bani: " + boatProperties.money);
                }
                        
            }
            getWorld().removeObject(this);
            
            //Level.mesaj.update("Bani: " + boatProperties.money);
        }
    }*/
    void checkCollision(Class a){
        Actor actor = getOneIntersectingObject(a);
        if(actor != null){
            /*final int rangeConst = 100;
            Actor a1 = getOneObjectAtOffset(getX(), getY()-rangeConst, actor.getClass());
            Actor a2 = getOneObjectAtOffset(getX()+rangeConst, getY(), actor.getClass());
            Actor a3 = getOneObjectAtOffset(getX(), getY()+rangeConst, actor.getClass());
            Actor a4 = getOneObjectAtOffset(getX()-rangeConst, getY(), actor.getClass());
            System.out.println(a1 + " " + a2 + " " + a3 + " " + a4);
            getWorld().addObject(new GoldCoinIcon(), getX(), getY()-rangeConst);
            getWorld().addObject(new GoldCoinIcon(), getX()+rangeConst, getY());
            getWorld().addObject(new GoldCoinIcon(), getX(), getY()+rangeConst);
            getWorld().addObject(new GoldCoinIcon(), getX()-rangeConst, getY());
            if(a1 == null){
                setLocation(getX(), getY()+rangeConst);
                //System.out.println("a1");
                turn(180);
            }
            if(a2 != null){
                setLocation(getX()-rangeConst, getY());
                //System.out.println("a2");
                turn(180);
            }
            if(a3 != null){
                setLocation(getX(), getY()-rangeConst);
                //System.out.println("a3");
                turn(180);
            }
            if(a4 != null){
                setLocation(getX()+rangeConst, getY());
                //System.out.println("a4");
                turn(180);
            }
            if(a1 != null || a2!=null || a3!=null || a4!=null){
                
            }
            
            Greenfoot.stop();*/
            for(int i=1;i<=8;i++)
                move(-speed);
            turn(180);
        }
    }
    
    void moveTrajectory(){
        move(speed);
        if(Greenfoot.getRandomNumber(100)<5){
            turn(Greenfoot.getRandomNumber(10));
        }
        //checkCollision(Boat0.class);
        checkCollision(Barrier.class);
        checkCollision(Island.class);
        
        /*Actor allies = getOneIntersectingObject(EnemyBoats.class);
        if(allies != null){
            setLocation(getX() - 10, getY());
            turn(180);
        }*/
        
        /*Actor a1 = getIntersectingObjects(Barrier.class);
        Actor a2 = getIntersectingObjects(Boat0.class);*/
        
    }
    int numarDeTunuri = 20;
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
                enemyBall eb = new enemyBall(this);
                int fiftyfifty = randomNumber.nextInt(2);
                if(!eb.fata){
                    if(fiftyfifty == 0)
                        getWorld().addObject(eb, getX()-randomNumber.nextInt(30), getY()-30);
                    else
                        getWorld().addObject(eb, getX()+randomNumber.nextInt(30), getY()-30);
                }else{
                    if(fiftyfifty == 0)
                        getWorld().addObject(eb, getX()-randomNumber.nextInt(30), getY()+30);
                    else
                        getWorld().addObject(eb, getX()+randomNumber.nextInt(30), getY()+30);
                }
                
                //if(getRotation() > 45 && getRotation() < 90)
                numarDeTunuri--;
            }
        }
    }

    private int delay = 0, moveDelay = 0;
    void fireIfShipIsInRange(){
        List objects = getObjectsInRange(250, boat.class);
        for (Object object : objects) {
            if (object instanceof boat){
                if(delay < 100){
                    delay++;
                    boat b =  (boat)object;
                    //turnTowards(b.getX(), b.getY());
                    moveDelay++;
                    if(delay >= 100){
                        delay=0;
                    }
                    if(moveDelay >= 50){
                        if(speed > 1)
                            speed--;
                        moveDelay = 0;
                    }
                    
                }
                /*if(delay == 100){
                    delay=0;
                    speed = 3;
                }*/
                //if(randomNumber.nextInt(10) == 0)
                /*int ok=0;
                for(int i=1;i<=100;i++){
                    Actor a1 = getOneObjectAtOffset(getX()+i, getY()+i, boat.class);
                    Actor a2 = getOneObjectAtOffset(getX()-i, getY()+i, boat.class);
                    Actor a3 = getOneObjectAtOffset(getX()+i, getY()-i, boat.class);
                    Actor a4 = getOneObjectAtOffset(getX()-i, getY()-i, boat.class);
                    if(a1 != null || a2 != null || a3 != null || a4 != null)
                        fire();
                }*/
                //if()
                fire();
           }
        }
    }
    
    public void act() 
    {
        //System.out.println(getX() + " " + getY());
        if(getHp() > 0 && this.echipaj > 0){
            if(isInCloseRange()){
                move(0);
            }
            else{
                if(showIcon){
                    getWorld().removeObject(melee);
                    showIcon = false;
                }
                delay++;
                if(delay >= 100){
                    delay=0;
                    if(speed < 2)
                        speed++;
                }
                if(getWorld() != null)
                    fireIfShipIsInRange();
                moveTrajectory();
            }
        }
        else
            destroy();
        /*moveDelay++;
        if(moveDelay >= 200){
            if(speed < 3)
                speed++;
                moveDelay = 0;
        }*/
        // Add your action code here.
    }    
}
