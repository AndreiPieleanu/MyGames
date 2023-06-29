import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OptiuniButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class OptiuniButton extends Buttons
{
    /**
     * Act - do whatever the OptiuniButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public OptiuniButton(){
        setImage(new GreenfootImage("Optiuni", 30, 
        Color.BLACK, Color.WHITE));
    }
    private void checkWorldType(){
        if(Greenfoot.mousePressed(this)){
            if (getWorld() instanceof Nivel1 || getWorld() instanceof Nivel2 || getWorld() instanceof Nivel3 
            || getWorld() instanceof StoryofScrappie || getWorld() instanceof SelectLevel || getWorld() instanceof YouWinWorld){
                //codul pentru o mica interfata de optiuni
                OptiuniGUI gui = new OptiuniGUI();
                gui.main(new String[10]);
                //getWorld().addObject(gui, getWorld().getWidth()/2, getWorld().getHeight()/2);
                Greenfoot.stop();
            }
        }
    }
    public void act() 
    {
        checkWorldType();
        // Add your action code here.
    }    
}
