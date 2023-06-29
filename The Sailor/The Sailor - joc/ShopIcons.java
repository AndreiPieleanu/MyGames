import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShopIcons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShopIcons extends World
{

    /**
     * Constructor for objects of class ShopIcons.
     * 
     */
    
    private String text;
    public void act(){
        for(int i=0;i<this.getObjects(Mesaje.class).size();i++){
            if(this.getObjects(Mesaje.class).get(i).toString().contains("Bani")){
                this.getObjects(Mesaje.class).get(i).update("Bani: " + boatProperties.money + "\nDiamante: " + boatProperties.diamonds);
                break;
            }
        }
    }
    public ShopIcons(String text)
    {
        super(900, 600, 1); 
        prepare(text);
    }
    public ShopIcons(){
        super(900, 600, 1); 
        prepare();
    }
    private void addLocker(int x, int y){
        addObject(new LockerIcon(), x, y);
    }
    
    private void prepare(String text){
        this.text = text;
        if(text.equalsIgnoreCase("carma")){
            Carma carma1 = new Carma("shopIcons/carma1.png");
            Carma carma2 = new Carma("shopIcons/carma2.png");
            Carma carma3 = new Carma("shopIcons/carma3.png");
            carma1.setLevelOfItem(1);carma2.setLevelOfItem(2);carma3.setLevelOfItem(3);
            carma1.setPrice(100);carma2.setPrice(200);carma3.setPrice(400);
            addPriceTags(carma1.getPrice(), carma2.getPrice(), carma3.getPrice());
            addInformationAboutProduct();
            addObject(carma1, 205, 175);
            if(boatProperties.nivelulNavei >= 2)
                addObject(carma2, 455, 175);
            else
                addLocker(455, 175);
            if(boatProperties.nivelulNavei >= 3)
                addObject(carma3, 694, 175);
            else
                addLocker(694, 175);
        }
        if(text.equalsIgnoreCase("catarg")){
            Catarg catarg1 = new Catarg("shopIcons/catarg1.png");
            Catarg catarg2 = new Catarg("shopIcons/catarg2.png");
            Catarg catarg3 = new Catarg("shopIcons/catarg3.png");
            catarg1.setLevelOfItem(1);catarg2.setLevelOfItem(2);catarg3.setLevelOfItem(3);
            catarg1.setPrice(150);catarg2.setPrice(300);catarg3.setPrice(600);
            addPriceTags(catarg1.getPrice(), catarg2.getPrice(), catarg3.getPrice());
            addInformationAboutProduct();
            addObject(catarg1, 210, 174);
            if(boatProperties.nivelulNavei >= 1)
                addObject(catarg2, 455, 174);
            else
                addLocker(455, 175);
            if(boatProperties.nivelulNavei >= 2)
                addObject(catarg3, 694, 174);
            else
                addLocker(694, 175);
        }
        
        if(text.equalsIgnoreCase("hull")){
            Hull hull1 = new Hull("shopIcons/hull1.png");
            Hull hull2 = new Hull("shopIcons/hull2.png");
            Hull hull3 = new Hull("shopIcons/hull3.png");
            hull1.setLevelOfItem(1);hull2.setLevelOfItem(2);hull3.setLevelOfItem(3);
            hull1.setPrice(300);hull2.setPrice(400);hull3.setPrice(800);
            addPriceTags(hull1.getPrice(), hull2.getPrice(), hull3.getPrice());
            addInformationAboutProduct();
            addObject(hull1, 211, 176);
            if(boatProperties.nivelulNavei >= 1)
                addObject(hull2, 455, 176);
            else
                addLocker(455, 175);
            if(boatProperties.nivelulNavei >= 2)
                addObject(hull3, 694, 176);
            else
                addLocker(694, 175);
        }
        if(text.equalsIgnoreCase("echipaj")){
            Echipaj echipaj1 = new Echipaj("shopIcons/echipaj1.png");
            Echipaj echipaj2 = new Echipaj("shopIcons/echipaj2.png");
            Echipaj echipaj3 = new Echipaj("shopIcons/echipaj3.png");
            echipaj1.setLevelOfItem(1);echipaj2.setLevelOfItem(2);echipaj3.setLevelOfItem(3);
            echipaj1.setPrice(200);echipaj2.setPrice(300);echipaj3.setPrice(500);
            addPriceTags(echipaj1.getPrice(), echipaj2.getPrice(), echipaj3.getPrice());
            addInformationAboutProduct();
            addObject(echipaj1, 210, 165);
            if(boatProperties.nivelulNavei >= 2)
                addObject(echipaj2, 455, 165);
            else
                addLocker(455, 175);
            if(boatProperties.nivelulNavei >= 3)
                addObject(echipaj3, 694, 165);
            else
                addLocker(694, 175);
        }
        if(text.equalsIgnoreCase("tunuri")){
            Tunuri tunuri1 = new Tunuri("shopIcons/tunuri1.png");
            Tunuri tunuri2 = new Tunuri("shopIcons/tunuri2.png");
            Tunuri tunuri3 = new Tunuri("shopIcons/tunuri3.png");
            tunuri1.setLevelOfItem(1);tunuri2.setLevelOfItem(2);tunuri3.setLevelOfItem(3);
            tunuri1.setPrice(250);tunuri2.setPrice(400);tunuri3.setPrice(600);
            addPriceTags(tunuri1.getPrice(), tunuri2.getPrice(), tunuri3.getPrice());
            addInformationAboutProduct();
            addObject(tunuri1, 210, 170);
            if(boatProperties.nivelulNavei >= 1)
                addObject(tunuri2, 455, 170);
            else
                addLocker(455, 175);
            if(boatProperties.nivelulNavei >= 2)
                addObject(tunuri3, 694, 170);
            else
                addLocker(694, 175);
        }
        addObject(new CloseIcon(new ShopBackground()), 814, 57);
        
        addObject(new Mesaje("Bani: " + boatProperties.money + "\nDiamante: " + boatProperties.diamonds), 742, 514);
        
        //addObject();
    }
    private void addPriceTags(int p1, int p2, int p3){
        
        addObject(new GoldCoinIcon(), 250, 288);
        addObject(new GoldCoinIcon(), 501, 288);
        addObject(new GoldCoinIcon(), 739, 288);
        addObject(new Mesaje(p1 + "", 30), 250-50, 288);
        addObject(new Mesaje(p2 + "", 30), 501-50, 288);
        addObject(new Mesaje(p3 + "", 30), 739-50, 288);
    }
    private void addInformationAboutProduct(){
        addObject(new Mesaje(), 222, 395+50);
    }
    private void prepare(){
        addObject(new CloseIcon(new ShopBackground()), 814, 57);
    }
}
//150, 567
