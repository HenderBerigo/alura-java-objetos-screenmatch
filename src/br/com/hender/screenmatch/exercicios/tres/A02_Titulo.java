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
<<<<<<< HEAD

=======
  // TODO Auto-generated method stub
>>>>>>> 4b55da538306bb5487309bf9f072e33c29d41383
  return this.nome;
}
}
