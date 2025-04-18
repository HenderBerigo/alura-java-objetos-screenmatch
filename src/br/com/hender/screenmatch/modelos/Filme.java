package br.com.hender.screenmatch.modelos;

import br.com.hender.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public void exibeInformacoesExtras() {
        System.out.println();
        System.out.println("Informações do filme: "+ this.getNome());
        System.out.println("Ano de Laçamento: "+ this.getAnoDeLancamento());
        System.out.println("Duração em minutos: "+ this.getDuracaoEmMinutos());
        if (this.diretor == null) {
            System.out.println("Diretor não informado");

        } else {
            System.out.println("Diretor: " + diretor);

        }
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
