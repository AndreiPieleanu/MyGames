import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class enemyBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemyBall extends Actors
{
    /**
     * Act - do whatever the enemyBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img1 = new GreenfootImage("ball.png");
    private GreenfootImage img2 = new GreenfootImage("ball_explosion.png");
    private int dimensiune = 15;
    private int grad, range, damage=0;
    public boolean fata;
    Random r;
    private EnemyBoats b;
    public int getDamage(){
        return this.damage;
    }
    private int reloadBullet = boatProperties.enemyBoatsDelay;
    public enemyBall(Actor a){
        img1.scale(dimensiune*img1.getWidth()/100, dimensiune*img1.getHeight()/100);
        //img2.scale(dimensiune*img2.getWidth()/100, dimensiune*img2.getHeight()/100);
        grad = a.getRotation();
        setImage(img1);
        if(r == null)
            r = new Random();
        range = r.nextInt(50)%35 + 60;
        int con;
        if(a instanceof EnemyBoats){
            con = 5;
            if(b == null){
                if(a instanceof Boat0)
                    b = (Boat0) a;
                if(a instanceof Boat1)
                    b = (Boat1) a;
                if(a instanceof Boat2)
                    b = (Boat2) a;
            }
            //if(boatProperties.nivelulNavei == 1)
            damage = 10;
            if(boatProperties.nivelulNavei == 1)
                damage = 10;
            if(boatProperties.niveluriTerminate[2] == 1){
                damage = 15;
            }
            if(boatProperties.niveluriTerminate[6] == 1){
                damage = 25;
            }
        }else{
            //a = (Boat0)a;//ClassCastException
            con = 10;
            //System.out.println(a);
        }
        if(r.nextInt(2) == 0){
            this.setRotation(boatProperties.viteza > 0 ? grad-90+con : boatProperties.viteza < 0 ? grad+270+con : grad-90);
            fata = true;
        }
        else{
            this.setRotation(boatProperties.viteza > 0 ? grad+75 : grad+90);
            fata = false;
        }
    }
    public enemyBall(){
        setImage(img1);
    }
    int boomTimer = 2;
    public void boom(){
        if(getWorld() != null){
            Actor a = getOneIntersectingObject(boat.class);
            if(a != null){
                boat b = (boat) a;
                if(this.getImage().getTransparency() != 0){
                    if(boomTimer > 0){
                        boomTimer--;
                        if(b.getHp() > 0){
                            setImage(img2);
                        }
                    }
                    if(boomTimer == 0){
                        setImage(img1);
                        b.getHit(damage);
                        for(int i=0;i<getWorld().getObjects(Mesaje.class).size();i++){
                            if(getWorld().getObjects(Mesaje.class).get(i).toString().contains("/")){
                                getWorld().getObjects(Mesaje.class).get(i).update(b.getHp() + "/" + boatProperties.hp);
                                break;
                            }
                        }
                        
                        if(b.getHp() > 0){
                            move(0);
                            damage=0;
                            this.getImage().setTransparency(0);
                        }
                    }
                }
            }
        }
        /*if(getWorld() != null){
            Actor a = getOneIntersectingObject(Island.class);
            if(a != null){
                if(this.getImage().getTransparency() != 0){
                    if(boomTimer > 0){
                        boomTimer--;
                        setImage(img2);
                    }
                    if(boomTimer == 0){
                        setImage(img1);
                            move(0);
                            damage=0;
                            this.getImage().setTransparency(0);
                    }
                }
            }
        }*/
    }
    
    private void reload(){
        if(reloadBullet > 0)
            reloadBullet--;
        if(reloadBullet == 0){
            if(b instanceof Boat0){
                Boat0 boat0 = (Boat0) b;
                boat0.numarDeTunuri++;
            }
            if(b instanceof Boat1){
                Boat1 boat1 = (Boat1) b;
                boat1.numarDeTunuri++;
            }
            if(b instanceof Boat2){
                Boat2 boat2 = (Boat2) b;
                boat2.numarDeTunuri++;
            }
            reloadBullet=-1;
        }
        if(reloadBullet == -1){
            getWorld().removeObject(this);
            reloadBullet = boatProperties.enemyBoatsDelay;
        }
    }
    public void act() 
    {
        /*if(isAtEdge())
            getWorld().removeObject(this);*/
        if(getWorld()!=null || getWorld()==null)
            reload();
        //System.out.println(reloadBullet);
        if(range == 0){
            move(0);
            damage=0;
            this.getImage().setTransparency(0);
            //getWorld().removeObject(this);
        }else{
            move(4);
            range--;
        }
        boom();
        //setLocation(getX()+viteza, getY()-viteza);
        // Add your action code here.
    }     
}
