import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StoryofScrappie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StoryofScrappie extends World
{
    /**
     * Constructor for objects of class StoryofScrappie.
     * 
     */
    
    public static final GreenfootSound menu_music = new GreenfootSound("menu_music.mp3");
    public StoryofScrappie()
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
        //interfata principala a jocului, pune pauza la muzica de invins daca ai pierdut
        //si verifica daca interfata(OptiuniGUI) are pornita muzica de inceput
        GameOverWorld.defeat.pause();
        if(OptiuniGUI.nr == 1){
            menu_music.playLoop();
            Nivel1.lvl1.stop();
            Nivel2.lvl2.stop();
            Nivel3.boss_music.stop();
            GameOverWorld.defeat.stop();
            YouWinWorld.victory.stop();
        }
        PlayButton playbutton = new PlayButton();
        addObject(playbutton,95,253);
        playbutton.setLocation(118,253);
        ExitGame exitgame = new ExitGame();
        addObject(exitgame,101,557);
        exitgame.setLocation(82,565);
        OptiuniButton optiunibutton = new OptiuniButton();
        addObject(optiunibutton,97,405);
        optiunibutton.setLocation(120,405);
        InstructiuniButton instructiunibutton = new InstructiuniButton();
        addObject(instructiunibutton,126,320);
        instructiunibutton.setLocation(131,326);
        PuzzleButton puzzlebutton = new PuzzleButton();
        addObject(puzzlebutton,116,478);
        puzzlebutton.setLocation(133,482);
        mute mute = new mute();
        addObject(mute,772,575);
    }
}
