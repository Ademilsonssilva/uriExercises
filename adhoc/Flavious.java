
import java.util.Scanner;

/**
 *
 * @author Ademilson
 */
public class Flavious {
    
    public static void main(String[] args)
    {
        int casos_de_teste, qtd_pessoas, tamanho_salto;
        int passos_restantes, registros_restantes;
        int posicao_prox_passo;
        int ultimo_registro_valor = 0;
        boolean ultimo_registro;
        
        Scanner scan = new Scanner(System.in);
        
        casos_de_teste = scan.nextInt();
        
        for (int i = 0; i < casos_de_teste; i++) {
            posicao_prox_passo = -1;
            ultimo_registro = false;
                    
            qtd_pessoas = scan.nextInt();
            registros_restantes = qtd_pessoas;
            tamanho_salto = scan.nextInt();
            
            boolean[] pessoas = new boolean[qtd_pessoas];
            
            for (int j = 0; j < pessoas.length; j++) {
                pessoas[j] = true;
            }
            
            while (!ultimo_registro) {
                for (passos_restantes = tamanho_salto; passos_restantes > 0; passos_restantes--) {
                    if (posicao_prox_passo + 1 >= qtd_pessoas) {
                        //System.out.println("ARRAY REINICIADO");
                        posicao_prox_passo = 0;
                    }
                    else {
                        posicao_prox_passo++;
                        //System.out.println("PROXIMO PASSO VAI PARA CASA "+ posicao_prox_passo);
                    }
                    
                    if (!pessoas[posicao_prox_passo]) {
                        passos_restantes++;
                    }
                }
                
                pessoas[posicao_prox_passo] = false;

                //System.out.println("REGISTRO " + (posicao_prox_passo+1) + " REMOVIDO!");
                
                registros_restantes--;
                if (registros_restantes == 1) {
                    ultimo_registro = true;
                }
            }
            
            for( int k = 0; k < pessoas.length; k++) {
                if (pessoas[k]){
                    ultimo_registro_valor = k+1;
                }
            }

            System.out.println("Case " + (i+1) + ": "+ ultimo_registro_valor);
                       
        }
    }
    
}
