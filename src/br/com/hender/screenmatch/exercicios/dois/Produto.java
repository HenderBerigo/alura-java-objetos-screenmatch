package br.com.hender.screenmatch.exercicios.dois;

public class Produto {
  private String nome;
  private double preco;
  private int quantidade;

  public Produto(String nome, double preco, int quantidade){
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }
  
  public String getNome() {
    return nome;
  }

  // public void setNome(String nome) {
  //   this.nome = nome;
  // }

  public double getPreco() {
    return preco;
  }

  // public void setPreco(double preco) {
  //   this.preco = preco;
  // }
  
  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public int getQuantidade() {
    return quantidade;
  }


  @Override
  public String toString() {
  return "Produto: "+getNome()+" - Preço: "+getPreco()+" - Qnt: "+getQuantidade();
  }

}
