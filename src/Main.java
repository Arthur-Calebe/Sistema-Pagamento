import pagamentos.Boleto;
import pagamentos.CartaoCredito;
import pagamentos.Pix;
import service.ProcessadorPagamento;

public class Main {

    public static void main(String[] args) {

        ProcessadorPagamento processador = new ProcessadorPagamento();

        Pix pix = new Pix();
        Boleto boleto = new Boleto();
        CartaoCredito cartao = new CartaoCredito();

        double valor = 100.00;

        processador.processarPagamento(pix, valor);

        System.out.println("----------------------");

        processador.processarPagamento(boleto, valor);

        System.out.println("----------------------");

        processador.processarPagamento(cartao, valor);
    }
}
