package br.com.hender.screenmatch.principal;

import br.com.hender.screenmatch.modelos.Filme;
import br.com.hender.screenmatch.modelos.Serie;
import br.com.hender.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
public static void main(String[] args) {
  System.out.println();
  System.out.println();
  Filme filme1 = new Filme("O Poderoso Chefão", 1976);
  filme1.avalia(8);
  Filme filme2 = new Filme("No Limite do Amanhã", 2014);
  filme2.avalia(6);
  Serie lost = new Serie("Lost", 2008);
  var filme3 = new Filme("Matrix", 1993);
  filme3.avalia(9.50);
  var filme4 = new Filme("Transformers", 2007);
  filme4.avalia(8);

  ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme3);
        lista.add(0, filme2);
        lista.add(filme1);
        lista.add(filme4);
        lista.add(lost);

        for (Titulo item : lista) {
          System.out.println(item.getNome());
          if(item instanceof Filme filme && filme.getClassificacao() > 2){
            //Filme filme = (Filme)item;
            System.out.println("Classificação " + filme.getClassificacao());
            System.out.println();

          } else {
            System.out.println("Sem classificação");
          }
        }

}
}
