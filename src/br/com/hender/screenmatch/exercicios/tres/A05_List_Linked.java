package br.com.hender.screenmatch.exercicios.tres;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class A05_List_Linked {
public static void main(String[] args) {
  
  List<String> nomes3;
  
  nomes3 = new ArrayList<>();
  nomes3.add("A José");
  nomes3.add("A Laila");
  nomes3.add("A Hender");
  
  
  System.out.println("/");
  System.out.println();
  System.out.println("ArrayList: " + nomes3);
  Collections.sort(nomes3);
  System.out.println("ArrayList: " + nomes3);
  
  
  nomes3 = new LinkedList<>();
  nomes3.add("A José");
  nomes3.add("A Laila");
  nomes3.add("A Hender");
  System.out.println("LinkedList: " + nomes3);
  Collections.sort(nomes3);
  System.out.println("LinkedList: " + nomes3);
  






}
}
