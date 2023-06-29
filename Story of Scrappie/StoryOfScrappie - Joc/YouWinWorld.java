import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouWinWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouWinWorld extends World
{

    /**
     * Constructor for objects of class YouWinWorld.
     * 
     */
    public static final GreenfootSound victory = new GreenfootSound("victory.mp3");
    public YouWinWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        victory.playLoop();
        Nivel1.lvl1.stop();
        Nivel2.lvl2.stop();
        Nivel3.boss_music.stop();
        GameOverWorld.defeat.stop();
        StoryofScrappie.menu_music.stop();
        MeniuButton meniubutton = new MeniuButton();
        addObject(meniubutton,484,532);
        meniubutton.setLocation(38,73);
        OptiuniButton optiunibutton = new OptiuniButton();
        addObject(optiunibutton,306,160);
        optiunibutton.setLocation(46,39);
        mute mute2 = new mute();
        addObject(mute2,760,571);
    }
}
