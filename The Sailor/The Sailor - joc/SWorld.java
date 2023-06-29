import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class SWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SWorld extends World
{

    /**
     * Constructor for objects of class SWorld.
     * 
     */
    private int scrollingWidth, scrollingHeight; // dimensiunile zonei in care voi da scrolling
    private int actorMinX, actorMaxX, actorMinY, actorMaxY; // limitele unde Scrappie poate ajunge
    private int scrolledX, scrolledY; // nr de scroll-uri facute vertical si orizontal
    private int scrollType; // tipul de scroll (0=nimic, 1=orizontal, 2=vertical, 3=vertical&orizontal)
    Actor mainActor = null; // Scrappie care va fi vizibil
    private List<Actor>genActors=new ArrayList(); // Lista obiectelor ce li se vor da scroll
    private GreenfootImage background = null;
    
    /**
     * The constructor for a universal scroller.
     * Creates an unbounded world and sets the size of the scrollable area.
     *
     * @param wide the window width
     * @param high the window height
     * @param cellSize the size of each cell
     * @param scrollWide the scrollable width (minimum value is window width)
     * @param scrollHigh the scrollable height (minimum value is window height)
     */
    /*
       dimensiunile Nivelului2 in functie de cell(standard cell=1) si de inaltimea Nivelului2 in sine
    */
    public SWorld(int wide, int high, int cellSize, int scrollWide, int scrollHigh)
    {
        super(cellSize==1?wide:(wide/2)*2+1, cellSize==1?high:(high/2)*2+1, cellSize, false); 
        scrollType=(scrollWide>wide?1:0)+(scrollHigh>high?2:0);
        scrollingWidth=scrollType%2==1?scrollWide:wide;
        scrollingHeight=scrollType/2==1?scrollHigh:high;
    }
    
    public SWorld(int wide, int high, int cellSize, int scrollWide)
    {
        this(wide, high, cellSize, scrollWide, high);

    }
    
    /*
     * pozitionarea atorului principal pe scena, daca exista
     */
    public void setMainActor(Actor main, int xRange, int yRange)
    {
        if (main==null)
        {
            System.out.println("A main actor MUST be supplied.");
            System.out.println("");
            return;
        }
        super.addObject(main, getWidth()/2, getHeight()/2);
        mainActor = main;
        xRange=(int)Math.min(xRange, getWidth());
        yRange=(int)Math.min(yRange, getHeight());
        actorMinX=getWidth()/2-xRange/2;
        actorMaxX=getWidth()/2+xRange/2;
        actorMinY=getHeight()/2-yRange/2;
        actorMaxY=getHeight()/2+yRange/2;
    }
    
    /*
     * functi Scrolling, ca sa mearga, este nevoie ca Scrappie sa fie setat cu setMainActor()
     */
    public void setScrollingBackground(GreenfootImage scrollingBackground)    
    {
        if(mainActor==null)
        {
            System.out.println("Cheama actorul principal cu setMainActor!");
            //System.out.println("");
            return;
        }
        
        background = new GreenfootImage(scrollingBackground);
        background.scale(scrollingWidth*getCellSize(), scrollingHeight*getCellSize());
        scrollBackground();
    }
    
    
    /*
     * parcurgerea lumii si "umplerea" hartii = cadranul se va misca odata cu actorul principal
     */
    public void fillScrollingBackground(GreenfootImage fillImage)
    {
        if(mainActor==null)
        {
            System.out.println("Cheama actorul principal cu setMainActor!");
            System.out.println("");
            return;
        }
        if (fillImage.getWidth()<getWidth() && fillImage.getHeight()<getHeight())
        {
            setBackground(new GreenfootImage(fillImage));
            fillImage = getBackground();
        }
        background = new GreenfootImage(scrollingWidth*getCellSize(), scrollingHeight*getCellSize());
        for (int x=0; x<background.getWidth(); x+=fillImage.getWidth())
            for (int y=0; y<background.getHeight(); y+=fillImage.getHeight())
                background.drawImage(fillImage, x, y);
        scrollBackground();
    }
        
    /*
     * adauga un actor pe scena, fa-l sa fie scrollable, adaugandu-l in lista principala de obiecte
     */
    public void addObject(Actor obj, int xLoc, int yLoc, boolean scroller)
    {
        super.addObject(obj, xLoc, yLoc);
        if(scroller) {genActors.add(obj);};
    }
    
    
    // doar adauga un actor scrollable
    public void addObject(Actor obj, int xLoc, int yLoc)
    {
        addObject(obj, xLoc, yLoc, true);
    }
    
    //sterge actorul 
    public void removeObject(Actor obj)
    {
        if(obj==null)
            return;
        if(obj.equals(mainActor))
            mainActor=null;
        else
            genActors.remove(obj);
        super.removeObject(obj);
    }
    
    //sterge colectia specificata de actori din parametru
    public void removeObjects(List<Actor>objs)
    {
        for(Actor obj:objs)removeObject(obj);
    }
    
    public void act()
    {
        scrollObjects();
        scrollBackground();
    }
    
    private void scrollBackground()
    {
        if (background==null)
            return;
        int w = getWidth(), h = getHeight(), c = getCellSize();
        int bw = background.getWidth(), bh = background.getHeight();
        getBackground().drawImage(background, (w*c-bw)/2-scrolledX*c, (h*c-bh)/2-scrolledY*c);
    }
    
    /**
     * Scrolls all scrollable object.  Determines how far outside boundary limits the main actor is, and moves all neccessary
     * objects in the same direction, moving the main actor back within boundary limits.  A background can be
     * made up of scrollable actor object(s) to produce a scrolling background; however, determining intersectors with object
     * will have to include the background object as being one or more of them when using <i>null</i> for the class of intersector.
     */
    /*
     * da-le scroll la toate obiectele scrollable si determina limitele actorului principal
     */
    private void scrollObjects()
    {
        if (mainActor==null) return;
        // determina cat de departe e actorul principal afara de limitele sale
        int dx=0, dy=0;
        if(mainActor.getX()<actorMinX) 
            dx=actorMinX-mainActor.getX();
        if(mainActor.getX()>actorMaxX)
            dx=actorMaxX-mainActor.getX();
        if(mainActor.getY()<actorMinY) 
            dy=actorMinY-mainActor.getY();
        if(mainActor.getY()>actorMaxY) 
            dy=actorMaxY-mainActor.getY();
        if(dx==0 && dy==0) 
            return; // daca nu e inafara limitei din perimetru
        // inafara limitei de perimetru
        int dxSum = dx, dySum = dy;
        scrolledX-=dx; scrolledY-=dy;
        // misca actorul princ inapoi in limitele perimetrului
        mainActor.setLocation(mainActor.getX()+dx, mainActor.getY()+dy);
        // vezi cat de departe backgroundul e in interiorul limitei
        dx=0; dy=0;
        if(scrolledX > scrollingWidth/2-getWidth()/2) dx=scrolledX-(scrollingWidth/2-getWidth()/2);
        if(scrolledX < getWidth()/2-scrollingWidth/2) dx=scrolledX-(getWidth()/2-scrollingWidth/2);
        if(scrolledY > scrollingHeight/2-getHeight()/2) dy=scrolledY-(scrollingHeight/2-getHeight()/2);
        if(scrolledY < getHeight()/2-scrollingHeight/2) dy=scrolledY-(getHeight()/2-scrollingHeight/2);
        // daca backgroundul nu acopera comple limita Nivelului
        dxSum+=dx; dySum+=dy;
        scrolledX-=dx; scrolledY-=dy;
        // misca toate obiectele in asa fel incat backgroundul sa continue
        mainActor.setLocation(mainActor.getX()+dx, mainActor.getY()+dy);
        for(Object obj : genActors)
        {
            Actor actor=(Actor)obj;
            actor.setLocation(actor.getX()+dxSum, actor.getY()+dySum);
            //System.out.println(actor.getClass());
        }
        //System.out.println();
        dx=0; dy=0;
        if(mainActor.getX() < 0) 
            dx=0-mainActor.getX();
        if(mainActor.getX() > getWidth()-1) 
            dx=(getWidth()-1)-mainActor.getX();
        if(mainActor.getY() < 0) 
            dy=0-mainActor.getY();
        if(mainActor.getY() > getHeight()-1) 
            dy=(getHeight()-1)-mainActor.getY();
        if(dx==0 && dy==0) 
            return;
        mainActor.setLocation(mainActor.getX()+dx, mainActor.getY()+dy);
    }
    
    public int getScrolledX(){
        return scrolledX;
    }
    public int getScrolledY(){
        return scrolledY;
    }
    public int getScrollingWidth(){
        return scrollingWidth;
    }
    public int getScrollingHeight(){
        return scrollingHeight;
    }
}
