import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomba extends GoodObjects
{
    /**
     * Act - do whatever the Bomba wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootImage i = getImage();
    GreenfootImage img1 = new GreenfootImage("bomb.png");
    GreenfootImage img2 = new GreenfootImage("bomb.png");
    GreenfootImage boom = new GreenfootImage("boom.png");
    boolean isAgressive = false, once = true;

    public void setIsAgressive(boolean isAgressive){
        this.isAgressive = isAgressive;
    }
    public boolean getAgressive(){
        return this.isAgressive;
    }
    public Bomba(){
        isAgressive = false;
        img1.scale(60*i.getWidth()/100, 60*i.getHeight()/100);
        img2.scale(65*i.getWidth()/100, 65*i.getHeight()/100);
        boom.scale(120*i.getWidth()/100, 120*i.getHeight()/100);
        setImage(img1);
    }
    //spawneaza o bomba, da-i un timer si dupa aceea sa explodeze, facand pagube in jur
    int frame = 0;
    private void animate(){
        frame++;
        if(frame<180)
            setIsAgressive(false);
        if(frame>=1 && frame<25)
            setImage(img1);
        else if (frame >= 25 && frame<50)
            setImage(img2);
        else if (frame >= 50 && frame<75)
            setImage(img1);
        else if (frame >= 75 && frame<100)
            setImage(img2);
        else if (frame >= 100 && frame<125)
            setImage(img1);
        else if (frame >= 125 && frame<150)
            setImage(img2);
        else if (frame >= 150 && frame<180){
            //setImage(boom);
            setIsAgressive(true);
            setImage(boom);
            if(once){
                GreenfootSound boomSound = new GreenfootSound("boom.mp3"); 
                boomSound.setVolume(90);
                boomSound.play();
                once = false;
            }
        }
        else if(frame == 180){
            getWorld().removeObject(this);
            frame = 0;
            once = true;
            return;
        }
    }
    
    public void act() 
    {
        animate();
        // Add your action code here.
    }    
}
