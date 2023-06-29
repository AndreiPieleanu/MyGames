import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class Instructiuni here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructiuni extends World
{
    /**
     * Constructor for objects of class Instructiuni.
     * 
     */
    public Instructiuni(){super(800, 593, 1);}
    
    //polimorfism - pentru fiecare buton de forward/back ce sa returneze
    //subclasele din Instructiune si StoryofScrappie au o singura clasa parinte in comun - World
    public static World setWorldType(int x){
        switch(x){
        case 1:
            return new Instructiune1();
        case 2:
            return new Instructiune2();
        case 3:
            return new Instructiune3();
        case 4:
            return new Instructiune4();
        }
        return new StoryofScrappie();
    }
    
}
