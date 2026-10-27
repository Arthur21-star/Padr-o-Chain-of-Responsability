package padroescomportamentais.chainofresponsability;

public class AprovadorPresidente extends Aprovador {

    public AprovadorPresidente(Aprovador aprovadorSuperior) {
        setAprovadorSuperior(aprovadorSuperior);
        listaDespesas.add(TipoDespesaViagem.getTipoDespesaViagem());
    }

    public String getDescricaoCargo() {
        return "Presidente";
    }
}
