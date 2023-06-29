import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arrowBack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arrowBack extends frameCurent
{
    /**
     * Act - do whatever the arrowBack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public arrowBack(){
        GreenfootImage i = getImage();
        i.scale(10*i.getWidth()/100, 10*i.getHeight()/100);
        setImage(i);
    }
    //sagetile care vor merge inainte sau inapoi in functie de numarul instructiunii
    //(scade, adica mergi inapoi)
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            if(frameCurent.numarInstructiune == 0){
                Greenfoot.setWorld(new StoryofScrappie());
                frameCurent.numarInstructiune = 1;
            }
            else{
                frameCurent.numarInstructiune--;
                Greenfoot.setWorld(Instructiuni.setWorldType(frameCurent.numarInstructiune));
            }
            //nivelCurent.printX();
        }
        
        // Add your action code here.
    }    
}
