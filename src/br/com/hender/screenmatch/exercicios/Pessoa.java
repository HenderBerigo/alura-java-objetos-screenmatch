package br.com.hender.screenmatch.exercicios;

public class Pessoa {
  private String nome;
  private int idade;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return this.nome + " tem " + this.idade + " anos.";
  }
}
