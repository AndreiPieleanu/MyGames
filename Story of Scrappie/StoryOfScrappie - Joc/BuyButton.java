import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BuyButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BuyButton extends Buttons
{
    /**
     * Act - do whatever the BuyButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int gold = 0;
    private int index = 0;
    private boolean tranzactie = false;
    public void setTranzactie(boolean tranzactie){
        this.tranzactie = tranzactie;
    }
    public boolean getTranzactie(){
        return this.tranzactie;
    }
    public void setIndex(int index){
        this.index = index;
    }
    public int getIndex(){
        return this.index;
    }
    
    public int getGold(){
        return this.gold;
    }

    //stabileste pretul fiecarui buton cand apesi pe el
    public void setGold(int gold){
        this.gold = gold;
        setImage(new GreenfootImage("Cumpara cu " + gold, 25, 
        Color.BLUE, Color.YELLOW));

    }
    
    //confirma tranzactia, mofificand banii lui Scrappie si interfata de magazin
    public boolean Deal(){
        if(Greenfoot.mousePressed(this)){
            if(Scrappie.money >=100 && getIndex() == 1){
                        Scrappie.money-=100;
                        Scrappie.speed+=1;
                        setTranzactie(true);
                        Greenfoot.setWorld(new Magazin());
                        return true;
            }
            else if (Scrappie.money >=150 && getIndex() == 2){
                        Scrappie.money-=150;
                        Scrappie.attack+=5;
                        setTranzactie(true);
                        Greenfoot.setWorld(new Magazin());
                        return true;
            }
            
            else if(Scrappie.money >=150 && getIndex() == 3){
                        Scrappie.money-=150;
                        Scrappie.hp+=10;
                        Scrappie.maxHP+=10;
                        setTranzactie(true);
                        Greenfoot.setWorld(new Magazin());
                        return true;
            }
            else if (Scrappie.money >=200 && getIndex() == 4){
                        Scrappie.money-=200;
                        Scrappie.numberOfBombs++;
                        setTranzactie(true);
                        Greenfoot.setWorld(new Magazin());
                        return true;
            }
            
        }
        
        return false;
        
    }
    
    public void act() 
    {
            Deal();
            //System.out.println(SelectLevel.levelSituation);
        // Add your action code here.
    }  
    
}
