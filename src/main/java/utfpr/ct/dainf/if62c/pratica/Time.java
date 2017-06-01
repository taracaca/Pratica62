/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Ayrton
 */
public class Time {

    private HashMap<String, Jogador> jogadores = new HashMap<>();
    public Time(){
        super();
    }
    public HashMap getJogadores() {
        return this.jogadores;
    }

    public void addJogador(String posicao, Jogador jogador) {
        this.jogadores.put(posicao, jogador);
    }
    public List ordena(JogadorComparator jogador){
        List<Jogador> lista = new ArrayList<>();   
        Collections.sort(lista, jogador);
        return lista;
    } 
            
}
