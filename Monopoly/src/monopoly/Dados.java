package monopoly;
 
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

 


public class Dados extends Thread{
    int[] R = new int[4]; 
    
    public int[] getR() {
        return R;
    }
    public void run(){
    detener();
        try {    
            Resultado();
        } catch (InterruptedException ex) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    } 
    
     public void detener (){
     try {
            Thread.sleep(1500);
            
        } catch (InterruptedException ex) {
            
        }  
     }
     public void Resultado() throws InterruptedException{
        Random rnd = new Random();
        R[0] = (int)(rnd.nextDouble()*6+1);
        Thread.sleep(500);
        R[1] = (int)(rnd.nextDouble()*6+1);
        R[2] = R[0]+R[1]; 
        //JOptionPane.showMessageDialog(null, "");
        switch(R[0]){
            case 1: 
                JuegoMonopoly.lDadoA.setIcon(new ImageIcon("C:\\Users\\Flavio A. Pareja\\Documents\\NetBeansProjects\\Monopoly\\src\\dados\\Dado1.png"));
                break;
            case 2: 
                 JuegoMonopoly.lDadoA.setIcon(new ImageIcon("C:\\Users\\Flavio A. Pareja\\Documents\\NetBeansProjects\\Monopoly\\src\\dados\\Dado2.png"));
                break;
            case 3: 
                 JuegoMonopoly.lDadoA.setIcon(new ImageIcon("C:\\Users\\Flavio A. Pareja\\Documents\\NetBeansProjects\\Monopoly\\src\\dados\\Dado3.png"));
                break;
            case 4: 
                 JuegoMonopoly.lDadoA.setIcon(new ImageIcon("C:\\Users\\Flavio A. Pareja\\Documents\\NetBeansProjects\\Monopoly\\src\\dados\\Dado4.png"));
                break;
            case 5: 
                 JuegoMonopoly.lDadoA.setIcon(new ImageIcon("C:\\Users\\Flavio A. Pareja\\Documents\\NetBeansProjects\\Monopoly\\src\\dados\\Dado5.png"));
                 break;
            case 6: 
                 JuegoMonopoly.lDadoA.setIcon(new ImageIcon("C:\\Users\\Flavio A. Pareja\\Documents\\NetBeansProjects\\Monopoly\\src\\dados\\Dado6.png"));
                 break;
            
        }
        Thread.sleep(500);
         switch(R[1]){
            case 1: 
                JuegoMonopoly.lDadoB.setIcon(new ImageIcon("C:\\Users\\Flavio A. Pareja\\Documents\\NetBeansProjects\\Monopoly\\src\\dados\\Dado1.png"));
                break;
            case 2: 
                 JuegoMonopoly.lDadoB.setIcon(new ImageIcon("C:\\Users\\Flavio A. Pareja\\Documents\\NetBeansProjects\\Monopoly\\src\\dados\\Dado2.png"));
                break;
            case 3: 
                 JuegoMonopoly.lDadoB.setIcon(new ImageIcon("C:\\Users\\Flavio A. Pareja\\Documents\\NetBeansProjects\\Monopoly\\src\\dados\\Dado3.png"));
                break;
            case 4: 
                 JuegoMonopoly.lDadoB.setIcon(new ImageIcon("C:\\Users\\Flavio A. Pareja\\Documents\\NetBeansProjects\\Monopoly\\src\\dados\\Dado4.png"));
                break;
            case 5: 
                 JuegoMonopoly.lDadoB.setIcon(new ImageIcon("C:\\Users\\Flavio A. Pareja\\Documents\\NetBeansProjects\\Monopoly\\src\\dados\\Dado5.png"));
                 break;
            case 6: 
                 JuegoMonopoly.lDadoB.setIcon(new ImageIcon("C:\\Users\\Flavio A. Pareja\\Documents\\NetBeansProjects\\Monopoly\\src\\dados\\Dado6.png"));
                 break;           
        }
              
     }
}
     

