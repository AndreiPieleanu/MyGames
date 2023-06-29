import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CarmaDecor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BusolaDecor extends OtherIcons
{
    /**
     * Act - do whatever the CarmaDecor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img1 = new GreenfootImage("busloaDecorInstrument.png");
    private GreenfootImage img2 = new GreenfootImage("carmaDecor.png");
    private boolean t;
    
    
    public BusolaDecor(boolean t){
        if(!t)
            img1.scale(img1.getWidth()*40/100, img1.getHeight()*40/100);
        else
            img2.scale(img2.getWidth()*25/100, img2.getHeight()*25/100);
        this.t = t;
        if(t == false)
            setImage(img1);
        else
            setImage(img2);
    }
    
    private void getMainActorRotation(){
        for(int i=0;i<getWorld().getObjects(boat.class).size();i++){
            if(getWorld().getObjects(boat.class).get(i) != null){
                //getWorld().getObjects(boat.class).get(i).update("Bani: " + boatProperties.money + "\nDiamante: " + boatProperties.diamonds);
                setRotation(getWorld().getObjects(boat.class).get(i).getRotation()+90);
            }
        }
    }
    public void act() 
    {
        if(t)
            getMainActorRotation();
        // Add your action code here.
    }
}
