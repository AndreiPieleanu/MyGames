import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectLevel extends World
{

    /**
     * Constructor for objects of class SelectLevel.
     * 
     */
    
    public static int levelSituation = 3, levelsUnlocked = 3;
    public SelectLevel()
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
        Lock lock = new Lock();
        Lock lock2 = new Lock();
        OptiuniButton optiunibutton = new OptiuniButton();
        MeniuButton meniubutton = new MeniuButton();
        if(OptiuniGUI.nr == 1){
            StoryofScrappie.menu_music.playLoop();
            Nivel1.lvl1.stop();
            Nivel2.lvl2.stop();
            Nivel3.boss_music.stop();
            GameOverWorld.defeat.stop();
            YouWinWorld.victory.stop();
        }
        //cum sa arate SelectLevel de fiecare data cand termini unul dintre niveluri
        if(SelectLevel.levelsUnlocked == 1){
            addObject(lock,345,247);
            addObject(lock2,539,212);
            addObject(optiunibutton,432,399);
            optiunibutton.setLocation(543,451);

            addObject(meniubutton,283,448);
            meniubutton.setLocation(263,448);
            optiunibutton.setLocation(539,450);
            meniubutton.setLocation(228,465);
            optiunibutton.setLocation(536,464);
            lock2.setLocation(535,288);
            lock.setLocation(375,288);
            ShopButton sb = new ShopButton();
            addObject(sb, 377, 465);
            sb.setLocation(377, 465);
        }
        if(SelectLevel.levelsUnlocked == 2){
            removeObject(lock);
            level2 lv2 = new level2();
            addObject(lv2, 375, 288);
            lv2.setLocation(375, 288);
            lock2.setLocation(535,288);
            addObject(optiunibutton,432,399);
            optiunibutton.setLocation(543,451);

            addObject(meniubutton,283,448);
            meniubutton.setLocation(263,448);
            optiunibutton.setLocation(539,450);
            meniubutton.setLocation(228,465);
            optiunibutton.setLocation(536,464);
            addObject(lock2, 535, 288);
            lock2.setLocation(535,288);
            
            ShopButton sb = new ShopButton();
            addObject(sb, 377, 465);
            sb.setLocation(377, 465);
        }
        if(SelectLevel.levelsUnlocked == 3){
            removeObject(lock);
            removeObject(lock2);
            level2 lv2 = new level2();
            addObject(lv2, 375, 288);
            lv2.setLocation(375, 288);
            level3 lv3 = new level3();
            addObject(lv3, 375, 288);
            lv3.setLocation(535, 288);
            addObject(optiunibutton,432,399);
            optiunibutton.setLocation(543,451);
            addObject(meniubutton,283,448);
            meniubutton.setLocation(263,448);
            optiunibutton.setLocation(539,450);
            meniubutton.setLocation(228,465);
            optiunibutton.setLocation(536,464);
            ShopButton sb = new ShopButton();
            addObject(sb, 377, 465);
            sb.setLocation(377, 465);
        }
        level1 level1 = new level1();
        addObject(level1,222,302);
        level1.setLocation(215, 288);
        
        mute m = new mute();
        addObject(m, 799, 599);
    }
}
