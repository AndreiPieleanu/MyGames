import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
public class PriceStatus extends JFrame
{
    
    private static final long serialVersionUID = 0L;
    private JPanel contentPane;
    static String mesaj;
    
    /*public static void main(String[] args) {
        
        
        ImagePanel panel1 = new ImagePanel(
                new ImageIcon("images/icons/GUIBackground.png").getImage());
        Image icon = new ImageIcon("images/icons/pirateIcon.png").getImage();
        //System.out.println(message + " " + nivel + " " + price + "***");
        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    System.out.println(mesaj);
                    Confirmation frame = new Confirmation();
                    frame.setVisible(true);
                    //frame.setTitle("Confirmare");
                    //frame.getContentPane().add(panel1);
                    frame.setIconImage(icon);
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public PriceStatus() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        
        JLabel lblAtentie = new JLabel("Atentie!");
        lblAtentie.setForeground(Color.WHITE);
        lblAtentie.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lblAtentie.setHorizontalAlignment(SwingConstants.CENTER);
        lblAtentie.setBounds(155, 11, 120, 37);
        contentPane.add(lblAtentie);
        
        JLabel lblEstiSigurCa = new JLabel(mesaj);
        lblEstiSigurCa.setForeground(Color.WHITE);
        lblEstiSigurCa.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblEstiSigurCa.setHorizontalAlignment(SwingConstants.CENTER);
        lblEstiSigurCa.setBounds(51, 72, 339, 64);
        contentPane.add(lblEstiSigurCa);
    }*/

    
    public static void main(String[] args) {
        mesaj = args[0];
        ImagePanel panel1 = new ImagePanel(
                new ImageIcon("images/icons/GUIBackground.png").getImage());
        Image icon = new ImageIcon("images/icons/pirateIcon.png").getImage();
        //System.out.println(mesaj+"***");
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PriceStatus frame = new PriceStatus();
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

    public PriceStatus() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton btnOk = new JButton("OK");
        btnOk.setForeground(Color.BLACK);
        btnOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                setVisible(false); //you can't see me :D
                dispose(); //distruge obiectul
            }
        });
        btnOk.setBounds(283, 213, 107, 37);
        contentPane.add(btnOk);
        
        JLabel lblAtentie = new JLabel("Atentie");
		lblAtentie.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblAtentie.setHorizontalAlignment(SwingConstants.CENTER);
		lblAtentie.setBounds(140, 11, 134, 60);
		lblAtentie.setForeground(Color.WHITE);
		contentPane.add(lblAtentie);
        
        JLabel lblNewLabel = new JLabel(mesaj);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(60, 82, 285, 141);
		lblNewLabel.setForeground(Color.WHITE);
        contentPane.add(lblNewLabel);
    }
}
