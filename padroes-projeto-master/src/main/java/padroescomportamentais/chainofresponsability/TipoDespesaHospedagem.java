package padroescomportamentais.chainofresponsability;

public class TipoDespesaHospedagem implements TipoDespesa {

    private static TipoDespesaHospedagem tipoDespesaHospedagem = new TipoDespesaHospedagem();

    private TipoDespesaHospedagem() {};

    public static TipoDespesaHospedagem getTipoDespesaHospedagem() {
        return tipoDespesaHospedagem;
    }
}
