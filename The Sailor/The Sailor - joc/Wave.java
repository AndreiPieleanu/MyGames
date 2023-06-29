import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wave extends Decorations
{
    /**
     * Act - do whatever the Wave wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String[] animation = {
        "decorations/wave1.png", 
        "decorations/wave2.png",
        "decorations/wave3.png",
    };
    private GreenfootImage img1 = new GreenfootImage(animation[0]);
    private GreenfootImage img2 = new GreenfootImage(animation[1]);
    private GreenfootImage img3 = new GreenfootImage(animation[2]);
    int c = 50;
    public Wave(){
        img1.scale(c*img1.getWidth()/100, c*img1.getHeight()/100);
        img2.scale(c*img2.getWidth()/100, c*img2.getHeight()/100);
        img3.scale(c*img3.getWidth()/100, c*img3.getHeight()/100);
    }
    int frame = 0, constanta = 10, cooldown = 200;
    private void doAnimation(){
        frame++;
        if(frame<constanta*3)
            move(1);
        if(frame>=0 && frame<=constanta){
            setImage(img1);
        }
        if(frame>constanta && frame<=constanta*2){
            setImage(img2);
        }
        if(frame>constanta*2 && frame<=constanta*3){
            setImage(img3);
        }
        if(frame == constanta*3){
            getImage().setTransparency(0);
        }
        if(frame == cooldown){
            frame = 0;
            getImage().setTransparency(255);
            int nr = Greenfoot.getRandomNumber(4);
            if(nr == 0)
                setLocation(getX()-Greenfoot.getRandomNumber(100), getY()-Greenfoot.getRandomNumber(100));
            if(nr == 1)
                setLocation(getX()+Greenfoot.getRandomNumber(100), getY()-Greenfoot.getRandomNumber(100));
            if(nr == 2)
                setLocation(getX()+Greenfoot.getRandomNumber(100), getY()+Greenfoot.getRandomNumber(100));
            if(nr == 3)
                setLocation(getX()-Greenfoot.getRandomNumber(100), getY()+Greenfoot.getRandomNumber(100));
        }
    }
    public void act() 
    {
        doAnimation();
        // Add your action code here.
    }    
}
