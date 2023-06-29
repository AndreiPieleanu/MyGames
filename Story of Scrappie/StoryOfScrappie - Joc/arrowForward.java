import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arrowForward here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arrowForward extends frameCurent
{
    /**
     * Act - do whatever the arrowForward wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public arrowForward(){
        GreenfootImage i = getImage();
        i.scale(10*i.getWidth()/100, 10*i.getHeight()/100);
        setImage(i);
    }
    //sagetile care vor merge inainte sau inapoi in functie de numarul instructiunii
    //(creste, adica mergi inainte)
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            if(frameCurent.numarInstructiune == 4){
                Greenfoot.setWorld(new StoryofScrappie());
                frameCurent.numarInstructiune = 1;
            }
            else{
                frameCurent.numarInstructiune++;
                Greenfoot.setWorld(Instructiuni.setWorldType(frameCurent.numarInstructiune));
                //InregistrareNumarFrame.setButoane(frameCurent.numarInstructiune);
            }
            //nivelCurent.printX();
        }
        // Add your action code here.
    }    
}
