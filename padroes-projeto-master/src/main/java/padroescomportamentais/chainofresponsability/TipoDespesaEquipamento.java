package padroescomportamentais.chainofresponsability;

public class TipoDespesaEquipamento implements TipoDespesa {

    private static TipoDespesaEquipamento tipoDespesaEquipamento = new TipoDespesaEquipamento();

    private TipoDespesaEquipamento() {};

    public static TipoDespesaEquipamento getTipoDespesaEquipamento() {
        return tipoDespesaEquipamento;
    }
}
