import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartWorld extends World
{

    /**
     * Constructor for objects of class StartWorld.
     * 
     */
    
    
    public StartWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        
        
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public static final GreenfootSound menuMusic = new GreenfootSound("Main_Menu_Theme.mp3");
    private void prepare()
    {
        Level.battleMusic.stop();
        FinishedLevel.victory.stop();
        ShopBackground.shopMusic.stop();
        YouWon.victory.stop();
        Defeat.defeat.stop();
        
        
        if(boatProperties.muzicaMeniu){
            menuMusic.playLoop();
            //shopTheme.stop();
        }
        /*PlayButton playbutton = new PlayButton();
        addObject(playbutton,399,442);
        playbutton.setLocation(417,390);
        Optiuni optiuni = new Optiuni();
        addObject(optiuni,432,527);
        optiuni.setLocation(407,494+30);
        playbutton.setLocation(421,391);*/
        PlayButton playbutton = new PlayButton();
        addObject(playbutton,406,270);
        Optiuni optiuni = new Optiuni();
        addObject(optiuni,421,569);
        Instructions instructions = new Instructions();
        addObject(instructions,451,452);
        instructions.setLocation(438,535);
        playbutton.setLocation(418,413);
        optiuni.setLocation(130,42);
    }
    
}
