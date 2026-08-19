package model;

public interface MetodoPagamento {
    double calcularValorFinal(double valorOriginal);
    String gerarComprovante(double valorOriginal);
}
