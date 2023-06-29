import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectLevel extends World
{
    public SelectLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1);
        
        /*if(boatProperties.muzicaMeniu && !StartWorld.menuMusic.isPlaying()){
            StartWorld.menuMusic.setVolume(40);
            StartWorld.menuMusic.playLoop();
            StartWorld.battleTheme.stop();
            StartWorld.cannon.stop();
            StartWorld.shopTheme.stop();
            StartWorld.sword.stop();
        }*/
        prepare();
        modifyShipStats();
        
    }
    private void modifyShipStats(){
        switch(boatProperties.hullLevel){
            case 1:
            boatProperties.hp=150;
            boatProperties.tunuri=15;
            break;
            case 2:
            boatProperties.hp=300;
            boatProperties.tunuri=30;
            break;
            case 3:
            if(boatProperties.catargLevel == 1)
                boatProperties.viteza = 0;
            boatProperties.hp=400;
            boatProperties.tunuri=50;
            break;
        }
        switch(boatProperties.carmaLevel){
            case 1:
            boatProperties.turn = 3;
            break;
            case 2:
            boatProperties.turn = 5;
            break;
            case 3:
            boatProperties.turn = 6;
            break;
        }
        switch(boatProperties.catargLevel){
            case 1:
            boatProperties.viteza = 3;
            break;
            case 2:
            boatProperties.viteza = 4;
            break;
            case 3:
            boatProperties.viteza = 5;
            break;
        }
        switch(boatProperties.echipajLevel){
            case 1:
            boatProperties.echipaj = 100;
            boatProperties.ratieInamic = 1;
            break;
            case 2:
            boatProperties.echipaj = 150;
            boatProperties.ratieInamic = 2;
            break;
            case 3:
            boatProperties.echipaj = 180;
            boatProperties.ratieInamic = 3;
            break;
        }
        switch(boatProperties.tunuriLevel){
            case 1:
            boatProperties.dmg = 10;
            boatProperties.cannonDelay = 200;
            boatProperties.yourCannonSpeed = 6;
            break;
            case 2:
            boatProperties.dmg = 15;
            boatProperties.cannonDelay = 220;
            boatProperties.yourCannonSpeed = 8;
            break;
            case 3:
            boatProperties.dmg = 25;
            boatProperties.cannonDelay = 240;
            boatProperties.yourCannonSpeed = 10;
            break;
        }
        if(boatProperties.nivelulNavei == -1){
            boatProperties.nivelulNavei = 1;
        }
    }
    
    
    private void prepare(){
        if(boatProperties.niveluriTerminate[2] == 1){
            boatProperties.nivelulNavei = 2;
        }
        if(boatProperties.niveluriTerminate[6] == 1){
            boatProperties.nivelulNavei = 3;
        }
        for(int i=0;i<boatProperties.niveluriTerminate.length;i++){
            CheckLevelIcon icon = new CheckLevelIcon(i, boatProperties.niveluriTerminate[i]);
            addObject(icon, boatProperties.indexi[i][0], boatProperties.indexi[i][1]);
        }
        int in=0;
        for(int i=0;i<boatProperties.niveluriTerminate.length;i++){
            if(boatProperties.niveluriTerminate[i] == 1){
                in=i;
            }
        }
        in--;
        if(in == -1){
            addObject(new ShipIcon(), 100, 580);
        }
        else
            addObject(new ShipIcon(), boatProperties.indexi[in][0], boatProperties.indexi[in][1]);
        addObject(new Mesaje("Magazin"), 800, 580);
        addObject(new Mesaje("Meniu principal", new StartWorld()), 800, 540);
        
    }
}

