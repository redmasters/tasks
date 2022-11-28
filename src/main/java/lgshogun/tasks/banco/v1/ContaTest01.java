package lgshogun.tasks.banco.v1;
import lgshogun.tasks.banco.v1.Conta;

public class ContaTest01 {
    public static void main(String[] args) {

        // Conta com Saldo
        Conta conta1 = new Conta();
        conta1.nomeTitular = "Casaubé Silva";
        conta1.numDaConta = 1272812;
        conta1.agencia = "0001";
        conta1.nomeBanco = "Banco FWV";
        conta1.saldoAtual = 200.0;
        conta1.chavePix = "12345678";
        conta1.imprimir();

        // Extrato de Movimentações da Conta 1
        System.out.println("--- Movimentações de " + conta1.nomeTitular + " ---");
        conta1.sacar(80);
        conta1.depositar(100);
        conta1.transferir("lauro.gpereira@gmail.com", 20);

        // Conta sem Saldo
        Conta conta2 = new Conta();
        conta2.nomeTitular = "Fernando Soares";
        conta2.numDaConta = 1275930;
        conta2.agencia = "0001";
        conta2.nomeBanco = "Banco FWV";
        conta2.saldoAtual = 0;
        conta2.chavePix = "12342259";
        conta2.imprimir();
    }
}