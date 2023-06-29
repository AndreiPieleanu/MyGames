import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.util.function.*;
/**
 * Write a description of class Robotel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robotel2 extends Enemies
{
    /**
     * Act - do whatever the Robotel2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage move1 = new GreenfootImage("Robot2prototip1.png");
    private GreenfootImage move2 = new GreenfootImage("Robot2prototip2.png");
    private GreenfootImage back1 = new GreenfootImage("Robot2back1.png");
    private GreenfootImage back2 = new GreenfootImage("Robot2back2.png"); 
    private GreenfootImage front1 = new GreenfootImage("Robot2front1.png");
    private GreenfootImage front2 = new GreenfootImage("Robot2front2.png");
    private GreenfootImage distr1 = new GreenfootImage("Robot2distrus1.png");
    private GreenfootImage distr2 = new GreenfootImage("Robot2distrus2.png");
    List<GreenfootImage> images = Arrays.asList(move1, move2, back1, back2, front1, front2, distr1, distr2);
    private int dimensiune = 40;
    public Robotel2(){
        //modifica dimensiunea robotilor in functie de tipul nivelului curent
        if (SelectLevel.levelSituation != 1){
            dimensiune = 25;
            distr1.scale(30*front1.getWidth()/100, 30*front1.getHeight()/100);
            distr2.scale(30*front2.getWidth()/100, 30*front2.getHeight()/100);
            setImage(front1);
        }
        else if (SelectLevel.levelSituation == 1){
            
            dimensiune = 20;
            distr1.scale(20*front1.getWidth()/100, 20*front1.getHeight()/100);
            distr2.scale(20*front2.getWidth()/100, 20*front2.getHeight()/100);
            setImage(front1);
        }
        
        move1.scale(dimensiune*move1.getWidth()/100, dimensiune*move1.getHeight()/100);
        move2.scale(dimensiune*move2.getWidth()/100, dimensiune*move2.getHeight()/100);
        back1.scale(dimensiune*back1.getWidth()/100, dimensiune*back1.getHeight()/100);
        back2.scale(dimensiune*back2.getWidth()/100, dimensiune*back2.getHeight()/100);
        front1.scale(dimensiune*front1.getWidth()/100, dimensiune*front1.getHeight()/100);
        front2.scale(dimensiune*front2.getWidth()/100, dimensiune*front2.getHeight()/100);
        
    }
    private final int speed = 2;
    private int hp = 25;
    private final int attack = 10;
    
    int frame = 0, dinamicFrame = 0;
    
    private char Stanga_Dreapta;
    
    //seteaza de unde vrei sa inceapa(stanga, dreapta, sus sau jos)
    public void setStanga_dreapta(char Stanga_Dreapta){
        this.Stanga_Dreapta = Stanga_Dreapta;
    }
    public char getStanga_dreapta(){
        return this.Stanga_Dreapta;
    }
    public boolean collision(){
        return (getOneIntersectingObject(Wall.class) != null || getOneIntersectingObject(WallPereteV.class) != null || getOneIntersectingObject(WallPereteO.class) != null);
    }
    void objectsCollision(){
        //ia damage de la laser
        Actor a  = getOneIntersectingObject(LaserBeam.class);
        if(a!=null){
            getWorld().removeObject(a);
            hp-=Scrappie.attack;
        }
        
        //daca atinge bomba, fugi in celalata directie
        Actor b = getOneIntersectingObject(Bomba.class);
        if(b!=null){
            Bomba bmb = (Bomba) b;
            if(bmb.getAgressive()){
                hp-=30;
                if(hp <= 0){
                    destroyRobot();
                }
            }
            else{
                if(getStanga_dreapta() == 's'){
                    reverseImages();
                    setStanga_dreapta('d');
                    moveRight();
                }
                else if(getStanga_dreapta() == 'd'){
                    reverseImages();
                    setStanga_dreapta('s');
                    moveLeft();
                }
                else if(getStanga_dreapta() == 'x'){
                    reverseImages();
                    setStanga_dreapta('c');
                    moveBack();
                }
                else if(getStanga_dreapta() == 'c'){
                    reverseImages();
                    setStanga_dreapta('x');
                    moveFront();
                }
            }
        }
    }
    boolean once = true;
    void destroyRobot(){
        frame++;
        if(once){
                GreenfootSound boomSound = new GreenfootSound("boom.mp3"); 
                boomSound.setVolume(50);
                boomSound.play();
                once = false;
        }
        if(frame >= 1 && frame < 60)
            setImage(distr1);
        if(frame >= 60 && frame < 120)
            setImage(distr2);
        if (frame == 120){
            getWorld().removeObject(this);
            frame = 0;
            Random r = new Random();
            Scrappie.money+=(r.nextInt(40)+5);
            return;
        }
    }
    
    private void fireLaser(int u, int v){
        Random r = new Random();
        if (r.nextInt(500) <= 4){
            GreenfootSound laser = new GreenfootSound("laser.wav");
            laser.setVolume(70);
            laser.play();
            LaserBeamInamic beam = new LaserBeamInamic(u, v);
            getWorld().addObject(beam, getX(), getY()-26);
        }
    }
    int odata = 0;
    protected void takeDamageFromMelee(){
        Actor a = getOneIntersectingObject(Melee.class);

        if(a != null){
            if (odata == 0){
                hp-=Scrappie.attack;
                if(hp<=0){
                    setImage(distr1);
                    destroyRobot();
                }
                odata = 1;
            }
        }
        else
            odata = 0;
    }
    //a - fireLaser(getRotation(), -5);
    //d - fireLaser(getRotation(), +5);
    public void animate(){
        frame++;
        if (frame>=1 && frame <= 15){
            setImage(move1);
        }
        else if (frame> 15 && frame<=30){
            setImage(move2);
        }
        else if (frame> 30 && frame<=45){
            setImage(move1);
        }
        else if(frame > 45 && frame <= 60){
            setImage(move2);
        }
        else if (frame>60){
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
            setImage(front1);
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
    
    void moveLeft(){
        if(collision()){
            setLocation(getX() + 10*speed, getY());
            reverseImages();
            Stanga_Dreapta = 'd';
        }
        else{
            fireLaser(getRotation(), -5);
            setLocation(getX() - speed, getY());
            animate();
        }
    }
    void moveRight(){
        if(collision()){
            setLocation(getX() - 10*speed, getY());
            reverseImages();
            Stanga_Dreapta = 's';
        }
        
        else{
            fireLaser(getRotation(), +5);
            setLocation(getX() + speed, getY());
            animate();
        }
    }
    
    void moveFront(){
        if(collision()){
            dinamicFrame = 0;
            setLocation(getX(), getY() + 10*speed);
            Stanga_Dreapta = 'c';
            
        }
        
        else{
            fireLaser(getRotation()+90, -5);
            setLocation(getX(), getY() - speed);
            animateBack();
        }
    }
    void moveBack(){
        if(collision()){
            dinamicFrame = 0;
            setLocation(getX(), getY() - 10*speed);
            Stanga_Dreapta = 'x';
        }
        else{
            fireLaser(getRotation()+90, +5);
            setLocation(getX(), getY() + speed);
            animateForward();
            
        }
    }
    
    //ca si in cazul robotului malefic, modifica imaginile pe baza uneli liste si a unui stream
    GreenfootImage returnReversedImage(GreenfootImage i){
        i.mirrorHorizontally();
        return i;
    }
    void reverseImages(){
        images.stream().map(e -> returnReversedImage(e)).count();
    }
    
    
    int x = 0;
    public void act() {
        takeDamageFromMelee();
        //cat timp e in viata verifica pe unde ar putea sa o ia
        if(hp > 0){
            if(getStanga_dreapta() == 's' && x == 0){
                reverseImages();
                x = 1;
            }
            if(getStanga_dreapta() == 's' && x != 0){
                moveLeft();
            }
            else if (getStanga_dreapta() == 'd'){
                moveRight();
            }
            else if (getStanga_dreapta() == 'x')
                moveFront();
            else if (getStanga_dreapta() == 'c')
                moveBack();
        }
        else{
            destroyRobot();
        }
        //reactioneaza cu obiectele din jur
        if(getWorld() != null && hp>0)
            objectsCollision();
    }  
}
