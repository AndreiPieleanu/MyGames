import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Boat1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boat2 extends EnemyBoats
{
    /**
     * Act - do whatever the Boat1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage move1 = new GreenfootImage("boss/spanish_or_vanish3_n1.png");
    private GreenfootImage move2 = new GreenfootImage("boss/spanish_or_vanish3_n2.png");
    private GreenfootImage move3 = new GreenfootImage("boss/spanish_or_vanish3_n3.png");
    
    private GreenfootImage shield1 = new GreenfootImage("boss/spanish_or_vanish3_s1.png");
    private GreenfootImage shield2 = new GreenfootImage("boss/spanish_or_vanish3_s2.png");
    private GreenfootImage shield3 = new GreenfootImage("boss/spanish_or_vanish3_s3.png");
    
    private GreenfootImage ram1 = new GreenfootImage("boss/spanish_or_vanish3_r1.png");
    private GreenfootImage ram2 = new GreenfootImage("boss/spanish_or_vanish3_r1.png");
    private GreenfootImage ram3 = new GreenfootImage("boss/spanish_or_vanish3_r1.png");
    
    private GreenfootImage moveAnimationAarray[] = new GreenfootImage[3];
    private GreenfootImage shieldAnimationArray[] = new GreenfootImage[3];
    private GreenfootImage ramingAnimationArray[] = new GreenfootImage[3];
    
    private Random randomNumber;
    public int speed, sansa;
    private int hp;
    private int dimensiuni = 100;
    public Boat2(){
        
        move1.scale(dimensiuni*move1.getWidth()/100, dimensiuni*move1.getHeight()/100);
        move2.scale(dimensiuni*move2.getWidth()/100, dimensiuni*move2.getHeight()/100);
        move3.scale(dimensiuni*move3.getWidth()/100, dimensiuni*move3.getHeight()/100);
        shield1.scale(dimensiuni*shield1.getWidth()/100, dimensiuni*shield1.getHeight()/100);
        shield2.scale(dimensiuni*shield2.getWidth()/100, dimensiuni*shield2.getHeight()/100);
        shield3.scale(dimensiuni*shield3.getWidth()/100, dimensiuni*shield3.getHeight()/100);
        ram1.scale(dimensiuni*ram1.getWidth()/100, dimensiuni*ram1.getHeight()/100);
        ram2.scale(dimensiuni*ram2.getWidth()/100, dimensiuni*ram2.getHeight()/100);
        ram3.scale(dimensiuni*ram3.getWidth()/100, dimensiuni*ram3.getHeight()/100);
        
        
        moveAnimationAarray[0] = move1;
        moveAnimationAarray[1] = move2;
        moveAnimationAarray[2] = move3;
        shieldAnimationArray[0] = shield1;
        shieldAnimationArray[1] = shield2;
        shieldAnimationArray[2] = shield3;
        ramingAnimationArray[0] = ram1;
        ramingAnimationArray[1] = ram2;
        ramingAnimationArray[2] = ram3;
        
        setImage(move1);
        randomNumber = new Random();
        hp = 2500;
        sansa = randomNumber.nextInt(4);
        speed = 1;
    }
    public int getHit(int x){
        this.hp-=x;
        return this.hp;
    }
    public int getHp(){
        return this.hp;
    }
    int frame=0, con=30, chance = 0, animatia_1_sau_2 = 0;
    boolean isChestDropped = true;
    int turnDirection = new Random().nextInt(2);
    private String[] deathAnimationArray1 = {
        "boss/boss_dead1.png", 
        "boss/boss_dead2.png",
        "boss/boss_dead3.png",
        "boss/boss_dead4.png",
        "boss/boss_dead5.png",
    };
    
    void destroy(){
        if(this.hp<=0){
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
                            chest.setTypeOfShip(2);
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
            for(int i=1;i<=8;i++)
                move(-speed);
            turn(180);
        }
    }
    
    int moveFrame=0, shieldFrame=0, ramFrame = 0;
    void moveAnimation(int nr){
        moveFrame++;
        if(moveFrame >= 1 && moveFrame < nr){
            setImage(moveAnimationAarray[0]);
        }
        else if(moveFrame >= nr && moveFrame < 2*nr){
            setImage(moveAnimationAarray[1]);
        }
        else if(moveFrame >= 2*nr && moveFrame < 3*nr){
            setImage(moveAnimationAarray[2]);
        }
        else if (moveFrame >= 3*nr){
            moveFrame = 0;
        }
    }
    void shieldAnimation(int nr){
        shieldFrame++;
        if(shieldFrame >= 1 && shieldFrame < nr){
            setImage(shieldAnimationArray[0]);
        }
        else if(shieldFrame >= nr && shieldFrame < 2*nr){
            setImage(shieldAnimationArray[1]);
        }
        else if(shieldFrame >= 2*nr && shieldFrame < 3*nr){
            setImage(shieldAnimationArray[2]);
        }
        else if (shieldFrame >= 3*nr){
            shieldFrame = 0;
        }
    }
    void ramAnimation(int nr){
        ramFrame++;
        if(ramFrame >= 1 && ramFrame < nr){
            setImage(ramingAnimationArray[0]);
        }
        else if(ramFrame >= nr && ramFrame < 2*nr){
            setImage(ramingAnimationArray[1]);
        }
        else if(ramFrame >= 2*nr && ramFrame < 3*nr){
            setImage(ramingAnimationArray[2]);
        }
        else if (ramFrame >= 3*nr){
            ramFrame = 0;
        }
    }
    void resetAllAnimations(){
        moveFrame=0;
        shieldFrame=0;
        ramFrame = 0;
    }
    boolean canRam(){
        List objects = getObjectsInRange(300, boat.class);
        for (Object object : objects) {
            if (object instanceof boat){
                return true;
           }
        }
        return false;
    }
    String getCollisionType(boat player){
        String s = "";
        if(player.getX() < getX() && player.getY() < getY())
            s = "fata dreapta";
        else if(player.getX() > getX() && player.getY() < getY())
            s = "fata stanga";
        else if(player.getX() < getX() && player.getY() > getY())
            s = "spate dreapta";
        else if(player.getX() > getX() && player.getY() > getY())
            s = "spate stanga";
        return s;
    }
    
    int dizzyDelay = 20, ct = 5;
    void movePlayer(boat player){
        String result = getCollisionType(player);
        if(result.equals("fata dreapta")){
            if(dizzyDelay > 0){
                player.setLocation(player.getX()-ct, player.getY()-ct);
                dizzyDelay--;
            }
        }
        else if(result.equals("fata stanga")){
            if(dizzyDelay > 0){
                player.setLocation(player.getX()+ct, player.getY()-ct);
                dizzyDelay--;
            }
        }
        else if(result.equals("spate stanga")){
            if(dizzyDelay > 0){
                player.setLocation(player.getX()-ct, player.getY()+ct);
                dizzyDelay--;
            }
        }
        else if(result.equals("spate dreapata")){
            if(dizzyDelay > 0){
                player.setLocation(player.getX()+ct, player.getY()+ct);
                dizzyDelay--;
            }
        }
    }
    
    int roations = 10;
    boolean hasHitPlayer = false;
    void getDizzy(){
        List objects = getObjectsInRange(170, boat.class);
        boat player = null;
        for (Object object : objects) {
            if (object instanceof boat){
                hasHitPlayer = true;
                player = (boat) object;
                break;
            }
        }
        boat player2 = null;
        List objects2 = getObjectsInRange(200, boat.class);
        for (Object object : objects2) {
            if (object instanceof boat){
                player2 = (boat) object;
                break;
            }
        }
        if(player2 != null)
            movePlayer(player2);
        
        if(hasHitPlayer && player != null){
            if(bigRamDelay >= 2000){
                player.getHit(10);
                bigRamDelay--;
                sansaDeUrmarire=1;
                //System.out.println(player.getX() + "-" + this.getX() + "   " + player.getY() + "-" + this.getY());
                //System.out.println(getCollisionType(player));
                //movePlayer(player);
                //Greenfoot.stop();
                //cioc cioc
            }
            //System.out.println("cioc");
            speed = 0;
            
        }
        resetRam();
    }
    
    int sansaDeUrmarire = 0;
    void moveTrajectory(){
        move(speed);
        if(Greenfoot.getRandomNumber(100)<5){
            //turn(Greenfoot.getRandomNumber(10));
            Actor actor = (Actor)getWorld().getObjects(boat.class).get(0);
            
            turnTowards(actor.getX(), actor.getY());
        }
        checkCollision(Barrier.class);
    }
    void simpleMove(){
        move(speed);
        if(Greenfoot.getRandomNumber(100)<5){
            turn(Greenfoot.getRandomNumber(5));
        }
        checkCollision(Barrier.class);
    }
    
    boolean lostPlayer(){
        List objects = getObjectsInRange(400, boat.class);
        for (Object object : objects) {
            if (object instanceof boat){
                return false;
           }
        }
        return true;
    }
    int numarDeTunuri = 100;
    void fire(){
        if(sansa == 0)
            sansa = randomNumber.nextInt(2);
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
                        getWorld().addObject(eb, getX()-randomNumber.nextInt(50), getY()-30);
                    else
                        getWorld().addObject(eb, getX()+randomNumber.nextInt(50), getY()-30);
                }else{
                    if(fiftyfifty == 0)
                        getWorld().addObject(eb, getX()-randomNumber.nextInt(50), getY()+30);
                    else
                        getWorld().addObject(eb, getX()+randomNumber.nextInt(50), getY()+30);
                }
                
                //if(getRotation() > 45 && getRotation() < 90)
                numarDeTunuri--;
            }
        }
    }
    
    void spawnMinions(){
        if(Greenfoot.getRandomNumber(10000) < 10){
            if(Greenfoot.getRandomNumber(2) == 0){
                getWorld().addObject(new Boat1(), this.getX(), this.getY());
            }
            else{
                getWorld().addObject(new Boat0(false, 1, 100), this.getX(), this.getY());
            }
        }
    }
    
    private int delay = 0;
    void fireIfShipIsInRange(){
        List objects = getObjectsInRange(300, boat.class);
        for (Object object : objects) {
            if (object instanceof boat){
                fire();
           }
        }
    }
    
    public boolean hasShieldActivated = false;
    private int shieldDuration = 3;
    void activateShield(int nr){
        shieldFrame++;
        if(shieldFrame >= 1 && shieldFrame < nr){
            setImage(shieldAnimationArray[0]);
        }
        else if(shieldFrame >= nr && shieldFrame < 2*nr){
            setImage(shieldAnimationArray[1]);
        }
        else if(shieldFrame >= 2*nr && shieldFrame < 3*nr){
            setImage(shieldAnimationArray[2]);
        }
        else if (shieldFrame >= 3*nr){
            shieldFrame = 0;
            shieldDuration--;
        }
    }
    
    int bigRamDelay = 2000;
    public void act() 
    {
        //System.out.println(hasShieldActivated);
        if(hp > 0){
            int shield = Greenfoot.getRandomNumber(10000);
            if(hp >= 500){
                if(shield <= 10){
                    hasShieldActivated = true;
                }
            }else{
                if(shield <= 100){
                    hasShieldActivated = true;
                }
            }
            //System.out.println(bigRamDelay);
            if(lostPlayer()){//daca a pierdut playerul
                if(!hasShieldActivated){//daca nu are scutul activat
                    spawnMinions();
                    resetRam();
                    speed = 1;
                    simpleMove();
                    moveAnimation(10);
                    ramFrame = 0;
                }
                else{//daca are scutul activat
                    simpleMove();
                    if(shieldDuration >= 0)
                        activateShield(10);
                    else{
                        hasShieldActivated = false;
                        shieldDuration = 3;
                    }
                }
            }
            else{//daca l-a gasit
                hasShieldActivated = false;
                hasHitPlayer = false;
                if(canRam()){//poate sa dea ram? da
                    if(sansaDeUrmarire == 0){
                        speed = 2;
                        ramAnimation(10);
                        getDizzy();
                        moveTrajectory();
                    }else{
                        simpleMove();
                        moveAnimation(10);
                    }
                }else{//daca nu poate de ram
                    resetRam();
                    speed = 1;
                    moveTrajectory();
                    moveAnimation(10);
                }
                fireIfShipIsInRange();
            }
        }
        //System.out.println(getX() + " " + getY());
        if(hp <= 0)
            destroy();
    }
    private void resetRam(){
        if(bigRamDelay <= 1999)
            bigRamDelay--;
        if(bigRamDelay <= 0){
            bigRamDelay = 2000;
            dizzyDelay = 20;
            sansaDeUrmarire = 0;
        }
    }
    
}
