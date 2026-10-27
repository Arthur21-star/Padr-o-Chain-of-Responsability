package padroescomportamentais.chainofresponsability;

public class AprovadorDiretor extends Aprovador {

    public AprovadorDiretor(Aprovador aprovadorSuperior) {
        setAprovadorSuperior(aprovadorSuperior);
        listaDespesas.add(TipoDespesaHospedagem.getTipoDespesaHospedagem());
    }

    public String getDescricaoCargo() {
        return "Diretor";
    }
}
