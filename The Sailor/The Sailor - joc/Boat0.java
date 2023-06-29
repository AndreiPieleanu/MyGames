import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Boat0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boat0 extends EnemyBoats
{
    /**
     * Act - do whatever the Boat0 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img1 = new GreenfootImage("spanish_or_vanish1.png");
    private String[] deathAnimationArray1 = {
        "spanish_or_vanish_dead1.png", 
        "spanish_or_vanish_dead2.png",
        "spanish_or_vanish_dead3.png",
        "spanish_or_vanish_dead4.png",
        "spanish_or_vanish_dead5.png",
    };
    private String[] deathAnimationArray2 = {
        "spanish_or_vanish1_dead2 1.png", 
        "spanish_or_vanish1_dead2 2.png",
        "spanish_or_vanish1_dead2 3.png",
        "spanish_or_vanish1_dead2 4.png",
        "spanish_or_vanish1_dead2 5.png",
    };
    private int dimensiune = 100;
    private boolean oval = false;
    private int delay = 0, moveDelay = 0;
    private int distanta, x, sansa;
    private Random randomNumber;
    public int speed = 0;
    private int hp;
    
    //private int xInit, yInit;
    public int getHit(int x){
        this.hp-=x;
        return this.hp;
    }
    public int getSpeed(){
        return speed;
    }
    
    /*public String toString(){
        return speed+"";
    }*/
    public int getHp(){
        return this.hp;
    }
    
    private int echipaj = 35;
    public int getEchipaj(){
        return this.echipaj;
    }
    public void setEchipaj(int echipaj){
        this.echipaj = echipaj;
    }
    public void loseCrew(int x){
        this.echipaj -= x;
    }
    public Boat0(){
        getImage().scale(dimensiune*img1.getWidth()/100, dimensiune*img1.getHeight()/100);
        hp = (randomNumber.nextInt(10)+5)*10;
        this.oval = false;
    }
    public Boat0(boolean oval, int speed){
        getImage().scale(dimensiune*img1.getWidth()/100, dimensiune*img1.getHeight()/100);
        this.oval = oval;
        this.speed = speed;
        randomNumber = new Random();
        sansa = randomNumber.nextInt(4);
        hp = (randomNumber.nextInt(15)+5)*10;
        distanta = 0;
    }
    public Boat0(boolean oval, int speed, int x){
        getImage().scale(dimensiune*img1.getWidth()/100, dimensiune*img1.getHeight()/100);
        this.oval = oval;
        this.speed = speed;
        randomNumber = new Random();
        sansa = randomNumber.nextInt(4);
        distanta = 0;
        hp = (randomNumber.nextInt(15)+5)*10;
        this.x = x;
    }
    /*private int turnToDirection = 0, startMove = 0;
    void returnToDefaultPosition(){
        if(getRotation()>0)
            turn(-3);
        else
            turn(3);
        if(getRotation() == 0){
            startMove = 1;
            return;
        }
    }*/
    private int ok = 1, turnDelay=0;
    void moveTrajectory(){
        if(oval){
            move(speed);
            if(speed == 1){
                delay++;
                if(delay == 5){
                    turn(3);
                    delay = 0;
                }
            }
            else{
                moveDelay++;
                /*if(moveDelay == 100){
                    getImage().mirrorVertically();
                }*/
                if(moveDelay >= 100 && moveDelay <= 159){
                    turn(3);
                }
                /*if(moveDelay == 260){
                    getImage().mirrorVertically();
                }*/
                if(moveDelay >= 260 && moveDelay <= 319){
                    turn(3);
                }
                if(moveDelay == 319)
                    moveDelay = 0;
            }
        }else if(x != 0){
            if(ok != 0){
                distanta = 0;
                turnDelay = 0;
                ok=0;
            }
            else{
                if(distanta < x){
                    move(speed);
                    distanta++;
                }
                if(distanta == x){
                    if(turnDelay < 90){
                        turn(2);
                        turnDelay++;
                    }
                    if(turnDelay == 90){
                        distanta=0;
                        turnDelay=0;
                    }
                }
            }
            
            /*if(ok != 0){
                sansa = randomNumber.nextInt(4);
                turnToDirection = 0;
                distanta = 1;
                ok=0;
            }
            
            if(ok == 0 && distanta <= 2*x){
                if(sansa  == 0){
                    //turnToDirection == 90
                    //getRotation() == 270
                    if(turnToDirection == 90)
                        moveAndGoBack('w');
                    else{
                       turnToDirection++;
                       //turn(1);
                    }
                }
                if(sansa == 1){
                    //turnToDirection == 90
                    //getRotation() == 180
                    if(turnToDirection == 90)
                        moveAndGoBack('a');
                    else{
                        turnToDirection++;
                        //returnToDefaultPosition();
                        //turn(1);
                    }
                }
                if(sansa == 2){
                    //turnToDirection == 90
                    //getRotation() == 90
                    if(turnToDirection == 90)
                        moveAndGoBack('s');
                    else{
                        turnToDirection++;
                        //returnToDefaultPosition();
                        //turn(1);
                    }
                }
                if(sansa == 3){
                    //turnToDirection == 0
                    //getRotation() == 0
                    if(turnToDirection == 90)
                        moveAndGoBack('d');
                    else{
                        turnToDirection++;
                        //returnToDefaultPosition();
                        //turn(1);
                    }
                }
                
            }
            if(distanta == 2*x){
                ok=1;
                distanta = 1;
            }*/
       }
    }
    
    /*private boolean turnDone = false;
    private int turnDoneDelay = 0;
    private void moveAndGoBack(char directie){
        
        if(directie == 'w' && !turnDone){
            if(distanta <= x)
                setLocation(getX(), getY()+speed);
            else
                setLocation(getX(), getY()-speed);
        }
        if(directie == 's' && !turnDone){
            if(distanta <= x)
                setLocation(getX(), getY()-speed);
            else
                setLocation(getX(), getY()+speed);
        }
        if(directie == 'a' && !turnDone){
            if(distanta <= x)
                setLocation(getX()-speed, getY());
            else
                setLocation(getX()+speed, getY());
        }
        if(directie == 'd' && !turnDone){
            if(distanta <= x)
                setLocation(getX()+speed, getY());
            else
                setLocation(getX()-speed, getY());
        }
        //System.out.println(getX() + " " + getY() + " " + distanta + " " + directie + " " + x);
        if(distanta == x){
            turnDone = true;
            turnAtEnd();
        }
        if(!turnDone)
            distanta++;
    }
    void turnAtEnd(){
        turnDoneDelay++;
        if(turnDoneDelay <= 60){
            //change images at turn end
            turn(3);
        }
        if(turnDoneDelay == 60){
            turnDoneDelay = 0;
            turnDone = false;
            turnToDirection = 0;
        }
    }*/
    
    int frame=0, con=20, chance = 0, animatia_1_sau_2 = 0;
    
    int turnDirection = new Random().nextInt(2);
    boolean isChestDropped = true;
    void destroy(){
        if(this.hp <= 0 || echipaj <= 0){
            getWorld().removeObject(melee);
            if(chance == 0){
                animatia_1_sau_2 = new Random().nextInt(3);
                chance = 1;
            }
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
                            chest.setTypeOfShip(0);
                            getWorld().addObject(chest, this.getX(), this.getY());
                            isChestDropped = false;
                        }
                    }
                }else{
                    
                    getWorld().removeObject(this);
                    
                    frame=0;
                }
            }
            
            if(animatia_1_sau_2 > 0){
                if(frame<=9*con){
                    frame++;
                    if(frame<con){
                        setImage(deathAnimationArray2[0]);
                    }
                    if(frame>=con && frame<2*con){
                        setImage(deathAnimationArray2[1]);
                    }
                    if(frame>=2*con && frame<3*con){
                        setImage(deathAnimationArray2[2]);
                    }
                    if(frame>=3*con && frame<4*con){
                        setImage(deathAnimationArray2[3]);
                    }
                    if(frame>=4*con && frame<5*con){
                        setImage(deathAnimationArray2[4]);
                    }
                    if(frame>=4*con && frame<9*con){
                        super.rotateAndDropItem(randomNumber, this, turnDirection);
                        if(isChestDropped){
                            getWorld().addObject(new Chest(), this.getX(), this.getY());
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
    
    int numarDeTunuri = 10;
    void fire(){
        if(sansa == 0)
            sansa = randomNumber.nextInt(5)+10;
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
                //System.out.println(numarDeTunuri);
                
            }
        }
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
                        this.hp = (echipaj*100)/30;
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
    void fireIfShipIsInRange(){
        List objects = getObjectsInRange(250, boat.class);
        for (Object object : objects) {
            if (object instanceof boat)
                fire();
        }
    }
    int animationFrame;
    String []animations = {"spanish_or_vanish1 move1.png", "spanish_or_vanish1 move2.png", "spanish_or_vanish1 move3.png"};
    public void act(){
        //System.out.println(numarDeTunuri);
        //if(oval)
            //super.turnTheShipAtAngles(this);
        if(this.hp > 0 && this.echipaj > 0){
            if(isInCloseRange())
                move(0);
            else{
                if(showIcon){
                    getWorld().removeObject(melee);
                    showIcon = false;
                }
                super.moveAnimation(animations, 7, animationFrame);
                animationFrame++;
                if(animationFrame == 30)
                    animationFrame = 0;
                moveTrajectory();
                if(getWorld() != null)
                    fireIfShipIsInRange();
            }
        }
        else
            destroy();
        //System.out.println(this.hp);
        //System.out.println(this.hp);
        //System.out.println(oval + " " + moveDelay + " " + delay + " " + speed);
        //System.out.println(turnToDirection);
        
    }
}
