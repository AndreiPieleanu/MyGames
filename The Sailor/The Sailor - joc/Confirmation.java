import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
public class Confirmation extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    
    private static  String message;
    private static int nivel, price;

    /**
     * Launch the application.
     */
    
    private void confirmPurchase(){
        if(message.contains("carma")){
                        if(nivel == 2){
                                if(boatProperties.money >= price){
                                    boatProperties.money-=price;
                                    Carma.isLvl2Bought = true;
                                    boatProperties.carmaLevel = 2;
                                }
                        }
                        if(nivel == 3){
                            if(boatProperties.money >= price){
                                    boatProperties.money-=price;
                                    //System.out.println("Obiectul a fost cumparat!");
                                    Carma.isLvl3Bought = true;
                                    boatProperties.carmaLevel = 3;
                                }
                        }
                        //doPurchase(nivel, Carma.isLvl1Bought, Carma.isLvl2Bought, Carma.isLvl3Bought, price);
                    }
                    if(message.contains("catarg")){
                        if(nivel == 2){
                            if(boatProperties.money >= price){
                                    boatProperties.money-=price;
                                    //System.out.println("Obiectul a fost cumparat!");
                                    Catarg.isLvl2Bought = true;
                                    boatProperties.catargLevel = 2;
                                }
                        }
                        if(nivel == 3){
                            if(boatProperties.money >= price){
                                    boatProperties.money-=price;
                                    //System.out.println("Obiectul a fost cumparat!");
                                    Catarg.isLvl3Bought = true;
                                    boatProperties.catargLevel = 3;
                                }
                        }
                    }
                    if(message.contains("echipaj")){
                        if(nivel == 2){
                            if(boatProperties.money >= price){
                                    boatProperties.money-=price;
                                    //System.out.println("Obiectul a fost cumparat!");
                                     
                                    Echipaj.isLvl2Bought = true;
                                    boatProperties.echipajLevel = 2;
                                }
                        }
                        if(nivel == 3){
                            if(boatProperties.money >= price){
                                    boatProperties.money-=price;
                                    //System.out.println("Obiectul a fost cumparat!");
                                     
                                    Echipaj.isLvl3Bought = true;
                                    boatProperties.echipajLevel = 3;
                                }
                        }
                    }
                    if(message.contains("tunuri")){
                        if(nivel == 2){
                            if(boatProperties.money >= price){
                                    boatProperties.money-=price;
                                    //System.out.println("Obiectul a fost cumparat!");
                                     
                                    Tunuri.isLvl2Bought = true;
                                    boatProperties.tunuriLevel = 2;
                                }
                        }
                        if(nivel == 3){
                            if(boatProperties.money >= price){
                                    boatProperties.money-=price;
                                    //System.out.println("Obiectul a fost cumparat!");
                                     
                                    Tunuri.isLvl3Bought = true;
                                    boatProperties.tunuriLevel = 3;
                                }
                        }
                    }
                    if(message.contains("hull")){
                        if(nivel == 2){
                            if(boatProperties.money >= price){
                                    boatProperties.money-=price;
                                    //System.out.println("Obiectul a fost cumparat!");
                                     
                                    Hull.isLvl2Bought = true;
                                    boatProperties.hullLevel = 2;
                                }
                        }
                        if(nivel == 3){
                            if(boatProperties.money >= price){
                                    boatProperties.money-=price;
                                    //System.out.println("Obiectul a fost cumparat!");
                                     
                                    Hull.isLvl3Bought = true;
                                    boatProperties.hullLevel = 3;
                                }
                        }
                    }
    }
    
    public static void main(String[] args) {
        ImagePanel panel1 = new ImagePanel(
                new ImageIcon("images/icons/GUIBackground.png").getImage());
        Image icon = new ImageIcon("images/icons/pirateIcon.png").getImage();
        message = args[0];
        nivel = Integer.parseInt(args[1]);
        price = Integer.parseInt(args[2]);
        //System.out.println(message + " " + nivel + " " + price + "***");
        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Confirmation frame = new Confirmation();
                    frame.setVisible(true);
                    frame.setTitle("Confirmare");
                    frame.getContentPane().add(panel1);
                    frame.setIconImage(icon);
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    /**
     * Create the frame.
     */
    public Confirmation() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        Icon confirm = new ImageIcon("images/icons/confirm.png");
        Icon decline = new ImageIcon("images/icons/decline.png");
        
        JButton btnYes = new JButton(confirm);
        btnYes.setForeground(Color.BLACK);
        btnYes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                confirmPurchase();
                setVisible(false); //you can't see me :D
                dispose(); //distruge obiectul
            }
        });
        btnYes.setBounds(51, 213, 107, 37);
        contentPane.add(btnYes);
        
        JButton btnNo = new JButton(decline);
        btnNo.setForeground(Color.BLACK);
        btnNo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                setVisible(false); //you can't see me :D
                dispose(); //distruge obiectul
            }
        });
        btnNo.setBounds(283, 213, 107, 37);
        contentPane.add(btnNo);
        
        JLabel lblAtentie = new JLabel("Atentie!");
        lblAtentie.setForeground(Color.WHITE);
        lblAtentie.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lblAtentie.setHorizontalAlignment(SwingConstants.CENTER);
        lblAtentie.setBounds(155, 11, 120, 37);
        contentPane.add(lblAtentie);
        
        JLabel lblEstiSigurCa = new JLabel("Esti sigur ca vrei sa cumperi acest obiect?");
        lblEstiSigurCa.setForeground(Color.WHITE);
        lblEstiSigurCa.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblEstiSigurCa.setHorizontalAlignment(SwingConstants.CENTER);
        lblEstiSigurCa.setBounds(51, 72, 339, 64);
        contentPane.add(lblEstiSigurCa);
        
        JLabel lblAurulNuEste = new JLabel("Aurul tau este pretios! ");
        lblAurulNuEste.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblAurulNuEste.setForeground(Color.WHITE);
        lblAurulNuEste.setHorizontalAlignment(SwingConstants.CENTER);
        lblAurulNuEste.setBounds(61, 129, 339, 14);
        contentPane.add(lblAurulNuEste);
    }
}

class ImagePanel extends JPanel {

      private Image img;

      public ImagePanel(String img) {
        this(new ImageIcon(img).getImage());
      }

      public ImagePanel(Image img) {
        this.img = img;
        Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        setLayout(null);
      }

      public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
      }

	}