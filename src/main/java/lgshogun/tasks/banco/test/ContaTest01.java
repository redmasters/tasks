package lgshogun.tasks.banco.test;
import lgshogun.tasks.banco.dominio.Conta;

public class ContaTest01 {
    public static void main(String[] args) {

        // Conta sem Saldo
        Conta conta1 = new Conta();
        conta1.nomeTitular = "Casaubé Silva";
        conta1.numDaConta = 1272812;
        conta1.agencia = "0001";
        conta1.nomeBanco = "Banco FWV";
        conta1.saldoAtual = 200.0;
        conta1.imprime();

        // Saque e Deposito da Conta 1
        System.out.println("-------");
        conta1.sacar(20);
        conta1.deposita(100);


        // Conta com Saldo
        Conta conta2 = new Conta();
        conta2.nomeTitular = "Fernando Soares";
        conta2.numDaConta = 1275930;
        conta2.agencia = "0001";
        conta2.nomeBanco = "Banco FWV";
        conta2.saldoAtual = 103320.60;
        conta2.imprime();



    }
}