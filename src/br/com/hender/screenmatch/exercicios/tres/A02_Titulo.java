package br.com.hender.screenmatch.exercicios.tres;

public class A02_Titulo implements Comparable<A02_Titulo>{
String nome;



@Override
public int compareTo(A02_Titulo outroTitulo) {
  return this.nome.compareTo(outroTitulo.nome);
}


public A02_Titulo(String titulo){
  this.nome = titulo;
}
// public String getNome() {
//   return nome;
// }



// public void setNome(String nome) {
//   this.nome = nome;
// }

@Override
public String toString() {
  return this.nome;
}
}
