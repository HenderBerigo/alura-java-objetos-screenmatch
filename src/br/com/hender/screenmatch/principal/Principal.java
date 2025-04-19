package br.com.hender.screenmatch.principal;
import java.util.ArrayList;

import br.com.hender.screenmatch.calculos.CalculadoraDeTempo;
import br.com.hender.screenmatch.calculos.FiltroRecomendacao;
import br.com.hender.screenmatch.modelos.*;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O Poderoso Chefão", 1976);
        //filme1.setNome();  *** Criado pelo construtor
        //filme1.setAnoDeLancamento(1976);  *** Criado pelo construtor
        filme1.setDuracaoEmMinutos(180);
        filme1.setIncluidoNoPlano(true);

        filme1.avalia(5.0);
        filme1.avalia(8.5);
        filme1.avalia(9.0);
        filme1.setTipo(TipoTitulo.FILME);
        filme1.exibeFichaTecnica();

        Filme filme2 = new Filme("No Limite do Amanhã", 2014);
        //filme2.setNome();  *** Criado pelo construtor
        // filme2.setAnoDeLancamento(2014);  *** Criado pelo construtor
        filme2.setDuracaoEmMinutos(113);
        filme2.setIncluidoNoPlano(true);
        filme2.setDiretor("Tom Cruiser");

        filme2.avalia(8.0);
        filme2.avalia(8.5);
        // filme2.avaliar(9.0);
        filme2.setTipo(TipoTitulo.FILME);
        filme2.exibeFichaTecnica();
        
        Serie lost = new Serie("Lost", 2008);
        //lost.setNome(); *** Criado pelo construtor
        lost.setTemporadas(10);
        lost.setEpsodiosPorTemporada(22);
        //lost.setAnoDeLancamento(2008); *** Criado pelo construtor
        lost.setDuracaoEmMinutos(50);
        lost.setMinutosPorEpsodio(50);
        lost.setTipo(TipoTitulo.SERIE);
        lost.exibeFichaTecnica();
        
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme2);
        calculadora.inclui(filme1);
        calculadora.inclui(lost);
        
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

        Epsodio epsodio = new Epsodio();
        epsodio.setNumero(1);
        epsodio.setSerie(lost);
        epsodio.setTotalVisulizacoes(300);
        filtro.filtra(epsodio);
        
        var filme3 = new Filme("Matrix", 1993);
        //filme3.setNome();  *** Criado pelo construtor
        filme3.setDuracaoEmMinutos(200);
        // filme3.setAnoDeLancamento(1993);  *** Criado pelo construtor
        filme3.avalia(9.5);
        
        var filme4 = new Filme("Transformers", 2007);
        filme4.setDuracaoEmMinutos(144);
        filme4.setDiretor("Michael Bay");
        

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme3);
        listaDeFilmes.add(0, filme2);
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme4);
        System.out.println();
        System.out.println("*** Lista de Filmes ***");
        System.out.println("Tamanho da lista de filmes:  " + listaDeFilmes.size());
        System.out.println("Primeiro filme da lista: " + listaDeFilmes.get(0).getNome());
        listaDeFilmes.set(0, filme1);
        listaDeFilmes.set(2, filme2);
        System.out.println("toString() do filme 0: " + listaDeFilmes.get(0).toString());

        // for(int i =1; i <= listaDeFilmes.size(); i++){
        for (Filme filme : listaDeFilmes) {
            System.out.println("Filme " + (listaDeFilmes.indexOf(filme) + 1) + ": " + filme.getNome());

        }
        // }
        System.out.println();
        System.out.println(listaDeFilmes);
        System.out.println(filme3.toString());
        filme4.exibeInformacoesExtras();
        
    }
}
