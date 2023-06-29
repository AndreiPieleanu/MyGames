import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructiune3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructiune3 extends Instructiuni
{

    /**
     * Constructor for objects of class Instructiune3.
     * 
     */
    public Instructiune3()
    {
        prepare();
    }
    
    private void prepare(){

        MeniuButton meniubutton = new MeniuButton();
        addObject(meniubutton,380,545);
        meniubutton.setLocation(384,554);
        arrowBack arrowback = new arrowBack();
        addObject(arrowback,78,531);
        arrowback.setLocation(67,539);
        arrowForward arrowforward = new arrowForward();
        addObject(arrowforward,710,523);
        arrowforward.setLocation(714,535);
        removeObject(arrowforward);
        arrowForward arrowforward2 = new arrowForward();
        addObject(arrowforward2,714,533);
        arrowforward2.setLocation(710,534);
        InregistrareNumarFrame inregistrarenumarframe = new InregistrareNumarFrame();
        addObject(inregistrarenumarframe,337,285);
        inregistrarenumarframe.setLocation(156, 88);
        InregistrareNumarFrame inregistrarenumarframe2 = new InregistrareNumarFrame();
        addObject(inregistrarenumarframe2,530,323);
        inregistrarenumarframe2.setLocation(156, 212);
        InregistrareNumarFrame inregistrarenumarframe3 = new InregistrareNumarFrame();
        addObject(inregistrarenumarframe3,569,305);
        inregistrarenumarframe3.setLocation(156, 350);
        Text text12 = new Text("Alte obstacole periculoase");
        addObject(text12,511,96);
        text12.setLocation(569,107);
        Text text13 = new Text("Turnurile Tesla sunt periculoase si te vor omori instantaneu.");
        addObject(text13,353,205);
        text13.setLocation(534,184);
        Text text14 = new Text("Pentru a le dezactiva va trebui sa tragi de o maneta aflata in nivel.");
        addObject(text14,372,247);
        text14.setLocation(544,207);
        Text text15 = new Text("Tasta p dezactiveaza turnurile Tesla pentru a putea trece mai");
        addObject(text15,357,280);
        text15.setLocation(528,245);
        Text text16 = new Text("departe.");
        addObject(text16,341,290);
        text16.setLocation(340,265);
        Text text17 = new Text("Tepusele sunt destul de periculoase, te poti lovi destul de usor");
        addObject(text17,350,353);
        text17.setLocation(535,324);
        Text text18 = new Text("de ele, va trebui sa dovedesti tenacitate pentru a le evita.");
        addObject(text18,410,397);
        text18.setLocation(514,347);
        text15.setLocation(528,242);
        TeslaTower teslatower = new TeslaTower();
        addObject(teslatower,336,422);
        teslatower.setLocation(334,436);
        Wall wall = new Wall();
        addObject(wall,506,452);
        wall.setLocation(528,455);
        teslatower.setLocation(376,432);
        Spike spike = new Spike(70, 230);
        addObject(spike,535,416);
        spike.setLocation(528,414);
    }
}
