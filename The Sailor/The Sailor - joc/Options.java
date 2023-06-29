import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JRadioButtonMenuItem;
import greenfoot.*;

public class Options extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	    ImagePanel panel1 = new ImagePanel(
                new ImageIcon("images/icons/GUIBackground.png").getImage());
        Image icon = new ImageIcon("images/icons/pirateIcon.png").getImage();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Options frame = new Options();
					frame.setVisible(true);
                    frame.setTitle("Optiuni");
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
	
	
	public Options() {
	    Greenfoot.stop();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOptiuni = new JLabel("Optiuni");
		lblOptiuni.setForeground(java.awt.Color.WHITE);
		lblOptiuni.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblOptiuni.setBounds(184, 11, 94, 34);
		contentPane.add(lblOptiuni);
		
		JRadioButton rdbtnmntmMuzicaMeniu = new JRadioButton("Muzica meniu", boatProperties.muzicaMeniu);
		rdbtnmntmMuzicaMeniu.setForeground(java.awt.Color.BLACK);
		rdbtnmntmMuzicaMeniu.setFont(new Font("Segoe UI", Font.BOLD, 14));
		rdbtnmntmMuzicaMeniu.setBounds(60, 68, 140, 22);
		contentPane.add(rdbtnmntmMuzicaMeniu);
		rdbtnmntmMuzicaMeniu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                boatProperties.muzicaMeniu = rdbtnmntmMuzicaMeniu.isSelected();
                if(boatProperties.muzicaMeniu){
                    StartWorld.menuMusic.playLoop();
                }else{
                    StartWorld.menuMusic.pause();
                }
            }
        });
        
		JRadioButton rdbtnmntmMuzicaMagazin = new JRadioButton("Muzica magazin", boatProperties.muzicaMagazin);
		rdbtnmntmMuzicaMagazin.setForeground(java.awt.Color.BLACK);
		rdbtnmntmMuzicaMagazin.setFont(new Font("Segoe UI", Font.BOLD, 14));
		rdbtnmntmMuzicaMagazin.setBounds(60, 132, 152, 22);
		contentPane.add(rdbtnmntmMuzicaMagazin);
		rdbtnmntmMuzicaMagazin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                boatProperties.muzicaMagazin = rdbtnmntmMuzicaMagazin.isSelected();
                /*if(boatProperties.muzicaMagazin){
                    StartWorld.shopTheme.playLoop();
                }else{
                    StartWorld.shopTheme.pause();
                }*/
            }
        });
		
		JRadioButton rdbtnmntmMuzicaNivel = new JRadioButton("Muzica nivel", boatProperties.muzicaNivel);
		rdbtnmntmMuzicaNivel.setForeground(java.awt.Color.BLACK);
		rdbtnmntmMuzicaNivel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		rdbtnmntmMuzicaNivel.setBounds(60, 199, 125, 22);
		contentPane.add(rdbtnmntmMuzicaNivel);
		rdbtnmntmMuzicaNivel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                boatProperties.muzicaNivel = rdbtnmntmMuzicaNivel.isSelected();
                /*if(boatProperties.muzicaNivel){
                    Level.battleTheme.playLoop();
                }else{
                    Level.battleTheme.pause();
                }*/
            }
        });
        
		JRadioButton rdbtnmntmSunetInLupte = new JRadioButton("Sunet in lupte", boatProperties.sunetInLupte);
		rdbtnmntmSunetInLupte.setForeground(java.awt.Color.BLACK);
		rdbtnmntmSunetInLupte.setFont(new Font("Segoe UI", Font.BOLD, 14));
		rdbtnmntmSunetInLupte.setBounds(249, 68, 125, 22);
		contentPane.add(rdbtnmntmSunetInLupte);
		rdbtnmntmSunetInLupte.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                boatProperties.sunetInLupte = rdbtnmntmSunetInLupte.isSelected();
            }
        });
        
		
		JRadioButton rdbtnmntmMuzicaVictorie = new JRadioButton("Muzica victorie", boatProperties.muzicaVictorie);
		rdbtnmntmMuzicaVictorie.setForeground(java.awt.Color.BLACK);
		rdbtnmntmMuzicaVictorie.setFont(new Font("Segoe UI", Font.BOLD, 14));
		rdbtnmntmMuzicaVictorie.setBounds(249, 132, 140, 22);
		contentPane.add(rdbtnmntmMuzicaVictorie);
		rdbtnmntmMuzicaVictorie.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                boatProperties.muzicaVictorie = rdbtnmntmMuzicaVictorie.isSelected();
                if(boatProperties.muzicaVictorie){
                    FinishedLevel.victory.play();
                }else{
                    FinishedLevel.victory.pause();
                }
            }
        });
		
		JRadioButton rdbtnmntmMuzicaInfrangere = new JRadioButton("Muzica infrangere", boatProperties.muzicaInfrangere);
		rdbtnmntmMuzicaInfrangere.setForeground(java.awt.Color.BLACK);
		rdbtnmntmMuzicaInfrangere.setFont(new Font("Segoe UI", Font.BOLD, 14));
		rdbtnmntmMuzicaInfrangere.setBounds(249, 199, 152, 22);
		contentPane.add(rdbtnmntmMuzicaInfrangere);
		rdbtnmntmMuzicaInfrangere.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                boatProperties.muzicaInfrangere = rdbtnmntmMuzicaInfrangere.isSelected();
                if(boatProperties.muzicaInfrangere){
                    Defeat.defeat.play();
                }else{
                    Defeat.defeat.pause();
                }
            }
        });
		
		JButton btnAmTerminat = new JButton("Am terminat");
		btnAmTerminat.setBounds(168, 227, 102, 23);
		contentPane.add(btnAmTerminat);
		btnAmTerminat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                setVisible(false); //you can't see me :D
                dispose(); //distruge obiectul
                Greenfoot.start();
            }
        });
	}
}