package padroescomportamentais.chainofresponsability;

public class TipoDespesaViagem implements TipoDespesa {

    private static TipoDespesaViagem tipoDespesaViagem = new TipoDespesaViagem();

    private TipoDespesaViagem() {};

    public static TipoDespesaViagem getTipoDespesaViagem() {
        return tipoDespesaViagem;
    }
}
