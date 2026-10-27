package padroescomportamentais.chainofresponsability;

public class AprovadorGerente extends Aprovador {

    public AprovadorGerente(Aprovador aprovadorSuperior) {
        setAprovadorSuperior(aprovadorSuperior);
        listaDespesas.add(TipoDespesaTransporte.getTipoDespesaTransporte());
    }

    public String getDescricaoCargo() {
        return "Gerente";
    }
}
