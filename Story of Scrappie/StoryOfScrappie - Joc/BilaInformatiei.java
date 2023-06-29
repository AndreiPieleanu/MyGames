import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class BilaInformatiei here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BilaInformatiei extends GoodObjects
{
    /**
     * Act - do whatever the BilaInformatiei wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img = new GreenfootImage("electronicball.png");
    public BilaInformatiei(){
        img.scale(35*getImage().getWidth()/100, 35*getImage().getHeight()/100);
        setImage(img);
    }
    private int frame = 0;
    private void animate(){
        frame++;
        setImage(img);
        if(frame>=1 && frame<=30)
            img.setTransparency(255);
        if(frame>30 && frame<=60)
            img.setTransparency(0);
        if(frame >= 61){
            frame = 0;
            return;
        }
    }
    
    //verifica unde poti spawna un portal in momentul in care colectezi bila
    //daca dreapta e ocupata pe 200 de pixeli, verifica la stanga
    //iar daca nici acolo nu e valabil, pune-o la dreapta by default
    int i = 100;
    int j = -100;
    private void youWin(){
        Actor a = getOneIntersectingObject(Scrappie.class);

        if(a!=null){
            Scrappie s = (Scrappie)a;
            Portal p = new Portal();
            p.setPortalType(2);
            p.setPortalLevel(4);
            Actor wall1 = getOneObjectAtOffset(100, 0, Wall.class);
            Actor wall2 = getOneObjectAtOffset(100, 0, WallPereteV.class);
            Actor wall3 = getOneObjectAtOffset(100, 0, WallPereteO.class);
            while(wall1!=null || wall2!=null || wall3!=null || i<=200){
                wall1 = getOneObjectAtOffset(i, 0, Wall.class);
                wall2 = getOneObjectAtOffset(i, 0, Wall.class);
                wall3 = getOneObjectAtOffset(i, 0, Wall.class);
                i++;
            }
            if (i == 200){
                getWorld().addObject(p, s.getX()+200, s.getY());
                getWorld().addObject(new ScrappieOm(0), s.getX(), s.getY());
                
            }
            else{
                wall1 = getOneObjectAtOffset(j, 0, Wall.class);
                wall2 = getOneObjectAtOffset(j, 0, Wall.class);
                wall3 = getOneObjectAtOffset(j, 0, Wall.class);
                while(wall1!=null || wall2!=null || wall3!=null || j>=-200){
                    wall1 = getOneObjectAtOffset(j, 0, Wall.class);
                    wall2 = getOneObjectAtOffset(j, 0, Wall.class);
                    wall3 = getOneObjectAtOffset(j, 0, Wall.class);
                    j--;
               }
               if(j == -200){
                   getWorld().addObject(p, s.getX()-200, s.getY());
                   getWorld().addObject(new ScrappieOm(1), s.getX(), s.getY());
               }
               else{
                   getWorld().addObject(p, s.getX()+200, s.getY());
                   getWorld().addObject(new ScrappieOm(0), s.getX(), s.getY());
               }
            }
            
            Actor b = getObjectsInRange(1000, HealthBar.class).get(0);
            getWorld().removeObject(b);
            getWorld().removeObject(a);
            getWorld().removeObject(this);
        }
    }
    
    public void act() 
    {
        animate();
        youWin();
    }    
}
