package pagamentos;

import model.MetodoPagamento;

public class Pix implements MetodoPagamento {
    public static final double TAXA_DESCONTO = 0.02;

    @Override
    public double calcularValorFinal(double valorOriginal) {
        double desconto = valorOriginal * TAXA_DESCONTO;
        double valorFinal = valorOriginal - desconto;
        return valorFinal;
    }

    @Override
    public String gerarComprovante(double valorOriginal) {
        return "Pagamento via Pix \n" +
                "Valor original: R$ " + valorOriginal + "\n" +
                "Desconto aplicado: " + (TAXA_DESCONTO  * 100) + "\n" +
                "Valor final: R$ " + calcularValorFinal(valorOriginal) + "\n";
    }
}