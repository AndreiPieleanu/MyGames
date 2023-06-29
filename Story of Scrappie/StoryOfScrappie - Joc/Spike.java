import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spike extends BadObjects
{
    /**
     * Act - do whatever the Spike wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage img = new GreenfootImage("spike.png");
    int frame;
    public Spike(int startTime, int delayTime){
        this.startTime = startTime;
        this.delayTime = delayTime;
        frame = 0;
        GreenfootImage i = getImage();
        img.scale(16*img.getWidth()/100, 16*img.getHeight()/100);
        setImage(img);
    }
    private boolean collision(){
        return getOneIntersectingObject(Scrappie.class)!=null;
    }
    private boolean agressive;
    public void setAgressive(boolean agressive){
        this.agressive = agressive;
    }
    public boolean getAgressive(){
        return this.agressive;
    }
    //stai activa pentru un anumit timp si fii agresiva(daca Scrappie trece pe aici scade-i din viata)
    //dupa aceea devino trnsparenta si opreste agresivitatea samd
    int t = 0, x = 0;
    private void delay(){
        if(collision()){
            if(t == 80){
                t = 0;
                x = 0;
                setAgressive(true);
            }
            if(getAgressive() && getImage().getTransparency() == 255 && x != 1){
                Scrappie.hp-=5;
                setAgressive(false);
                x = 1;
            }
            if(t<80){
                t++;
            }
        }
    }
    
    
    int startTime, delayTime;
    private void play(){
        frame++;
        if(frame <= startTime){
            getImage().setTransparency(255);
            setAgressive(true);
        }
        if(frame>startTime && frame <= delayTime+startTime){
            getImage().setTransparency(0);
            setAgressive(false);
            //getWorld().removeObject(this);
        }
        if(frame == delayTime + startTime + 1){
            startTime = 200;
            frame = 0;
            return;
        }
    }
    
    public void act() 
    {
        play();
        delay();
        // Add your action code here.
    }    
}
