import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mute here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mute extends Actors
{
    /**
     * Act - do whatever the mute wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        if(OptiuniGUI.nr%2 == 1){
            if(getWorld() instanceof Nivel1){
                Nivel1.lvl1.playLoop();
            }
            else if(getWorld() instanceof Nivel2)
                Nivel2.lvl2.playLoop();
            else if(getWorld() instanceof Nivel3)
                Nivel3.boss_music.playLoop();
            else if (getWorld() instanceof StoryofScrappie || getWorld() instanceof SelectLevel)
                StoryofScrappie.menu_music.playLoop();
            else if (getWorld() instanceof YouWinWorld)
                YouWinWorld.victory.playLoop();
        }
        else{
            Nivel1.lvl1.pause();
            Nivel2.lvl2.pause();
            Nivel3.boss_music.pause();
            StoryofScrappie.menu_music.pause();
            YouWinWorld.victory.pause();
        }
    }   
    
}