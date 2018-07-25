
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ademilson
 */
public class TrocaCartas {


    public static void main (String[] args)
    {
        int quantidade_alice, quantidade_beatriz;
        int trocas_disponiveis_alice, trocas_disponiveis_beatriz;
        int ultima_carta_verificada = 0;
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> cartas_alice = new ArrayList<Integer>();
        ArrayList<Integer> cartas_beatriz = new ArrayList<Integer>();
        
        while (true){
            
            quantidade_alice = scan.nextInt();
            quantidade_beatriz = scan.nextInt();
            
            cartas_alice.clear();
            cartas_beatriz.clear();
                       
            trocas_disponiveis_beatriz = 0;
            trocas_disponiveis_alice = 0;
            
            ultima_carta_verificada = 0;
            
                        
            if (quantidade_alice == quantidade_beatriz && quantidade_alice == 0) {
                break;
            }
            
            for (int i = 0; i < quantidade_alice; i++) {
                cartas_alice.add(scan.nextInt());
            }
            
            for (int i = 0; i < quantidade_beatriz; i++) {
                int carta = scan.nextInt();
                cartas_beatriz.add(carta);
                if (!cartas_alice.contains(carta)) {
                    if (ultima_carta_verificada != carta) {
                        //System.out.println("CARTA DISPONIVEL DA BEATRIZ: " + carta);
                        trocas_disponiveis_beatriz++;
                        ultima_carta_verificada = carta;
                    }
                }
            }
            
            for (int i = 0; i < quantidade_alice; i++) {
                int carta = cartas_alice.get(i);
                if (!cartas_beatriz.contains(carta)) {
                    if (ultima_carta_verificada != carta ) {
                        //System.out.println("CARTA DISPONIVEL DA ALICE: " + carta);
                        trocas_disponiveis_alice++;
                        ultima_carta_verificada = carta;
                    }
                }
            }
            
            int retorno = trocas_disponiveis_alice > trocas_disponiveis_beatriz ? trocas_disponiveis_beatriz : trocas_disponiveis_alice;
            int menor = quantidade_alice > quantidade_beatriz ? quantidade_beatriz : quantidade_alice;
            
            retorno = retorno > menor ? menor : retorno;
            
            System.out.println(retorno);
            
            
            
            
        }
        
    }
}
