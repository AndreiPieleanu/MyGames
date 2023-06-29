import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShipComponents here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShipComponents extends Actor
{
    /**
     * Act - do whatever the ShipComponents wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Confirmation confirmation = new Confirmation();
    PriceStatus priceStatus = new PriceStatus();
    protected void resizeToShop(GreenfootImage image, int percentage1, int percentage2){
        image.scale(image.getWidth()*percentage1/100, image.getHeight()*percentage2/100);
        setImage(image);
    }
    boolean confirm(boolean b){return true;}
    void confirm(String mesaj, int nivel, int priceOfItem){
        String args[] = {mesaj, nivel+"", priceOfItem+""};
        confirmation.main(args);
    }
    void showAlert(int i){
        String args[]=new String[1];
        if(i == 0)
            args[0] = "Obiectul este deja cumparat!";
        else if(i == 1)
            args[0] = "Obiectul este prea scump!";
        priceStatus.main(args);
    }
    
    
    void selectItem(String message, int nivel, boolean isBoughtAlready, int price){
        if(Greenfoot.mouseClicked(this)){
            if (ShopIcons.class.isInstance(getWorld())){
                //getWorld().addObject(new ShopIcon(message), getWorld().getWidth()/2, getWorld().getHeight()/2);
                //System.out.println(message + " " + nivel + " " + isBoughtAlready + " " + price);
                //if(boatProperties.money >= price){
                    if(message.contains("carma")){
                        if(nivel == 1){
                            if(Carma.isLvl1Bought){
                                //System.out.println("Obiectul este deja cumparat!");
                                boatProperties.turn = 3;
                                showAlert(0);
                                boatProperties.carmaLevel = 1;
                            }else{
                                boatProperties.money-=price;
                                //System.out.println("Obiectul a fost cumparat!");
                                Carma.isLvl1Bought = true;
                            }
                        }
                        if(nivel == 2){
                            if(Carma.isLvl2Bought){
                                //System.out.println("Obiectul este deja cumparat!");
                                boatProperties.turn = 5;
                                showAlert(0);
                                boatProperties.carmaLevel = 2;
                            }else{
                                if(boatProperties.money >= price){
                                    confirm(message, nivel, price);
                                }else{showAlert(1);//System.out.println("Obiectul este prea scump!");
                                }
                            }
                        }
                        if(nivel == 3){
                            if(Carma.isLvl3Bought){
                                //System.out.println("Obiectul este deja cumparat!");
                                boatProperties.turn = 7;
                                showAlert(0);
                                 boatProperties.carmaLevel = 3;
                            }else{
                                if(boatProperties.money >= price){
                                    confirm(message, nivel, price);
                                }else{
                                    //System.out.println("Obiectul este prea scump!");
                                    showAlert(1);
                                }
                            }
                        }
                        //doPurchase(nivel, Carma.isLvl1Bought, Carma.isLvl2Bought, Carma.isLvl3Bought, price);
                    }
                    
                    if(message.contains("catarg")){
                        if(nivel == 1){
                            if(Catarg.isLvl1Bought){
                                //System.out.println("Obiectul este deja cumparat!");
                                showAlert(0);
                                boatProperties.catargLevel = 1;
                            }else{
                                boatProperties.money-=price;
                                //System.out.println("Obiectul a fost cumparat!");
                                Catarg.isLvl1Bought = true;
                            }
                        }
                        if(nivel == 2){
                            if(Catarg.isLvl2Bought){
                                //System.out.println("Obiectul este deja cumparat!");
                                showAlert(0);
                                boatProperties.catargLevel = 2;
                            }else{
                                if(boatProperties.money >= price){
                                    confirm(message, nivel, price);
                                }else{
                                    //System.out.println("Obiectul este prea scump!");
                                    showAlert(1);
                                }
                            }
                        }
                        if(nivel == 3){
                            if(Catarg.isLvl3Bought){
                                //System.out.println("Obiectul este deja cumparat!");
                                showAlert(0);
                                boatProperties.catargLevel = 3;
                            }else{
                                if(boatProperties.money >= price){
                                    confirm(message, nivel, price);
                                }else{
                                    //System.out.println("Obiectul este prea scump!");
                                    showAlert(1);
                                }
                            }
                        }
                    }
                    if(message.contains("echipaj")){
                        if(nivel == 1){
                            if(Echipaj.isLvl1Bought){
                                //System.out.println("Obiectul este deja cumparat!");
                                showAlert(0);
                                boatProperties.echipajLevel = 1;
                            }else{
                                boatProperties.money-=price;
                                //System.out.println("Obiectul a fost cumparat!");
                                 
                                Echipaj.isLvl1Bought = true;
                            }
                        }
                        if(nivel == 2){
                            if(Echipaj.isLvl2Bought){
                                //System.out.println("Obiectul este deja cumparat!");
                                showAlert(0);
                                boatProperties.echipajLevel = 2;
                            }else{
                                if(boatProperties.money >= price){
                                    confirm(message, nivel, price);
                                }else{
                                    //System.out.println("Obiectul este prea scump!");
                                    showAlert(1);
                                }
                            }
                        }
                        if(nivel == 3){
                            if(Echipaj.isLvl3Bought){
                                //System.out.println("Obiectul este deja cumparat!");
                                showAlert(0);
                                boatProperties.echipajLevel = 3;
                            }else{
                                if(boatProperties.money >= price){
                                    confirm(message, nivel, price);
                                }else{
                                    //System.out.println("Obiectul este prea scump!");
                                    showAlert(1);
                                }
                            }
                        }
                    }
                    if(message.contains("tunuri")){
                        if(nivel == 1){
                            if(Tunuri.isLvl1Bought){
                                //System.out.println("Obiectul este deja cumparat!");
                                showAlert(0);
                                boatProperties.tunuriLevel = 1;
                            }else{
                                boatProperties.money-=price;
                                //System.out.println("Obiectul a fost cumparat!");
                                 
                                Tunuri.isLvl1Bought = true;
                            }
                        }
                        if(nivel == 2){
                            if(Tunuri.isLvl2Bought){
                                //System.out.println("Obiectul este deja cumparat!");
                                showAlert(0);
                                boatProperties.tunuriLevel = 2;
                            }else{
                                if(boatProperties.money >= price){
                                    confirm(message, nivel, price);
                                }else{
                                   // System.out.println("Obiectul este prea scump!");
                                   showAlert(1);
                                }
                            }
                        }
                        if(nivel == 3){
                            if(Tunuri.isLvl3Bought){
                                //System.out.println("Obiectul este deja cumparat!");
                                showAlert(0);
                                boatProperties.tunuriLevel = 3;
                            }else{
                                if(boatProperties.money >= price){
                                    confirm(message, nivel, price);
                                }else{
                                   //System.out.println("Obiectul este prea scump!");
                                   showAlert(1);
                                }
                            }
                        }
                    }
                    if(message.contains("hull")){
                        if(nivel == 1){
                            if(Hull.isLvl1Bought){
                                //System.out.println("Obiectul a fost cumparat!");
                                 showAlert(0);
                                boatProperties.hullLevel = 1;
                            }else{
                                boatProperties.money-=price;
                                //System.out.println("Obiectul a fost cumparat!");
                                Hull.isLvl1Bought = true;
                            }
                        }
                        if(nivel == 2){
                            if(Hull.isLvl2Bought){
                                //System.out.println("Obiectul este deja cumparat!");
                                showAlert(0);
                                boatProperties.hullLevel = 2;
                            }else{
                                if(boatProperties.money >= price){
                                    confirm(message, nivel, price);
                                }else{
                                    //System.out.println("Obiectul este prea scump!");
                                    showAlert(1);
                                }
                            }
                        }
                        if(nivel == 3){
                            if(Hull.isLvl3Bought){
                                //System.out.println("Obiectul este deja cumparat!");
                                showAlert(0);
                                boatProperties.hullLevel = 3;
                            }else{
                                if(boatProperties.money >= price){
                                    confirm(message, nivel, price);
                                }else{
                                   //System.out.println("Obiectul este prea scump!");
                                   showAlert(1);
                                }
                            }
                        }
                    }
                    //System.out.println("Tranzactia a fost un succes!");
                /*}else{
                    System.out.println("Prea scump!");
                }*/
            }
            
        }
    }
    
    int timer = 0;
    public void informationAboutItem(ShipComponents sc, int nivel){
        if(getWorld() instanceof ShopIcons){
            if(Greenfoot.mouseMoved(this)){
                Mesaje mesaj = getWorld().getObjects(Mesaje.class).get(3);
                if(sc instanceof Catarg){
                    if(nivel == 1){       
                        mesaj.setMessage(
                        "Catargul cel mai simplu, de care \norice pirat la inceput are nevoie. \nSimplu si la indemana, matelot!\nAcest obiect este important \npentru viteza navei tale!");
                    }
                    else if(nivel == 2){
                        mesaj.setMessage(
                        "O variante mai buna de ales atunci \n cand ai nevoie de viteza! Acest \ncatarg e facut din lemn de stejar \nsi garanteaza ca va tine! \nAsa mi-a spus vanzatorul...");
                    }
                    else if(nivel == 3){
                        mesaj.setMessage(
                        "Cand vine vorba de viteza, \nmotorul cu aburi castiga mereu! \nNu e nevoie decat de putini \ncarbuni si frumusetea asta poate \nsa iti propulseze nava cu \nviteze foarte mari pe mari!");
                    }
                }
                if(sc instanceof Echipaj){
                    if(nivel == 1){
                        mesaj.setMessage(
                        "Bun venit la bord, capitane!\nAsta este prima noastra zi pe \nnava! Cu ce te putem ajuta? \nOrice treaba marinareasca dar nu \nlupta! Ne este foarte frica!");
                    }
                    else if(nivel == 2){
                        mesaj.setMessage(
                        "Arrr, capitane! Se pare ca \nluptele nu au fost chiar asa de \ngrele precum am zis. Suntem \nalaturi de tine pana la final si \nvom lupta pentru capitanul nostru!");
                    }
                    else if(nivel == 3){
                        mesaj.setMessage(
                        "Buna ziua, stimate domn! Nu\nam altceva de oferit decat curaj, \nexperienta si devotament! \nTii minte cand am scufundat prima \nnoastra nava spaniola? \nCe vremuri...");
                    }
                }
                if(sc instanceof Carma){
                    if(nivel == 1){
                        mesaj.setMessage(
                        "Sa nu te temi! Aceasta carma \neste perfecta pentru o nava \naflata la inceputul calatoriei. \nNava se intoarce repede pentru a\nintercepta inamicul.");
                    }
                    else if(nivel == 2){
                        mesaj.setMessage(
                        "O varianta imbunatatita a carmei.\nFabricata dint-run soi de \nlemn fin, aceasta componenta va\n scadea timpul de intoarcere \nal navei chiar mai repede!");
                    }
                    else if(nivel == 3){
                        mesaj.setMessage(
                        "Ce face butonul asta? Beep! \nBoop! Ultima solutie pentru a \n raspunde provocarilor inamicilor \nnostri. Acum poti comunica instant \ncu baiatul de pe catarg!");
                    }
                }
                if(sc instanceof Tunuri){
                    if(nivel == 1){
                        mesaj.setMessage(
                        "Aceste tunuri nu au mai fost \nschimbate de cand am luat nava \ndin port. Nu par a fi puternice, \ndar inamicii nostri se tem de \nputerea lor. Foloseste-le cu \nincredere!");
                    }
                    else if(nivel == 2){
                        mesaj.setMessage(
                        "O varianta imbunatatita, aceste \ntunuri din aur va baga spaima \nin tot ce inseamna galioane \nspaniole. Totusi, echipajul \nnu e obisnuit sa traga cu ele, \ndar se vor descurca ei.");
                    }
                    else if(nivel == 3){
                        mesaj.setMessage(
                        "Cele mai bune tunuri fabricate \ndin cel mai bun metal prelucret, \naceste monstrozitati vor nimici \nabsolut totul in calea lor. Oamenii \nnostri sunt atat de speriati de ele \nincat iau distanta mare atunci \ncand trag cu ele!");
                    }
                }
                if(sc instanceof Hull){
                    if(nivel == 1){
                        mesaj.setMessage(
                        "Cea mai importanta componenta \na navei, cu un design simplu, \ncare isi face treaba asa cum \ntrebuie. Capacitate mica de \nstocare, dar cu suficiente butoaie \nde praf de pusca.");
                    }
                    else if(nivel == 2){
                        mesaj.setMessage(
                        "Avand un design elegant, aceasta \npiesa importanat a navei tale \no va transforma intr-o mica \nfortareata plutitoare. Creste \nrezistenta navei, dar scade viteza \nsi creste timpul de intoarcere al \nacesteia.");
                    }
                    else if(nivel == 3){
                        mesaj.setMessage(
                        "Celebrul ironclad care a \nrevolutionat lumea navala, \nintroducand pentru prima data \narmura de fier pe nava. Cu un \nconfort placut chipajul tau va \niubi nava asta! Invincibila \npe mare, sa vedem!");
                    }
                }
            }else{
                timer++;
                if(timer == 1000){
                    Mesaje mesaj = getWorld().getObjects(Mesaje.class).get(3);
                    mesaj.setMessage("Put mouse on one of the icons to \nsee information about it");
                    timer = 0;
                }
                
                //Mesaje mesaj = getWorld().getObjects(Mesaje.class).get(3);
                //mesaj.setMessage("Put mouse on one of the icons to \nsee information about it");
            }
        }
        
    }
    public void act() 
    {
         
        // Add your action code here.
    }    
    
}
