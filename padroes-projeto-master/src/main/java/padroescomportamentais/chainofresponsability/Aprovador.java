package padroescomportamentais.chainofresponsability;

import java.util.ArrayList;

public abstract class Aprovador {

    protected ArrayList listaDespesas = new ArrayList();
    private Aprovador aprovadorSuperior;

    public Aprovador getAprovadorSuperior() {
        return aprovadorSuperior;
    }

    public void setAprovadorSuperior(Aprovador aprovadorSuperior) {
        this.aprovadorSuperior = aprovadorSuperior;
    }

    public abstract String getDescricaoCargo();

    public String aprovarDespesa(Despesa despesa) {
        if (listaDespesas.contains(despesa.getTipoDespesa())) {
            return getDescricaoCargo();
        }
        else {
            if (aprovadorSuperior != null) {
                return aprovadorSuperior.aprovarDespesa(despesa);
            }
            else
            {
                return "Sem aprovação";
            }
        }
    }
}
