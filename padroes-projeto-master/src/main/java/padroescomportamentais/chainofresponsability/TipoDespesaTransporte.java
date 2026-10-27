package padroescomportamentais.chainofresponsability;

public class TipoDespesaTransporte implements TipoDespesa {

    private static TipoDespesaTransporte tipoDespesaTransporte = new TipoDespesaTransporte();

    private TipoDespesaTransporte() {};

    public static TipoDespesaTransporte getTipoDespesaTransporte() {
        return tipoDespesaTransporte;
    }
}
