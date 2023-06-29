import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShopBackground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShopBackground extends World
{

    /**
     * Constructor for objects of class ShopBackground.
     * 
     */
     Hull hull = new Hull();
     Carma carma = new Carma();
     Catarg catarg = new Catarg();
     Echipaj echipaj = new Echipaj();
     Tunuri tunuri = new Tunuri();
     public static GreenfootSound shopMusic = new GreenfootSound("Shop_Theme.mp3");
    public ShopBackground()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        StartWorld.menuMusic.stop();
        FinishedLevel.victory.stop();
        Defeat.defeat.stop();
        YouWon.victory.stop();
        Level.battleMusic.stop();
        
        if(boatProperties.muzicaMagazin){
            shopMusic.playLoop();
        }
        
        //prepare();
        /*if(boatProperties.muzicaMagazin){
            StartWorld.shopTheme.setVolume(50);
            StartWorld.shopTheme.playLoop();
            if(StartWorld.menuMusic.isPlaying())
                StartWorld.menuMusic.stop();
            if(StartWorld.battleTheme.isPlaying())
                StartWorld.battleTheme.stop();
            if(StartWorld.cannon.isPlaying())
                StartWorld.cannon.stop();
            if(StartWorld.sword.isPlaying())
                StartWorld.sword.stop();
        }*/
    }
    
    
    int ok=1;
    public void act(){
        if(ok == 1){
            prepare();
            ok=0;
        }
    }
    private void prepare(){
       
        if(boatProperties.hullLevel == -1){
            boatProperties.hullLevel = 1;
        }
        if(boatProperties.carmaLevel == -1){
            boatProperties.carmaLevel = 1;
        }
        if(boatProperties.catargLevel == -1){
            boatProperties.catargLevel = 1;
        }
        if(boatProperties.echipajLevel == -1){
            boatProperties.echipajLevel = 1;
        }
        if(boatProperties.tunuriLevel == -1){
            boatProperties.tunuriLevel = 1;
        }
        if(boatProperties.nivelulNavei == -1){
            boatProperties.nivelulNavei = 3;
        }
        
        
        switch(boatProperties.hullLevel){
            case 1:
            hull.setImage("shipComponents/hull1.png");
            break;
            case 2:
            hull.setImage("shipComponents/hull2.png");
            break;
            case 3:
            hull.setImage("shipComponents/hull3.png");
            break;
        }
        switch(boatProperties.carmaLevel){
            case 1:
            carma.setImage("shipComponents/carma1.png");
            break;
            case 2:
            carma.setImage("shipComponents/carma2.png");
            break;
            case 3:
            carma.setImage("shipComponents/carma3.png");
            break;
        }
        switch(boatProperties.catargLevel){
            case 1:
            catarg.setImage("shipComponents/catarg1.png");
            break;
            case 2:
            catarg.setImage("shipComponents/catarg2.png");
            break;
            case 3:
            catarg.setImage("shipComponents/catarg3.png");
            break;
        }
        switch(boatProperties.echipajLevel){
            case 1:
            echipaj.setImage("shipComponents/echipaj1.png");
            break;
            case 2:
            echipaj.setImage("shipComponents/echipaj2.png");
            break;
            case 3:
            echipaj.setImage("shipComponents/echipaj3.png");
            break;
        }
        switch(boatProperties.tunuriLevel){
            case 1:
            tunuri.setImage("shipComponents/tunuri1.png");
            break;
            case 2:
            tunuri.setImage("shipComponents/tunuri2.png");
            break;
            case 3:
            tunuri.setImage("shipComponents/tunuri3.png");
            break;
        }

        if(hull.getLevel() == 3){
            addObject(hull, 450, 450);
            if(catarg.getLevel() == 3)
                addObject(catarg, 430, 334);
            if(catarg.getLevel() == 2)
                addObject(catarg, 488, 320);
            if(catarg.getLevel() == 1)
                addObject(catarg, 450, 323);
            addObject(echipaj,338,360);
            addObject(tunuri,470,460);
            addObject(carma, 286, 395);
            
        }else{
            if(hull.getLevel() == 1){
                addObject(hull, 450, 475);
                if(catarg.getLevel() == 3)
                    addObject(catarg, 405, 359);
                if(catarg.getLevel() == 2)
                    addObject(catarg, 432, 354);
                if(catarg.getLevel() == 1)
                    addObject(catarg, 432, 356);
                addObject(echipaj,330,395);
                addObject(carma, 274, 430);
                addObject(tunuri,430,480);
            }else{
                addObject(hull, 450, 475);
                //addObject(carma, 480, 320);
                if(catarg.getLevel() == 3)
                    addObject(catarg, 401, 352);
                if(catarg.getLevel() == 2)
                    addObject(catarg, 432, 354);
                if(catarg.getLevel() == 1)
                    addObject(catarg, 442, 346);
                addObject(echipaj,394,389);
                addObject(carma, 341, 424);
                addObject(tunuri,430,480);
            }
        }
        UpgradeCarma upgradecarma = new UpgradeCarma();
        //addObject(upgradecarma,boatProperties.hullLevel != 1 ? carma.getX()/2+50 : carma.getX()/2,carma.getY());
        addObject(upgradecarma,carma.getX(),carma.getY()-60);
        UpgradeCatarg upgradecatarg = new UpgradeCatarg();
        //addObject(upgradecatarg,boatProperties.catargLevel != 2 ? catarg.getX() : catarg.getX()-100,catarg.getY()/2+100);
        addObject(upgradecatarg, catarg.getX()+60, catarg.getX()-100);
        UpgradeEchipaj upgradeechipaj = new UpgradeEchipaj();
        addObject(upgradeechipaj,echipaj.getX()+40,echipaj.getY()+30);
        UpgradeHull upgradehull = new UpgradeHull();
        addObject(upgradehull,hull.getX()/2 + 100,hull.getY()+20);
        UpgradeTunuri upgradetunuri = new UpgradeTunuri();
        addObject(upgradetunuri,hull.getX(),hull.getY()+10);
        addObject(new Mesaje("Inapoi la harta", new SelectLevel()), 770, 550);
    }
    
}
