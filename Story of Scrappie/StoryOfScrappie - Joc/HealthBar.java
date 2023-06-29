import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actors
{
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int health = Scrappie.hp;
    int width=75;
    int height=15;
    int healthPerPixel;
    String s;
    int baza = 1, aux = health;
    
    //calculeaza viata ramasa lui Scrappie
    //din moment ce totul este in int, nu putem aproxima viata, iar pe masura ce cumperi mai multa
    //viata, ratia va scadea pana va deveni 0, asa ca verifica daca viata e un numar mare si scade
    //usor bara de hp
    public HealthBar(){
        while(aux!=0){
            baza*=10;
            aux/=10;
        }
        if(health>width)
            healthPerPixel = (baza*width/health)%baza<baza?1:width/health;
        else
            healthPerPixel = (int)width/health;
    }
    
    public void act() 
    {
        if(SelectLevel.levelSituation == 1)
            setLocation(Scrappie.x, Scrappie.y-40);
        else
            setLocation(Scrappie.x, Scrappie.y-55);
        update();
    }
    
    //de fiecare data mentine constant bara de health
    public void update()
    {
        health=Scrappie.hp;
        setImage(new GreenfootImage(width+2,height+2));
        GreenfootImage hb=getImage();
        hb.setColor(Color.BLACK);
        hb.drawRect(0,0,width+1,height+1);
        hb.setColor(Color.GREEN);
        hb.fillRect(1,1,Scrappie.hp*healthPerPixel,height);
    }
}
