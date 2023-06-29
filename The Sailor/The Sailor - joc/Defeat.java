import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Defeat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Defeat extends World
{
    public static final GreenfootSound defeat = new GreenfootSound("defeat.mp3");
    public Defeat()
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
        FinishedLevel.victory.stop();
        ShopBackground.shopMusic.stop();
        YouWon.victory.stop();
        Level.battleMusic.stop();
        
        if(boatProperties.muzicaInfrangere)
            defeat.play();
        Mesaje mesaje = new Mesaje("Restart joc", 35);
        addObject(mesaje,444,563);
        mesaje.setLocation(519,575);
        for(int i=1;i<boatProperties.niveluriTerminate.length;i++){
            boatProperties.niveluriTerminate[i] = 0;
        }
    }
}
