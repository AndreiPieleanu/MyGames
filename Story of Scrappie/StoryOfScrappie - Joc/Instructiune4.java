import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructiune4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructiune4 extends Instructiuni
{

    /**
     * Constructor for objects of class Instructiune4.
     * 
     */
    public Instructiune4()
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
        InregistrareNumarFrame inregistrarenumarframe4 = new InregistrareNumarFrame();
        addObject(inregistrarenumarframe4, 156, 460);
        inregistrarenumarframe4.setLocation(156, 460);
        Text text8 = new Text("Nivelul 3");
        addObject(text8,527,106);
        text8.setLocation(561,107);
        Text text9 = new Text("La ultimul nivel te vei confrunta cu Robotul Malefic. Daca il");
        addObject(text9,472,230);
        text9.setLocation(527,216);
        Text text10 = new Text("poti invinge, vei castiga jocul! Insa mare atentie! Este destul");
        addObject(text10,411,266);
        text10.setLocation(531,237);
        Text text11 = new Text("de greu si va trebui sa fii pregatit daca vei infrunta provocarea!");
        addObject(text11,438,285);
        text11.setLocation(539,288);
        text10.setLocation(532,248);
        text11.setLocation(543,285);
        Text text12 = new Text("MULTA BAFTA!");
        addObject(text12,410,451);
        text12.setLocation(519,457);
    }
}
