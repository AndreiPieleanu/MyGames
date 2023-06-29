import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Echipaj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Echipaj extends ShipComponents
{
    /**
     * Act - do whatever the Echipaj wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static boolean isLvl1Bought = true, isLvl2Bought = false, isLvl3Bought = false;
    public int getLevel(){
        return boatProperties.echipajLevel;
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
    public Echipaj(){
        switch(boatProperties.echipajLevel){
            case 1:
            this.setImage("shipComponents/echipaj1.png");
            break;
            case 2:
            this.setImage("shipComponents/echipaj2.png");
            break;
            case 3:
            this.setImage("shipComponents/echipaj3.png");
            break;
        }
    }
    public Echipaj(String s){
        setImage(s);
        super.resizeToShop(getImage(), 170, 170);
        
    }
    public void act() 
    {
        super.selectItem("echipaj upgrade ", getLevelOfItem(), 
        getLevelOfItem()==1?isLvl1Bought:getLevelOfItem()==2?isLvl2Bought:isLvl3Bought, getPrice());
        super.informationAboutItem(this, getLevelOfItem());
        // Add your action code here.
    }    
}
