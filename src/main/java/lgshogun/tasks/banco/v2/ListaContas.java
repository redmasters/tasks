package lgshogun.tasks.banco.v2;

public class ListaContas {
    public static void main(String[] args) {
        DadosConta conta1 = new DadosConta();
        conta1.nomeBanco = "Nubank";
        conta1.nomeTitular = "Jose Freitas";
        conta1.agencia = "0001";
        conta1.numeroConta = 11010101;
        conta1.setSaldoAtual(1000);
        conta1.chavePix = "jose.1940@hotmail.com";

        conta1.imprimirDados();
    }
}
