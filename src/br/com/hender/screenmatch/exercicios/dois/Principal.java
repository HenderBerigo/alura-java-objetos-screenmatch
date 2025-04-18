package br.com.hender.screenmatch.exercicios.dois;

import java.util.ArrayList;

public class Principal {
  public static void main(String[] args) {

    System.out.println();
    ProdutoPerecivel produto1 = new ProdutoPerecivel("Cafe", 29.00, 5);
    produto1.setDataValidade("31/12/2025");
    // produto1.setNome("Aguá");

    ProdutoPerecivel produto2 = new ProdutoPerecivel("Leite", 4.95, 3);
    produto2.setDataValidade("31/06/2025");

    ProdutoPerecivel produto3 = new ProdutoPerecivel("Cha", 8.0, 4);
    produto3.setDataValidade("31/12/2026");

    ProdutoPerecivel produto4 = new ProdutoPerecivel("Pao", 7.99, 2);
    produto4.setDataValidade("31/05/2025");

    var listaProdutos = new ArrayList<ProdutoPerecivel>();
    listaProdutos.add(produto1);
    listaProdutos.add(produto2);
    listaProdutos.add(produto3);
    listaProdutos.add(produto4);

    System.out.println(listaProdutos.toString());

  }
}
