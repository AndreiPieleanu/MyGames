import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * 
 * 
 * Write a description of class Nivel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Nivel3 extends World
{
    /**
     * Constructor for objects of class Nivel3.
     * 
     */
    public static final GreenfootSound boss_music = new GreenfootSound("boss_music.mp3");
    public Nivel3()
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
        
        //daca interfata are pornita muzica de nivel3
        if(OptiuniGUI.nr == 1){
            boss_music.play();
            Nivel2.lvl2.stop();
            Nivel1.lvl1.stop();
            StoryofScrappie.menu_music.stop();
            GameOverWorld.defeat.stop();
            YouWinWorld.victory.stop();
        }
        TeslaTower.leverTras = false;
        SelectLevel.levelSituation = 3;
        WallPereteO wallpereteo = new WallPereteO();
        addObject(wallpereteo,122,445);
        WallPereteO wallpereteo2 = new WallPereteO();
        addObject(wallpereteo2,274,445);
        WallPereteO wallpereteo3 = new WallPereteO();
        addObject(wallpereteo3,405,452);
        WallPereteO wallpereteo4 = new WallPereteO();
        addObject(wallpereteo4,496,445);
        WallPereteO wallpereteo5 = new WallPereteO();
        addObject(wallpereteo5,589,443);
        WallPereteO wallpereteo6 = new WallPereteO();
        addObject(wallpereteo6,623,443);
        wallpereteo.setLocation(79,590);
        wallpereteo2.setLocation(152,590);
        wallpereteo3.setLocation(225,590);
        wallpereteo4.setLocation(299,590);
        wallpereteo4.setLocation(299,590);
        wallpereteo6.setLocation(676,456);
        wallpereteo5.setLocation(373,590);
        wallpereteo6.setLocation(447,590);
        WallPereteO wallpereteo7 = new WallPereteO();
        addObject(wallpereteo7,286,418);
        WallPereteO wallpereteo8 = new WallPereteO();
        addObject(wallpereteo8,352,421);
        WallPereteO wallpereteo9 = new WallPereteO();
        addObject(wallpereteo9,451,419);
        WallPereteO wallpereteo10 = new WallPereteO();
        addObject(wallpereteo10,512,419);
        wallpereteo7.setLocation(521,589);
        wallpereteo8.setLocation(595,589);
        wallpereteo9.setLocation(668,589);
        wallpereteo10.setLocation(742,590);
        Wall wall = new Wall();
        addObject(wall,623,345);
        wall.setLocation(788,599);
        WallPereteV wallperetev = new WallPereteV();
        addObject(wallperetev,504,503);
        WallPereteV wallperetev2 = new WallPereteV();
        addObject(wallperetev2,498,448);
        WallPereteV wallperetev3 = new WallPereteV();
        addObject(wallperetev3,499,414);
        WallPereteV wallperetev4 = new WallPereteV();
        addObject(wallperetev4,498,387);
        WallPereteV wallperetev5 = new WallPereteV();
        addObject(wallperetev5,498,342);
        WallPereteV wallperetev6 = new WallPereteV();
        addObject(wallperetev6,498,285);
        WallPereteV wallperetev7 = new WallPereteV();
        addObject(wallperetev7,495,228);
        WallPereteV wallperetev8 = new WallPereteV();
        addObject(wallperetev8,495,211);
        WallPereteV wallperetev9 = new WallPereteV();
        addObject(wallperetev9,490,143);
        WallPereteV wallperetev10 = new WallPereteV();
        addObject(wallperetev10,490,29);
        wallperetev.setLocation(504,503);
        wallperetev3.setLocation(798,466);
        wallperetev2.setLocation(798,393);
        wallperetev4.setLocation(798,320);
        wallperetev5.setLocation(798,247);
        wallperetev6.setLocation(798,175);
        wallperetev7.setLocation(798,102);
        wallperetev8.setLocation(797,44);
        Wall wall2 = new Wall();
        addObject(wall2,499,247);
        wall2.setLocation(791,3);
        Wall wall3 = new Wall();
        addObject(wall3,225,359);
        Wall wall4 = new Wall();
        addObject(wall4,169,221);
        wall3.setLocation(7,11);
        wall4.setLocation(19,588);
        wallperetev10.setLocation(10,70);
        wallperetev9.setLocation(10,144);
        wallperetev9.setLocation(10,143);
        WallPereteV wallperetev11 = new WallPereteV();
        addObject(wallperetev11,400,121);
        WallPereteV wallperetev12 = new WallPereteV();
        addObject(wallperetev12,399,192);
        WallPereteV wallperetev13 = new WallPereteV();
        addObject(wallperetev13,400,220);
        WallPereteV wallperetev14 = new WallPereteV();
        addObject(wallperetev14,404,279);
        WallPereteV wallperetev15 = new WallPereteV();
        addObject(wallperetev15,406,309);
        WallPereteV wallperetev16 = new WallPereteV();
        addObject(wallperetev16,405,341);
        WallPereteV wallperetev17 = new WallPereteV();
        addObject(wallperetev17,405,378);
        wallperetev11.setLocation(10,216);
        wallperetev12.setLocation(10,289);
        wallperetev13.setLocation(10,362);
        wallperetev14.setLocation(10,435);
        wallperetev15.setLocation(10,508);
        wallperetev16.setLocation(9,585);
        wall4.setLocation(19,589);
        WallPereteO wallpereteo11 = new WallPereteO();
        addObject(wallpereteo11,110,236);
        WallPereteO wallpereteo12 = new WallPereteO();
        addObject(wallpereteo12,167,236);
        WallPereteO wallpereteo13 = new WallPereteO();
        addObject(wallpereteo13,207,236);
        WallPereteO wallpereteo14 = new WallPereteO();
        addObject(wallpereteo14,269,232);
        WallPereteO wallpereteo15 = new WallPereteO();
        addObject(wallpereteo15,336,236);
        WallPereteO wallpereteo16 = new WallPereteO();
        addObject(wallpereteo16,447,239);
        WallPereteO wallpereteo17 = new WallPereteO();
        addObject(wallpereteo17,494,238);
        WallPereteO wallpereteo18 = new WallPereteO();
        addObject(wallpereteo18,555,238);
        WallPereteO wallpereteo19 = new WallPereteO();
        addObject(wallpereteo19,607,236);
        wallpereteo11.setLocation(67,4);
        wallpereteo12.setLocation(141,5);
        wallpereteo13.setLocation(215,5);
        wallpereteo14.setLocation(289,5);
        wallpereteo15.setLocation(363,6);
        wallpereteo16.setLocation(437,6);
        wallpereteo17.setLocation(511,6);
        wallpereteo18.setLocation(585,6);
        wallpereteo19.setLocation(659,6);
        WallPereteO wallpereteo20 = new WallPereteO();
        addObject(wallpereteo20,620,193);
        wallpereteo20.setLocation(733,6);
        wall2.setLocation(791,3);
        wallperetev17.setLocation(797,539);
        wall.setLocation(788,598);
        removeObject(wallperetev);
        BackButton backbutton = new BackButton();
        addObject(backbutton,119,120);
        backbutton.setLocation(68,47);
        OptiuniButton optiunibutton = new OptiuniButton();
        addObject(optiunibutton,455,135);
        optiunibutton.setLocation(78,17);
        Scrappie scrappie = new Scrappie();
        addObject(scrappie,102,289);
        scrappie.setLocation(124,289);
        Portal portal = new Portal();
        addObject(portal,473,298);
        portal.setLocation(76,284);
        scrappie.setLocation(130,289);
        portal.setPortalLevel(1);
        LaserBattery laserbattery = new LaserBattery();
        addObject(laserbattery,175,113);
        LaserBattery laserbattery2 = new LaserBattery();
        addObject(laserbattery2,171,480);
        LaserBattery laserbattery3 = new LaserBattery();
        addObject(laserbattery3,710,283);
        Aid aid = new Aid();
        addObject(aid,713,506);
        Aid aid2 = new Aid();
        addObject(aid2,705,79);
        RobotulMalefic robotulmalefic = new RobotulMalefic();
        addObject(robotulmalefic,686,281);
        HealthBar healthbar = new HealthBar();
        addObject(healthbar,137,203);

        
        LaserBattery laserbattery4 = new LaserBattery();
        addObject(laserbattery4,230,114);
        LaserBattery laserbattery5 = new LaserBattery();
        addObject(laserbattery5,225,481);
        mute mute2 = new mute();
        addObject(mute2,748,580);
        
    }
}
