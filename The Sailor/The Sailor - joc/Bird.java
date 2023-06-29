import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Decorations
{
    /**
     * Act - do whatever the Bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int c = 40;
    public Bird(){
        img1.scale(c*img1.getWidth()/100, c*img1.getHeight()/100);
        img2.scale(c*img2.getWidth()/100, c*img2.getHeight()/100);
        img3.scale(c*img3.getWidth()/100, c*img3.getHeight()/100);
    }
    
    
    private String[] animation = {
        "decorations/bird1.png", 
        "decorations/bird2.png",
        "decorations/bird3.png",
    };
    private GreenfootImage img1 = new GreenfootImage(animation[0]);
    private GreenfootImage img2 = new GreenfootImage(animation[1]);
    private GreenfootImage img3 = new GreenfootImage(animation[2]);
    
    int frame = 0, constanta = 10;
    private void doAnimation(){
        frame++;
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
            frame=0;
        }
    }
    private void barrierCollision(){
        Actor a = getOneIntersectingObject(Barrier.class);
        if(a!=null){
            for(int i=1;i<=4;i++)
                move(-3);
            turn(180);
        }
    }
    public void act() 
    {
        move(2);
        doAnimation();
        barrierCollision();
        if(Greenfoot.getRandomNumber(100)<10){
            turn(Greenfoot.getRandomNumber(10));
        }
        //barrierCollision();
        // Add your action code here.
    }    
}
