
import java.util.Scanner;

/**
 *
 * @author Ademilson
 */
public class RoboColecionador {
    
    public static void main (String[] args)
    {
        /**
         * elementos do mapa definidos como numeros
         * N = 2 / L = 4 / S = 6 / O = 8 -> Pontos cardeais
         * . = 1 -> Célula normal
         * * = 3 -> Figurinha
         * # = 5 -> Pilastra
         */
        
        Scanner s = new Scanner(System.in);
        int linhas, colunas, instrucoes;
        String instrucao;
        
        int x_robo, y_robo;
        int d_robo;
        
        int[][] matriz;
        
        while (true) {
            
            linhas = s.nextInt();
            colunas = s.nextInt();
            instrucoes = s.nextInt();
            
            x_robo = 0;
            y_robo = 0;
            d_robo = 0;
            int quantidade_figurinhas = 0;
            
            if (linhas == colunas && linhas == 0 && linhas == instrucoes) {
                break;
            }
            
            matriz = new int[linhas][colunas];
            
            for  (int i = 0; i < linhas; i++) {
                
                String informacao_lida = s.next();
                char[] info_mapa = informacao_lida.toCharArray();
                for (int j = 0; j < colunas; j++) {
                    
                    
                    int informacao_casa = 0;
                    switch (info_mapa[j]){
                        case 'N': 
                            informacao_casa = 2;
                            d_robo = 2;
                            break;
                        case 'L':
                            informacao_casa = 4;
                            d_robo = 4;
                            break;
                        case 'S':
                            informacao_casa = 6;
                            d_robo = 6;
                            break;
                        case 'O':
                            informacao_casa = 8;
                            d_robo = 8;
                            break;
                        case '.':
                            informacao_casa = 1;
                            break;
                        case '*':
                            informacao_casa = 3;
                            break;
                        case '#':
                            informacao_casa = 5;
                    }
                    
                    if (informacao_casa == 2 || informacao_casa == 4 || informacao_casa == 6 || informacao_casa == 8 ) {
                        x_robo = i;
                        y_robo = j;
                    }
                    
                    matriz[i][j] = informacao_casa;
                    
                }
                
            }
            
            
                
            instrucao = s.next();
            for (char c: instrucao.toCharArray()) {

                if (c == 'D') {
                    d_robo = (d_robo+2)%8;
                    if (d_robo == 0) {
                        d_robo = 8;
                    }
                }
                else if (c == 'E') {
                    d_robo = (d_robo-2)%8;
                    if (d_robo == 0) {
                        d_robo = 8;
                    }
                }
                else if (c == 'F') {
                    if (d_robo == 2) {
                        if (x_robo > 0) {
                            if (matriz[x_robo-1][y_robo] != 5) { //diferente de pilastra (5)
                                matriz[x_robo][y_robo] = 1;
                                if(matriz[x_robo-1][y_robo] == 3) {//figurinha
                                    quantidade_figurinhas++;
                                }
                                x_robo = x_robo-1;
                            }
                        }

                    }

                    if (d_robo == 4) {
                        if (y_robo < colunas-1) {
                            if (matriz[x_robo][y_robo+1] != 5) { //diferente de pilastra (5)
                                matriz[x_robo][y_robo] = 1;
                                if(matriz[x_robo][y_robo+1] == 3) {//figurinha
                                    quantidade_figurinhas++;
                                }
                                y_robo = y_robo+1;
                            }
                        }

                    }

                    if (d_robo == 6) {
                        if (x_robo < linhas-1) {
                            if (matriz[x_robo+1][y_robo] != 5) { //diferente de pilastra (5)
                                matriz[x_robo][y_robo] = 1;
                                if(matriz[x_robo+1][y_robo] == 3) {//figurinha
                                    quantidade_figurinhas++;
                                }
                                x_robo = x_robo+1;
                            }
                        }

                    }

                    if (d_robo == 8) {
                        if (y_robo > 0) {
                            if (matriz[x_robo][y_robo-1] != 5) { //diferente de pilastra (5)
                                matriz[x_robo][y_robo] = 1;
                                if(matriz[x_robo][y_robo-1] == 3) {//figurinha
                                    quantidade_figurinhas++;
                                }
                                y_robo = y_robo-1;
                            }
                        }

                    }
                    
                    matriz[x_robo][y_robo] = d_robo;


                }
            }
            
            System.out.println(quantidade_figurinhas);            
            
        }
        
    }

}
