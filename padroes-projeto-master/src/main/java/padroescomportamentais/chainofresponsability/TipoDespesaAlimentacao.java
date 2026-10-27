package padroescomportamentais.chainofresponsability;

public class TipoDespesaAlimentacao implements TipoDespesa {

    private static TipoDespesaAlimentacao tipoDespesaAlimentacao = new TipoDespesaAlimentacao();

    private TipoDespesaAlimentacao() {};

    public static TipoDespesaAlimentacao getTipoDespesaAlimentacao() {
        return tipoDespesaAlimentacao;
    }
}