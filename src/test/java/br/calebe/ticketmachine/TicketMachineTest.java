package br.calebe.ticketmachine;

import org.junit.Before;
import org.junit.Test;

import br.calebe.ticketmachine.core.TicketMachine;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;

import static org.junit.Assert.*;

public class TicketMachineTest{

    private TicketMachine ticketMachine;

    @Before
    public void setUp() {
        ticketMachine = new TicketMachine(10);
    }

    @Test
    public void testChecarSaldoAposInsercao() {
        try {
            ticketMachine.inserir(20);
            assertEquals(30, ticketMachine.getSaldo());
        } catch (PapelMoedaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testImprimirBilhete() {
        try {
            ticketMachine.inserir(25);
            try {
                String bilhete = ticketMachine.imprimir();
                assertTrue(bilhete.contains("R$ 25,00"));
            } catch (SaldoInsuficienteException e) {
                System.out.println(e.getMessage());
            }
        } catch (PapelMoedaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(expected = SaldoInsuficienteException.class)
    public void testNaoDeveImprimirBilhete() throws SaldoInsuficienteException {
        try {
            ticketMachine.inserir(10);
            ticketMachine.imprimir();
        } catch (PapelMoedaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}