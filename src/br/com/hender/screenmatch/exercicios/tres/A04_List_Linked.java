package br.com.hender.screenmatch.exercicios.tres;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class A04_List_Linked {
public static void main(String[] args) {
  
  List<String> nomes = new ArrayList<>();
  nomes.add("A José");
  nomes.add("A Laila");
  nomes.add("A Hender");

  List<String> nomes2 = new LinkedList<>();
  nomes2.add("B José");
  nomes2.add("B Laila");
  nomes2.add("B Hender");
  
  System.out.println("/");
  System.out.println();
  System.out.println("ArrayList: " + nomes);
  System.out.println("LinkedList: " + nomes2);
  
  Collections.sort(nomes);
  Collections.sort(nomes2);

  
  
  System.out.println("ArrayList: " + nomes);
  System.out.println("LinkedList: " + nomes2);





}
}
