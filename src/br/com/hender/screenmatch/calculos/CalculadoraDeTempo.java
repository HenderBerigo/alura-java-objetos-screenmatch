package br.com.hender.screenmatch.calculos;

import br.com.hender.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//        System.out.println("Tempo total dos Filmes: "+tempoTotal+" min");
//    }
//
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//        System.out.println("Tempo total das Séries: "+tempoTotal+" min");
//    }

    public void inclui(Titulo t){
        this.tempoTotal += t.getDuracaoEmMinutos();
        System.out.println("Tempo total da maratona: "+tempoTotal+" min");
    }
}
