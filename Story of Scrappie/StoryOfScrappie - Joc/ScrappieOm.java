import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScrappieOm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScrappieOm extends Actors
{
    /**
     * Act - do whatever the ScrappieOm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img1 = new GreenfootImage("ScrappieOm.png");
    private GreenfootImage img2 = new GreenfootImage("ScrappieOm2.png");
    
    private GreenfootImage front1 = new GreenfootImage("ScrappieOmWalk1.png");
    private GreenfootImage front2 = new GreenfootImage("ScrappieOmWalk2.png");
    
    private int dim = 25;
    private int dir = 1, repetari = 0;
    public ScrappieOm(int x){
        img1.scale(dim*getImage().getWidth()/100, dim*getImage().getHeight()/100);
        img2.scale(dim*getImage().getWidth()/100, dim*getImage().getHeight()/100);
        front1.scale(dim*getImage().getWidth()/100, dim*getImage().getHeight()/100);
        front2.scale(dim*getImage().getWidth()/100, dim*getImage().getHeight()/100);
        if(x != 0){
            img1.mirrorHorizontally();
            img2.mirrorHorizontally();
            front1.mirrorHorizontally();
            front2.mirrorHorizontally();
            x = -1;
        }
        setImage(img2);
    }
    private int frame = 0;
    //deplaseaza-l pana cand intalneste un portal
    private void walk(){
        frame++;
        setLocation(getX()+dir, getY());
        if(frame >= 1 && frame < 20)
            setImage(front1);
        if(frame >= 20 && frame < 40)
            setImage(front2);
        if(frame == 40){
            frame = 0;
            return;
        }
    }
    private void fericit(){
        frame++;
        if(frame >= 1 && frame < 35)
            setImage(img2);
        if(frame >= 35 && frame < 70)
            setImage(img1);
        if(frame == 70){
            frame = 0;
            repetari++;
            return;
        }
    }
    public void act() 
    {
        if(repetari < 3)
            fericit();
        else
            walk();
        if(getOneIntersectingObject(Portal.class)!=null){
            Scrappie.money+=150;
            Greenfoot.setWorld(new YouWinWorld());
        }
        // Add your action code here.
    }    
}
