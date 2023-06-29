import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.util.function.*;

/**
 * Write a description of class Robotel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class RobotulMalefic extends Enemies //robotul are inglobat atat abilitati de  la robotul 1 (atac
                                            //din apropiere), cat si de la robotul 2 (laser)
                                            //dar si de la Scrappie(bomba)
                                            //si unice(teleportarea)
{
    /**
     * Act - do whatever the Robotel3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //imaginile pentru robotul malefic; acestea sunt salvate intr-o lista
    private GreenfootImage back1 = new GreenfootImage("robot3back1.png");
    private GreenfootImage back2 = new GreenfootImage("robot3back2.png");
    private GreenfootImage front1 = new GreenfootImage("robot3front1.png");
    private GreenfootImage front2 = new GreenfootImage("robot3front2.png");
    private GreenfootImage front3 = new GreenfootImage("robot3front3.png");
    private GreenfootImage move1 = new GreenfootImage("robot3move1.png");
    private GreenfootImage move2 = new GreenfootImage("robot3move2.png");
    private GreenfootImage move3 = new GreenfootImage("robot3move3.png");
    private GreenfootImage mage1 = new GreenfootImage("robot3mage1.png");
    private GreenfootImage mage2 = new GreenfootImage("robot3mage2.png");
    private GreenfootImage death1 = new GreenfootImage("robot3death1.png");
    private GreenfootImage death2 = new GreenfootImage("robot3death2.png");
    private GreenfootImage death3 = new GreenfootImage("robot3death3.png");
    private GreenfootImage death4 = new GreenfootImage("robot3death4.png");
    private List<GreenfootImage> images = Arrays.asList(back1, back2, front1, front2, front3, 
    move1, move2, move3, death1, death2, death3, death4);
    GreenfootImage img = getImage();
    public static int x;
    public static int y;
    Random lucky;
    public static int phase = 1;
    
    //coordonatele robotului
    public void getlocation()
    {
        x=getX();
        y=getY();
    }
    
   public RobotulMalefic(){
       phase = 1;
       hp = 400; attack = 5; speed = 1;
       lucky = new Random();
        img = getImage();
        scaleImages();
        setImage(front1);
   }
   
   //modifica dimeniunea imaginilor
    private GreenfootImage scaleImage(GreenfootImage i, int width, int height){
        i.scale(img.getWidth()*width/100, img.getHeight()*height/100);
        return i;
    }
    
    
    private void scaleImages(){
        //interfata functionala ce ne ajuta sa modificam dimensiunea imaginilor, returnandu-le modificate
        //(prima posibilitate de scriere cu functia deja existenta)
        Function <GreenfootImage, GreenfootImage> scaleFunction = e -> scaleImage(e, 35, 35);
        images.stream().map(scaleFunction).count();
        move1.scale(img.getWidth()*45/100, img.getHeight()*35/100);
        mage1.scale(img.getWidth()*30/100, img.getHeight()*45/100);
        mage2.scale(img.getWidth()*45/100, img.getHeight()*45/100);
        
        death2.scale(img.getWidth()*40/100, img.getHeight()*35/100);
        death3.scale(img.getWidth()*40/100, img.getHeight()*35/100);
        death4.scale(img.getWidth()*40/100, img.getHeight()*35/100);
    }

    //funtie ce ia ca parametru o imagine si returneaza aceasi imagine cu anumite modificari cum ar fi
    //oglindirea sau dimensiunea (a 2-a posibilitate de scriere cu expresie lambda)
    Function <GreenfootImage, GreenfootImage> reverseImageFunction = e -> {
                                                                            e.mirrorHorizontally();
                                                                            return e;
                                                                          };
    //stream ce oglindeste toate imaginile, count() de la final e operatie terminala ce numara imaginile
    //si porneste stream-ul
    private void reverseImages(){
        images.stream().map(reverseImageFunction).count();
    }
   
    
   public static int hp = 10, attack = 5, speed = 1;
   int frame = 0, dinamicFrame = 0;
   //animatiile robotului malefic
    public void animate(){
        frame++;
        if (frame>=1 && frame <= 10){
            setImage(move1);
        }
        else if (frame> 10 && frame<=20){
            setImage(move2);
        }
        else if (frame> 20 && frame<=30){
            setImage(move3);
        }
        else if(frame > 30 && frame <= 40){
            setImage(move2);
        }
        else if (frame == 41){
            frame = 0;
            return;
        }
    }
    private void animateForward(){
        dinamicFrame++;
        if (dinamicFrame>=1 && dinamicFrame <= 15){
            setImage(front1);
        }
        else if (dinamicFrame> 15 && dinamicFrame<=30){
            setImage(front2);
        }
        else if (dinamicFrame> 30 && dinamicFrame<=45){
            setImage(front3);
        }
        else if(dinamicFrame > 45 && dinamicFrame <= 60){
            setImage(front2);
        }
        else if (dinamicFrame>60){
            dinamicFrame = 0;
            return;
        }
    }
    private void animateBack(){
        dinamicFrame++;
        if (dinamicFrame>=1 && dinamicFrame <= 15){
            setImage(back1);
        }
        else if (dinamicFrame> 15 && dinamicFrame<=30){
            setImage(back2);
        }
        else if (dinamicFrame> 30 && dinamicFrame<=45){
            setImage(back1);
        }
        else if(dinamicFrame > 45 && dinamicFrame <= 60){
            setImage(back2);
        }
        else if (dinamicFrame>60){
            dinamicFrame = 0;
            return;
        }
    }
    
    int odata = 0;
    protected void takeDamageFromMelee(){
        Actor a = getOneIntersectingObject(Melee.class);
        if(a != null){
            if (odata == 0){
                hp-=Scrappie.attack;
                if(hp<=0){
                    destroyRobot();
                }
                if(getWorld()!=null)
                    spawnMinions(this, phase);
                odata = 1;
            }
        }
        else
            odata = 0;
    }
    
    boolean once = true;
    void destroyRobot(){
        setImage(death2);
        if(once){
            GreenfootSound boomSound = new GreenfootSound("boom.mp3"); 
            boomSound.setVolume(70);
            boomSound.play();
            once = false;
        }
        frame++;
        if (frame>=1 && frame <= 40){
            setImage(death1);
        }
        if (frame> 40 && frame<=60){
            setImage(death2);
        }
        if (frame> 60 && frame<=80){
            setImage(death3);
        }
        if(frame > 80 && frame <= 200){
            setImage(death4);
        }
        //distruge acest robot, adauga bila informatiei si da-i bani lui Scrappie
        if(frame >200){
            frame = 0;
            addBila();
            getWorld().addObject(new Piesa3(), lucky.nextInt(500)+150, lucky.nextInt(300)+150);
            getWorld().removeObject(this);
            Scrappie.money+=200;
            return;
        }
    }
    private void addBila(){
        BilaInformatiei bila = new BilaInformatiei();
        getWorld().addObject(bila, this.getX(), this.getY());
    }
    /*
     * functia de spawn a inamicilor
     * in functie de faza ne vom orienta cate obiecte sa spawneze robotul
     * faza scade pe masura ce viata scade, iar la faza 1 robotul este mai rapid si mai periculos
     */
    private void spawnMinions(RobotulMalefic rm, int phase){
        int minionSansa = lucky.nextInt(15);
        int aidSansa = lucky.nextInt(60);
        //spawneaza minioni in functie de sansa(pot fi roboti 1 sau 2)
        if(minionSansa < 3){
            for(int i=1;i<=phase;i++){
                int sf = lucky.nextInt(100)+1;
                int n = lucky.nextInt(3), dX = 0, dY = 0;
                //cu coordonatele in jurul robotului
                if(sf < 25){
                    dX = lucky.nextInt(10)-40;
                    dY = lucky.nextInt(10)-40;
                }
                if(sf >= 25 && sf < 50){
                    dX = lucky.nextInt(10)+40;
                    dY = lucky.nextInt(10)-40;
                }
                if(sf >= 50 && sf < 75){
                    dX = lucky.nextInt(10)+40;
                    dY = lucky.nextInt(10)+40;
                }
                if(sf >= 75){
                    dX = lucky.nextInt(10)-40;
                    dY = lucky.nextInt(10)+40;
                }
                if(n == 0){
                    Robotel1 r = new Robotel1();
                    r.setStanga_dreapta('s');
                    getWorld().addObject(r, rm.getX()+dX, rm.getY()+dY);
                }
                else{
                    Robotel2 r = new Robotel2();
                    if(lucky.nextInt(2) == 1){
                        r.setStanga_dreapta('s');
                    }
                    else{
                        if(lucky.nextInt(2) == 1)
                            r.setStanga_dreapta('x');
                        else
                            r.setStanga_dreapta('c');
                    }
                    getWorld().addObject(r, rm.getX()+dX, rm.getY()+dY);
                }
            }
        }
        //spawneaza ajutor pentru ca Scrappie sa atace si sa se repare
        if(aidSansa < 10){
            for(int i=1;i<=phase+1;i++){
                GoodObjects go;
                int n = lucky.nextInt(3);
                if(n == 0){
                    go = new Aid();
                    getWorld().addObject(go, getWorld().getWidth()-lucky.nextInt(500),  getWorld().getHeight()-lucky.nextInt(200));
                }
                else{
                    go = new LaserBattery();
                    getWorld().addObject(go, getWorld().getWidth()-lucky.nextInt(500),  getWorld().getHeight()-lucky.nextInt(200));
                }
            }
        }
    }
    
    
    private void spawnBomb(){
        if(lucky.nextInt(4000) < 10){
            int sf = lucky.nextInt(100)+1;
            int dX = 0, dY = 0;
            if(sf < 25){
                dX = lucky.nextInt(10)-40;
                dY = lucky.nextInt(10)-40;
            }
            if(sf >= 25 && sf < 50){
                dX = lucky.nextInt(10)+40;
                dY = lucky.nextInt(10)-40;
            }
            if(sf >= 50 && sf < 75){
                dX = lucky.nextInt(10)+40;
                dY = lucky.nextInt(10)+40;
            }
            if(sf >= 75){
                dX = lucky.nextInt(10)-40;
                dY = lucky.nextInt(10)+40;
            }
            getWorld().addObject(new Bomba(), this.getX()+dX, this.getY()+dY);
        }
    }
    
    boolean bombOnce = false;
    int bmbT = 0;
    void objectsCollision(){
        Actor a  = getOneIntersectingObject(LaserBeam.class);
        if(a!=null){
            getWorld().removeObject(a);
            hp-=Scrappie.attack;
            spawnMinions(this, phase);
        }
        //daca bomba explodeaza sa ii scada 30 din viata numai o singura data
        Actor b = getOneIntersectingObject(Bomba.class);
        if(b!=null){
            bmbT++;
            Bomba bmb = (Bomba) b;
            if(bmb.getAgressive()){
                if(!bombOnce){
                    hp-=30;
                    bombOnce = true;
                }
                if(bmbT >= 50){
                    bombOnce = false;
                    bmbT = 0;
                }
                if(hp <= 0){
                    destroyRobot();
                }
                if(lucky.nextInt(20) < 2)
                    spawnMinions(this, phase);
            }

        }
    }
   //functiile de introarcere in momentul in care ai dat cumva de zid
   boolean turn = false;
   void moveLeft(){
       if(turn){
           reverseImages();
           turn = false;
       }
       setLocation(getX() - speed, getY());
       fireLaser(getRotation(), -5, phase);
       animate();
   }
    void moveRight(){
        if(!turn){
            reverseImages();
            turn = true;
        }
        setLocation(getX() + speed, getY());
        fireLaser(getRotation(), +5, phase);
        animate();
   }
   void moveFront(){
        setLocation(getX(), getY() - speed);
        fireLaser(getRotation()+90, -5, phase);
        animateBack();
    }
    void moveBack(){
        setLocation(getX(), getY() + speed);
        fireLaser(getRotation()+90, +5, phase);
        animateForward();
    }
   //teleporteaza robotul
   //aceasta va fi valalbila numai sub o anumita sansa, iar robotul poate fi lovit
   //in timp ce acesta pregateste vraja de teleportare
   int mageFrame = 0;
   void teleportBoss(){
       if(mageFrame >= 1 && mageFrame < 30)
           setImage(mage1);
       if(mageFrame >= 31 && mageFrame < 50)
           setImage(mage2);
       if(mageFrame == 51){
           
          Random r = new Random();
          int coordX, coordY;
          coordX = Math.abs(r.nextInt(getWorld().getWidth())-100);
          coordY = Math.abs(r.nextInt(getWorld().getHeight())-100);
          
          setLocation(coordX, coordY);
        }
        if(mageFrame > 51 && mageFrame < 70)
            setImage(mage2);
        if(mageFrame >= 70 && mageFrame <=100)
            setImage(mage1);
        if(mageFrame == 101){
           mageFrame = 0;
           closed = false;
           return;
        }
   }
   
   //urmareste-l pe Scrappie pe toata harta
   //daca x == y robotul va merge pe diagonala
   void followScrappie(Actors a){
       int deltaX = getX() - a.getX();
       int deltaY = getY() - a.getY();
       if(Math.abs(deltaX) > Math.abs(deltaY)){
           if(deltaX > 0){
               moveLeft();
           }
           else if (deltaX < 0){
               moveRight();
           }
       }
       else{
           if(deltaY > 0){
               moveFront();
           }
           else if (deltaY < 0){
               moveBack();
           }
       }
   }
   
    private void fireLaser(int u, int v, int sansa){
        Random r = new Random();
        
        if (r.nextInt(1000) <= sansa){
            LaserBeamInamic beam = new LaserBeamInamic(u, v);
            getWorld().addObject(beam, getX(), getY()-55);
        }
    }
    
    //daca l-ai atins pe Scrappie, i-ai o singura data din viata si pune un timer
    //ca acesta sa aiba timp sa fuga
    int timer = 0, attackDelay = 0;
    private void attackScrappie(){
        List<Scrappie> list = getObjectsInRange(15, Scrappie.class);
        if(timer < 150)
            timer++;
        if(!list.isEmpty()){
            if(list.get(0) != null){
                teleportBoss();
                if(timer == 150){
                    timer = 0;
                    attackDelay = 0;
                }
                if(attackDelay == 0){
                    Scrappie.hp-=attack;
                    attackDelay = 1;
                }
                if(timer < 150){
                    timer++;
                }
            }
        }

    }
    
    int tpNumber;
    boolean closed = false;
    
    public void act() 
    {
        takeDamageFromMelee();
        getlocation();
        attackScrappie();
        spawnBomb();
        
        
        if(hp > 0){
           if(hp>=0 && hp<=100){
               phase = 3;
               speed = 2;
            }
           if(hp>100 && hp<=200){
               phase = 2;
            }
           if(hp>200){
               phase = 1;
            }
           if(!closed && phase > 1)
               tpNumber = lucky.nextInt(4000);
           else if(!closed && phase == 1)
               tpNumber = lucky.nextInt(3500);
           if(tpNumber > 10){
               List<Scrappie> scrappie = getWorld().getObjects(Scrappie.class);
               if(!scrappie.isEmpty()){
                   Scrappie s = scrappie.get(0);
                   followScrappie(s);
               }
           }
           else{
               closed = true;
               mageFrame++;
               teleportBoss();
           }
        }
        else{
            destroyRobot();
        }
        if(getWorld() != null && hp>0)
            objectsCollision();
        // Add your action code here.
    }   
    
}
