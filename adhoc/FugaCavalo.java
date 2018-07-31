
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ademilson
 */
public class FugaCavalo {

    public static void main (String[] args) 
    {
        Scanner s =  new Scanner(System.in);
        int[] cavalo;
        int[] piao;
        ArrayList<String> posicoesPermitidasCavalo = new ArrayList<String>();
        int casos_teste = 1;
        
        while (true) {
            String pos_cavalo = s.next();
            posicoesPermitidasCavalo.clear();
            
            if (pos_cavalo.equals("0")) {
                break;
            }
            
            cavalo = getPosicao(pos_cavalo);
            getPosicoesPermitidasCavalo(posicoesPermitidasCavalo, cavalo);

            for (int i = 0; i < 8; i++) {
                piao = getPosicao(s.next());
                posicoesAtaquePiao(posicoesPermitidasCavalo, piao);
            };
            
            System.out.println("Caso de Teste #" + casos_teste + ": "+ posicoesPermitidasCavalo.size() + " movimento(s).");
            casos_teste++;
            
        }
        
    }
    
    public static int[] getPosicao(String posicao)
    {
        int coluna = Coluna.valueOf(Character.toString(posicao.charAt(1)).toUpperCase()).getColuna();
        
        int[] retorno = new int[2];
        retorno[0] = Integer.parseInt(posicao.substring(0,1));
        retorno[1] = coluna;
        return retorno;
        
    }
    
    public static void posicoesAtaquePiao(ArrayList<String> posicoesCavalo, int[] posicao)
    {
        String pos_str;

        if (posicao[0]>=2) {
            if (posicao[1] > 1) {
                pos_str = String.valueOf(posicao[0] -1) + Coluna.values()[(posicao[1]-1) -1].toString();
                if (posicoesCavalo.contains(pos_str)){
                    posicoesCavalo.remove( posicoesCavalo.indexOf(pos_str) );
                }
            }

            if (posicao[1] < 8) {
                pos_str = String.valueOf(posicao[0] -1) + Coluna.values()[(posicao[1]-1) +1].toString();
                if (posicoesCavalo.contains(pos_str)){
                    posicoesCavalo.remove( posicoesCavalo.indexOf(pos_str) );
                }
            }
        }
    }
    
    public static void getPosicoesPermitidasCavalo (ArrayList<String> posicoes, int[] posicaoAtual)
    {
                
        if (posicaoAtual[0] <= 6) {
            if (posicaoAtual[1] > 1) {
                posicoes.add( String.valueOf(posicaoAtual[0] + 2) + Coluna.values()[(posicaoAtual[1]-1) -1].toString() );
            }
            if (posicaoAtual[1] < 8) {
                posicoes.add( String.valueOf(posicaoAtual[0] + 2) + Coluna.values()[(posicaoAtual[1]-1) +1].toString() );
            }
        }
        if (posicaoAtual[0] >= 3) {
            if (posicaoAtual[1] > 1) {
                posicoes.add( String.valueOf(posicaoAtual[0] - 2) + Coluna.values()[(posicaoAtual[1]-1) -1].toString() );
            }
            if (posicaoAtual[1] < 8) {
                posicoes.add( String.valueOf(posicaoAtual[0] - 2) + Coluna.values()[(posicaoAtual[1]-1) +1].toString() );
            }
        }
        
        if (posicaoAtual[1] <= 6) {
            if (posicaoAtual[0] > 1) {
                posicoes.add( String.valueOf(posicaoAtual[0] - 1) + Coluna.values()[(posicaoAtual[1]-1) +2].toString() );
            }
            if (posicaoAtual[0] < 8) {
                posicoes.add( String.valueOf(posicaoAtual[0] + 1) + Coluna.values()[(posicaoAtual[1]-1) +2].toString() );
            }
        }
        if (posicaoAtual[1] >= 3) {
            if (posicaoAtual[0] > 1) {
                posicoes.add( String.valueOf(posicaoAtual[0] - 1) + Coluna.values()[(posicaoAtual[1]-1) -2].toString() );
            }
            if (posicaoAtual[0] < 8) {
                posicoes.add( String.valueOf(posicaoAtual[0] + 1) + Coluna.values()[(posicaoAtual[1]-1) -2].toString() );
            }
        }
        
    }
    
    enum Coluna
    {
        A(1), B(2), C(3), D(4), E(5), F(6), G(7), H(8);

        public int coluna;
        Coluna(int valor)
        {
            coluna = valor;
        }

        public int getColuna()
        {
            return coluna;
        }
    }
       
}

