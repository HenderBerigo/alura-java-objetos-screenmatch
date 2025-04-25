package br.com.hender.screenmatch.exercicios.tres;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A01_ListaNumeros {
public static void main(String[] args) {
  System.out.println("/");
  System.out.println();
  List<Integer> listaNumeros = new ArrayList<>();
  listaNumeros.add(10);
  listaNumeros.add(75);
  listaNumeros.add(90);
  listaNumeros.add(2);
  listaNumeros.add(17);
  listaNumeros.add(53);
  listaNumeros.add(24);

  System.out.println(listaNumeros);
  Collections.sort(listaNumeros);
  System.out.println(listaNumeros);

}
}
