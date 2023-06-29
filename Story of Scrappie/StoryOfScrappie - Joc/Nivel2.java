import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel2 extends SWorld
{
    
    /**
     * Constructor for objects of class Nivel2.
     * 
     */
    
    public static final GreenfootSound lvl2 = new GreenfootSound("lvl2.mp3");
    public Nivel2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1, 3000); 
        prepare();
    }
    
    
    private void prepare(){
        if(OptiuniGUI.nr == 1){
            //lvl2.playLoop();
            Nivel1.lvl1.stop();
            StoryofScrappie.menu_music.stop();
            Nivel1.lvl1.stop();
            Nivel3.boss_music.stop();
            GameOverWorld.defeat.stop();
            YouWinWorld.victory.stop();
        }
        TeslaTower.leverTras = false;
        SelectLevel.levelSituation = 2;
        Scrappie s = new Scrappie();
        setMainActor(s, 0, 0);
        mainActor.setLocation(-1020, 250);
        GreenfootImage bg = new GreenfootImage("Nivel2.png");
        setScrollingBackground(bg);
        Wall wall = new Wall();
        addObject(wall,111,306);
        Wall wall2 = new Wall();
        addObject(wall2,207,312);
        Wall wall3 = new Wall();
        addObject(wall3,254,307);
        Wall wall4 = new Wall();
        addObject(wall4,360,307);
        Wall wall5 = new Wall();
        addObject(wall5,436,306);
        Wall wall6 = new Wall();
        addObject(wall6,488,306);
        Wall wall7 = new Wall();
        addObject(wall7,565,307);
        Wall wall8 = new Wall();
        addObject(wall8,644,307);
        wall.setLocation(22-1100,371);
        wall2.setLocation(67-1100,371);
        wall3.setLocation(111-1100,371);
        wall4.setLocation(155-1144,416);
        wall5.setLocation(155-1144,461);
        wall6.setLocation(155-1144,506);
        wall7.setLocation(155-1144,551);
        wall8.setLocation(155-1144,593);

        Wall wall9 = new Wall();
        addObject(wall9,149,364);

        Wall wall10 = new Wall();
        addObject(wall10,233,373);

        Wall wall11 = new Wall();
        addObject(wall11,309,369);

        Wall wall12 = new Wall();
        addObject(wall12,243,287);
        Wall wall13 = new Wall();
        addObject(wall13,292,282);
        Wall wall14 = new Wall();
        addObject(wall14,352,177);
        Wall wall15 = new Wall();
        addObject(wall15,397,174);
        Wall wall16 = new Wall();
        addObject(wall16,436,172);
        Wall wall17 = new Wall();
        addObject(wall17,480,171);
        Wall wall18 = new Wall();
        addObject(wall18,525,169);
        Wall wall19 = new Wall();
        addObject(wall19,620,286);
        Wall wall20 = new Wall();
        addObject(wall20,673,283);
        Wall wall21 = new Wall();
        addObject(wall21,749,113);
        Wall wall22 = new Wall();
        addObject(wall22,659,313);

        wall9.setLocation(138-950,370);
        wall10.setLocation(183-950,370);
        wall11.setLocation(93-950,370);
        wall12.setLocation(248-870,289);
        wall13.setLocation(293-870,289);
        wall14.setLocation(376-850,220);
        wall15.setLocation(421-850,220);
        wall16.setLocation(466-850,220);
        wall17.setLocation(511-850,220);
        wall17.setLocation(511-850,220);
        wall18.setLocation(556-850,220);
        wall19.setLocation(648-760,110);
        wall20.setLocation(693-760,110);
        wall21.setLocation(738-760,110);
        wall22.setLocation(608-760,306);
        addObject(new Wall(), 608-800,306);

        Portal portal = new Portal();
        addObject(portal,-1070,305);
        Portal portal2 = new Portal();
        addObject(portal2,1840,295);
        portal.setPortalType(1);
        portal2.setPortalType(2);
        portal2.setPortalLevel(3);

        Wall wall23 = new Wall();
        addObject(wall23,113,106);
        Wall wall24 = new Wall();
        addObject(wall24,163,103);
        Wall wall25 = new Wall();
        addObject(wall25,215,102);
        Wall wall26 = new Wall();
        addObject(wall26,274,102);
        Wall wall27 = new Wall();
        addObject(wall27,330,103);
        Wall wall28 = new Wall();
        addObject(wall28,389,103);
        Wall wall29 = new Wall();
        addObject(wall29,459,103);
        wall23.setLocation(113,104);
        wall24.setLocation(158,104);
        wall25.setLocation(203,104);
        wall26.setLocation(248,104);
        wall27.setLocation(293,104);
        wall28.setLocation(338,105);
        wall28.setLocation(338,104);
        wall29.setLocation(383,104);

        Wall wall30 = new Wall();
        addObject(wall30,202,392);
        Wall wall31 = new Wall();
        addObject(wall31,202,336);
        Wall wall32 = new Wall();
        addObject(wall32,203,279);
        Wall wall33 = new Wall();
        addObject(wall33,265,392);
        Wall wall34 = new Wall();
        addObject(wall34,329,390);
        Wall wall35 = new Wall();
        addObject(wall35,384,389);
        Wall wall36 = new Wall();
        addObject(wall36,450,386);
        wall33.setLocation(247,392);
        wall34.setLocation(292,392);
        wall35.setLocation(337,392);
        wall36.setLocation(382,392);
        wall31.setLocation(202,347);
        wall32.setLocation(202,301);
        Robotel2 robotel2 = new Robotel2();
        addObject(robotel2,285,295);
        robotel2.setLocation(309,300);
        robotel2.setStanga_dreapta('s');
        LaserBattery laserbattery = new LaserBattery();
        addObject(laserbattery,271,29);
        laserbattery.setLocation(247,57);
        Wall wall37 = new Wall();
        addObject(wall37,454,313);
        wall37.setLocation(426,383);
        TeslaTower teslatower = new TeslaTower();
        addObject(teslatower,130,29);
        teslatower.setLocation(112,43);
        wall31.setLocation(157,392);
        wall32.setLocation(112,392);
        wall37.setLocation(512,161);
        Wall wall38 = new Wall();
        addObject(wall38,622,109);
        Wall wall39 = new Wall();
        addObject(wall39,672,103);
        Wall wall40 = new Wall();
        addObject(wall40,727,99);
        wall39.setLocation(701,130);
        wall40.setLocation(755,107);
        wall38.setLocation(633,109);
        wall39.setLocation(678,109);
        wall40.setLocation(723,109);
        wall40.setLocation(796,109);
        wall39.setLocation(751,109);
        wall38.setLocation(706,109);
        Wall wall41 = new Wall();
        addObject(wall41,643,110);
        wall41.setLocation(661,109);
        Wall wall42 = new Wall();
        addObject(wall42,554,366);
        wall42.setLocation(530,394);
        WallPereteO wallpereteo = new WallPereteO();
        addObject(wallpereteo,255,450);
        WallPereteO wallpereteo2 = new WallPereteO();
        addObject(wallpereteo2,252,506);
        wallpereteo.setLocation(410,530);
        wallpereteo2.setLocation(336,530);
        WallPereteV wallperetev = new WallPereteV();
        addObject(wallperetev,461,289);
        WallPereteV wallperetev2 = new WallPereteV();
        addObject(wallperetev2,461,329);
        wallperetev.setLocation(223,409);
        wallperetev2.setLocation(223,475);
        wallperetev2.setLocation(222,482);
        wallpereteo2.setLocation(253,524);
        wallpereteo.setLocation(326,525);
        wallpereteo.setLocation(325,524);
        WallPereteO wallpereteo3 = new WallPereteO();
        addObject(wallpereteo3,469,521);
        wallpereteo3.setLocation(399,524);
        wallpereteo3.setLocation(361,524);
        wallpereteo3.setLocation(368,524);
        Lever lever = new Lever();
        addObject(lever,287,483);
        lever.setLocation(245,466);
        lever.getImage().mirrorHorizontally();
        Robotel2 robotel22 = new Robotel2();
        addObject(robotel22,355,450);
        laserbattery.setLocation(390,58);
        robotel22.setLocation(290,13);
        Robotel2 robotel23 = new Robotel2();
        addObject(robotel23,703,51);
        robotel23.setLocation(620,224);
        wall41.setLocation(659,154);
        wall38.setLocation(704,153);
        wall38.setLocation(704,154);
        wall39.setLocation(749,154);
        robotel23.setLocation(762,63);
        wall40.setLocation(794,150);
        wall42.setWeirdWall(true);
        wall23.setLocation(113,103);
        robotel22.setLocation(291,28);
        wall23.setLocation(113,102);
        wall29.setLocation(383,101);
        laserbattery.setLocation(389,55);
        teslatower.setLocation(113,40);
        robotel23.setLocation(740,80);
        robotel23.setLocation(740,79);
        wall41.setLocation(659,153);
        wall36.setLocation(382,391);
        robotel2.setLocation(309,318);
        wall36.setLocation(382,390);
        wall36.setLocation(382,383);
        wall32.setLocation(112,383);
        wall35.setLocation(337,391);
        wall35.setLocation(337,392);
        wall29.setLocation(383,96);
        wall23.setLocation(113,96);
        teslatower.setLocation(164,43);
        wall41.setLocation(659,145);
        wall40.setLocation(794,145);
        wall41.setLocation(659,148);
        removeObject(wallperetev);
        removeObject(wallperetev2);
        removeObject(wallpereteo2);
        removeObject(wallpereteo);
        removeObject(wallpereteo3);
        Wall wall43 = new Wall();
        addObject(wall43,183,434);
        Wall wall44 = new Wall();
        addObject(wall44,185,484);
        Wall wall45 = new Wall();
        addObject(wall45,186,534);
        Wall wall46 = new Wall();
        addObject(wall46,241,544);
        Wall wall47 = new Wall();
        addObject(wall47,296,540);
        Wall wall48 = new Wall();
        addObject(wall48,342,540);
        Wall wall49 = new Wall();
        addObject(wall49,389,540);
        wall43.setLocation(202,437);
        wall44.setLocation(204,481);
        wall43.setLocation(205,436);
        wall45.setLocation(204,526);
        wall46.setLocation(249,535);
        wall47.setLocation(294,535);
        wall48.setLocation(339,536);
        wall49.setLocation(384,536);
        wall48.setLocation(339,535);
        wall49.setLocation(384,535);
        robotel2.setLocation(309,323);
        robotel22.setLocation(250,37);
        robotel23.setLocation(739,88);
        robotel2.setLocation(308,325);
        robotel22.setStanga_dreapta('s');
        robotel23.setStanga_dreapta('s');
        Wall wall50 = new Wall();
        addObject(wall50,613,365);
        Wall wall51 = new Wall();
        addObject(wall51,660,363);
        Wall wall52 = new Wall();
        addObject(wall52,707,361);
        Wall wall53 = new Wall();
        addObject(wall53,752,357);
        Wall wall54 = new Wall();
        addObject(wall54,796,357);
        wall50.setLocation(628,372);
        wall51.setLocation(673,372);
        wall52.setLocation(718,372);
        wall53.setLocation(763,372);
        wall54.setLocation(808,372);

        LaserBattery laserbattery2 = new LaserBattery();
        addObject(laserbattery2,697,312);
        laserbattery2.setLocation(716,326);
        LaserBattery laserbattery3 = new LaserBattery();
        addObject(laserbattery3,697,312);
        laserbattery3.setLocation(248-870,289-45);

        Wall wall55 = new Wall();
        addObject(wall55,103,260);
        Wall wall56 = new Wall();
        addObject(wall56,161,260);
        Wall wall57 = new Wall();
        addObject(wall57,221,257);
        Wall wall58 = new Wall();
        addObject(wall58,285,257);
        Wall wall59 = new Wall();
        addObject(wall59,339,256);
        Wall wall60 = new Wall();
        addObject(wall60,380,254);
        Wall wall61 = new Wall();
        addObject(wall61,441,249);
        Wall wall62 = new Wall();
        addObject(wall62,424,252);
        Wall wall63 = new Wall();
        addObject(wall63,476,251);
        Robotel2 robotel24 = new Robotel2();
        addObject(robotel24,270,180);
        robotel24.setStanga_dreapta('s');
        Robotel2 robotel25 = new Robotel2();
        addObject(robotel25,371,180);
        robotel25.setStanga_dreapta('s');
        LaserBattery laserbattery4 = new LaserBattery();
        addObject(laserbattery4,282,213);
        LaserBattery laserbattery5 = new LaserBattery();
        addObject(laserbattery5,331,214);

        laserbattery4.setLocation(285-600,211+250);
        laserbattery5.setLocation(330-600,211+250);
        robotel24.setLocation(214-600,191+250);
        robotel25.setLocation(372-600,190+250);
        wall55.setLocation(110-600,248+250);
        wall56.setLocation(155-600,257+250);
        wall57.setLocation(200-600,257+250);
        wall58.setLocation(245-600,257+250);
        wall59.setLocation(290-600,257+250);
        addObject(new Aid(),245-680,257+250-40);
        wall60.setLocation(335-600,257+250);
        wall61.setLocation(380-600,257+250);
        wall62.setLocation(425-600,257+250);
        wall63.setLocation(470-600,248+250);
        WallPereteV wallperetev34 = new WallPereteV();
        addObject(wallperetev34,554,522);
        wallperetev34.setLocation(401,541);
        robotel2.setLocation(326,469);

        //modifica aparitia tepuselor la inceput, ca mai apoi sa se sincronizeze de la ine
        Spike s1 = new Spike(70, 230);
        addObject(s1, 112, 383 - 40);
        s1.setAgressive(true);
        int x = 112, y = 383 - 32, start = 70, timer = 230;
        for(int i=1;i<=5;i++){
            start+=30;
            x+=45;
            Spike spike = new Spike(start, timer);
            addObject(spike, x, y);
            spike.setAgressive(true);
        }
        Spike s2 = new Spike(start+=30, timer);
        addObject(s2, x+=45, 383 - 40);
        s2.setAgressive(true);

        Spike spike8 = new Spike(50, 200);
        addObject(spike8,471,154);
        spike8.setRotation(270);
        spike8.setLocation(471,159);
        Spike spike9 = new Spike(50, 200);
        addObject(spike9,511,116);
        spike9.setLocation(513,119);
        spike9.setLocation(513,120);
        Spike spike10 = new Spike(50, 200);
        addObject(spike10,552,162);
        spike10.setRotation(90);
        spike10.setLocation(553,159);
        Spike spike11 = new Spike(50, 200);
        addObject(spike11,511,216);
        spike11.setRotation(180);
        spike11.setLocation(512,202);

        BackButton backbutton = new BackButton();
        addObject(backbutton,46,50, true);
        backbutton.setLocation(-1020,20);
        OptiuniButton optiunibutton = new OptiuniButton();
        addObject(optiunibutton,40,70, true);
        optiunibutton.setLocation(-1020,50);

        Wall wall64 = new Wall();
        addObject(wall64,431,233);
        wall64.setLocation(437+950,237);
        wall64.setWeirdWall(true);

        Wall wall65 = new Wall();
        addObject(wall65,582,310);
        Wall wall66 = new Wall();
        addObject(wall66,59,214);
        Wall wall67 = new Wall();
        addObject(wall67,116,211);
        Wall wall68 = new Wall();
        addObject(wall68,174,208);
        Wall wall69 = new Wall();
        addObject(wall69,235,211);
        Wall wall70 = new Wall();
        addObject(wall70,287,210);
        Wall wall71 = new Wall();
        addObject(wall71,341,208);

        wall66.setLocation(71+900,211+100);
        wall67.setLocation(116+900, 211+100);
        wall68.setLocation(161+900,211+100);
        wall69.setLocation(206+900,211+100);
        wall70.setLocation(251+900,211+100);
        wall71.setLocation(296+900,211+100);

        WallPereteO wallpereteo4 = new WallPereteO();
        addObject(wallpereteo4,435,322);
        wallpereteo4.setLocation(219,553);

        TeslaTower teslatower2 = new TeslaTower();
        addObject(teslatower2,574,220);
        wall65.setLocation(582+1000, 310);
        teslatower2.setLocation(582+1000,250);

        Wall wall72 = new Wall();
        addObject(wall72,278,213);
        wall72.setLocation(290+660,218-50);
        TeslaTower teslatower3 = new TeslaTower();
        addObject(teslatower3,262,157);
        teslatower3.setLocation(291+660,157-50);
        WallPereteV wallperetev4 = new WallPereteV();
        addObject(wallperetev4,587,376);
        wallperetev4.setLocation(611,381);
        WallPereteV wallperetev5 = new WallPereteV();
        addObject(wallperetev5,560,340);
        wallperetev5.setLocation(622+200,381);
        LaserBattery laserbattery6 = new LaserBattery();
        addObject(laserbattery6,315,321);
        laserbattery6.setLocation(315,345);
        LaserBattery laserbattery7 = new LaserBattery();
        addObject(laserbattery7,764,307);
        laserbattery7.setLocation(767,326);
        Robotel1 robotel1 = new Robotel1();
        addObject(robotel1,523,293);
        robotel1.setLocation(691,327-12);
        robotel1.setStanga_dreapta('s');

        wall40.setLocation(794,154);
        wall41.setLocation(659,154);
        WallPereteV wallperetev6 = new WallPereteV();
        addObject(wallperetev6,605,108);
        WallPereteV wallperetev7 = new WallPereteV();
        addObject(wallperetev7,665,67);
        wallperetev6.setLocation(642,158);
        wallperetev7.setLocation(653+165,158);

        TeslaTower teslatower4 = new TeslaTower();
        addObject(teslatower4,262,157);
        teslatower4.setLocation(116+900, 211+40);

        Wall wall73 = new Wall();
        addObject(wall73,293,193);
        Wall wall74 = new Wall();
        addObject(wall74,238,191);
        Wall wall75 = new Wall();
        addObject(wall75,181,190);
        Wall wall76 = new Wall();
        addObject(wall76,128,192);
        Wall wall77 = new Wall();
        addObject(wall77,128,235);
        Wall wall78 = new Wall();
        addObject(wall78,128,280);
        Wall wall79 = new Wall();
        addObject(wall79,129,314);
        Wall wall80 = new Wall();
        addObject(wall80,130,357);
        Wall wall81 = new Wall();
        addObject(wall81,132,408);

        wall73.setLocation(263+1625,192+170);
        wall74.setLocation(218+1625,192+170);
        wall75.setLocation(173+1625,192+170);
        wall76.setLocation(128+1625,192+170);
        wall77.setLocation(128+1625,235+170);
        addObject(new Aid(),128+1625,235+170-80);
        wall78.setLocation(128+1625,280+170);
        wall79.setLocation(128+1625,320+170);
        wall80.setLocation(128+1625,360+170);
        wall81.setLocation(128+1625,403+170);

        Nor nor = new Nor();
        addObject(nor,445,312);
        Nor nor2 = new Nor();
        addObject(nor2,585,238);
        Nor nor3 = new Nor();
        addObject(nor3,557,42);
        Nor nor4 = new Nor();
        addObject(nor4,278,189);
        Nor nor5 = new Nor();
        addObject(nor5,54,68);
        Nor nor6 = new Nor();
        addObject(nor6,53,278);
        nor.setLocation(-1020, 55);
        nor2.setLocation(-800, 60);
        nor3.setLocation(-600, 55);
        nor4.setLocation(100, 70);
        nor5.setLocation(200, 40);
        nor6.setLocation(500, 50);
        Aid aid = new Aid();
        addObject(aid,414,327);
        aid.setLocation(359,352);
        HealthBar healthbar2 = new HealthBar();
        addObject(healthbar2,633,522);
        Piesa2 piesa2 = new Piesa2();
        addObject(piesa2,653,80);
        piesa2.setLocation(679,103);
        mute mute2 = new mute();
        addObject(mute2,781,581);
    }
}