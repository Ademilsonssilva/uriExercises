
import java.util.Scanner;


/**
 *
 * @author Ademilson
 */
public class Dama {
    
    
    public static void main(String[] args) 
    {
        int dama_x, dama_y, destino_x, destino_y;
        
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            
            dama_x = scan.nextInt();
            dama_y = scan.nextInt();
            destino_x = scan.nextInt();
            destino_y = scan.nextInt();
            
            if (dama_x == dama_y && destino_x == destino_y && dama_x == destino_x && dama_x == 0) {
                break;
            }
            else {
                
                if (dama_x == destino_x && dama_y == destino_y) {
                    System.out.println("0");
                }
                
                else if (dama_x == destino_x || dama_y == destino_y) {
                    System.out.println("1");
                }
                
                else if ( Math.abs(destino_x - dama_x) == Math.abs(destino_y-dama_y)) {
                    System.out.println("1");
                }
                else {
                    System.out.println("2");
                }
                
                
            }
            
        }
        
        
        
    }
    
    
}
