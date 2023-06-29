import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Magazin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Magazin extends World
{

    /**
     * Constructor for objects of class Magazin.
     * 
     */
    public Magazin()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 593, 1); 
        prepare();
    }
    
    private void prepare(){

        
        BackButton backbutton = new BackButton();
        addObject(backbutton,470,516);
        backbutton.setLocation(35,563);
        BuyButton buybutton = new BuyButton();
        addObject(buybutton,568,151);
        buybutton.setLocation(583,152);
        BuyButton buybutton2 = new BuyButton();
        addObject(buybutton2,572,263);
        buybutton2.setLocation(589,259);
        BuyButton buybutton3 = new BuyButton();
        addObject(buybutton3,554,372);
        buybutton3.setLocation(582,364);
        BuyButton buybutton4 = new BuyButton();
        addObject(buybutton4,582,453);
        buybutton4.setLocation(582,461);
        buybutton.setGold(100);
        buybutton2.setGold(150);
        buybutton3.setGold(150);
        buybutton4.setGold(200);
        MoneyCounter moneycounter = new MoneyCounter();
        addObject(moneycounter,76,51);
        moneycounter.setLocation(66,44);
        
        //pun indexurile la butoanele din magazin si de fiecare data cand cumpar ceva, acestea
        //sa stie ce rol au fiecare (rolul de dat in clasa BuyButton)
        buybutton.setIndex(1);
        buybutton2.setIndex(2);
        buybutton3.setIndex(3);
        buybutton4.setIndex(4);
        
        
    }
}
