package pagamentos;

import model.MetodoPagamento;

import java.time.LocalDate;

public class Boleto implements MetodoPagamento {
    public static final double TAXA_PAGAMENTO = 0.02;
    public static final int DIAS_VENCIMENTO = 3;

    @Override
    public double calcularValorFinal(double valorOriginal) {
        double acrescimo =  valorOriginal * TAXA_PAGAMENTO;
        double valorFinal = valorOriginal + acrescimo;
        return valorFinal;
    }

    @Override
    public String gerarComprovante(double valorOriginal) {
        LocalDate dataVencimento = LocalDate.now().plusDays(DIAS_VENCIMENTO);
        double valorFinal = calcularValorFinal(valorOriginal);

        return "Pagamento via Boleto\n" +
                "Valor original: R$ " + valorOriginal + "\n" +
                "Acréscimo aplicado: " + (TAXA_PAGAMENTO * 100) + "%\n" +
                "Valor final: R$ " + valorFinal + "\n" +
                "Vencimento: " + dataVencimento;
    }
}
