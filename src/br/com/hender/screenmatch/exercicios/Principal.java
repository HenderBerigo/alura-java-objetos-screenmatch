package br.com.hender.screenmatch.exercicios;

import java.util.ArrayList;

public class Principal {
  public static void main(String[] args) {
    var pessoa1 = new Pessoa();
    pessoa1.setNome("Hender");
    pessoa1.setIdade(49);

    var pessoa2 = new Pessoa();
    pessoa2.setNome("Laila");
    pessoa2.setIdade(35);

    var pessoa3 = new Pessoa();
    pessoa3.setNome("José");
    pessoa3.setIdade(17);

    var pessoas = new ArrayList<>();
    pessoas.add(pessoa1);
    pessoas.add(pessoa2);
    pessoas.add(pessoa3);

    System.out.println("Primeira pessoa da lista: " + pessoas.get(0));
    System.out.println("Tamanho da lista de pessoas: "+ pessoas.size());

    System.out.println("Lista de pessoas completa: " + pessoas);
    System.out.println();
    System.out.println("Lista de pessoas com foreach:");
    for (var pessoa : pessoas) {
      System.out.println(pessoa);
    }
  }
}
