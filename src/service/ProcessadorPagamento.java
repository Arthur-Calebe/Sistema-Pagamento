package service;

import model.MetodoPagamento;

public class ProcessadorPagamento {

    public void processarPagamento(MetodoPagamento metodoPagamento, double valorOriginal) {
        System.out.println(metodoPagamento.gerarComprovante(valorOriginal));
    }
}