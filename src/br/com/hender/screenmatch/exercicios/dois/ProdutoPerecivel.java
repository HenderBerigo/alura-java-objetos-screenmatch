package br.com.hender.screenmatch.exercicios.dois;

public class ProdutoPerecivel extends Produto{
  private String dataValidade;


  public ProdutoPerecivel(String nome, double preco, int quantidade) {
    super(nome, preco, quantidade);
    
  }

  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  public String getDataValidade() {
    return dataValidade;
  }



}
