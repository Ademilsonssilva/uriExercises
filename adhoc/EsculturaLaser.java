
import java.util.Scanner;

/**
 *
 * @author Ademilson
 */
public class EsculturaLaser {

    public static void main (String[] args)
    {
        
        Scanner s = new Scanner(System.in);
        int altura, comprimento, laser_ativado = 0;
        
        boolean laser_ativo;
        int[] alturaPorColuna;
        
        while (true) {
            
            altura = s.nextInt();
            comprimento = s.nextInt();
            
            alturaPorColuna = new int[comprimento];
            
            laser_ativo = false;
            laser_ativado = 0;
            
            if (altura == comprimento && altura == 0) {
                break;
            }
            
            for (int i = 0; i < comprimento; i++) {
                alturaPorColuna[i] = s.nextInt();
            }
            
            for (int j = altura; j > 0; j--) {
                laser_ativo = false;
                for (int i = 0; i < comprimento; i++)  {
                    
                    if (j > alturaPorColuna[i]) {
                        
                        if (!laser_ativo) {
                            laser_ativo = true;
                            laser_ativado++;
                        }
                        
                    }
                    else {
                        laser_ativo = false;
                    }
                    
                }
                
            }
            
            System.out.println(laser_ativado);
            
        }
        
    }
    
}
