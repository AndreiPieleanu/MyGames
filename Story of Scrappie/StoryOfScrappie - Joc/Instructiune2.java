import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructiune2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructiune2 extends Instructiuni
{

    /**
     * Constructor for objects of class Instructiune2.
     * 
     */
    
    public Instructiune2()
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
        InregistrareNumarFrame inregistrarenumarframe2 = new InregistrareNumarFrame();
        addObject(inregistrarenumarframe2,391,235);
        inregistrarenumarframe2.setLocation(156, 88);
        InregistrareNumarFrame inregistrarenumarframe3 = new InregistrareNumarFrame();
        addObject(inregistrarenumarframe3,454,278);
        inregistrarenumarframe3.setLocation(156, 212);
        Text text11 = new Text("Cum se joaca");
        addObject(text11,534,111);
        text11.setLocation(564,112);
        Text text12 = new Text("De la WASD il vei controla pe Scappie in toate directiile");
        addObject(text12,404,228);
        text12.setLocation(498,191);
        Text text13 = new Text("Nu vei putea trece prin ziduri");
        addObject(text13,489,255);
        text13.setLocation(361,248);
        text12.setLocation(493,191);
        Text text14 = new Text("Roboteii inamici sunt imprastiati prin mapa. Acestia sunt");
        addObject(text14,304,312);
        text14.setLocation(484,286);
        text12.setLocation(492,193);
        text13.setLocation(346,226);
        text14.setLocation(483,285);
        Text text15 = new Text("de 2 tipuri, cel care ataca din apropiere si cel care trage");
        addObject(text15,378,369);
        text15.setLocation(482,318);
        Text text16 = new Text("cu laserul.");
        addObject(text16,517,370);
        text16.setLocation(232,350);
        text12.setLocation(565,179);
        text13.setLocation(473,199);
        text13.setLocation(474,199);
        text14.setLocation(567,219);
        text15.setLocation(567,239);
        text16.setLocation(407,259);
        Text text7 = new Text("Tasta l va trage cu un laser, pe care va trebui sa il colectezi");
        addObject(text7,407,310);
        text7.setLocation(576,293);
        Text text8 = new Text("dintr-o baterie.");
        addObject(text8,397,326);
        text8.setLocation(419,313);
        Text text9 = new Text("Tasta t foloseste gheara lui Scrappie pentru autoaparare.");
        addObject(text9,393,368);
        text9.setLocation(568,347);
        Text text10 = new Text("Tasta b va plasa o bomba fix langa tine, insa va trebui");
        addObject(text10,384,389);
        text10.setLocation(555,380);
        Text textx = new Text("sa fii atent, deoarece aceasta exploda dupa un anumit timp.");
        addObject(textx,400,416);
        textx.setLocation(574,400);
    }
}
