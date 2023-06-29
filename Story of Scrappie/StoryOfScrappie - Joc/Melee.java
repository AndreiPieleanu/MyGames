import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Melee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Melee extends GoodObjects
{
    /**
     * Act - do whatever the Melee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img1 = new GreenfootImage("cleste1.png");
    private GreenfootImage img2 = new GreenfootImage("cleste2.png");
    private GreenfootImage img3 = new GreenfootImage("cleste3.png");
    private int frame = 0, timer = 0;
    private int directie;
    private static int vitezaScrappie = 0;
    
    //salveaza viteza lui Scrappie si fa-o 0 pe a acestuia
    public Melee(int directie){
        if (Scrappie.speed != 0)
            vitezaScrappie = Scrappie.speed;
                
        GreenfootImage i = getImage();
        img1.scale(90*i.getWidth()/100, i.getHeight());
        img2.scale(90*i.getWidth()/100, i.getHeight());
        img3.scale(90*i.getWidth()/100, i.getHeight());
        setImage(img1);
        this.directie = directie;
    }
    
    //animeaza o gheara si fa-o sa dispara la final, redandu-i viteza pe care Scrappie o avea pe parcurs
    private void animate(int valoare){
        frame++;
        timer++;
        if (frame>=1 && frame<valoare)
            setImage(img1);
        if (frame >= valoare && frame<2*valoare)
            setImage(img2);
        if (frame>=2*valoare && frame<3*valoare)
            setImage(img3);
        if (frame>=3*valoare && frame<4*valoare)
            setImage(img2);
        if (frame>=4*valoare && frame<5*valoare)
            setImage(img1);
        if(frame == 5*valoare){
            getWorld().removeObject(this);
            Scrappie.speed = vitezaScrappie;
            frame = 0;
            return;
        }
    }
    
    boolean wallCollision(){
        Actor a = getOneIntersectingObject(Wall.class);
        return a!=null;
    }
    
    public void act() 
    {
        setRotation(directie);
        animate(10);
        // Add your action code here.
    }    
}
