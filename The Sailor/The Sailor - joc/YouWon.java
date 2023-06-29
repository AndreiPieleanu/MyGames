import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouWon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouWon extends World
{

    /**
     * Constructor for objects of class YouWon.
     * 
     */
    public static final GreenfootSound victory = new GreenfootSound("victory.mp3");
    public YouWon()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        StartWorld.menuMusic.stop();
        Defeat.defeat.stop();
        ShopBackground.shopMusic.stop();
        Level.battleMusic.stop();
        if(boatProperties.muzicaVictorie){
            victory.play();
        }
        
        Mesaje mesaje = new Mesaje("In sfarsit, victorie!", 30);
        addObject(mesaje,600,495);
        mesaje.setLocation(703,571);
    }
    
}
