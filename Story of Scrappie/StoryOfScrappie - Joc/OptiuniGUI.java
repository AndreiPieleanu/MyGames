import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.*;
/**
 * Write a description of class OptiuniGUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OptiuniGUI extends JFrame
{
    /*
     * relizata cu ajutorul frameworkului Eclipse, aceasta interfata are rolul de a modifica actiunile 
     * utiliatorului si de a porni/opri muzica, cu exceptia laserelor, bombei, muzicii de victorie
     * sin infrangere ca utilizatorul sa fie ce s-a intamplat
     */
    /**
     * Act - do whatever the OptiuniGUI wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //butoane si campuri de text
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JLabel lblMersFata;
    private JLabel lblMersSpate;
    private JLabel lblMersStanga;
    private JLabel lblMersDreapta;
    private JLabel lblTastaBomba;
    private JLabel lblNewLabel;
    private JLabel lblTastaLaser;
    private JLabel lblTastaGheara;
    private JLabel lblSunet;
    private JLabel lblOptiuni;
    JButton btnSetariDefault = new JButton("Setari Default");
    JButton btnConfirmaSetarile = new JButton("Confirma setarile");
    JButton btnAmTerminat = new JButton("Am terminat");
    private static JCheckBox chckbxOpresteMuzica;
    public static int nr = 1;
    
    private String fata, spate, stanga, dreapta, bomba, maneta, laser, gheara;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    OptiuniGUI frame = new OptiuniGUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        
    }

    /**
     * Create the frame.
     */
    
    public OptiuniGUI() {
        //off = new ImageIcon(getClass().getResource("soundOFF.png"));
        //System.out.println(Scrappie.fata);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        textField = new JTextField();
        textField.setBounds(93, 107, 53, 20);
        contentPane.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setBounds(93, 138, 53, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);
        
        textField_2 = new JTextField();
        textField_2.setBounds(93, 169, 53, 20);
        contentPane.add(textField_2);
        textField_2.setColumns(10);
        
        textField_3 = new JTextField();
        textField_3.setBounds(93, 200, 53, 20);
        contentPane.add(textField_3);
        textField_3.setColumns(10);
        
        textField_4 = new JTextField();
        textField_4.setBounds(269, 107, 53, 20);
        contentPane.add(textField_4);
        textField_4.setColumns(10);
        
        textField_5 = new JTextField();
        textField_5.setBounds(269, 138, 53, 20);
        contentPane.add(textField_5);
        textField_5.setColumns(10);
        
        textField_6 = new JTextField();
        textField_6.setBounds(269, 169, 53, 20);
        contentPane.add(textField_6);
        textField_6.setColumns(10);
        
        textField_7 = new JTextField();
        textField_7.setBounds(269, 200, 53, 20);
        contentPane.add(textField_7);
        textField_7.setColumns(10);
        
        textField.setText(Scrappie.fata);
        textField_1.setText(Scrappie.spate);
        textField_2.setText(Scrappie.stanga);
        textField_3.setText(Scrappie.dreapta);
        textField_4.setText(Scrappie.bomba);
        textField_5.setText(Scrappie.maneta);
        textField_6.setText(Scrappie.laser);
        textField_7.setText(Scrappie.gheara);
        
        btnSetariDefault.setBounds(10, 231, 114, 30);
        contentPane.add(btnSetariDefault);
        
        btnConfirmaSetarile.setBounds(134, 231, 156, 30);
        contentPane.add(btnConfirmaSetarile);
        
        btnAmTerminat.setBounds(300, 231, 124, 27);
        contentPane.add(btnAmTerminat);
        
        lblMersFata = new JLabel("Mers fata");
        lblMersFata.setBounds(10, 110, 83, 14);
        contentPane.add(lblMersFata);
        
        lblMersSpate = new JLabel("Mers spate");
        lblMersSpate.setBounds(10, 141, 83, 14);
        contentPane.add(lblMersSpate);
        
        lblMersStanga = new JLabel("Mers stanga");
        lblMersStanga.setBounds(10, 172, 83, 14);
        contentPane.add(lblMersStanga);
        
        lblMersDreapta = new JLabel("Mers dreapta");
        lblMersDreapta.setBounds(10, 203, 83, 14);
        contentPane.add(lblMersDreapta);
        
        lblTastaBomba = new JLabel("Tasta bomba");
        lblTastaBomba.setBounds(183, 110, 95, 14);
        contentPane.add(lblTastaBomba);
        
        lblNewLabel = new JLabel("Tasta maneta");
        lblNewLabel.setBounds(182, 141, 96, 14);
        contentPane.add(lblNewLabel);
        
        lblTastaLaser = new JLabel("Tasta laser");
        lblTastaLaser.setBounds(183, 172, 95, 14);
        contentPane.add(lblTastaLaser);
        
        lblTastaGheara = new JLabel("Tasta gheara");
        lblTastaGheara.setBounds(183, 203, 95, 14);
        contentPane.add(lblTastaGheara);
        
        lblOptiuni = new JLabel("OPTIUNI");
        lblOptiuni.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblOptiuni.setBounds(154, 11, 104, 30);
        contentPane.add(lblOptiuni);
        
        chckbxOpresteMuzica = new JCheckBox("Porneste muzica de fundal");
        chckbxOpresteMuzica.setBounds(10, 48, 160, 23);
        contentPane.add(chckbxOpresteMuzica);
        
        //actiunile pentru butoane be baza clasei anonime
        chckbxOpresteMuzica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nr++;
                if(nr == 3)
                    nr = 1;
            }
        });
        chckbxOpresteMuzica.setSelected(nr%2==1);
        
        btnConfirmaSetarile.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                citesteComenzile();
            }
        });
        btnSetariDefault.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                initializeazDefault();
            }
            
        });
        btnAmTerminat.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                Greenfoot.start();
                setVisible(false); //you can't see me :D
                dispose(); //distruge obiectul
            }
            
        });
        
    }
    
    //cu fiecare text inntrodus, acestea vor fi salvate in clasa Scrappie si pot fi folosite
    private void citesteComenzile(){
        fata = textField.getText();
        spate = textField_1.getText();
        stanga = textField_2.getText();
        dreapta = textField_3.getText();
        bomba = textField_4.getText();
        maneta = textField_5.getText();
        laser = textField_6.getText();
        gheara = textField_7.getText();
        if(fata.equals(null))
            fata = "w";
        if(spate.equals(null))
            spate = "s";
        if(stanga.equals(null))
            stanga = "a";
        if(dreapta.equals(null))
            dreapta = "d";
        if(bomba.equals(null))
            bomba = "b";
        if(maneta.equals(null))
            maneta = "p";
        if(laser.equals(null))
            laser = "l";
        if(gheara.equals(null))
            gheara = "t";
        textField.setText(fata);
        textField_1.setText(spate);
        textField_2.setText(stanga);
        textField_3.setText(dreapta);
        textField_4.setText(bomba);
        textField_5.setText(maneta);
        textField_6.setText(laser);
        textField_7.setText(gheara);
        Scrappie.fata = fata;
        Scrappie.spate = spate;
        Scrappie.stanga = stanga;
        Scrappie.dreapta = dreapta;
        Scrappie.bomba = bomba;
        Scrappie.laser = laser;
        Scrappie.maneta = maneta;
        Scrappie.gheara = gheara;
        chckbxOpresteMuzica.setSelected(nr%2==1);
        
    }
    
    //daca te-ai saturat de comenzi ciudate, schimba-le pe default, exact ca la inceput
    private void initializeazDefault(){
        fata = "w";
        spate = "s";
        stanga = "a";
        dreapta = "d";
        bomba = "b";
        maneta=  "p";
        laser = "l";
        gheara = "t";
        
        textField.setText(fata);
        textField_1.setText(spate);
        textField_2.setText(stanga);
        textField_3.setText(dreapta);
        textField_4.setText(bomba);
        textField_5.setText(maneta);
        textField_6.setText(laser);
        textField_7.setText(gheara);
        
        Scrappie.fata = fata;
        Scrappie.spate = spate;
        Scrappie.stanga = stanga;
        Scrappie.dreapta = dreapta;
        Scrappie.bomba = bomba;
        Scrappie.laser = laser;
        Scrappie.maneta = maneta;
        Scrappie.gheara = gheara;
    }
    public void act() 
    {
        
    } 
}
   
