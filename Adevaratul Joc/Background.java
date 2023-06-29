import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends SWorld
{
    /**
     * Constructor for objects of class Background.
     * 
     */
    Scoreboard score = new Scoreboard();
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 620, 1,1000); 
        //GreenfootImage img = new GreenfootImage("blue.jpg");
        //scroller = new Scroller(img,611,288);
        prepare();
    }
    public Scoreboard getScoreboard()
    {
        return score;
    }
    

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        /* GreenfootImage bg = new GreenfootImage ("blue.jpg");
        setScrollingBackground (bg);*/

        wall wall = new wall();
        addObject(wall,812,58);
        wall wall2 = new wall();
        addObject(wall2,741,57);
        wall wall3 = new wall();
        addObject(wall3,678,55);
        wall wall4 = new wall();
        addObject(wall4,625,54);
        wall wall5 = new wall();
        addObject(wall5,583,53);
        wall wall6 = new wall();
        addObject(wall6,526,53);
        wall wall7 = new wall();
        addObject(wall7,487,55);
        wall wall8 = new wall();
        addObject(wall8,442,50);
        wall wall9 = new wall();
        addObject(wall9,376,51);
        wall wall10 = new wall();
        addObject(wall10,311,58);
        wall wall11 = new wall();
        addObject(wall11,256,57);
        wall wall12 = new wall();
        addObject(wall12,203,52);
        wall wall13 = new wall();
        addObject(wall13,122,52);
        wall wall14 = new wall();
        addObject(wall14,128,99);
        wall wall15 = new wall();
        addObject(wall15,126,144);
        wall wall16 = new wall();
        addObject(wall16,119,191);
        wall wall17 = new wall();
        addObject(wall17,118,238);
        wall wall18 = new wall();
        addObject(wall18,118,290);
        wall wall19 = new wall();
        addObject(wall19,122,348);
        wall wall20 = new wall();
        addObject(wall20,124,406);
        wall wall21 = new wall();
        addObject(wall21,125,458);
        wall wall22 = new wall();
        addObject(wall22,125,506);
        wall wall23 = new wall();
        addObject(wall23,126,552);
        wall wall24 = new wall();
        addObject(wall24,186,551);
        wall wall25 = new wall();
        addObject(wall25,252,558);
        wall wall26 = new wall();
        addObject(wall26,301,558);
        wall wall27 = new wall();
        addObject(wall27,353,556);
        wall wall28 = new wall();
        addObject(wall28,394,556);
        wall wall29 = new wall();
        addObject(wall29,444,556);
        wall wall30 = new wall();
        addObject(wall30,499,556);
        wall wall31 = new wall();
        addObject(wall31,550,558);
        wall wall32 = new wall();
        addObject(wall32,594,556);
        wall wall33 = new wall();
        addObject(wall33,644,550);
        wall wall34 = new wall();
        addObject(wall34,697,550);
        wall wall35 = new wall();
        addObject(wall35,743,560);
        wall wall36 = new wall();
        addObject(wall36,788,554);
        wall wall37 = new wall();
        addObject(wall37,838,554);
        wall wall38 = new wall();
        addObject(wall38,897,550);
        wall wall39 = new wall();
        addObject(wall39,525,520);
        wall wall40 = new wall();
        addObject(wall40,534,478);
        wall wall41 = new wall();
        addObject(wall41,540,426);
        wall wall42 = new wall();
        addObject(wall42,542,373);
        wall wall43 = new wall();
        addObject(wall43,544,328);
        wall wall44 = new wall();
        addObject(wall44,550,287);
        wall wall45 = new wall();
        addObject(wall45,506,391);
        wall wall46 = new wall();
        addObject(wall46,468,393);
        wall wall47 = new wall();
        addObject(wall47,432,391);
        wall wall48 = new wall();
        addObject(wall48,394,391);
        wall wall49 = new wall();
        addObject(wall49,352,392);
        maistrul maistrul = new maistrul();
        addObject(maistrul,783,179);
        Scoreboard scoreboard = new Scoreboard();
        addObject(scoreboard,56,581);
        floare floare = new floare();
        addObject(floare,675,470);
        floare floare2 = new floare();
        addObject(floare2,675,400);
        floare floare3 = new floare();
        addObject(floare3,686,354);
        floare floare4 = new floare();
        addObject(floare4,452,295);
        floare floare5 = new floare();
        addObject(floare5,435,484);
        liftClosed liftclosed = new liftClosed();
        addObject(liftclosed,887,413);
        scoreboard.setLocation(148,592);
        maistrul.setLocation(768,343);
        box box = new box();
        addObject(box,761,226);
        box.setLocation(677,106);
        box box2 = new box();
        addObject(box2,797,231);
        box box3 = new box();
        addObject(box3,803,189);
        box3.setLocation(797,181);
        box box4 = new box();
        addObject(box4,904,240);
        box box5 = new box();
        addObject(box5,907,187);
        box4.setLocation(905,236);
        box4.setLocation(907,234);
        box2.setLocation(799,298);
        box3.setLocation(800,251);
        maistrul.setLocation(734,413);
        box box6 = new box();
        addObject(box6,744,267);
        box6.setLocation(744,255);
        box box7 = new box();
        addObject(box7,332,176);
        box7.setLocation(334,193);
        scoreboard.setLocation(79,23);
    }
}/*
/*import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     
    private void prepare()
    {
        
    }
}
   
   */