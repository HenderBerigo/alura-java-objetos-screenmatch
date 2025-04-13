import br.com.hender.screenmatch.calculos.CalculadoraDeTempo;
import br.com.hender.screenmatch.calculos.FiltroRecomendacao;
import br.com.hender.screenmatch.modelos.*;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("O Poderoso Chefão");
        filme.setAnoDeLancamento(1976);
        filme.setDuracaoEmMinutos(180);
        filme.setIncluidoNoPlano(true);

        filme.avalia(5.0);
        filme.avalia(8.5);
        filme.avalia(9.0);
        filme.setTipo(TipoTitulo.FILME);
        filme.exibeFichaTecnica();

        Filme filme2 = new Filme();
        filme2.setNome("No Limite do Amanhã");
        filme2.setAnoDeLancamento(2014);
        filme2.setDuracaoEmMinutos( 113);
        filme2.setIncluidoNoPlano(true);
        filme2.setDiretor("Tom Cruiser");

        filme2.avalia(8.0);
        filme2.avalia(8.5);
        //filme2.avaliar(9.0);
        filme2.setTipo(TipoTitulo.FILME);
        filme2.exibeFichaTecnica();

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setTemporadas(10);
        lost.setEpsodiosPorTemporada(22);
        lost.setAnoDeLancamento(2008);
        lost.setDuracaoEmMinutos(50);
        lost.setMinutosPorEpsodio(50);
        lost.setTipo(TipoTitulo.SERIE);
        lost.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme2);
        calculadora.inclui(filme);
        calculadora.inclui(lost);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme);

        Epsodio epsodio = new Epsodio();
        epsodio.setNumero(1);
        epsodio.setSerie(lost);
        epsodio.setTotalVisulizacoes(300);
        filtro.filtra(epsodio);

    }
}
