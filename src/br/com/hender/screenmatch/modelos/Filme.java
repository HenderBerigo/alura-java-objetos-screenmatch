package br.com.hender.screenmatch.modelos;

import br.com.hender.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    protected void exibeInformacoesExtras() {
        if(diretor == null){
            System.out.println("Diretor não informado");

        } else {
            System.out.println("Diretor: " + diretor);

        }
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
