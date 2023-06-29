import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boatProperties here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boatProperties extends Ships
{
    /**
     * Act - do whatever the boatProperties wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int viteza = 3, turn = 3;
    public static int dmg=10, hp=150, mana=500, echipaj=100, ratieInamic=1, tunuri = 15, nivelulNavei = -1;
    public static int cannonDelay = 200, enemyBoatsDelay = 500, yourCannonSpeed = 6, enemyCannonSpeed = 4;
    
    public static int hullLevel = 3, carmaLevel = 3, catargLevel = 3, echipajLevel = 3, tunuriLevel = 3;
    public static int money = 10000, diamonds = 0;
    
    public static boolean muzicaMeniu=true, sunetInLupte=true, muzicaMagazin=true, muzicaVictorie=true, 
    muzicaInfrangere=true, muzicaNivel=true;
    
    public static int niveluriTerminate[]={
        1,
        0,
        0,
        0,
        0,
        0,
        //0,
        0,
        //0,
        //0,
        //0,
        0,
        0
    };
    public static int [][]indexi=
    {
        {258, 578},//0
        {200, 508},//1
        {291, 411},//2
        {300, 300},//3
        {441, 268},//4
        {576, 304},//5
        //{539, 437},//6
        {622, 189},//7
        //{775, 258},//8
        //{755, 115},//9
        //{856,  41},//10
        {328, 192},//11
        {281, 116},//12
    };
    public void act() 
    {
        // Add your action code here.
    }    
}
