package br.com.hender.screenmatch.exercicios.tres;

import java.util.ArrayList;
import java.util.Collections;

public class A03_TituloPrincipal {
  public static void main(String[] args) {
    System.out.println("/");
    System.out.println();

    ArrayList<A02_Titulo> titulos = new ArrayList<>();

    titulos.add(new A02_Titulo("Homem Aranha"));
    titulos.add(new A02_Titulo("O poderoso Chefão"));
    titulos.add(new A02_Titulo("Avatar"));
    titulos.add(new A02_Titulo("Dexter"));
    titulos.add(new A02_Titulo("Breakin Bad"));


    System.out.println(titulos);
    Collections.sort(titulos);
    System.out.println(titulos);

    for (A02_Titulo titulo : titulos) {
      System.out.println(titulo);
    }
  }
}
