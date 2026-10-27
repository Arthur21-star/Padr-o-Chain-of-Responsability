package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DespesaTest {

    AprovadorPresidente presidente;
    AprovadorDiretor diretor;
    AprovadorGerente gerente;
    AprovadorSupervisor supervisor;

    @BeforeEach
    void setUp() {
        presidente = new AprovadorPresidente(null);
        diretor = new AprovadorDiretor(presidente);
        gerente = new AprovadorGerente(diretor);
        supervisor = new AprovadorSupervisor(gerente);
    }

    @Test
    void deveRetornarSupervisorParaAprovacaoAlimentacao() {
        assertEquals("Supervisor", supervisor.aprovarDespesa(new Despesa(TipoDespesaAlimentacao.getTipoDespesaAlimentacao())));
    }

    @Test
    void deveRetornarGerenteParaAprovacaoTransporte() {
        assertEquals("Gerente", supervisor.aprovarDespesa(new Despesa(TipoDespesaTransporte.getTipoDespesaTransporte())));
    }

    @Test
    void deveRetornarDiretorParaAprovacaoHospedagem() {
        assertEquals("Diretor", supervisor.aprovarDespesa(new Despesa(TipoDespesaHospedagem.getTipoDespesaHospedagem())));
    }

    @Test
    void deveRetornarPresidenteParaAprovacaoViagem() {
        assertEquals("Presidente", supervisor.aprovarDespesa(new Despesa(TipoDespesaViagem.getTipoDespesaViagem())));
    }

    @Test
    void deveRetornarSemAprovacaoParaAprovacaoEquipamento() {
        assertEquals("Sem aprovação", supervisor.aprovarDespesa(new Despesa(TipoDespesaEquipamento.getTipoDespesaEquipamento())));
    }

}