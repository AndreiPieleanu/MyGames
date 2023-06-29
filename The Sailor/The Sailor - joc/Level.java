import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class sea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends SWorld
{
    /**
     * Constructor for objects of class sea.
     * 
     */
    public static GreenfootSound battleMusic = new GreenfootSound("Battle_Theme.mp3");
    
    public Level()
    {
        super(900, 600, 1, 3000);
        StartWorld.menuMusic.stop();
        FinishedLevel.victory.stop();
        Defeat.defeat.stop();
        YouWon.victory.stop();
        ShopBackground.shopMusic.stop();
        if(boatProperties.muzicaNivel){
            battleMusic.playLoop();
        }
        addBarrier();
        prepare12();
        addDecorations12();
        //setScrollingBackground(new GreenfootImage("wet-blue.jpg"));
        // prepare();
    }
    private void createWaves(int nr){
        for(int i=1;i<=nr;i++){
            addObject(new Wave(), Greenfoot.getRandomNumber(2000)-1000, Greenfoot.getRandomNumber(400)+100);
        }
    }
    public Level(int nivel){
        super(900, 600, 1, 3000);
        
        StartWorld.menuMusic.stop();
        FinishedLevel.victory.stop();
        Defeat.defeat.stop();
        YouWon.victory.stop();
        ShopBackground.shopMusic.stop();
        if(boatProperties.muzicaNivel){
            battleMusic.playLoop();
        }
        addBarrier();
        if(nivel == 0){
            
            prepare0();
            addDecorations0();
            createWaves(7);
        }
        else if (nivel == 1){
            
            prepare1();
            addDecorations1();
            createWaves(10);
        }
        else if (nivel == 2){
            
            prepare2();
            addDecorations2();
            createWaves(10);
        }
        else if (nivel == 3){
            
            prepare3();
            addDecorations3();
            createWaves(10);
        }
        else if (nivel == 4){
            
            prepare4();
            addDecorations4();
            createWaves(10);
        }
        else if (nivel == 5){
            
            prepare5();
            addDecorations5();
            createWaves(10);
        }
        /*else if (nivel == 6){
            addDecorations6();
            prepare6();
        }*/
        else if (nivel == 6){
            
            prepare7();
            addDecorations7();
            createWaves(10);
        }
        /*else if (nivel == 8){
            addDecorations8();
            prepare8();
        }
        else if (nivel == 9){
            addDecorations9();
            prepare9();
        }
        else if (nivel == 10){
            addDecorations10();
            prepare10();
        }*/
        else if (nivel == 7){
            
            prepare11();
            addDecorations11();
            createWaves(5);
        }
        else if(nivel == 8){
            
            prepare12();
            addDecorations12();
            createWaves(15);
        }
        
        //...
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    boat b = new boat();
    private void prepare0()
    {
        
        
        
        
        Boat0 b1,b2,b3,b4,b5,b6;
        b1 = new Boat0(true, 2);
        b2 = new Boat0(true, 2);
        b3 = new Boat0(true, 2);
        b4 = new Boat0(false, 1, 300);
        b5 = new Boat0(false, 2, 300);
        b6 = new Boat0(false, 1, 250);
        addObject(b1, 457-1000, 137);
        b4.setRotation(270);
        addObject(b4, 789-1000, 421);
        b5.setRotation(180);
        b6.setRotation(180);
        addObject(b5, 1600-1000, 213);
        b6.setRotation(270);
        addObject(b6, 1985-1000, 413);
        addObject(b2, 2281-1000, 421);
        b3.setRotation(90);
        addObject(b3, 2621, 277);
        
        Island i1,i2,i3,i4,i5;
        i1 = new Island(1, 40, 40);
        i2 = new Island(4, 50, 50);
        i3 = new Island(3, 70, 70);
        i4 = new Island(9, 40, 40);
        i5 = new Island(8, 70, 70);
        addObject(i1, 201-1000, 505);
        addObject(i2, 109-1000, 97);
        addObject(i3, 1290-1000, 372);
        addObject(i4, 2817-1000, 60);
        i5.setRotation(270);
        addObject(i5, 2910-1000, 300);
        Port port = new Port();
        port.setRotation(270);
        List<Integer> levels = Arrays.asList(1, 2);
        NextLevel nextLevel = new NextLevel(1, levels);
        addObject(nextLevel, 2830-1000, 300);
        addObject(port, 2850-1000, 300);
        
        
        
        
        
        
        GreenfootImage bg = new GreenfootImage("NivelBackground.png");
        boat boat = new boat();
        setMainActor(b, 0,0);
        mainActor.setLocation(-1000,300);
        setScrollingBackground(bg);
        addObjects();
        //addObject(new Boat0(true, 2), 200, 200);
        //addObject(new Boat0(false, 1, 130), 630, 250);
        //addObject(new Boat0(false, 1, 250), -200, 100);
        //aici vor fi informatiile in legatura cu statusul navei
        //addObject(new Boat1(), 100, 100);
    }
    
    private void prepare1()
    {
        Boat0 b1, b2, b3, b4, b5, b6;
        b1 = new Boat0(false, 2, 100);
        b2 = new Boat0(false, 2, 150);
        b3 = new Boat0(false, 1, 100);
        b4 = new Boat0(true, 1);
        b5 = new Boat0(true, 2);
        b6 = new Boat0(true, 2);
        Boat1 b7 = new Boat1();
        b1.setRotation(90);
        addObject(b1, 557-1000, 117);
        b2.setRotation(270);
        addObject(b2, 745-1000, 475);
        b3.setRotation(90);
        addObject(b3, 1173-1000, 177);
        b4.setRotation(180);
        addObject(b4, 1917-1000, 400);
        b5.setRotation(90);
        addObject(b5, 2333-1000, 305);
        addObject(b6, 2653-1000, 177);
        b7.setRotation(120);
        addObject(b7, 1397-1000, 381);
        
        
        Island i1,i2,i3,i4,i5,i6,i7,i8;
        i1 = new Island(1, 45, 45);
        i2 = new Island(1, 40, 40);
        i3 = new Island(2, 40, 40);
        i4 = new Island(4, 40, 40);
        i5 = new Island(3, 30, 30);
        i6 = new Island(3, 30, 30);
        i7 = new Island(9, 30, 30);
        i8 = new Island(5, 80, 80);
        addObject(i1, 965-1000, 105);
        addObject(i3, 977-1000, 237);
        addObject(i2, 937-1000, 441);
        addObject(i4, 1921-1000, 277);
        addObject(i5, 1357-1000, 185);
        addObject(i6, 2413-1000, 421);
        addObject(i7, 1559-1000, 449);
        i8.setRotation(270);
        addObject(i8, 2669-1000, 50);
        NextLevel nextLevel= new NextLevel(2, Arrays.asList(1, 2, 3));
        addObject(nextLevel, 2678-1000, 120);
        Port port = new Port();
        port.setRotation(180);
        addObject(port, 2678-1000, 99);
        
        GreenfootImage bg = new GreenfootImage("NivelBackground.png");
        boat boat = new boat();
        setMainActor(b, 0,0);
        mainActor.setLocation(-1000,300);
        setScrollingBackground(bg);
        addObjects();
    }
    private void prepare2()
    {
        Boat0 b1, b2, b3, b4;
        Boat1 b5, b6, b7;
        b1 = new Boat0(false, 2, 150);
        b2 = new Boat0(false, 2, 150);
        b3 = new Boat0(false, 1, 400);
        b4 = new Boat0(false, 1, 400);
        b5 = new Boat1();
        b6 = new Boat1();
        b7 = new Boat1();
        
        
        addObject(b1, 1577-1000, 481);
        addObject(b2, 1489-1000, 113);
        b3.setRotation(270);
        addObject(b3, 381-1000, 437);
        b4.setRotation(90);
        addObject(b4, 233-1000, 153);
        addObject(b5, 2817-1000, 485);
        addObject(b6, 2005-1000, 365);
        addObject(b7, 1105-1000, 373);
        
        Island i1,i2,i3,i4,i5,i6,i7;
        i1 = new Island(4, 40, 40);
        i2 = new Island(4, 40, 40);
        i3 = new Island(4, 40, 40);
        i4 = new Island(2, 80, 80);
        i5 = new Island(9, 35, 35);
        i6 = new Island(7, 30, 30);
        i7 = new Island(8, 80, 80);
        addObject(i1, 2457-1000, 473);
        addObject(i3, 2421-1000, 193);
        addObject(i2, 1930-1000, 85);
        addObject(i4, 1469-1000, 300);
        addObject(i5, 1117-1000, 97);
        addObject(i6, 597-1000, 457);
        i7.setRotation(90);
        addObject(i7, 25-1000, 277);
        NextLevel nextLevel= new NextLevel(2, Arrays.asList(1, 2, 3, 4));
        addObject(nextLevel, 101-1000, 277);
        Port port = new Port();
        port.setRotation(90);
        addObject(port, 100-1000, 292);
        
        
        
        GreenfootImage bg = new GreenfootImage("NivelBackground.png");
        boat boat = new boat();
        boat.setRotation(90);
        setMainActor(b, 0,0);
        mainActor.setLocation(2659-1000,57);
        setScrollingBackground(bg);
        addObjects();
    }
    private void prepare3()
    {
        Island i1,i2,i3,i4,i5,i6,i7,i8;
        i1 = new Island(9, 45, 45);
        i2 = new Island(4, 40, 40);
        i3 = new Island(9, 40, 40);
        i4 = new Island(5, 70, 70);
        i5 = new Island(6, 40, 40);
        i6 = new Island(1, 30, 30);
        i7 = new Island(2, 30, 30);
        i8 = new Island(8, 80, 80);
        addObject(i1, 470-1000, 259);
        addObject(i3, 769-1000, 469);
        addObject(i2, 1025-1000, 213);
        i4.setRotation(90);
        addObject(i4, 1369-1000, 509);
        addObject(i5, 1641-1000, 217);
        addObject(i6, 2865-1000, 161);
        addObject(i7, 2937-1000, 453);
        i8.setRotation(270);
        addObject(i8, 2965-1000, 317);
        NextLevel nextLevel= new NextLevel(2, Arrays.asList(1, 2, 3, 4, 5));
        addObject(nextLevel, 2900-1000, 317);
        Port port = new Port();
        port.setRotation(270);
        addObject(port, 2900-1000, 290);
        
        Boat0 b1,b2,b3,b4;
        Boat1 b5,b6,b7;
        b1 = new Boat0(true, 1);
        b2 = new Boat0(false, 2, 300);
        b3 = new Boat0(false, 2, 300);
        b4 = new Boat0(false, 1, 300);
        b5 = new Boat1();
        b6 = new Boat1();
        b7 = new Boat1();
        addObject(b1, 481-1000, 181);
        addObject(b2, 869-1000, 141);
        addObject(b3, 893-1000, 361);
        b4.setRotation(270);
        addObject(b4, 1365-1000, 400);
        addObject(b5, 2077-1000, 393);
        addObject(b6, 2449-1000, 241);
        addObject(b7, 2545-1000, 473);
        
        GreenfootImage bg = new GreenfootImage("NivelBackground.png");
        boat boat = new boat();
        setMainActor(b, 0,0);
        mainActor.setLocation(-1000,300);
        setScrollingBackground(bg);
        addObjects();
        
    }
    private void prepare4()
    {
        Island i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
        i1 = new Island(1, 50, 50);
        i2 = new Island(2, 55, 55);
        i3 = new Island(4, 50, 50);
        i4 = new Island(4, 60, 60);
        i5 = new Island(2, 35, 35);
        i6 = new Island(1, 60, 60);
        i7 = new Island(9, 60, 60);
        i8 = new Island(1, 60, 60);
        i9 = new Island(1, 60, 60);
        i10 = new Island(8, 60, 60);
        addObject(i1, 650-1000, 501);
        addObject(i2, 529-1000, 449);
        addObject(i3, 405-1000, 409);
        addObject(i4, 121-1000, 100);
        addObject(i5, 270-1000, 100);
        addObject(i6, 361-1000, 100);
        addObject(i7, 953-1000, 257);
        addObject(i8, 1105-1000, 361);
        addObject(i9, 1325-1000, 245);
        i10.setRotation(180);
        addObject(i10, 1713-1000, 37);
        
        
        Boat0 b1,b2,b3;
        Boat1 b4,b5,b6,b7,b8;
        b1 = new Boat0(false, 1, 300);
        b1.setRotation(270);
        b2 = new Boat0(false, 1, 200);
        b2.setRotation(270);
        b3 = new Boat0(false, 2, 150);
        b4 = new Boat1();
        b5 = new Boat1();
        b6 = new Boat1();
        b7 = new Boat1();
        b8 = new Boat1();
        addObject(b1, 109-1000, 577);
        addObject(b2, 225-1000, 557);
        addObject(b3, 270-1000, 250);
        addObject(b4, 825-1000, 457);
        addObject(b5, 1713-1000, 449);
        addObject(b6, 2133-1000, 405);
        addObject(b7, 2525-1000, 211);
        addObject(b8, 2833-1000, 465);
        
        NextLevel nextLevel= new NextLevel(2, Arrays.asList(1, 2, 3, 4, 5, 6));
        addObject(nextLevel, 1715-1000, 110);
        Port port = new Port();
        port.setRotation(180);
        addObject(port, 1715-1000, 100);
        
        GreenfootImage bg = new GreenfootImage("NivelBackground.png");
        boat boat = new boat();
        setMainActor(b, 0,0);
        mainActor.setLocation(417-1000, 530);
        setScrollingBackground(bg);
        addObjects();
    }
    private void prepare5()
    {
        Island i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12;
        i1 = new Island(1, 50, 50);
        i2 = new Island(1, 55, 55);
        i3 = new Island(4, 50, 50);
        i4 = new Island(4, 60, 60);
        i5 = new Island(6, 35, 35);
        i6 = new Island(6, 30, 30);
        i7 = new Island(6, 40, 40);
        i8 = new Island(6, 30, 30);
        i9 = new Island(6, 45, 45);
        i10 = new Island(7, 50, 50);
        i11 = new Island(7, 50, 50);
        i12 = new Island(7, 50, 50);
        addObject(i1, 2250-1000, 300);
        addObject(i2, 1817-1000, 361);
        addObject(i3, 1100-1000, 525-50);
        addObject(i4, 1061-1000, 425-100);
        addObject(i5, 873-1000, 437-100);
        addObject(i6, 673-1000, 433-100);
        addObject(i7, 509-1000, 433-100);
        addObject(i8, 305-1000, 429-100);
        addObject(i9, 73-1000, 429-100);
        addObject(i10, 805-1000, 377-100);
        addObject(i11, 609-1000, 389-100);
        addObject(i12, 117-1000, 365-100);
        
        NextLevel nextLevel= new NextLevel(2, Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        addObject(nextLevel, 1000-1000, 525-50);
        Port port = new Port();
        port.setRotation(270);
        addObject(port, 1000-1000, 525-50);
        
        
        Boat1 b1 = new Boat1();
        addObject(b1, 2689-1000, 349);
        Boat0 b2,b3;
        b2 = new Boat0(true, 1);
        b3 = new Boat0(true, 1);
        addObject(b2, 2241-1000, 201);
        addObject(b3, 1761-1000, 349);
        Boat1 b4,b5,b6;
        b4 = new Boat1();
        b5 = new Boat1();
        b6 = new Boat1();
        addObject(b4, 1397-1000, 113);
        addObject(b5, 1333-1000, 459);
        addObject(b6, 329-1000, 80);
        Boat0 b7,b8;
        b7 = new Boat0(false, 1, 200);
        b7.setRotation(180);
        b8 = new Boat0(false, 1, 200);
        addObject(b7, 505-1000, 493);
        addObject(b8, 133-1000, 565);
        
        GreenfootImage bg = new GreenfootImage("NivelBackground.png");
        boat boat = new boat();
        setMainActor(b, 0,0);
        mainActor.setLocation(2813-1000, 29);
        setScrollingBackground(bg);
        addObjects();
    }
    private void prepare7()
    {
        Island i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
        i1 = new Island(2, 60, 60);
        i2 = new Island(3, 65, 65);
        i3 = new Island(5, 50, 50);
        i4 = new Island(5, 50, 50);
        i5 = new Island(8, 40, 40);
        i6 = new Island(4, 30, 30);
        i7 = new Island(1, 40, 40);
        i8 = new Island(2, 30, 30);
        i9 = new Island(4, 45, 45);
        i10 = new Island(5, 50, 50);
        addObject(i1, 85-1000, 405);
        addObject(i2, 377-1000, 489);
        i3.setRotation(230);
        addObject(i3, 1177-1000, 153);
        i4.setRotation(250);
        addObject(i4, 1533-1000, 130);
        i5.setRotation(220);
        addObject(i5, 1869-1000, 120);
        addObject(i6, 1077-1000, 101);
        addObject(i7, 1273-1000, 57);
        addObject(i8, 1461-1000, 45);
        addObject(i9, 1693-1000, 45);
        addObject(i10, 2913-1000, 109);
        NextLevel nextLevel= new NextLevel(2, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        addObject(nextLevel, 2870-1000, 109);
        Port port = new Port();
        port.setRotation(270);
        addObject(port, 2870-1000, 109);
        
        
        Boat0 b1,b2,b3;
        Boat1 b4,b5,b6;
        b1 = new Boat0(false, 3, 200);
        b2 = new Boat0(false, 2, 150);
        b3 = new Boat0(false, 2, 100);
        b4 = new Boat1();
        b5 = new Boat1();
        b6 = new Boat1();
        addObject(b1, 133-1000, 277);
        addObject(b2, 1325-1000, 310);
        addObject(b3, 1680-1000, 400);
        b2.setRotation(45);
        b3.setRotation(240);
        addObject(b4, 573-1000, 233);
        addObject(b5, 1009-1000, 429);
        addObject(b6, 2061-1000, 333);
        
        GreenfootImage bg = new GreenfootImage("NivelBackground.png");
        boat boat = new boat();
        setMainActor(b, 0,0);
        mainActor.setLocation(113-1000, 545);
        setScrollingBackground(bg);
        addObjects();
    }
    private void prepare11()
    {
        NextLevel nextLevel= new NextLevel(2, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        addObject(nextLevel, 100-1000, 277);
        Island i1,i2, i3, i4, i5, i6;
        i1 = new Island(6, 80, 80);
        i1.setRotation(-30);
        i2 = new Island(1, 55, 55);
        i3 = new Island(2, 50, 50);
        i4 = new Island(4, 60, 60);
        i5 = new Island(9, 50, 50);
        i6 = new Island(3, 70, 70);
        addObject(i1, 2697-1000, 453);
        addObject(i2, 2461-1000, 545);
        addObject(i3, 2181-1000, 60);
        addObject(i4, 1937-1000, 557);
        addObject(i5, 1653-1000, 53);
        addObject(i6, 45-1000, 277);
        
        Boat0 b1, b2, b3, b4, b6, b7;
        Boat1 b5, b8;
        b1 = new Boat0(true, 3);
        b2 = new Boat0(true, 3);
        b3 = new Boat0(true, 3);
        b4 = new Boat0(true, 3);
        b5 = new Boat1();
        b6 = new Boat0(false, 2, 200);
        b7 = new Boat0(false, 2, 200);
        b8 = new Boat1();
        addObject(b1, 2500-1000, 153);
        addObject(b2, 2177-1000, 489);
        addObject(b3, 1957-1000, 173);
        addObject(b4, 1557-1000, 477);
        addObject(b5, 1289-1000, 181);
        addObject(b6, 949-1000, 45);
        addObject(b7, 717-1000, 521);
        addObject(b8, 449-1000, 433);
        b1.setRotation(90);
        b3.setRotation(90);
        b6.setRotation(90);
        b2.setRotation(270);
        b4.setRotation(270);
        b7.setRotation(270);
        
        
        
        GreenfootImage bg = new GreenfootImage("NivelBackground.png");
        boat boat = new boat();
        setMainActor(b, 0,0);
        mainActor.setLocation(2809-1000, 513);
        setScrollingBackground(bg);
        addObjects();
    }
    private void prepare12()
    {
        Boat2 boss = new Boat2();
        addObject(boss, 1400-1000, 300);
        
        GreenfootImage bg = new GreenfootImage("NivelBackground.png");
        boat boat = new boat();
        setMainActor(b, 0,0);
        mainActor.setLocation(800-1000, 300);
        setScrollingBackground(bg);
        addObjects();
    }
    private void addObjects(){
        super.addObject(new TaskBar(), 450, 575, false); 
        Mesaje mesaj = new Mesaje(boatProperties.money + " galbeni ");// + boatProperties.diamonds);
        Mesaje crew = new Mesaje(boatProperties.echipaj + " oameni ");
        Mesaje hp = new Mesaje(b.getHp() + "/" + boatProperties.hp);
        Mesaje mana = new Mesaje(b.numarDeTunuri + "/" + boatProperties.tunuri);
        super.addObject(mesaj, 588, 588, false);
        super.addObject(hp, 272, 568, false);
        super.addObject(crew, 588, 568, false);
        super.addObject(mana, 272, 588, false);
        super.addObject(new Mesaje("Inapoi la harta", new SelectLevel()), 50, 20, false);
        super.addObject(new Mesaje("Optiuni", new SelectLevel()), 30, 60, false);
        //super.addObject(new CarmaDecor(), 824, 530, false);
        super.addObject(new BusolaDecor(false), 824, 530, false);
        super.addObject(new BusolaDecor(true), 824, 530, false);
    }
    
    private void addBarrier(){
        Barrier b1,b2,b3,b4;
        b1 = new Barrier();
        b2 = new Barrier();
        b3 = new Barrier();
        b4 = new Barrier();
        addObject(b1, 170, 0);
        addObject(b2, 750, 0);
        addObject(b3, 170, 595);
        addObject(b4, 750, 595);
        Barrier left = new Barrier();
        Barrier right = new Barrier();
        left.setRotation(90);
        right.setRotation(90);
        addObject(left, -1040, 0);
        addObject(right, 1950, 0);
    }
    private void addDecorations0(){
        Dolphin d1 = new Dolphin();
        Dolphin d2 = new Dolphin();
        Dolphin d3 = new Dolphin();
        d1.setTimer(100);
        d2.setTimer(150);
        d3.setTimer(150);
        addObject(d1, 400, 400);
        addObject(d2, -300, 257);
        addObject(d3, 1200, 256);
        Bird b1 = new Bird();
        addObject(b1, 0, 300);
    }
    private void addDecorations1(){
        Dolphin d1 = new Dolphin();
        Dolphin d2 = new Dolphin();
        Dolphin d3 = new Dolphin();
        d1.setTimer(100);
        d2.setTimer(150);
        d3.setTimer(150);
        addObject(d1, 200-1000, 200);
        addObject(d2, 1000-1000, 257);
        addObject(d3, 1900-1000, 256);
        Bird b1 = new Bird();
        addObject(b1, 0, 300);
        Bird b2 = new Bird();
        addObject(b2, 0, 300);
        Bird b3 = new Bird();
        addObject(b3, 0, 300);
        b2.setRotation(45);
        b3.setRotation(-45);
    }
    private void addDecorations2(){
        Dolphin d1 = new Dolphin();
        Dolphin d2 = new Dolphin();
        Dolphin d3 = new Dolphin();
        Dolphin d4 = new Dolphin();
        d1.setTimer(100);
        d2.setTimer(150);
        d3.setTimer(150);
        d4.setTimer(250);
        addObject(d1, 150-1000, 400);
        addObject(d2, 1000-1000, 234);
        addObject(d3, 1900-1000, 435);
        addObject(d4, 2400-1000, 543);
        Bird b1 = new Bird();
        addObject(b1, 0, 300);
        Bird b2 = new Bird();
        addObject(b2, 0, 300);
        Bird b3 = new Bird();
        addObject(b3, 0, 300);
        b2.setRotation(45);
        b3.setRotation(-45);
    }
    private void addDecorations3(){
        Dolphin d1 = new Dolphin();
        Dolphin d2 = new Dolphin();
        Dolphin d3 = new Dolphin();
        d1.setTimer(100);
        d2.setTimer(150);
        d3.setTimer(150);
        addObject(d1, 150-1000, 400);
        addObject(d2, 750-1000, 234);
        addObject(d3, 990-1000, 435);
        Bird b1 = new Bird();
        addObject(b1, 0, 300);
        Bird b2 = new Bird();
        addObject(b2, 0, 300);
        Bird b3 = new Bird();
        addObject(b3, 0, 300);
        Bird b4 = new Bird();
        addObject(b4, 0, 300);
        b2.setRotation(45);
        b3.setRotation(-45);
        b4.setRotation(90);
    }
    private void addDecorations4(){
        Dolphin d1 = new Dolphin();
        Dolphin d2 = new Dolphin();
        Dolphin d3 = new Dolphin();
        d1.setTimer(100);
        d2.setTimer(150);
        d3.setTimer(150);
        addObject(d1, 150-1000, 400);
        addObject(d2, 750-1000, 234);
        addObject(d3, 990-1000, 435);
        Bird b1 = new Bird();
        addObject(b1, 0, 300);
        Bird b2 = new Bird();
        addObject(b2, 0, 300);
        Bird b3 = new Bird();
        addObject(b3, 0, 300);
        Bird b4 = new Bird();
        addObject(b4, 0, 300);
        b2.setRotation(45);
        b3.setRotation(-45);
        b4.setRotation(90);
    }
    private void addDecorations5(){
        Dolphin d1 = new Dolphin();
        Dolphin d2 = new Dolphin();
        Dolphin d3 = new Dolphin();
        d1.setTimer(100);
        d2.setTimer(150);
        d3.setTimer(150);
        addObject(d1, 1200-1000, 255);
        addObject(d2, 2000-1000, 340);
        addObject(d3, 150-1000, 150);
        
        Bird b1 = new Bird();
        addObject(b1, 0, 300);
        Bird b2 = new Bird();
        addObject(b2, 0, 300);
        Bird b3 = new Bird();
        addObject(b3, 0, 300);
        Bird b4 = new Bird();
        addObject(b4, 0, 300);
        b2.setRotation(45);
        b3.setRotation(-45);
        b4.setRotation(90);
    }
    private void addDecorations7(){
        Dolphin d1 = new Dolphin();
        Dolphin d2 = new Dolphin();
        Dolphin d3 = new Dolphin();
        d1.setTimer(100);
        d2.setTimer(150);
        d3.setTimer(150);
        addObject(d1, 150-1000, 400);
        addObject(d2, 750-1000, 234);
        addObject(d3, 990-1000, 435);
        
        Bird b1 = new Bird();
        addObject(b1, 0, 300);
        Bird b2 = new Bird();
        addObject(b2, 0, 300);
        Bird b3 = new Bird();
        addObject(b3, 0, 300);
        b2.setRotation(45);
        b3.setRotation(-45);
    }
    private void addDecorations11(){
        Dolphin d1 = new Dolphin();
        Dolphin d2 = new Dolphin();
        Dolphin d3 = new Dolphin();
        d1.setTimer(100);
        d2.setTimer(150);
        d3.setTimer(150);
        addObject(d1, 1500-1000, 410);
        addObject(d2, 2000-1000, 150);
        addObject(d3, 680-1000, 200);
        
        Bird b1 = new Bird();
        addObject(b1, 0, 300);
        Bird b2 = new Bird();
        addObject(b2, 0, 300);
        Bird b3 = new Bird();
        addObject(b3, 0, 300);
        b2.setRotation(45);
        b3.setRotation(-45);
    }
    private void addDecorations12(){
        Bird b1 = new Bird();
        addObject(b1, 1000, 300);
        Bird b2 = new Bird();
        addObject(b2, 1000, 300);
        Bird b3 = new Bird();
        addObject(b3, 1000, 300);
        Bird b4 = new Bird();
        addObject(b4, -1000, 300);
        Bird b5 = new Bird();
        addObject(b5, -1000, 300);
        b2.setRotation(45);
        b3.setRotation(-45);
        b4.setRotation(-90);
        b5.setRotation(90);
    }
    
    
    private void prepare()
    {
        boat boat = new boat();
        addObject(boat,283,540);
    }
}
