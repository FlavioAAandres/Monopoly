package monopoly;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class WellcomeMonopoly extends JFrame{
    static public int SIZE_X = 1100;
    static public int SIZE_Y = 619;   
        
 public void Configurar(){                 
        JFrame APrincipal = new JFrame("Monopoly GamePlay S.A");
        JLabel Background = new JLabel("");
        JButton PlayNow = new JButton(); 
        PlayNow.setSize(510,300);
        PlayNow.setIcon(new ImageIcon(getClass()
                .getResource("Pln.png")));
        PlayNow.setOpaque(false);
        PlayNow.setContentAreaFilled(false);
        PlayNow.setBorderPainted(false);
        PlayNow.setLocation(10,290);
        
        PlayNow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JuegoMonopoly A = null;
                try {
                    A = new JuegoMonopoly();
                } catch (IOException ex) {
                    Logger.getLogger(WellcomeMonopoly.class.getName()).log(Level.SEVERE, null, ex);
                }
                A.setVisible(true);
                APrincipal.setVisible(false);
            }
        });
        
        APrincipal.add(PlayNow);
        ImageIcon Bgr = new ImageIcon(getClass()
                .getResource("bgr1.jpg"));
        Background.setIcon(Bgr);
        Background.setSize(SIZE_X, SIZE_Y);
        APrincipal.add(Background);
        APrincipal.setLayout(null);
        APrincipal.setSize(SIZE_X,SIZE_Y);
        APrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        APrincipal.setLocation(20,20);
        APrincipal.setVisible(true);  
 }   

}


