import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverWorld extends World
{

    /**
     * Constructor for objects of class GameOverWorld.
     * 
     */
    
    public static final GreenfootSound defeat = new GreenfootSound("defeat.mp3");
    public GameOverWorld()
    {    
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {   
        defeat.play();
        Nivel1.lvl1.stop();
        Nivel2.lvl2.stop();
        StoryofScrappie.menu_music.stop();
        Nivel3.boss_music.stop();
        YouWinWorld.victory.stop();
        GameOver gameover = new GameOver();
        addObject(gameover,398,248);
        RestartButton restartbutton = new RestartButton();
        addObject(restartbutton,400,289);
        mute mute = new mute();
        addObject(mute,765,580);
    }
}
