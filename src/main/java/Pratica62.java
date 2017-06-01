
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.JogadorComparator;
import utfpr.ct.dainf.if62c.pratica.Time;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica62 {
    public static void main(String[] args) {
        Time time = new Time();
        List<Jogador> lista = new ArrayList<>();   
        
        time.addJogador("Goleiro", new Jogador(1, "Fulano"));
        time.addJogador("Lateral", new Jogador(4, "Ciclano"));
        time.addJogador("Atacante", new Jogador(10, "Beltrano"));
        
        JogadorComparator jogador =  new JogadorComparator(true,true,true) {
            @Override
            public int compare(Jogador o1, Jogador o2) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        lista = time.ordena(jogador);
    }
}
