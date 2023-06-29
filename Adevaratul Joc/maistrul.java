import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class maistrul here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class maistrul extends Actors
{
    /**
     * Act - do whatever the maistrul wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private final int normalSpeed = 4;
    private final int deplasare = 70;
    private final int durata = 15;
    private final int distanta = 18;
    private final int minim=-20,maxim=-70;
    
    public maistrul()
    {
        GreenfootImage newImg = getImage();
        int new_Height = (int)30*newImg.getHeight()/100;
        int new_Width = (int)40*newImg.getWidth()/100;
        newImg.scale(new_Height,new_Width);
    }
    
    public Actor coliziuneWall(Class c)
    {
        GreenfootImage img = getImage();
        int distf = img.getWidth();
        int xOffset = (int)Math.ceil(distf*Math.cos(Math.toRadians(getRotation())));
        int yOffset = (int)Math.ceil(distf*Math.sin(Math.toRadians(getRotation())));
        return (getOneObjectAtOffset(xOffset, yOffset, c));
    }
    public void coliziuneFloare()
    {
        Actor floricica = getOneIntersectingObject(floare.class);
        if (floricica != null)
        {
            getWorld().removeObject(floricica);
            super.SCOR();
        }
    }
    public boolean isActorAt(Class c,int x,int y)
    {
        return true;
    }
    public void act() 
    {
        // w -> x,y-deplasare
        // s -> x,y+deplasare
        // a -> x-deplasare,y
        // d -> x+deplasare,y
        //Actor collided = getOneIntersectingObject(wall.class);
        if(Greenfoot.isKeyDown("w") && !(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("s")))
        {
            setRotation(270);
            if (coliziuneWall(wall.class)==null && coliziuneWall(boxCapcana.class)==null  && coliziuneWall(liftClosed.class)==null)
            { 
                try
                {
                    Actors actor = (Actors) getOneObjectAtOffset(0,minim,null);
                    if(actor.getClass() == box.class)
                    {
                         box b = (box) actor;
                         Actor boxRight = (Actor) getOneObjectAtOffset(0,maxim,null);
                         if(boxRight == null || (boxRight instanceof box) && (boxRight instanceof wall))
                         {
                             Greenfoot.delay(durata);
                             b.setLocation(b.getX(), b.getY()-30);
                     // setLocation(getX(), getY()-deplasare);
                         }
                    }
                }
                catch (Exception e)
                {
                    setLocation(getX(), getY()-normalSpeed);
                }
                /*
                else
                {
                    
                }
                setLocation(getX(),getY());
                else if (isActorAt(box.class,getX(),getY()-distanta)==false || isActorAt(box.class,getX(),getY()-(4*distanta))==true)
                    move(normalSpeed);*/
                    
            }
            Actor actor = getOneIntersectingObject(box.class);
            if (actor != null)
            {
                Greenfoot.delay(durata);
                actor.setLocation(getX(),getY()-deplasare);
            }
           coliziuneFloare();
        }
        if(Greenfoot.isKeyDown("s") && !(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("w")))
        {
            setRotation (90);
            if (coliziuneWall(wall.class)==null && coliziuneWall(boxCapcana.class)==null  && coliziuneWall(liftClosed.class)==null)
            {
                try
                {
                    Actors actor = (Actors) getOneObjectAtOffset(0,-minim,null);
                    if(actor.getClass() == box.class)
                    {
                         box b = (box) actor;
                         Actor boxRight = (Actor) getOneObjectAtOffset(0,-maxim,null);
                         if(boxRight == null || (boxRight instanceof box) && (boxRight instanceof wall))
                         {
                             Greenfoot.delay(durata);
                             b.setLocation(b.getX(), b.getY()+30);
                     // setLocation(getX(), getY()-deplasare);
                         }
                    }
                }
                catch (Exception e)
                {
                    setLocation(getX(), getY()+normalSpeed);
                }
                //move(normalSpeed);
            }
            Actor actor = getOneIntersectingObject(box.class);
            if (actor != null)
            {
               Greenfoot.delay(durata);
               actor.setLocation(getX(),getY()+deplasare);
            }
            coliziuneFloare();
        }
        if(Greenfoot.isKeyDown("a") && !(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("s")))
        {
            setRotation(180);
           
            if (coliziuneWall(wall.class)==null && coliziuneWall(boxCapcana.class)==null  && coliziuneWall(liftClosed.class)==null)
            {
                try
                {
                    Actors actor = (Actors) getOneObjectAtOffset(-minim,0,null);
                    if(actor.getClass() == box.class)
                    {
                         box b = (box) actor;
                         Actor boxRight = (Actor) getOneObjectAtOffset(-maxim,0,null);
                         if(boxRight == null || (boxRight instanceof box) && (boxRight instanceof wall))
                         {
                             Greenfoot.delay(durata);
                             b.setLocation(b.getX()-30, b.getY());
                             // setLocation(getX(), getY()-deplasare);
                         }
                    }
                }
                catch (Exception e)
                {
                    setLocation(getX()-normalSpeed, getY());
                }
                    //move(normalSpeed);
            }
            Actor actor = getOneIntersectingObject(box.class);
            if (actor != null)
            {
                Greenfoot.delay(durata);
                actor.setLocation(getX()-deplasare,getY());
            }
            coliziuneFloare();
        }
        if(Greenfoot.isKeyDown("d") && !(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("s")))
        {
            setRotation(0);
            if (coliziuneWall(wall.class)==null && coliziuneWall(boxCapcana.class)==null  && coliziuneWall(liftClosed.class)==null)
            {
                 try
                {
                    Actors actor = (Actors) getOneObjectAtOffset(minim,0,null);
                    if(actor.getClass() == box.class)
                    {
                         box b = (box) actor;
                         Actor boxRight = (Actor) getOneObjectAtOffset(maxim,0,null);
                         if(boxRight == null || (boxRight instanceof box) && (boxRight instanceof wall))
                         {
                             Greenfoot.delay(durata);
                             b.setLocation(b.getX()+30, b.getY());
                     // setLocation(getX(), getY()-deplasare);
                         }
                    }
                }
                catch (Exception e)
                {
                    setLocation(getX()+normalSpeed, getY());
                }
                //move(normalSpeed);
            }
            Actor actor = getOneIntersectingObject(box.class);
            if (actor != null)
            {
               Greenfoot.delay(durata);
                actor.setLocation(getX()+deplasare,getY());
            }
            coliziuneFloare();
        }
    }  
    public void Scroll(int x,int y)
    {
        World my = (World)getWorld();
        int xShift = x-getX();
        int yShift = y-getY();
        
    }
    
}
