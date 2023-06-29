import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hull here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hull extends ShipComponents
{
    /**
     * Act - do whatever the Hull wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static boolean isLvl1Bought = true, isLvl2Bought = false, isLvl3Bought = false;
    public int getLevel(){
        return boatProperties.hullLevel;
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
    public Hull(){
        switch(boatProperties.hullLevel){
            case 1:
            this.setImage("shipComponents/hull1.png");
            break;
            case 2:
            this.setImage("shipComponents/hull2.png");
            break;
            case 3:
            this.setImage("shipComponents/hull3.png");
            break;
        }
    }
    public Hull(String s){
        setImage(s);
        //getImage().scale(getImage().getWidth()*10/100, getImage().getHeight()*10/100);
        super.resizeToShop(getImage(), 100, 100);
        
    }
    public void act() 
    {
        super.selectItem("hull upgrade ", getLevelOfItem(), 
        getLevelOfItem()==1?isLvl1Bought:getLevelOfItem()==2?isLvl2Bought:isLvl3Bought, getPrice());
        super.informationAboutItem(this, getLevelOfItem());
        // Add your action code here.
    }    
}
