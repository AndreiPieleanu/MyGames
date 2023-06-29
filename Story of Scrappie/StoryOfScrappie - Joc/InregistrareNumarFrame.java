import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InregistrareNumarFrame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InregistrareNumarFrame extends frameCurent
{
    /**
     * Act - do whatever the InregistrareNumarFrame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public InregistrareNumarFrame(){
        setImage(new GreenfootImage("V", 30, 
        Color.GREEN, Color.GREEN));
    }
    public static void setButoane(int nr){
        int x=156,y=88;
        for(int i=1;i<=nr+1;i++){
            new InregistrareNumarFrame().setLocation(x, y);
            y+=124;
        }
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
