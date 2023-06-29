import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Puzzle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puzzle extends World
{

    /**
     * Constructor for objects of class Puzzle.
     * 
     */
    public Puzzle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
        //creeaza 3 piese si verifica daca acestea au fost colectate de actorul principal
        Piesa1 p1 = new Piesa1();
        Piesa2 p2 = new Piesa2();
        Piesa3 p3 = new Piesa3();
        if(Scrappie.puzzleCollected[0]){
            addObject(p1, 136, 291);
        }
        if(Scrappie.puzzleCollected[1]){
            addObject(p2, 408, 291);
        }
        if(Scrappie.puzzleCollected[2]){
            addObject(p3, 646, 291);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MeniuButton meniubutton = new MeniuButton();
        addObject(meniubutton,464,484);
        meniubutton.setLocation(71,576);
        OptiuniButton optiunibutton = new OptiuniButton();
        addObject(optiunibutton,753,573);
        optiunibutton.setLocation(727,575);
    }
}
