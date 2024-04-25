package br.calebe.ticketmachine;

import org.junit.Test;

import br.calebe.ticketmachine.core.PapelMoeda;
import br.calebe.ticketmachine.core.Troco;

import static org.junit.Assert.*;
import java.util.Iterator;
import org.junit.Before;

public class TrocoTest{

    private Troco troco;

    @Before
    public void setUp() {
        troco = new Troco(387);
    }

    @Test
    public void testVerificaCasoBaseTroco() {
        PapelMoeda[] papeis = troco.papeisMoeda;

        assertEquals(1, papeis[0].getQuantidade());
        assertEquals(1, papeis[1].getQuantidade());
        assertEquals(1, papeis[2].getQuantidade());
        assertEquals(1, papeis[3].getQuantidade());
        assertEquals(1, papeis[4].getQuantidade());
        assertEquals(1, papeis[5].getQuantidade());
        assertEquals(1, papeis[6].getQuantidade());
    }

    @Test
    public void testVerificaIteracaoTroco() {
        Iterator<PapelMoeda> iterator = troco.getIterator();

        assertTrue(iterator.hasNext());
        assertEquals(200, iterator.next().getValor());

        assertTrue(iterator.hasNext());
        assertEquals(100, iterator.next().getValor());

        assertTrue(iterator.hasNext());
        assertEquals(50, iterator.next().getValor());

        assertTrue(iterator.hasNext());
        assertEquals(20, iterator.next().getValor());

        assertTrue(iterator.hasNext());
        assertEquals(10, iterator.next().getValor());

        assertTrue(iterator.hasNext());
        assertEquals(5, iterator.next().getValor());

        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next().getValor());

        assertFalse(iterator.hasNext());
    }
}