

package monopoly;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Movimiento extends Thread{
    
    static public int[] o0 = {540,525}; 
    static public int[] o1 = {540,460}; 
    static public int[] o2 = {540,405}; 
    static public int[] o3 = {540,355}; 
    static public int[] o4 = {540,300}; 
    static public int[] o5 = {540,250}; 
    static public int[] o6 = {540,195}; 
    static public int[] o7 = {540,145}; 
    static public int[] o8 = {540,90}; 
    static public int[] o9 = {540,10};
    static public int[] s10 = {470,10};
    static public int[] s11 = {415,10};
    static public int[] s12 = {365,10};
    static public int[] s13 = {310,10};
    static public int[] s14 = {260,10};
    static public int[] s15 = {205,10};
    static public int[] s16 = {150,10};
    static public int[] s17 = {95,10};
    static public int[] s18 = {25,10};
    
    public void Run(JLabel jug, int a){
        
    }
 
    public static void MOVIMIENTO_JLABELS(int Jugador, int posFX, int posFY) throws InterruptedException{
      Slower Lento = new Slower();
         for (int i = JuegoMonopoly.jLabel1.getY(); i < posFY; i++) {
             if (posFY == JuegoMonopoly.jLabel1.getY()) {
                 break; 
             }
             JuegoMonopoly.jLabel1.setLocation(JuegoMonopoly.jLabel1.getX(),i);
             Lento.start();
        }
    }
    public static int[] Posicion(int p){
        switch(p){
                case 0: 
                return o0;
                case 2: 
                return o2;
                case 3: 
                return o3;
                case 4: 
                return o4;
                case 5: 
                return o5;
                case 6: 
                return o6;
                case 7: 
                return o7;
                case 8: 
                return o8;
                case 9: 
                return o9;  
                case 1: 
                return o1;
                case 10: 
                return s10;
                case 11: 
                return s11;
                case 12: 
                return s12;  
                case 13: 
                return s13;
                case 14: 
                return s14;
                case 15: 
                return s15;
                case 16: 
                return s16;  
                case 17: 
                return s17;
                case 18: 
                return s18;
        }
    
    
    return new int[3];
    }
}
