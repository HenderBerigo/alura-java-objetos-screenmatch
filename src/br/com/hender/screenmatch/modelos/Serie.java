package br.com.hender.screenmatch.modelos;

import br.com.hender.screenmatch.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel {

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
        
    }

    private int temporadas;
    private int epsodiosPorTemporada;
    private  boolean ativa;

    public int getMinutosPorEpsodio() {
        return minutosPorEpsodio;
    }

    private int minutosPorEpsodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpsodiosPorTemporada() {
        return epsodiosPorTemporada;
    }

    public void setEpsodiosPorTemporada(int epsodiosPorTemporada) {
        this.epsodiosPorTemporada = epsodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    protected void exibeInformacoesExtras() {
        System.out.println("Episódios por temporada: " + getEpsodiosPorTemporada());
        System.out.println("Temporadas: " + getTemporadas());
    }

    public void setMinutosPorEpsodio(int minutosPorEpsodio){
        this.minutosPorEpsodio = minutosPorEpsodio;
    }

    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * epsodiosPorTemporada * minutosPorEpsodio;
    }

    @Override
    public int getClassificacao() {
        return 0;
    }

    @Override
    public String toString() {
    
    // return super.toString();
    return "Série: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
