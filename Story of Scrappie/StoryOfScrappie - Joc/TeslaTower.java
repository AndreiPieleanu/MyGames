import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TeslaTower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TeslaTower extends Obstacles
{
    /**
     * Act - do whatever the TeslaTower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage img = new GreenfootImage("Teslatower.png");
    private GreenfootImage img2 = new GreenfootImage("TeslaTowerActive.png");
    
    private final int dim = 16;
    private int frame = 0;
    
    public static boolean curentat, leverTras = false;
    //TeslaZap zap = TeslaZap.getInstance();
    
    public TeslaTower(){
        
        GreenfootImage i = getImage();
        img.scale(dim*i.getWidth()/100, dim*i.getHeight()/100);
        img2.scale((dim-2)*i.getWidth()/100, (dim-1)*i.getHeight()/100);
        setImage(img);
    }
    
    
    public void activeTower(){
        frame++;
        if(frame>=1 && frame<=50){
            setImage(img2);
            TeslaTower.curentat = true;
            
        }
        if(frame>50 && frame<70){
            setImage(img);
            TeslaTower.curentat = false;
        }
        if(frame == 70){
            frame = 0;
            return;
        }
        
        
    }
    
    public void act() 
    {
        if(!leverTras)
            activeTower();
        else{
            setImage(img);
            TeslaTower.curentat = false;
        }
        // Add your action code here.
    }
    
}
