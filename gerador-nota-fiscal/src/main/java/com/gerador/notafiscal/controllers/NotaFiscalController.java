package com.gerador.notafiscal.controllers;

import com.gerador.notafiscal.models.Bill;
import com.gerador.notafiscal.models.NotaFiscal;
import com.gerador.notafiscal.models.enums.ServiceType;

public class NotaFiscalController {
    public NotaFiscal generate(String clientName, String clientAddress, String serviceTypeDescription, double billValue) {
        ServiceType serviceType = ServiceType.getFromDescription(serviceTypeDescription);
        Bill bill = new Bill(clientName, clientAddress, serviceType, billValue);

        return new NotaFiscal(bill);
    }
}