import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball extends Ships
{
    /**
     * Act - do whatever the ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage img1 = new GreenfootImage("ball.png");
    private GreenfootImage img2 = new GreenfootImage("ball_explosion.png");
    private int dimensiune = 15;
    private int grad, range, damage;
    public boolean fata;
    Random r;
    private boat b;
    public int getDamage(){
        return this.damage;
    }
    private int reloadBullet = boatProperties.cannonDelay;
    public ball(Actor a){
        img1.scale(dimensiune*img1.getWidth()/100, dimensiune*img1.getHeight()/100);
        //img2.scale(dimensiune*img2.getWidth()/100, dimensiune*img2.getHeight()/100);
        grad = a.getRotation();
        setImage(img1);
        if(r == null)
            r = new Random();
        range = r.nextInt(50)%35 + 60;
        int con;
        if(a instanceof boat){
            con = 5*boatProperties.viteza;
            if(b == null)
                b = (boat) a;
            
            //if(boatProperties.nivelulNavei == 1)
                damage = boatProperties.dmg;
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
        //System.out.println(grad);
    }
    public ball(){
        damage = boatProperties.dmg;
        img1.scale(dimensiune*img1.getWidth()/100, dimensiune*img1.getHeight()/100);
        //img2.scale(dimensiune*img2.getWidth()/100, dimensiune*img2.getHeight()/100);
        setImage(img1);
    }
    int boomTimer = 2;
    public void boom(){
        if(getWorld() != null){
            Actor a = getOneIntersectingObject(EnemyBoats.class);
            Boat0 b1;
            Boat1 b2;
            Boat2 b3;
            if(a != null){
                //tipurile de nave ce vor fi lovite
                if(this.getImage().getTransparency()!=0){
                    if(a instanceof Boat0){
                        b1 = (Boat0) a;
                        if(boomTimer > 0){
                            boomTimer--;
                            if(b1.getHp() > 0){
                                setImage(img2);
                            }
                        }
                        if(boomTimer == 0){
                            setImage(img1);
                            if(b1.getHp() > 0){
                                move(0);
                                damage=0;
                                this.getImage().setTransparency(0);
                                boomTimer=2;
                            }
                        }
                    }
                    if(a instanceof Boat1){
                        b2 = (Boat1) a;
                        if(boomTimer > 0){
                            boomTimer--;
                            if(b2.getHp() > 0){
                                setImage(img2);
                            }
                        }
                        if(boomTimer == 0){
                            setImage(img1);
                            if(b2.getHp() > 0){
                                move(0);
                                damage=0;
                                this.getImage().setTransparency(0);
                                boomTimer=2;
                            }
                        }
                    }
                    if(a instanceof Boat2){
                        b3 = (Boat2) a;
                        if(boomTimer > 0){
                            boomTimer--;
                            if(b3.getHp() > 0){
                                setImage(img2);
                            }
                        }
                        if(boomTimer == 0){
                            setImage(img1);
                            if(b3.getHp() > 0){
                                move(0);
                                damage=0;
                                this.getImage().setTransparency(0);
                                boomTimer=2;
                            }
                        }
                    }
                    if(damage != 0){
                        if(a instanceof Boat0){
                            b1 = (Boat0) a;
                            b1.getHit(damage);
                        }
                        if(a instanceof Boat1){
                            b2 = (Boat1) a;
                            b2.getHit(damage);
                        }
                        if(a instanceof Boat2){
                            b3 = (Boat2) a;
                            if(!b3.hasShieldActivated)
                                b3.getHit(damage);
                        }
                    }
                    
                }
                //getWorld().removeObject(this);
                //Greenfoot.stop();
            }
        }
    }
    
    private void reload(){
        if(reloadBullet > 0)
            reloadBullet--;
        if(reloadBullet == 0){
            b.numarDeTunuri++;
            reloadBullet=-1;
        }
        int index = 0;
        for(int i=0;i<getWorld().getObjects(Mesaje.class).size();i++){
            if(getWorld().getObjects(Mesaje.class).get(i).toString().contains("/" + boatProperties.tunuri)){
                index = i;
            }
        }
        getWorld().getObjects(Mesaje.class).get(index).update(b.numarDeTunuri + "/" + boatProperties.tunuri);
        
        
        if(reloadBullet == -1){
            getWorld().removeObject(this);
            reloadBullet = boatProperties.cannonDelay;
        }
    }
    public void act() 
    {
        if(getWorld()!=null || getWorld()==null)
            reload();
        //System.out.println(reloadBullet);
        if(range == 0){
            move(0);
            damage=0;
            this.getImage().setTransparency(0);
            //getWorld().removeObject(this);
        }else{
            move(boatProperties.yourCannonSpeed);
            range--;
        }
        boom();
        //setLocation(getX()+viteza, getY()-viteza);
    }  
    
}
