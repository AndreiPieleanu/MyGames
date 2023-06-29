import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scrappie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Scrappie extends Actors
{
    
    
    /**
     * Act - do whatever the Scrappie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img1 = new GreenfootImage("ScrappieStand1.png");
    private GreenfootImage img2 = new GreenfootImage("ScrappieStand2.png");
    
    private GreenfootImage move1 = new GreenfootImage("ScrappieMove1.png");
    private GreenfootImage move1Mid = new GreenfootImage("ScrappieMove1Mid.png");
    private GreenfootImage move2 = new GreenfootImage("ScrappieMove2.png");
    
    private GreenfootImage front1 = new GreenfootImage("ScrappieFront1.png");
    private GreenfootImage front2 = new GreenfootImage("ScrappieFront2.png");
    
    private GreenfootImage back1 = new GreenfootImage("ScrappieBack1.png");
    private GreenfootImage back2 = new GreenfootImage("ScrappieBack2.png");
    
    private int frame = 0;
    private int dinamicframe = 0;
    
    private int dimensiune = 17;
    private final int constanta = 5;
    public static int x;
    public static int y;
    public static int hp = 40, maxHP = 40;
    public static int speed = 2;
    public static int attack = 5;
    public static int money = 15000;
    public static int numberOfBombs = 2;
    public static String fata = "w", spate = "s", stanga = "a", dreapta = "d", 
                         bomba = "b", laser = "l", maneta = "p", gheara = "t";
    private final int gravity = 1;
    private int velocity = 0;
    
    private int odata = 0, timer = 0;
    private int munitieLaser = 0;
    
    private String key, lastKeyPressed = "s";
    
    private boolean isIdle = true;
    public static boolean []puzzleCollected = {false, false, false};
    //ii schimb dimensiunea imaginii cu fiecare nivel
    //levelSituation e nivelul la care se afla, iar levelsUnlocked iti arata cate nivele ai deblocat


    public void locatie()
    {
        x = getX();
        y = getY();
    }
    public Scrappie(){
        
        velocity = 0;
        GreenfootImage i = getImage();
        if(SelectLevel.levelSituation == 1){
            dimensiune = 17;
        }
        if(SelectLevel.levelSituation == 2){
            dimensiune = 22;
        }
        if(SelectLevel.levelSituation == 3){
            dimensiune = 25;
        }
        img1.scale(dimensiune*i.getWidth()/100, dimensiune*i.getHeight()/100);
        img2.scale((dimensiune+5)*i.getWidth()/100, dimensiune*i.getHeight()/100);
        move1.scale((dimensiune-5)*i.getWidth()/100, dimensiune*i.getHeight()/100);
        move1Mid.scale((dimensiune-5)*i.getWidth()/100, dimensiune*i.getHeight()/100);
        move2.scale((dimensiune-5)*i.getWidth()/100, dimensiune*i.getHeight()/100);
        front1.scale((dimensiune-constanta)*i.getWidth()/100, dimensiune*i.getHeight()/100);
        front2.scale((dimensiune-constanta)*i.getWidth()/100, dimensiune*i.getHeight()/100);
        back1.scale((dimensiune-constanta)*i.getWidth()/100, dimensiune*i.getHeight()/100);
        back2.scale((dimensiune-constanta)*i.getWidth()/100, dimensiune*i.getHeight()/100);
        setImage(img1);
    }
    //pentru nivelul 2, ca optiunile si back-ul sa il urmareasca pe player iar daca se dupe prea departe
    //va reveni inapoi
    private void followScrappie(){
        Actor a, b;
        try{
            a = getObjectsInRange(700, BackButton.class).get(0);
            b = getObjectsInRange(700, OptiuniButton.class).get(0);
            if(a != null || b != null){
                    if(Greenfoot.isKeyDown(dreapta) && b.getX()<getWorld().getWidth()){
                        a.setLocation(a.getX()+Scrappie.speed, a.getY());
                        b.setLocation(b.getX()+Scrappie.speed, b.getY());
                        
                    }
                    if(Greenfoot.isKeyDown(stanga) && b.getX()>0){
                        a.setLocation(a.getX()-Scrappie.speed, a.getY());
                        b.setLocation(b.getX()-Scrappie.speed, b.getY());
                    }
            }
        }
        catch(IndexOutOfBoundsException e){
            a = getObjectsInRange(900, BackButton.class).get(0);
            b = getObjectsInRange(900, OptiuniButton.class).get(0);
            if(lastKeyPressed.equals("a")){
                a.setLocation(a.getX()+500, a.getY());
                b.setLocation(b.getX()+500, b.getY());
            }
            else{
                a.setLocation(a.getX()-500, a.getY());
                b.setLocation(b.getX()-500, b.getY());
            }
        }
    }
    //daca Scrappie nu va face nimica
    private void idleScrappie(){
        isIdle = true;
        frame++;
        if(frame>=1 && frame<40)
            setImage(img1);
        else if (frame>=40 && frame<80)
            setImage(img2);
        else if (frame == 80){
            frame = 0;
            return;
        }
    }
    //sari de maxim 3 ori, cu un delay foarte mic la final pana sa isi revina
    private int double_jump = 0, delayJump = 0;
    
    private void delayTheJump(){
        if(double_jump<3){
            if("space".equals(key)){
                if(double_jump <= 2){
                    double_jump++;
                    velocity = -15;
                }
            }
            else
                delayJump++;
            if(delayJump >= 200){
                double_jump = 0;
                delayJump = 0;
            }
        }
        else{
            delayJump++;
            if(delayJump >= 150){
                double_jump = 0;
                delayJump = 0;
            }
        }
    }
    //misca-l pe Scrappie in toate cele 4 directii
    private void moveScrappie(){
        //nivelul 2 cu platformele e o exceptie, doar pe a si d poti juca, si poti sari
        if(SelectLevel.levelSituation == 2){
            followScrappie();
            fall();
            delayTheJump();
            //System.out.println("delayJump" + delayJump + "\ndouble_jump" + double_jump);
            if(Greenfoot.isKeyDown(stanga)){
                timer = 0;
                lastKeyPressed = "a";
                frame = 0;
                setLocation(getX() - speed, getY());
                if(odata == 1){
                    move1.mirrorHorizontally();
                    move1Mid.mirrorHorizontally();
                    move2.mirrorHorizontally();
                    odata = 0;
                }
                
                walkAnimation();
                if(laser.equals(key))
                    fireLaser(getRotation(), -5);
                wallCollision(-speed, 0);
                meleeAttack(getRotation() + 90, -40, 0);
            }
            else if (Greenfoot.isKeyDown(dreapta)){
                timer = 0;
                lastKeyPressed = "d";
                frame = 0;
                setLocation(getX() + speed, getY());
                if (odata == 0){
                    move1.mirrorHorizontally();
                    move1Mid.mirrorHorizontally();
                    move2.mirrorHorizontally();
                    odata = 1;
                }
                
                walkAnimation();
                if(laser.equals(key))
                    fireLaser(getRotation(), 5);
                wallCollision(+speed, 0);
                meleeAttack(getRotation() + 270, +40, 0);
            }
            //daca nu faci nimica va reveni inapoi la pozitia initiala de idle
            else{
                isIdle = true;
                if("l".equals(key)){
                    if(lastKeyPressed.equals("a"))
                        fireLaser(getRotation(), -5);
                    else if(lastKeyPressed.equals("d"))
                        fireLaser(getRotation(), 5);
                    else
                        fireLaser(getRotation()+90, 5);
                }
                timer++;
                if(timer >= 5){
                    dinamicframe = 0;
                    idleScrappie();
                    lastKeyPressed = "s";
                }
                wallCollision(0, +speed); 
                meleeAttack(getRotation(), 0, +50);
            }
    }
    //nivelurile 1 si 3
    else if (SelectLevel.levelSituation != 2)
        if(Greenfoot.isKeyDown(stanga)){
            lastKeyPressed = "a";
            timer = 0;
            frame = 0;
            setLocation(getX() - speed, getY());
            if(odata == 1){
                move1.mirrorHorizontally();
                move1Mid.mirrorHorizontally();
                move2.mirrorHorizontally();
                odata = 0;
            }
            walkAnimation();
            if(laser.equals(key))
                fireLaser(getRotation(), -5);
            wallCollision(-speed, 0);
            meleeAttack(getRotation() + 90, -40, 0);
        }
        
        else if (Greenfoot.isKeyDown(dreapta)){
            lastKeyPressed = "d";
            timer = 0;
            frame = 0;
            setLocation(getX() + speed, getY());
            if (odata == 0){
                move1.mirrorHorizontally();
                move1Mid.mirrorHorizontally();
                move2.mirrorHorizontally();
                odata = 1;
            }
            walkAnimation();
            if(laser.equals(key))
                fireLaser(getRotation(), 5);
            wallCollision(+speed, 0);
            meleeAttack(getRotation() + 270, +40, 0);
        }
        
        else if (Greenfoot.isKeyDown(fata)){
            lastKeyPressed = "w";
            timer = 0;
            setLocation(getX(), getY() - speed);
            moveBack();
            if(laser.equals(key))
                fireLaser(getRotation()+90, -5);
            wallCollision(0, -speed);
            meleeAttack(getRotation() + 180, 0, -50);
        }
        else if (Greenfoot.isKeyDown(spate)){
            lastKeyPressed = "s";
            timer = 0;
            setLocation(getX(), getY() + speed);
            moveInFront();
            if(laser.equals(key))
                fireLaser(getRotation()+90, +5);
            wallCollision(0, +speed); 
            meleeAttack(getRotation(), 0, +50);
        }
        
        else{
            if(laser.equals(key)){
                if(lastKeyPressed.equals("w"))
                    fireLaser(getRotation()+90, -5);
                else if(lastKeyPressed.equals("a"))
                    fireLaser(getRotation(), -5);
                else if(lastKeyPressed.equals("s"))
                    fireLaser(getRotation()+90, +5);
                else if(lastKeyPressed.equals("d"))
                    fireLaser(getRotation(), 5);
                else
                    fireLaser(getRotation()+90, +5);
            }
            timer++;
            if(timer >= 5){
                dinamicframe = 0;
                idleScrappie();
                lastKeyPressed = "s";
            }
            meleeAttack(getRotation(), 0, +50);
        }
    }
    //banala animatie de mers in stanga si dreapta
    private void walkAnimation(){
        isIdle = false;
        dinamicframe++;
        if(dinamicframe>=1 && dinamicframe<20){
            setImage(move1);
        }
        else if (dinamicframe>=20 && dinamicframe<30){
            setImage(move1Mid);
        }
        else if (dinamicframe>=30 && dinamicframe<50){
            setImage(move2);

        }
        else if (dinamicframe>=50 && dinamicframe<60){
            setImage(move1Mid);
        }
        else if (dinamicframe==60){
            dinamicframe = 0;
            return;
        }
    }
    //animatie de mers in fata
    private void moveInFront(){
        isIdle = false;
        dinamicframe++;
        if(dinamicframe>=1 && dinamicframe<20){
            setImage(front1);
        }
        else if (dinamicframe>=20 && dinamicframe<40){
            setImage(front2);
        }
        else if (dinamicframe == 40){
            dinamicframe = 0;
            return;
        }
    }
    //animatie de mers in spate
    private void moveBack(){
        isIdle = false;
        dinamicframe++;
        if(dinamicframe>=1 && dinamicframe<20){
            setImage(back1);
        }
        else if (dinamicframe>=20 && dinamicframe<40){
            setImage(back2);
        }
        else if (dinamicframe == 40){
            dinamicframe = 0;
            return;
        }
    }
    //cade Scrappie
    private void fall(){
        setLocation(getX(), getY() + velocity);
        Actor a = getOneIntersectingObject(Wall.class);
        if (a!=null){
            velocity = 0;
        }
        else
            velocity+=gravity;
   }
   
   //colecteaza bateriile si pune 5 lasere in inventar
   private void collectBattery(){
       Actor a = getOneIntersectingObject(LaserBattery.class);
       if(a != null){
           getWorld().removeObject(a);
           munitieLaser+=5;
       }
   }
   //trage cu laserele
   private void fireLaser(int u, int v){
       if(getWorld()!= null){
           if(munitieLaser != 0){
               LaserBeam beam = new LaserBeam(u, v);
               GreenfootSound laserSound = new GreenfootSound("laser.wav"); 
               laserSound.play();
               getWorld().addObject(beam, getX(), getY()-17);
               munitieLaser--;
           }
        }
    }
    
    //daca Scrappie nu mai are viata, atunci va muri
    boolean bombaExplosieOdata = false;
    private void ScrappieDies(){
        Actor a = getOneIntersectingObject(TeslaTower.class);
        if(a != null){
            if(TeslaTower.curentat == true){
                GreenfootSound electricshock = new GreenfootSound("electricshock.mp3");
                electricshock.play();
                hp = 0;
            }
        }
        Actor b = getOneIntersectingObject(Bomba.class);
        Bomba bmb;

        if(b!=null){
            bmb = (Bomba) b;
            if(bmb.getAgressive()){
                if(!bombaExplosieOdata){
                    hp-=30;
                    bombaExplosieOdata = true;
                }
            }
        }
        else
            bombaExplosieOdata = false;
        //aici trebuie facuta interfata de game over
        if(Scrappie.hp<=0){
            //Greenfoot.stop(); 
            restartWorld();
            //restartWorld();
        }
        if(SelectLevel.levelSituation == 2 && getWorld() != null && getY() >= getWorld().getHeight())
            restartWorld();
    }
    
    private void restartWorld(){
        Greenfoot.setWorld(new GameOverWorld());
        hp = 25;
        speed = 2;
        attack = 5;
    }
    
    //trage de lever si opreste toate turnurile tesla
    public void pullTheLever(){
        Actor a = getOneIntersectingObject(Lever.class);
        if(a!=null){
            if(maneta.equals(key)){
                getWorld().removeObject(a);
                TeslaTower.leverTras = true;
                Scrappie.money+=20;
            }
        }
    }
    private void wallCollision(int x, int y){
        Actor a = null;
        final int constanta = 5;
        if(x>0)
            x+=constanta;
        else if(x<0)
            x-=constanta;
        if(y>0)
            y+=(constanta + 5);
        else if (y<0)
            y-=(constanta + 5);
       if (!isIdle){
           eliminateClimbing(Wall.class);
           a = getOneObjectAtOffset(x, y, Wall.class);
           if(a != null){
                setLocation(getX()-x, getY()-y);
            }
            
            Actor b = getOneObjectAtOffset(x, y, WallPereteV.class);
            if(b != null){
                setLocation(getX()-x, getY() - y);
            }
            
            Actor c = getOneObjectAtOffset(x, y, WallPereteO.class);
            if(c != null){
                setLocation(getX() - x, getY() - y);
            }
       }
       else if (isIdle){
           eliminateClimbing(Wall.class);
       }
    }
    
    private void eliminateClimbing(Class c){
        
        Actor a = getOneIntersectingObject(c);
           if (a != null){
               Actor aux1 = getOneObjectAtOffset(25, 0, c);
               Actor aux2 = getOneObjectAtOffset(-25, 0, c);
               Actor aux3;
               if(aux1!=null){
                   setLocation(getX() - 15, getY());
               }
               if(aux2!=null)
                   setLocation(getX() + 15, getY());
               for (int i = -40;i<=0;i++){
                   aux3 = getOneObjectAtOffset(0, i, c);
                   if(aux3 != null){
                       setLocation(getX(), getY() + 20);
                    }
               }
          }
    }
    
    //daca nu mai ai lasere poti folosi tasta t pentru a activa gheara
    int ghearaPeRand = 50;
    private void meleeAttack(int d, int x, int y){
        if(ghearaPeRand<=50)
            ghearaPeRand++;
        if(gheara.equals(key)){
            if(ghearaPeRand>=50){
                Melee m = new Melee(d);
                speed =  0;
                getWorld().addObject(m, getX() + x, getY() + y);
                ghearaPeRand = 0;
            }
       }
    }
    //plaseaza o bomba langa tine cu timer
    private void detonateBomb(){
        if(bomba.equals(key)){
            if (numberOfBombs > 0){
                Bomba b = new Bomba();
                b.setIsAgressive(false);
                getWorld().addObject(b, getX(), getY());
                numberOfBombs--;
            }
        }
    }
    
    public void act() 
    {
        key = Greenfoot.getKey();
        detonateBomb();
        moveScrappie();
        collectBattery();
        ScrappieDies();
        if(getWorld()!=null)
            locatie();
        if(getWorld() != null)
            pullTheLever();
            
        // Add your action code here.
    }    
}
