package pagamentos;

import model.MetodoPagamento;

public class CartaoCredito implements MetodoPagamento {
    public static final double TAXA_DE_ACRESCIMO_CREDITO = 0.02;

    @Override
    public double calcularValorFinal(double valorOriginal) {
        double acrescimo = valorOriginal * TAXA_DE_ACRESCIMO_CREDITO;
        double valorFinal = valorOriginal + acrescimo;
        return valorFinal;
    }

    @Override
    public String gerarComprovante(double valorOriginal) {
        return "Pagamento via Cartão de Crédito \n" +
                "Valor original: R$ " + valorOriginal + "\n" +
                "Desconto aplicavel: " + (TAXA_DE_ACRESCIMO_CREDITO  * 100) + "\n" +
                "Valor final: R$ " + calcularValorFinal(valorOriginal) + "\n";
    }
}
