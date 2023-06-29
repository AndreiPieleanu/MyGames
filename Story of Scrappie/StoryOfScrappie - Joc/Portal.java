import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portal extends SimpleObjects
{
    /**
     * Act - do whatever the Portal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img = new GreenfootImage("Portal1.png");
    private GreenfootImage img2 = new GreenfootImage("Portal2.png");
    
    //tipul de portal(!=2 = simplu, 2 = animat si functional)
    private int portalType;
    private int frame = 0;
    private int portalLevel;
    
    public int getPortalType(){
        return this.portalType;
    }
    public void setPortalType(int portalType){
        this.portalType = portalType;
    }
    
    public int getPortalLevel(){
        return this.portalLevel;
    }
    public void setPortalLevel(int portalLevel){
        this.portalLevel = portalLevel;
    }
    public Portal(){
        GreenfootImage i = getImage();
        img.scale(20*i.getWidth()/100, 20*i.getHeight()/100);
        img2.scale(20*i.getWidth()/100, 20*i.getHeight()/100);
        setImage(img2);
    }
    
    private void animate(){
        frame++;
        if(frame>=1 && frame<20){
            setImage(img);
        }
        else if(frame>=20 && frame<40){
            setImage(img2);
        }
        else if (frame == 40){
            frame = 0;
            return;
        }
    }
    
    //trimite actorul in Selectlevel si deblocheaza urmatorul nivel
    private void goToNextLevel(){
        Actor a = getOneObjectAtOffset(0, 0, Scrappie.class);
        if(a!=null){
            SelectLevel.levelSituation = getPortalLevel();
            int aux = getPortalLevel();
            if(aux!=4){
                if(aux>SelectLevel.levelsUnlocked){
                    SelectLevel.levelsUnlocked = aux;
                }
                Greenfoot.setWorld(new SelectLevel());
            }
            else{
                Greenfoot.setWorld(new YouWinWorld());
            }
            
            Scrappie.money+=100;
            
        }
    }
    public void act() 
    {
        if(getPortalType() == 2){
            animate();
            goToNextLevel();
        }
        
    }    
    
}
