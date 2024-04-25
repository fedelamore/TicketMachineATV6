
package br.calebe.ticketmachine;

import static org.junit.Assert.*;
import br.calebe.ticketmachine.core.PapelMoeda;
import org.junit.Test;

public class PapelMoedaTest {

    @Test
    public void testQuantidadeDiferente() {
        PapelMoeda papelMoeda = new PapelMoeda(5, 10);
        assertEquals(10, papelMoeda.getQuantidade());
    }

    @Test
    public void testValorDiferente() {
        PapelMoeda papelMoeda = new PapelMoeda(20, 5);
        assertEquals(20, papelMoeda.getValor());
    }

    @Test
    public void testValorEQuantidadeDiferente() {
        PapelMoeda papelMoeda = new PapelMoeda(10, 10);
        assertEquals(10, papelMoeda.getQuantidade());
        assertEquals(10, papelMoeda.getValor());
    }


}