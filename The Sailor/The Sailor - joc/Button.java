import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String text = "";
    public Button(String text){
        this.text =  text;
        setImage(new GreenfootImage(text, 40, 
        Color.BLACK, Color.WHITE));
    }
    public Button(){}
    void properties(){
        if(Greenfoot.mouseClicked(this)){
            if(text.equalsIgnoreCase("back")){
                
            }
            if(text.equalsIgnoreCase("options")){
                
            }
            if(text.equalsIgnoreCase("shop")){
                
            }
        }
    }
    public void act(){
        properties();
    }  
}
