package com.gerador.notafiscal.models;

import com.gerador.notafiscal.models.enums.ServiceType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class InvoiceTest {
    public Invoice defaultInvoice;

    @Before
    public void setup() {
        this.defaultInvoice = new Invoice("Davi Sousa", "Rua dos Bobos, 0", ServiceType.CONSULTING, 245.80);
    }

    @Test
    public void shouldCreateInvoice() {
        new Invoice("João Alves", "Rua dos Bobos, 0", ServiceType.TRAINING, 34.45);
    }

    @Test
    public void shouldCreateInvoiceWithOtherService() {
        new Invoice("João Alves", "Rua dos Bobos, 0", ServiceType.OTHER, 34.45);
    }

    @Test
    public void shouldGetInvoiceServiceType() {
        assertEquals("Consultoria", defaultInvoice.getServiceType());
    }

    @Test
    public void shouldGetClientName() {
        assertEquals("Davi Sousa", defaultInvoice.getClientName());
    }

    @Test
    public void shouldHasToString() {
        String expectedString = "Nome do cliente: Davi Sousa\n" +
                "Endereço do cliente: Rua dos Bobos, 0\n" +
                "Tipo do serviço: Consultoria\n" +
                "Valor da fatura: R$245.80";

        assertEquals(expectedString, defaultInvoice.toString());
    }
}
