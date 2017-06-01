/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.Comparator;

/**
 *
 * @author Ayrton
 */
public abstract class JogadorComparator implements Comparator<Jogador> {

    private boolean ordena_numero;
    private boolean ordena_numero_ascendente;
    private boolean ordena_nome_ascendente;

    public JogadorComparator(boolean primeiro, boolean segundo, boolean terceiro) {
        this.ordena_numero = primeiro;
        this.ordena_numero_ascendente = segundo;
        this.ordena_nome_ascendente = terceiro;
    }

    public interface Comparator<T> {
        public int compare(T o1, T o2);
    }

}
