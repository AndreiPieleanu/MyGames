import greenfoot.*;
import java.util.*;
/**
 * Write a description of class Mesaje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Mesaje extends Actor
{
    private String text = "Pune cursorul pe iconite pentru\na vedea informatii despre ele."; boolean isFollowingPlayer;
    Actor initialPlayerPosition, currentPlayerPosition;
    int initialPlayerX, initialPlayerY;
    int currentPlayerX, currentPlayerY;
    int previousPlayerX, previousPlayerY;
    
    World backToThisWorld;
    public Mesaje(){
        setImage(new GreenfootImage(text, 20, 
        Color.BLACK, new Color(0,0,0,0)));
    }
    public Mesaje(String text){
        this.text =  text;
        setImage(new GreenfootImage(text, 20, 
        Color.BLACK, new Color(0,0,0,0)));
    }
    public Mesaje(String text, int dim){
        this.text =  text;
        setImage(new GreenfootImage(text, dim, 
        Color.BLACK, new Color(0,0,0,0)));
    }
    
    public Mesaje(String text, World w){
        this.text =  text;
        setImage(new GreenfootImage(text, 20, 
        Color.BLACK, new Color(0,0,0,0)));
        this.backToThisWorld = w;
        
        //thisMessageX = getX();
        
        /*if(a != null){
            playerX = a.getX();
            playerY = a.getY();
        }*/
    }
    
    void update(String text){
        this.text =  text;
        setImage(new GreenfootImage(text, 20, Color.BLACK, new Color(0,0,0,0)));
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(this)){
            if(this.text.equals("Meniu principal")){
                if(backToThisWorld != null){
                    /*if(getWorld() instanceof ShopIcons)
                        Greenfoot.setWorld(new ShopBackground());
                    else
                        */Greenfoot.setWorld(this.backToThisWorld);
                }
                
            }
            if(this.text.equals("Magazin")){
                Greenfoot.setWorld(new ShopBackground());
            }
            if(this.text.equals("Inapoi la harta")){
                Greenfoot.setWorld(new SelectLevel());
            }
            if(this.text.equals("Inapoi")){
                Instructiuni.instrNumber--;
                Instructiuni.ok=1;
            }
            if(this.text.equals("Inainte")){
                Instructiuni.instrNumber++;
                Instructiuni.ok=1;
            }
            if(this.text.equals("Restart joc")){
                boatProperties.money = 100;
                boatProperties.hullLevel = 1;
                boatProperties.carmaLevel = 1;
                boatProperties.catargLevel = 1;
                boatProperties.echipajLevel = 1;
                boatProperties.tunuriLevel = 1;
                boatProperties.diamonds = 0;
                Greenfoot.setWorld(new StartWorld());
            }
            if(this.text.equals("Optiuni")){
                String[] args = {""};
                new Options().main(args);
            }
            if(this.text.equals("In sfarsit, victorie!")){
                Greenfoot.setWorld(new StartWorld());
                
            }
        }
    }
    
    public void setMessage(String text){
        this.text = text;
        update(this.text);
        //setImage(new GreenfootImage(this.text, 20, Color.BLACK, new Color(0,0,0,0)));
    }
    
    public String getMessage(){
        return this.text;
    }
    public String toString(){
        return this.text;
    }
    
}
