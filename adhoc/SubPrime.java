
import java.util.Scanner;

/**
 *
 * @author Ademilson
 */
public class SubPrime {

    public static void main (String[] args)
    {
        
        Scanner s = new Scanner(System.in);
        int bancos, debentures;
        int devedor, credor, valor;
        int[] reservas;
        char resultado;
        
        while (true) {
            
            bancos = s.nextInt();
            debentures = s.nextInt();
            
            reservas = new int[bancos];
            
            if (bancos == debentures && bancos == 0) {
                break;
            }
            
            for (int i = 0; i < bancos; i++) {
                
                reservas[i] = s.nextInt();
                
            }
            
            for (int i = 0; i < debentures; i++) {
                
                devedor = s.nextInt();
                credor = s.nextInt();
                valor = s.nextInt();
                
                reservas[devedor-1] -= valor;
                reservas[credor-1] += valor;
                
            }
            
            resultado = 'S';
            for (int i = 0; i < bancos; i++) {
                
                if (reservas[i] < 0) {
                    resultado = 'N';
                }
                
            }
            
            System.out.println(resultado);
            
        }
        
    }
    
}
