import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tunuri here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tunuri extends ShipComponents
{
    /**
     * Act - do whatever the Tunuri wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static boolean isLvl1Bought = true, isLvl2Bought = false, isLvl3Bought = false;
    public int getLevel(){
        return boatProperties.tunuriLevel;
    }
    private int levelOfItem;
    public int getLevelOfItem(){
        return this.levelOfItem;
    }
    public void setLevelOfItem(int levelOfItem){
        this.levelOfItem = levelOfItem;
    }
    private int price;
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public Tunuri(){
        switch(boatProperties.tunuriLevel){
            case 1:
            this.setImage("shipComponents/tunuri1.png");
            break;
            case 2:
            this.setImage("shipComponents/tunuri2.png");
            break;
            case 3:
            this.setImage("shipComponents/tunuri3.png");
            break;
        }
    }
    public Tunuri(String s){
        setImage(s);
        super.resizeToShop(getImage(), 150, 150);
        
    }
    public void act() 
    {
        super.selectItem("tunuri upgrade ", getLevelOfItem(), 
        getLevelOfItem()==1?isLvl1Bought:getLevelOfItem()==2?isLvl2Bought:isLvl3Bought, getPrice());
        super.informationAboutItem(this, getLevelOfItem());
        // Add your action code here.
    }    
}
