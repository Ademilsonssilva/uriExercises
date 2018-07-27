
import java.util.Scanner;

/**
 *
 * @author Ademilson
 */
public class Flores {
    
    public static void main (String[] args){
        
        Scanner s = new Scanner(System.in);
        String texto;
                
        while (true) {
            
            texto = s.nextLine();
            texto = texto.toLowerCase();
            char letra_inicial = texto.charAt(0);
            boolean tautograma = true;
            
            if (texto.equals("*")){
                break;
            }
            
            String[] palavras = texto.split(" ");
            
            
            for (int i = 0; i < palavras.length; i++) {
                
                if (palavras[i].charAt(0) != letra_inicial) {
                    tautograma = false;
                }
                
            }
            
            System.out.println(tautograma ? "Y": "N");
            
        }
        
        
    }
    
}
