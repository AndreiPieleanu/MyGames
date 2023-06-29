import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SimpleObjects here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SimpleObjects extends Objects
{
    /**
     * Act - do whatever the SimpleObjects wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //proprietatea mostenirii in OOP, orice piesa care e atinsa sa dispara si sa umple lumea 
    //Puzzle cu cele colectate. In clasele Piesa123 vom schimba dimensiunile pieselor in fct de
    //lumea in care se afla
    public void deleteAtCollisionOnce(Actor actor){
        Actor a = getOneIntersectingObject(Scrappie.class);
        Actor b = getOneIntersectingObject(ScrappieOm.class);
        if(a != null || b != null){
            if(actor instanceof Piesa1)
                Scrappie.puzzleCollected[0] = true;
            else if(actor instanceof Piesa2)
                Scrappie.puzzleCollected[1] = true;
            else if(actor instanceof Piesa3)
                Scrappie.puzzleCollected[2] = true;
            getWorld().removeObject(this);
        }
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
