
import java.util.Scanner;

/**
 *
 * @author Ademilson
 */
public class CriseEnergia {
    
    public static void main(String[] args) {
 
        final int ultima_regiao = 13;
        int numero_regioes;
        int tamanho_salto = 1;
        int saltos_restantes, regioes_restantes, regiao_atual = 0;
        boolean algoritmo_executando = true, solucao_encontrada;
        boolean[] regioes;
    
        Scanner scan = new Scanner(System.in);
        
        while (algoritmo_executando) {
            
            numero_regioes = scan.nextInt();
            regioes_restantes = numero_regioes;
            solucao_encontrada = false;
            regiao_atual = 0;
            tamanho_salto = 1;
            
            if (numero_regioes == 0) {
                algoritmo_executando = false;
                break;
            }
            else {
               
                while (!solucao_encontrada) {
                    //saltos_restantes = tamanho_salto;
                    regioes_restantes = numero_regioes;
                    regioes = new boolean[numero_regioes];
                    //regiao_atual = regiao_atual - tamanho_salto;
                    
                    for( int i = 0; i < numero_regioes; i++) {
                        regioes[i] = true;
                    }

                    
                    while(regioes_restantes > 1) {
                        saltos_restantes = tamanho_salto;
                        
                        while (saltos_restantes > 0) {
                        
                            if (regiao_atual + 1 >= numero_regioes) {
                                //System.out.println(" REINICIOU ARRAY");
                                regiao_atual = 0;
                            }

                            regiao_atual++;
                            //System.out.println("REGIAO ATUAL: " + regiao_atual + " SALTOS RESTANTES: "+ (saltos_restantes -1));    
                            if (regioes[regiao_atual]) {    
                                saltos_restantes--;
                            }

                        }

                        regioes[regiao_atual] = false;
                        regioes_restantes--;

                        if(regiao_atual+1 == ultima_regiao ) {
                            //System.out.println(" REINICIOU ARRAY");
                            break;
                        }
                        
                    }
                    
                    if (regioes_restantes == 1) {
                        solucao_encontrada = true;
                    }
                    
                    else {
                        tamanho_salto++;
                        regiao_atual = 0;
                    }
                    
                    
                }
                
                System.out.println(tamanho_salto);
                
            }
            
            
        }
    }
    
}
