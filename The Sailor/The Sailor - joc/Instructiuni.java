import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructiuni here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructiuni extends World
{

    /**
     * Constructor for objects of class Instructiuni.
     * 
     */
    public static int instrNumber = 1, ok=1;
    
    public Instructiuni()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
    }
    Mesaje m1,m2,m3;
    InstrIcon i1,i2,i3,i4,i5,i6,i7;
    
    InstrIcon i8, i9, i10, i11, i12, i13;
    
    InstrIcon i14,i15,i16,i17;
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    
    private void prepare()
    {
        Mesaje mesaje = new Mesaje("Inainte", 25);
        addObject(mesaje,781,515);
        mesaje.setLocation(805,514);
        Mesaje mesaje2 = new Mesaje("Inapoi", 25);
        addObject(mesaje2,86,500);
        mesaje2.setLocation(91,514);
        i1=new InstrIcon(new GreenfootImage("spanish_or_vanish1 move1.png"), 70, 70);
        i2=new InstrIcon(new GreenfootImage("spanish_or_ vanish2 dead4.png"), 70, 70);
        i3=new InstrIcon(new GreenfootImage("ball.png"), 30, 30);
        i4=new InstrIcon(new GreenfootImage("ball.png"), 30, 30);
        i5=new InstrIcon(new GreenfootImage("ball_explosion.png"), 70, 70);
        i6=new InstrIcon(new GreenfootImage("textura_basic_pirat.png"), 70, 70);
        i7=new InstrIcon(new GreenfootImage("decorations/island1.png"), 70, 70);
        
        
        i8=new InstrIcon(new GreenfootImage("shopIcons/hull1.png"), 200, 200);
        i9=new InstrIcon(new GreenfootImage("shopIcons/echipaj2.png"), 100, 100);
        i10=new InstrIcon(new GreenfootImage("shopIcons/tunuri2.png"), 100, 100);
        i11=new InstrIcon(new GreenfootImage("moneyIcon.png"), 30, 30);
        i12=new InstrIcon(new GreenfootImage("chest.png"), 40, 40);
        i13=new InstrIcon(new GreenfootImage("shopIcons/catarg1.png"), 200, 200);
        
        //i14=new InstrIcon(new GreenfootImage("icons/pirateIcon.png"), 100, 100);
        i15=new InstrIcon(new GreenfootImage("shopIcons/echipaj1.png"), 150, 150);
        i16=new InstrIcon(new GreenfootImage("shopIcons/tunuri1.png"), 150, 150);
        i17=new InstrIcon(new GreenfootImage("ball_explosion.png"), 100, 100);
        
        
        i1.setRotation(180);
        i2.setRotation(45);
        i6.setRotation(-45);
    }
    
    public void act(){
        if(instrNumber == 0){
            Greenfoot.setWorld(new StartWorld());
            instrNumber = 1;
            ok=1;
        }
        else if(instrNumber == 1){
            if(ok == 1){
                golire();
                 p1();
                ok=0;
            }
        }
        else if(instrNumber == 2){
            if(ok == 1){
                golire();
                p2();
                ok=0;
            }
        }
        else if(instrNumber == 3){
            if(ok == 1){
                golire();
                p3();
                ok=0;
            }
        }
        else if(instrNumber == 4){
            Greenfoot.setWorld(new StartWorld());
            instrNumber = 1;
            ok=1;
        }
    }
    void p1(){
        m1 = new Mesaje("Bun venit pe nava, tinere capitan! Azi iti vei incepe noua calatorie pe mare!\nMisiunea ta este sa cureti marile de navele spaniole care incearca sa supuna\npopulatia si sa extraga toate bogatiile acestor insule!\n", 20);
        m2 = new Mesaje("Avand in posesia ta o mica frigata cu un numar mic de marinari fricosi, va trebui\nsa scufunzi toate navele inamice si sa ajungi in siguranta la portul aflat in \ncapatul hartii.", 20);
        m3 = new Mesaje("Inamicii tai spanioli detin niste nave micute si slab echipate, ce pot fi distruse\nusor, ca mai apoi sa iei comoara navei aflata intr-un cufar.", 20);
        golireI2();
        golireI3();
        addObject(m1, 449, 141);
        addObject(m2, 449, 214);
        addObject(m3, 449, 279);
        addObject(i1, 444, 361);
        addObject(i2, 594, 468);
        addObject(i3, 440, 439);
        addObject(i4, 469, 408);
        addObject(i5, 452, 452);
        addObject(i6, 458, 479);
        addObject(i7, 291, 419);
    }
    void p2(){
        m1 = new Mesaje("Cu banii castigati din cufar, vei putea sa iti upgradezi nava de la magazinul insulei.\nChiar daca te va costa ceva, noile componente te vor ajuta mai bine in lupta.", 20);
        m2 = new Mesaje("Componentele ce pot fi upgradate sunt: puntea, catargul, tunurile, carma si echipajul.\n", 20);
        m3 = new Mesaje("Puntea iti creste rezistenta in lupta, poate tine mai multe tunuri, dar scade viteza.\nCarma face ca nava sa se intoarca mai repede, catargul creste viteza navei, echipajul\ne responsabil pentru lupte atunci cand navele sutn lipite una de alta, iar tunurile\nsunt cele care produc pagube semnificative inamicilor sai.", 20);
        addObject(m1, 449, 141);
        addObject(m2, 449, 214);
        addObject(m3, 449, 279);
        removeObject(i1);
        golireI1();
        golireI3();
        addObject(i8, 452, 476);
        addObject(i9, 512, 434);
        addObject(i10, 573, 446);
        addObject(i11, 279, 424);
        addObject(i12, 305, 446);
        addObject(i13, 434, 401);
    }
    void p3(){
        m1 = new Mesaje("Pe masura ce vei apropia de Insula Craniului, inamicii tai vor deveni din ce in ce mai \nputernici. In apropierea insulei va trebui sa invingi Marele Ironclad Spaniol, cea mai\nputernica nava trimisa de Regele Spaniei.", 20);
        m2 = new Mesaje("Fii foarte atent! Aceasta nava are abilitati speciale si te poate distruge cu usurinta.\nMulti pirati au incercat sa se lupte cu ea si nu au reusit. Crezi ca o poti distruge si\nca poti elibera insulele? Sa vedem!", 20);
        m3 = new Mesaje("Mult succes!", 20);
        addObject(m1, 449, 141);
        addObject(m2, 449, 214);
        addObject(m3, 449, 479);
        golireI1();
        
        golireI2();
        
        //addObject(i14, 400, 300);
        addObject(i15, 345, 377);
        addObject(i16, 417, 400);
        addObject(i17, 475, 381);
    }
    void golire(){
        removeObject(m1);
        removeObject(m2);
        removeObject(m3);
    }
    void golireI1(){
        removeObject(i1);
        removeObject(i2);
        removeObject(i3);
        removeObject(i4);
        removeObject(i5);
        removeObject(i6);
        removeObject(i7);
    }
    void golireI2(){
         removeObject(i8);
        removeObject(i9);
        removeObject(i10);
        removeObject(i11);
        removeObject(i12);
        removeObject(i13);
    }
    void golireI3(){
        removeObject(i15);
        removeObject(i16);
        removeObject(i17);
    }
}
