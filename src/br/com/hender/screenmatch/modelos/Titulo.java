package br.com.hender.screenmatch.modelos;

public abstract class Titulo {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes = 0;
    private int totalDeAvaliacoes = 0;
    private int duracaoEmMinutos;
    private TipoTitulo tipo;

    public TipoTitulo getTipo() {
        return tipo;
    }

    public void setTipo(TipoTitulo tipo) {
        this.tipo = tipo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    protected abstract void exibeInformacoesExtras();

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println();
        System.out.println("*** Dados do Título ***");
        System.out.println(getTipo().equals(TipoTitulo.SERIE) ? "Série: " +nome: "Filme: " +nome);
        System.out.println("Ano de Lançamento: "+ anoDeLancamento);
        if (getTipo().equals(TipoTitulo.SERIE)) {
            Serie s = (Serie) this;
            s.exibeInformacoesExtras();
        } else {
            Filme f = (Filme) this;
            f.exibeInformacoesExtras();
        }
        System.out.println("Duração em Minutos: " + getDuracaoEmMinutos()+" min");
        System.out.println("Incluído no Plano: " + (incluidoNoPlano ? "Sim": "Não"));
        if(totalDeAvaliacoes > 0){
            System.out.printf( String.format("%s, teve %d avaliações com média de %.2f.", nome, totalDeAvaliacoes, (somaDasAvaliacoes /totalDeAvaliacoes)));
        } else {
        System.out.println("Sem avaliações.");

        }
        System.out.println();
    }

    public double avalia(double nota){
        if(nota > 0 && nota < 11){
            somaDasAvaliacoes += nota;
            totalDeAvaliacoes++;
            return somaDasAvaliacoes / totalDeAvaliacoes;

        } else {
            System.out.println("Digite de 1 a 10 para avaliar");
            return 0;
        }
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

//    protected void exibeInformacoesExtras() {
//        // Vazio por padrão
//    }

}
