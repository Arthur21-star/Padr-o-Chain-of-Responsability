package padroescomportamentais.chainofresponsability;

public class AprovadorSupervisor extends Aprovador {

    public AprovadorSupervisor(Aprovador aprovadorSuperior) {
        setAprovadorSuperior(aprovadorSuperior);
        listaDespesas.add(TipoDespesaAlimentacao.getTipoDespesaAlimentacao());
    }

    public String getDescricaoCargo() {
        return "Supervisor";
    }
}
